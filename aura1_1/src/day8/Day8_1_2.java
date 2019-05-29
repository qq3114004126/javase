package day8;

public class Day8_1_2 {

	public static void main(String[] args) {
		
		Person1_1 pp = new Person1_1("zs",22);
		
	
		
	}

}

class Person1_1 {
	String name;
	int age;
	String place;// 弱依赖关系的属性

	public void test() {
		// this();
		// new Person();
	}

	public Person1_1() {
		System.out.println("你是王八蛋!");
	}

	public Person1_1(String name) {
		this();
		this.name = name + "new";
		System.out.println(this.name);
	}

	public Person1_1(String name, int age) {
		// name和age是强依赖关系的属性
		// 强弱由业务需求
	
		this(name);// 要求放在第一句
		this.name = name;
		this.age = age;
		System.out.println("这是Person的构造器");
	}
}