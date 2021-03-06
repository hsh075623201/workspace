package cn.edu.shou.hsh.builder;
/**
 * 通过调用建造者构建产品
 * @author HSH
 *
 */
public class Director {

	private Builder concreteBuilder;
	public Director(Builder builder){
		this.concreteBuilder = builder;
	}
	public Productor getProductor(){
		concreteBuilder.buildPart1("part1...");
		concreteBuilder.buildPart2("part2...");
		concreteBuilder.buildPart3("part3...");
		return concreteBuilder.getProductor();
		
	}
}
