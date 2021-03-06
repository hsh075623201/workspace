package com.hsh.proxy;
/**
 * 静态代理
 * 缺点：
 * 如果接口添加一个新的方法，所有的实现类和代理类都要实现这个方法，过于麻烦
 * 代码重复较多
 * @author HSH
 *
 */
public class Proxy_static implements People {
	
	private PeopleImpl peopleImpl;
	
	public Proxy_static(PeopleImpl peopleImpl){
		this.peopleImpl = peopleImpl;
	}

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eating before...");
		peopleImpl.eat();
		System.out.println("eating after...");
	}

	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("talk before...");
		peopleImpl.talk();
		System.out.println("talk after...");
		
	}

}
