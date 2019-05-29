package day11_1;

import java.util.Arrays;

public class Day11_4 {

	public static void main(String[] args) {
		Studentss s = new Studentss("张三",23);
		Grade g = new Grade("大数据1903开发1班");
		s.setGrade(g);
		g.add(s);
	}

}
class Grade{
	String name;
	private Student[] stu = new Student[10];
	
	public Grade(String name) {
		super();
		this.name = name;
	}
	public void add(Studentss ss) {
		boolean tag = true;
		for(int i =0;i<this.stu.length;i++) {
			if(this.stu[i]==null) {
				this.stu[i]=ss;
				tag = false;
			}
			}
		if(tag) {
			System.out.println("学生已添加满,无法加入");
		}
		System.out.println(Arrays.toString(stu));
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student[] getStu() {
		return stu;
	}
	public void setStu(Student[] stu) {
		this.stu = stu;
	}

	
	
}
class Studentss{
	String name;
	int age;
	Grade grade;
	
	public Studentss(String name, int age) {
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
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	
}