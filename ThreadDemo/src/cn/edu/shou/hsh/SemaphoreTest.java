package cn.edu.shou.hsh;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
/**
 * 测试 Semaphore
 * 功能：只有两个信号灯，只有等拿到这两个信号灯的某个线程退出了才能有新线程进入。
 * @author HSH
 *
 */
public class SemaphoreTest {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		final Semaphore semaphore = new Semaphore(2); 
		
		for(int i=0;i<10;i++){
			Runnable runable = new Runnable() {
				
				public void run() {
					// TODO Auto-generated method stub
					try {
						semaphore.acquire();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"进入,存在信号灯："+(semaphore.availablePermits()));
					try {
						Thread.sleep((long)(Math.random()*15000));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//System.out.println(Thread.currentThread().getName()+"即将离开。。。。。");
					semaphore.release();
					System.out.println(Thread.currentThread().getName()+"已离开,存在信号灯："+(3-semaphore.availablePermits()));
				}
			};
			executorService.execute(runable);
		}
		
		
	}
}
