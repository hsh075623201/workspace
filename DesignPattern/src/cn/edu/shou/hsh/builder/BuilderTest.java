package cn.edu.shou.hsh.builder;
/**
 * 测试建造者模式
 * Productor:定义需要生成的产品
 * Builder:定义生产产品的标准
 * ConcreteBuilder:根据标准 实现构建产品的方式
 * Director:调用产品各个部分的实现方式 构建产品  并返回构建的产品
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
