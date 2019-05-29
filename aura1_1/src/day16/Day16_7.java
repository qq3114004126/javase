package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Day16_7 {

	public static void main(String[] args) {
		Student stu1 = new Student("张三",21,165);
		Student stu2 = new Student("李四",22,170);
		Student stu3 = new Student("王五",23,172);
		List list = new ArrayList();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		
		list.forEach(System.out::println);
        
		
		
	}

}
class Student{
	String name;
	int age;
	int height;
	public Student(String name, int age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	
}