package com.hsh.proxy.dynamic.cglib;
/**
 * CGLIB实现动态代理
 * 有点：可直接对类进行代理 无需类实现接口
 * jar:
 * asm-commons-3.3
 * asm-util-3.3
 * cglib-nodep-2.1
 * asm-all-3.3
 * cglib-2.2.2
 */
import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyCGLIB implements MethodInterceptor  {
	
	private Object target;//操作的类
	/**
	 * 创建代理对象
	 * @param target
	 * @return
	 */
	public Object getInstance(Object target) {  
        this.target = target;  
        Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(this.target.getClass());  
        // 回调方法  
        enhancer.setCallback(this);  
        // 创建代理对象  
        return enhancer.create();  
	}  

	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("CGLIB start...");  
        proxy.invokeSuper(obj, args);  
        System.out.println("CGLIB end...");  
		return null;
	}

}
