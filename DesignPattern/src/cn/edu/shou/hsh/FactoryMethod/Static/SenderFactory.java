package cn.edu.shou.hsh.FactoryMethod.Static;


/**
 * ������̬����
 * @author HSH
 *ȱ�㣺
 *1.ÿ������һ��ʵ��Sender�ӿڵ��඼��Ҫ�ڹ�����������дһ������
 */
public class SenderFactory {

	public static Sender produceMail(){
		return new SmsSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}

}