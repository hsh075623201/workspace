package com.hsh.proxy;
/**
 * ��̬����
 * ȱ�㣺
 * ����ӿ�����һ���µķ��������е�ʵ����ʹ����඼Ҫʵ����������������鷳
 * �����ظ��϶�
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