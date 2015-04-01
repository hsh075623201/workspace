package com.hsh.proxy.dynamic.cglib;
/**
 * CGLIBʵ�ֶ�̬����
 * �е㣺��ֱ�Ӷ�����д��� ������ʵ�ֽӿ�
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
	
	private Object target;//��������
	/**
	 * �����������
	 * @param target
	 * @return
	 */
	public Object getInstance(Object target) {  
        this.target = target;  
        Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(this.target.getClass());  
        // �ص�����  
        enhancer.setCallback(this);  
        // �����������  
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
