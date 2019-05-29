package day10;
public class Day10_1{
	public static void main(String[] args) {
		 Pubclass p = new  Pubclass();
		 Student s = new Student();
		
	}
}
class Pubclass {

	Student[] stu = new Student[30];
	int num;

	public void addStudent(Student s) {
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] == null) {
				stu[i] = s;
				num++;
			}
		}
	}

	public int getNum() {
		return num;
	}

	public void classroom() {
		System.out.println("共有" + num + "位学生");
	}
}

class Student {
	private String name;
	private int age;
	Pubclass ccc;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void massage() {
		int sum = ccc.getNum();
		System.out.println("学生:" + this.name + " 年龄:" + this.age + "学生人数：" + sum);
	}
}
