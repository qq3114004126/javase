package day17;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Day17_6 {
	public static void test() {
		
		
	}
	public static void main(String[] args) {
		
		SortedSet<Person> tree = new TreeSet<>((p2,p1)->p2.getAge()-p1.getAge());
		tree.add(new Person(22,"张三"));
		tree.add(new Person(22,"赵三"));
		tree.add(new Person(24,"王三"));
		tree.add(new Person(26,"李三"));
		//tree.forEach(System.out::println);
		Iterator<Person> pp = tree.iterator();
		while(pp.hasNext()) {
			Person p = pp.next();
			System.out.println(p.name+":"+p.age);
		}
	}

}
class Person{
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
}