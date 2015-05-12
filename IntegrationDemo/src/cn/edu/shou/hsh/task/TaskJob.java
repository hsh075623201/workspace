package cn.edu.shou.hsh.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TaskJob {
	//每隔30秒执行的任务
	@Scheduled(cron = "0/30 * * * * ?")
	public void job() {
		//System.out.println("job task is doing...");
	}
	//每隔一分钟执行的任务
	@Scheduled(cron = "0 0/1 * * * ?")
	public void job2(){
		//System.out.println("...job2 task is doing...");
	}

}
