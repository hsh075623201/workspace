package cn.edu.shou.hsh;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * ���� Callable&Future
 * @author HSH
 *
 */
public class CallableAndFutureTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService threadPools = Executors.newSingleThreadExecutor();//���̳߳�
		Future future = threadPools.submit(new Callable() {
			
			public Object call() throws Exception {
				// TODO Auto-generated method stub
				System.out.println("calling....");
				return "hello��"+Thread.currentThread().getName();//���ؽ��
			}
		});
		System.out.println("waiting result....");
		System.out.println("get result:"+future.get());//��ȡ���
		//����̻߳�ȡ
		ExecutorService threadPools2 = Executors.newSingleThreadExecutor();
		CompletionService completionService = new ExecutorCompletionService(threadPools2);
		for(int i=0;i<10;i++){
			final int seq = i;//�����ڲ�����ʺ�������Ҫ���γ�final
			completionService.submit(new Callable() {
				
				public Object call() throws Exception {
					// TODO Auto-generated method stub
					System.out.println("calling2..."+seq);
					return seq;
				}
			});
		}
		System.out.println("waiting result2....");
		//ѭ����ȡ
		for(int i=0;i<10;i++){
			System.out.println("get result2:"+completionService.take().get());
		}
		
	}
}
