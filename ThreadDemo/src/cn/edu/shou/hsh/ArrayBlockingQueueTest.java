package cn.edu.shou.hsh;

import java.util.concurrent.ArrayBlockingQueue;
/**
 * 测试阻塞队列
 * 功能： 只有当队列中存在才能取  只有当队列中个数小于3是才能放
 * @author HSH
 *
 */
public class ArrayBlockingQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(3);
		
		for(int i=0;i<2;i++){
			//放数据
			new Thread(new Runnable(){
				public void run() {
					// TODO Auto-generated method stub
					while(true){
						try {
							Thread.sleep((long)(Math.random()*1000));
							System.out.println(Thread.currentThread().getName()+"准备放数据。。。");
							queue.put("hsh");
							System.out.println(Thread.currentThread().getName()+"放完数据，目前队列中有："+queue.size());
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).start();
			
			//取数据
			new Thread(new Runnable(){
				public void run() {
					// TODO Auto-generated method stub
					while(true){
						try {
							Thread.sleep((long)(Math.random()*1000));
							System.out.println(Thread.currentThread().getName()+"准备取数据#####");
							queue.take();
							System.out.println(Thread.currentThread().getName()+"取完数据，目前队列中有："+queue.size());
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).start();

		}
	}

}
