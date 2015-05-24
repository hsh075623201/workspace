package cn.edu.shou.hsh;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * ≤‚ ‘Lock
 * @author HSH
 *
 */
public class LockTest {

	public static void main(String[] args) {
		
		new Thread(new Runnable(){
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Output.output("zhangsan");
				}
				
			}
		}).start();
		
		new Thread(new Runnable(){
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Output.output("lisiwangwu");
				}
			}
		}).start();
	}
	
	static class Output{
		
		static Lock lock = new ReentrantLock();
		public static void output(String str){
			lock.lock();
			for(int i=0;i<str.length();i++){
				System.out.print(str.charAt(i));
			}
			System.out.println();
			lock.unlock();
		}
	}
}


