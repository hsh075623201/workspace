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
		final CountDownLatch p = new CountDownLatch(1);//���߳�
		final CountDownLatch s = new CountDownLatch(3);//���߳�
		
		for(int i=0;i<3;i++){
			Runnable runable = new Runnable() {
				
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName()+"׼��������");
					try {
						p.await();//�ȴ�
						System.out.println(Thread.currentThread().getName()+"�ѽ��ܡ�����");
						Thread.sleep((long)(Math.random()*10000));
						System.out.println(Thread.currentThread().getName()+"��ɡ�����");
						s.countDown();//���κ�Ϊ0 �ͷ����߳��еĵȴ�
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
			System.out.println(Thread.currentThread().getName()+"�ѽ���###");
			p.countDown();//��һΪ0  �ͷŵȴ����߳�
			Thread.sleep((long)(Math.random()*10000));
			
			s.await();//�ȴ����߳����ͷ�
			System.out.println(Thread.currentThread().getName()+"���###");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
