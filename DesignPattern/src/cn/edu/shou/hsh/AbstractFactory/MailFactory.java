package cn.edu.shou.hsh.AbstractFactory;

public class MailFactory implements Provider {

	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
