package day9;

public class Day9_8 {

	public static void main(String[] args) {
		int n = 50;
		Pubclass1 pubclass1 = new Pubclass1(50);
		Student stu = new Student("zs",20);
		pubclass1.add(1);
		System.out.println(pubclass1.number);
		stu.classNumber();
	}

}
class Pubclass1{
	Student[] student=new Student[50];
	int number;//班级人数
//	public Pubclass(int number) {
//		
//		this.number = number++;
//	}

	public Pubclass1(){
		String[] name = new String[50];
		int [] age = new int[50];
		
	}
	
	public Pubclass1(int number) {
		
		this.number = number;
	}
	int add(int num){
		System.out.println("向班级里添加num个学生");
		this.number+=num;
		return this.number;
	}
	void numberStudent() {
		System.out.println(this.number);
	}
	
	
}
class Student{
	Pubclass1 pubclass1;
	String name;
    int age;
    
	
	public Student( String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public void classNumber() {
		
		System.out.println(this.pubclass1.number);
	}

	
}