package cn.edu.shou.hsh.builder;
/**
 * ���ݱ�׼ ʵ�ֹ�����Ʒ�ķ�ʽ
 * @author HSH
 *
 */
public class ConcreteBuilder extends Builder{

	private Productor productor;
	public ConcreteBuilder(Productor productor){
		this.productor = productor;
	}
	public void buildPart1(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
		productor.setPart1(str);
	}

	public void buildPart2(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
		productor.setPart2(str);
	}

	public void buildPart3(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
		productor.setPart3(str);
	}
	
	public Productor getProductor() {  
        return productor;  
    }  

}