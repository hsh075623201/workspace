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
 * 如果在web.xml中配置了ContextLoaderListener
 * 则会出现多次调用 并且存在两个容器
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
		if (appEvent instanceof ContextRefreshedEvent) {
			System.out.println("spring init start...");
			ContextRefreshedEvent cre = (ContextRefreshedEvent)appEvent;
			ApplicationContext ac =  cre.getApplicationContext();
			System.out.println("==================" + ac.getDisplayName());
			if(ac == appContext) {
				System.out.println(" 1111111111111111111");
			}
			System.out.println("spring init completed...");
			
		}
	}
}
