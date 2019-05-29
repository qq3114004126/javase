package day10;

public class Day10_2 {

	public static void main(String[] args) {
		PythonTeacher p = new PythonTeacher();
//		JavaTeacher J = new JavaTeacher("ls");
//		J.teach();
	}

}
class Teacher{
	private int age=25;
	private String name = "王五";
	
	public Teacher() {
		
		
	}

	void teach() {
		System.out.println("教学"+name+age);
	}
}
class JavaTeacher extends Teacher{
	
	public JavaTeacher(String name) {
		super();
		this.name = name;
	}
	void teach() {
		System.out.println("教学"++J.age);
	    super.teach();
	}

	public JavaTeacher() {
		super.teach();
	}
	
}
class PythonTeacher extends Teacher{
	
	

	public PythonTeacher() {
		super.teach();
	}
	
}