package com.hsh.proxy.dynamic.cglib;

public class ProxyCGLIB_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProxyCGLIB proxy = new ProxyCGLIB();
		PeopleImpl people = (PeopleImpl) proxy.getInstance(new PeopleImpl());
		people.eat();
		people.talk();
	}

}
