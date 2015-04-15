package cn.edu.shou.hsh.builder;
/**
 * ���幹����Ʒ�ı�׼
 * @author HSH
 *
 */
public abstract class Builder {

	public abstract void buildPart1(String str);
	public abstract void buildPart2(String str);
	public abstract void buildPart3(String str);
	public abstract Productor getProductor();
}