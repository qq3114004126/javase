package day10;

public class Day10_13 {

	public static void main(String[] args) {
		Test t = new Test();
		U u = new U("u盘");
		t.test3(u);
		M m = new M("MP3");
		t.test3(m);
		m.readWrite();
		PM pm = new PM("移动硬盘");
		t.test3(pm);
	
		pm.cast();
		
	}

}
class Computer{
	String type;
	
	public Computer() {
		super();
	}

	void readWrite() {
		System.out.println("可以读和写");
	}
}
class U extends Computer{
	String name;
	public U(String name) {
		super();
		this.name = name;
	}
	void readWrite() {
		System.out.println(this.name+"可以读和写");
	}
	
	
}
class M extends Computer{
	String name;

	public M(String name) {
		super();
		this.name = name;
	}
	void readWrite() {
		System.out.println(this.name+"可以读和写");
	}
	
}
class PM extends Computer{
	String name;
	
	public PM(String name) {
		super();
		this.name = name;
	}
	void readWrite() {
		System.out.println(this.name+"可以读和写");
	}
	void cast() {
		System.out.println(this.name+"播放音乐功能");
	}
}
class Test{
	public void test3(Computer cc) {
		cc.readWrite();
	}
}