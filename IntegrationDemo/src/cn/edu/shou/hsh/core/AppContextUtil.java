package cn.edu.shou.hsh.core;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
/**
 * 返回applicationContext
 * @author HSH
 *
 */
@Component
public class AppContextUtil implements ApplicationContextAware,ApplicationListener{

	private static ApplicationContext appContext;
	
	public void setApplicationContext(ApplicationContext appContext)
			throws BeansException {
		// TODO Auto-generated method stub
		AppContextUtil.appContext = appContext;
		System.out.println("setApplicationContext...");
	}
	
	public static ApplicationContext getApplicationContext() {  
        return AppContextUtil.appContext;  
    }

	public void onApplicationEvent(ApplicationEvent appEvent) {
	// TODO Auto-generated method stub
		System.out.println("start...");
		System.out.println(appEvent);
		if (appEvent instanceof ContextRefreshedEvent) {//初始化完成
			
			ContextRefreshedEvent cre = (ContextRefreshedEvent)appEvent;
			ApplicationContext ac =  cre.getApplicationContext();
			System.out.println("==================" + ac.getDisplayName());
			if(ac == appContext) {
				System.out.println("ac == appContext");
			}
			System.out.println("spring init completed...");
			
		}
		System.out.println("ended...");
	}
}
