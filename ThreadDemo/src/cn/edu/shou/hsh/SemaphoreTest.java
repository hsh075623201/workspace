package cn.edu.shou.hsh;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
/**
 * ���� Semaphore
 * ���ܣ�ֻ�������źŵƣ�ֻ�е��õ��������źŵƵ�ĳ���߳��˳��˲��������߳̽��롣
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
					System.out.println(Thread.currentThread().getName()+"����,�����źŵƣ�"+(semaphore.availablePermits()));
					try {
						Thread.sleep((long)(Math.random()*15000));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//System.out.println(Thread.currentThread().getName()+"�����뿪����������");
					semaphore.release();
					System.out.println(Thread.currentThread().getName()+"���뿪,�����źŵƣ�"+(3-semaphore.availablePermits()));
				}
			};
			executorService.execute(runable);
		}
		
		
	}
}
