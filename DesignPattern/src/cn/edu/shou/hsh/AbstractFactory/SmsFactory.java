package cn.edu.shou.hsh.AbstractFactory;

public class SmsFactory implements Provider {

	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
