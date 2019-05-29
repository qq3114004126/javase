package day11_1;

import java.util.Arrays;

public class Day11_3 {

	public static void main(String[] args) {
		Student s = new Student("张三",20);
		Student s1 = new Student("李四",22);
		Student[] stu = s.getPubclass();
		Pubclass c = new Pubclass("1903大数据1班");
		s.setPubclass(c);
		c.getPubclass();
		c.add(s);
		
	}

}
class Pubclass{
	int index;
	String class1;
	Student[] stu = new Student[10];
	Student student;

	
	public Pubclass(String class1) {
		super();
		this.class1 = class1;
	
	}

	public String getPubclass() {
		return class1;
	}

	public void setPubclass(String pubclass) {
		this.class1 = pubclass;
	}

	public Pubclass(Student[] stu) {
		super();
		this.stu = stu;
	}

	public Student[] getStu() {
		return stu;
	}

	public void setStu(Student[] stu) {
		this.stu = stu;
	}
	public void add(Student s) {
		for(int i = 0;i<this.stu.length;i++) {
			this.stu[index]=s;
			this.index++;
		}
		
//		System.out.println(s.name+s.age+s.pubclass);
	}
	
	
}
class Student{
	String name;
	int age;
	Pubclass pubclass;
	
	public Pubclass getPubclass() {
		return pubclass;
	}

	public void setPubclass(Pubclass pubclass) {
		this.pubclass = pubclass;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
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
	
	
}