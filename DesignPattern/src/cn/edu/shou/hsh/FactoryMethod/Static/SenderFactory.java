package cn.edu.shou.hsh.FactoryMethod.Static;


/**
 * 创建静态工厂
 * @author HSH
 *缺点：
 *1.每次增加一个实现Sender接口得类都需要在工厂类中重新写一个函数
 */
public class SenderFactory {

	public static Sender produceMail(){
		return new SmsSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}

}
