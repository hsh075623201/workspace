package cn.edu.shou.hsh;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


/**
 * 测试读写锁
 * @author HSH
 *
 */
public class ReadWriteLockTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//开启三个写线程
		for(int i=0;i<3;i++){
			new Thread(new Runnable(){
				public void run() {
					// TODO Auto-generated method stub
					while(true){
						QueueTest.wirte();
					}
					
				}
			}).start();
		}
		//开启三个读线程
		for(int i=0;i<3;i++){
			new Thread(new Runnable(){
				public void run() {
					// TODO Auto-generated method stub
					while(true){
						QueueTest.read();
					}
					
				}
			}).start();
		}

	}

	static class QueueTest{
		
		static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		static public void read(){
			readWriteLock.readLock().lock();
			System.out.println(Thread.currentThread().getName()+"reading...start########");
			try {
				Thread.sleep((long)Math.random()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"reading...end##########");
			readWriteLock.readLock().unlock();
		}
		
		static public void wirte(){
			readWriteLock.writeLock().lock();
			System.out.println(Thread.currentThread().getName()+"writing...start");
			try {
				Thread.sleep((long)Math.random()*2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"writing...end");
			readWriteLock.writeLock().unlock();
		}
	}
}


