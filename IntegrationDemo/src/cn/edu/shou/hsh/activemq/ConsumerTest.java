package cn.edu.shou.hsh.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConsumerTest {
	
	@Autowired
	private ConsumerServiceImpl consumerServer;
	
	@RequestMapping("/receive")
	public String receive(Model model){
		System.out.println("receive start...");
		consumerServer.receive();
		System.out.println("receive end...");
		return "index";
	}

}
