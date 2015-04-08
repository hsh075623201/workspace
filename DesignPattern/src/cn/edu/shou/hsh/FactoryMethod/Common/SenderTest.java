package cn.edu.shou.hsh.FactoryMethod.Common;
/**
 * 普通工厂测试类
 * @author HSH
 *
 */
public class SenderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SenderFactory factory = new SenderFactory();  
        Sender sender = factory.produce("sms");  
        sender.send(); 
	}

}
