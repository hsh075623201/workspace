package cn.edu.shou.hsh.FactoryMethod.Static;


/**
 * ��̬����������
 * @author HSH
 *
 */
public class SenderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender sender = SenderFactory.produceSms();
        sender.send(); 
	}

}
