package cn.edu.shou.hsh.singleton;
/**
 * ����ģʽ���ŵ㣺
 *1.���ڴ���ֻ��һ�����󣬽�ʡ�ڴ�ռ䡣
 *2.����Ƶ���Ĵ������ٶ��󣬿���������ܡ�
 *3.����Թ�����Դ�Ķ���ռ�á�
 *4.����ȫ�ַ��ʡ�
 * @author HSH
 *
 */
public class Singleton {
	
	private Singleton(){}
	private static Singleton singleton = new Singleton();
	public static Singleton getInstance(){
		return singleton;
	}

}
