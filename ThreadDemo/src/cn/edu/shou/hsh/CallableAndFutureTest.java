package cn.edu.shou.hsh;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 测试 Callable&Future
 * @author HSH
 *
 */
public class CallableAndFutureTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService threadPools = Executors.newSingleThreadExecutor();//单线程池
		Future future = threadPools.submit(new Callable() {
			
			public Object call() throws Exception {
				// TODO Auto-generated method stub
				System.out.println("calling....");
				return "hello："+Thread.currentThread().getName();//返回结果
			}
		});
		System.out.println("waiting result....");
		System.out.println("get result:"+future.get());//获取结果
		//多个线程获取
		ExecutorService threadPools2 = Executors.newSingleThreadExecutor();
		CompletionService completionService = new ExecutorCompletionService(threadPools2);
		for(int i=0;i<10;i++){
			final int seq = i;//匿名内部类访问函数变量要修饰成final
			completionService.submit(new Callable() {
				
				public Object call() throws Exception {
					// TODO Auto-generated method stub
					System.out.println("calling2..."+seq);
					return seq;
				}
			});
		}
		System.out.println("waiting result2....");
		//循环获取
		for(int i=0;i<10;i++){
			System.out.println("get result2:"+completionService.take().get());
		}
		
	}
}
