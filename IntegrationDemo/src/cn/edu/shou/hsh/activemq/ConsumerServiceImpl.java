package cn.edu.shou.hsh.activemq;

import java.util.Date;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService{
	
	@Autowired
	//@Qualifier("jmsQueueTemplate")
	private JmsTemplate jmsTemplate;
	/*@Autowired
	@Qualifier("queueDest")
	private Destination destination;*/
	//接收
	public void receive() {
		// TODO Auto-generated method stub
		MapMessage message = (MapMessage) jmsTemplate.receive();
		try {
			System.out.println("收到消息："+new Date(message.getLong("count")));
		} catch(JMSException e){
			e.printStackTrace();
		}
	}

	/*public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	
	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}*/

}
