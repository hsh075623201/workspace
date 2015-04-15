package cn.edu.shou.hsh.builder;
/**
 * ���Խ�����ģʽ
 * Productor:������Ҫ���ɵĲ�Ʒ
 * Builder:����������Ʒ�ı�׼
 * ConcreteBuilder:���ݱ�׼ ʵ�ֹ�����Ʒ�ķ�ʽ
 * Director:���ò�Ʒ�������ֵ�ʵ�ַ�ʽ ������Ʒ  �����ع����Ĳ�Ʒ
 * @author HSH
 *
 */
public class BuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productor productor = new Productor();
		ConcreteBuilder builder = new ConcreteBuilder(productor);
		Director director = new Director(builder);
		productor = director.getProductor();
		productor.showProductor();
	}

}
