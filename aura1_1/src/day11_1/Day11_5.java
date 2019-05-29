package day11_1;

import java.util.Arrays;

public class Day11_5 {

	public static void main(String[] args) {
		Student2_1 s =  new Student2_1("张三",23);
		Student2_1 s1 = new Student2_1("李四",21);
		Student2_1 s2 = new Student2_1("王五",25);
		Student2_1 s3 = new Student2_1("赵六",29);
		Student2_1 s4 = new Student2_1("刘七",24);
		Student2_1 s5 = new Student2_1("王八",28);
		Grade11 g = new Grade11("大数据1903开发1班");
		s.setGrade(g);
		g.add(s);
		s1.setGrade(g);
		g.add(s1);
		s2.setGrade(g);
		g.add(s2);
		s3.setGrade(g);
		g.add(s3);
		System.out.println(s.getGrade().getName());
		Student2_1[] Stu=g.getStu();
		for(int i = 0;i<g.getStu().length;i++) {
			if(Stu[i]!=null) {
				System.out.println(Stu[i].name+" "+Stu[i].age);
			}else {
				break;
			}
		}	
	}
}
class Grade11{
	
	String name;
	Student2_1[] stu = new Student2_1[3];
	
	public Grade11(String name) {
		super();
		this.name = name;
	}
	public void add(Student2_1 ss) {
		boolean tag = true;
		int num = 0;
		for(int i =0;i<3;i++) {
			if(this.stu[i]==null) {
				this.stu[i]=ss;
				tag = false;
				break;
			}
		}
		if(tag) {
			System.out.println("学生已添加满,无法加入");
		}
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student2_1[] getStu() {
		return stu;
	}
	public void setStu(Student2_1[] stu) {
		this.stu = stu;
	}
	

	
	
}
class Student2_1{
	String name;
	int age;
	Grade11 grade;
	
	public Student2_1(String name, int age) {
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
	public Grade11 getGrade() {
		return grade;
	}
	public void setGrade(Grade11 grade) {
		this.grade = grade;
	}
	
	
}
