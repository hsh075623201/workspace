package com.hsh.proxy.dynamic.jdk;

/**
 * JDK��̬���������
 * @author HSH
 *
 */
public class ProxyJDK_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProxyJDK pro = new ProxyJDK();//ʵ����������
		People people = (People) pro.bind(new PeopleImpl());//�󶨲�������
		people.eat();
		people.talk();
	}

}
