package day11_2;

public class DAY11_3 {

	public static void main(String[] args) {
		UniversityTeacher ut = new UniversityTeacher("王艳",25);
		ut.add();
		UniversityTeacher tt = new UniversityTeacher("赵四",25);
		tt.teach();

	}

}
abstract class Teacher{
	String name;
	int age;
	
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	abstract void teach();
		
	
}
abstract class MathTeacher extends Teacher{

	public MathTeacher(String name, int age) {
		super(name, age);
		
	}

	abstract void teach();
		
	abstract void add();
		
	
}
class UniversityTeacher extends MathTeacher{

	public UniversityTeacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void add() {
		System.out.println(this.name+","+this.age+"可以进行加法运算");
		
	}

	@Override
	void teach() {
		System.out.println(this.name+","+this.age+"可以教学");
		
	}
	
}
