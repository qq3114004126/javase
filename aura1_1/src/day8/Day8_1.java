package day8;

public class Day8_1 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.name="旺财";
		d.age = 3;
		d.type = "哈士奇";
		d.eat();
		d.run();
		d.sleep();
	}

}
class Dog{
	String name = "ls";
	int age;
	String type;
	void register() {
		 String name = "zs";
		System.out.println(name); 
		System.out.println(this.name);
	}
	void eat() {
		System.out.println("吃饭");
	}
	void run() {
		System.out.println("跑步");
	}
	void sleep() {
		System.out.println("睡觉");
	}
	
}