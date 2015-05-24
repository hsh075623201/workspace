package cn.edu.shou.hsh;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newCachedThreadPool();
		final CountDownLatch p = new CountDownLatch(1);//主线程
		final CountDownLatch s = new CountDownLatch(3);//次线程
		
		for(int i=0;i<3;i++){
			Runnable runable = new Runnable() {
				
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName()+"准备。。。");
					try {
						p.await();//等待
						System.out.println(Thread.currentThread().getName()+"已接受。。。");
						Thread.sleep((long)(Math.random()*10000));
						System.out.println(Thread.currentThread().getName()+"完成。。。");
						s.countDown();//三次后为0 释放主线程中的等待
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			executorService.execute(runable);
		}
		try {
			Thread.sleep((long)(Math.random()*10000));
			System.out.println(Thread.currentThread().getName()+"已接受###");
			p.countDown();//减一为0  释放等待的线程
			Thread.sleep((long)(Math.random()*10000));
			
			s.await();//等待次线程中释放
			System.out.println(Thread.currentThread().getName()+"完成###");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
