package com.hsh.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK ��̬������
 * ȱ�㣺�������� ��Ҫʵ�ֽӿ�
 * @author HSH
 * 
 */
public class ProxyJDK implements InvocationHandler {

	private Object target; // Ŀ�������

	public Object bind(Object target) {
		this.target = target;
		// ȡ�ô�������
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), this); // Ҫ�󶨽ӿ�
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		Object result = null;
		System.out.println("start......");
		// ִ�з���
		result = method.invoke(target, args);
		System.out.println("end......");
		return result;
	}

}