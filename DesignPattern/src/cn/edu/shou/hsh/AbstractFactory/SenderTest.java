package cn.edu.shou.hsh.AbstractFactory;


/**
 * ���󹤳�������
 * @author HSH
 *
 */
public class SenderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Provider provider = new MailFactory();  
        Sender sender = provider.produce();  
        sender.send();  
	}

}
