package com.hsh.proxy;

public class Proxy_static_test {
	
	public static void main(String[] args){
		PeopleImpl peopleImpl = new PeopleImpl();
		Proxy_static pro = new Proxy_static(peopleImpl);
		pro.eat();
		pro.talk();
	}

}
