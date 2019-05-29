package day11_1;

public class Day11_2 {

	public static void main(String[] args) {
		// 对于字符串类型来说，重写equals方法，字符序列相同，则判定两个字符串相同
//		String s = "abc";
//		String s1 = "abc";
//		System.out.println(s == s1);
//		System.out.println(s.equals(s1));

		Person1 p1 = new Person1("张三", 20);
		Person1 p2 = new Person1("张三", 20);
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}
}
class Person1{
	String name;
	int age;
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}