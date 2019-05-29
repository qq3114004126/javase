package day9;

class Student{
	private String name;
	private int age;
	Classroom c =new Classroom();

	public String getInfo() {
		return "姓名："+name +"，年龄：" +age+", 人数"+this.c.getCount();
	}
	public void setInfo(int age,String name) {
		this.age = age;
		this.name =name;
	}
}


class Classroom{
	int n =56;
	Student[] s = new Student[n];
	private String grade;
	private int count =56;
	public int getCount() {
		return count;
	}
	public void setInfo(String grade) {
		this.grade = grade;
	}
	public void setInfo(String grade,int num) {
		this.grade = grade;
		this.n+=num;
	}
	public String getInfo() {
		return "班级："+this.grade+"，人数： " +this.n;
	}




	/*main方法里的内容*/
	public static void main(String[] args) {
		Student s = new Student();
		s.setInfo(18,"allen");
		System.out.println(s.getInfo());
		Classroom c = new Classroom();
		c.setInfo("1903班", 1);
		System.out.println(c.getInfo());
	}
	}
