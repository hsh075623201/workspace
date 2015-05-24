package cn.edu.shou.hsh;

import java.util.concurrent.ArrayBlockingQueue;
/**
 * ������������
 * ���ܣ� ֻ�е������д��ڲ���ȡ  ֻ�е������и���С��3�ǲ��ܷ�
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
			//������
			new Thread(new Runnable(){
				public void run() {
					// TODO Auto-generated method stub
					while(true){
						try {
							Thread.sleep((long)(Math.random()*1000));
							System.out.println(Thread.currentThread().getName()+"׼�������ݡ�����");
							queue.put("hsh");
							System.out.println(Thread.currentThread().getName()+"�������ݣ�Ŀǰ�������У�"+queue.size());
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).start();
			
			//ȡ����
			new Thread(new Runnable(){
				public void run() {
					// TODO Auto-generated method stub
					while(true){
						try {
							Thread.sleep((long)(Math.random()*1000));
							System.out.println(Thread.currentThread().getName()+"׼��ȡ����#####");
							queue.take();
							System.out.println(Thread.currentThread().getName()+"ȡ�����ݣ�Ŀǰ�������У�"+queue.size());
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
