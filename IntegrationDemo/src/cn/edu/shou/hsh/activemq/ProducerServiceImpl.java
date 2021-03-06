package cn.edu.shou.hsh.activemq;

import java.util.Date;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;


@Service
public class ProducerServiceImpl implements ProducerService {
	
	@Autowired
	//@Qualifier("jmsQueueTemplate")
	private JmsTemplate jmsTemplate;
	
	@Autowired
	@Qualifier("queueDest")
	private Destination destination;
	//����
	public void send() {
		// TODO Auto-generated method stub
		MessageCreator messageCreator = new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				// TODO Auto-generated method stub
				MapMessage message = session.createMapMessage();
				Date date = new Date();
				message.setLong("count", date.getTime());
				System.out.println("������Ϣ��"+date);
				return message;
			}
		};
		jmsTemplate.send(this.destination,messageCreator);
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
