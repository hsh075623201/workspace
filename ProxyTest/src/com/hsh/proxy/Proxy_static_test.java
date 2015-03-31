package com.hsh.proxy;
/**
 * æ≤Ã¨¥˙¿Ì≤‚ ‘
 * @author HSH
 *
 */
public class Proxy_static_test {
	
	public static void main(String[] args){
		PeopleImpl peopleImpl = new PeopleImpl();
		Proxy_static pro = new Proxy_static(peopleImpl);
		pro.eat();
		pro.talk();
	}

}
