package day11_1;

public class Day11_1 {
	public static void main(String[] args) {
		Person pp = new Person("张三","1903大数据开发",22,"男");
		pp.toString();
		System.out.println(pp.toString());
	}
}

// 1.toString()
// 功能：将对象转换成字符串
// 可以在自己的类下重写toString方法
// class Person{
// public String name;
// public int age;
//
//// eclipse直接生成
// @Override
// public String toString() {
// return "Person [name=" + name + ", age=" + age + "]";
// }
// public Person(String name, int age) {
// super();
// this.name = name;
// this.age = age;
// }
// }
// public class Day7_2_Object {
// public static void main(String[] args) {
// Person p=new Person("张三",20);
//// System.out.println(p.toString());
// System.out.println(p);//默认调用toString方法
// }
// }
class Person {
	String name;
	String pubclass;
	int age;
	String gender;

	

	public Person(String name, String pubclass, int age, String gender) {
		super();
		this.name = name;
		this.pubclass = pubclass;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", pubclass=" + pubclass + ", age=" + age + ", gender=" + gender + "]";
	}

}

