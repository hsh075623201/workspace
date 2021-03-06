package com.hsh.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK 动态代理类
 * 缺点：操作的类 需要实现接口
 * @author HSH
 * 
 */
public class ProxyJDK implements InvocationHandler {

	private Object target; // 目标操作类

	public Object bind(Object target) {
		this.target = target;
		// 取得代理对象
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), this); // 要绑定接口
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		Object result = null;
		System.out.println("start......");
		// 执行方法
		result = method.invoke(target, args);
		System.out.println("end......");
		return result;
	}

}
