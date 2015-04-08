package cn.edu.shou.hsh.FactoryMethod.Common;
/**
 * 创建普通工厂
 * @author HSH
 *缺点：
 *1.需要传入正确的type
 *2.每次增加一个实现Sender接口得类都需要在工厂类中重新写入判断
 */
public class SenderFactory {

	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("请输入正确类型！");
			return null;
		}
	}

}
