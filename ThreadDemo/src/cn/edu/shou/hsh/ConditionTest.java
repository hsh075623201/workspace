package cn.edu.shou.hsh;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试condiiton
 * 功能：三个线程依次执行 
 * @author HSH
 *
 */
public class ConditionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//执行task1
		new Thread(new Runnable(){
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++){
					try {
						Tasks.task1();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		//执行task2
		new Thread(new Runnable(){
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++){
					try {
						Tasks.task2();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		//执行task3
		new Thread(new Runnable(){
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++){
					try {
						Tasks.task3();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
	}
	
	
	static class Tasks{
		static Lock lock = new  ReentrantLock();
		static Condition condition1 = lock.newCondition();
		static Condition condition2 = lock.newCondition();
		static Condition condition3 = lock.newCondition();
		static int flag =1;
		public static void task1() throws InterruptedException{
			lock.lock();
			while(flag !=1){
				condition1.await();
			}
			System.out.println(Thread.currentThread().getName()+" task1...start########");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" task1...end##########");
			flag=2;
			condition2.signal();
			lock.unlock();
		}
		
		public static void task2() throws InterruptedException{
			lock.lock();
			while(flag !=2){
				condition2.await();
			}
			System.out.println(Thread.currentThread().getName()+" task2...start");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" task2...end");
			flag=3;
			condition3.signal();
			lock.unlock();
		}
		
		public static void task3() throws InterruptedException{
			lock.lock();
			while(flag !=3){
				condition3.await();
			}
			System.out.println(Thread.currentThread().getName()+" task3...start@@@@@@@");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" task3...end@@@@@@@");
			flag=1;
			condition1.signal();
			lock.unlock();
		}
	}

}
