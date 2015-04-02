package cn.edu.shou.hsh.activemq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProducerTest {
	@Autowired
	private ProducerServiceImpl producerService;

	@RequestMapping("/send")
	public String send(Model model){
		System.out.println("send start...");
		producerService.send();
		System.out.println("send end...");
		return "index";
	}

}
