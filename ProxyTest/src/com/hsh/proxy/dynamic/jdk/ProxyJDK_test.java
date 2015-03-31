package com.hsh.proxy.dynamic.jdk;

/**
 * JDK动态代理类测试
 * @author HSH
 *
 */
public class ProxyJDK_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProxyJDK pro = new ProxyJDK();//实例化代理类
		People people = (People) pro.bind(new PeopleImpl());//绑定操作的类
		people.eat();
		people.talk();
	}

}
