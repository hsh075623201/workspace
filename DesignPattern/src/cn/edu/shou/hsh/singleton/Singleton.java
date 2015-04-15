package cn.edu.shou.hsh.singleton;
/**
 * 单例模式的优点：
 *1.在内存中只有一个对象，节省内存空间。
 *2.避免频繁的创建销毁对象，可以提高性能。
 *3.避免对共享资源的多重占用。
 *4.可以全局访问。
 * @author HSH
 *
 */
public class Singleton {
	
	private Singleton(){}
	private static Singleton singleton = new Singleton();
	public static Singleton getInstance(){
		return singleton;
	}

}
