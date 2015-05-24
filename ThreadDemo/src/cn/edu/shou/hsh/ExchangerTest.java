package cn.edu.shou.hsh;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试 线程数据交换
 * @author HSH
 *
 */
public class ExchangerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newCachedThreadPool();
		final Exchanger<String> exchanger = new Exchanger<String>();
		executorService.execute(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				String data = "shou";
				System.out.println(Thread.currentThread().getName()+"准备将数据 "+data+" 换出去。。。");
				try {
					Thread.sleep((long)(Math.random()*10000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String result="";
				try {
					result = (String)exchanger.exchange(data);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"换回结果数据 "+result);
			}
		});
		
		
		executorService.execute(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				String data = "baosight";
				System.out.println(Thread.currentThread().getName()+"准备将数据 "+data+" 换出去。。。");
				try {
					Thread.sleep((long)(Math.random()*10000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String result="";
				try {
					result = (String)exchanger.exchange(data);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"换回结果数据 "+result);
			}
		});
	}

}
