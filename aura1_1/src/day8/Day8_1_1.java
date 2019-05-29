package day8;

public class Day8_1_1 {

	public static void main(String[] args) {
		new Person11().fun2("zst");

	}

}

class Person11 {
	String name;

	void fun1() {
		System.out.println("这是fun1方法");
	}

	void fun2(String name) {
		this.fun1();
		this.name = name;
		System.out.println(this.name);
	}
}