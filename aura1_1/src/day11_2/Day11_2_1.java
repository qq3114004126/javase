package day11_2;

public class Day11_2_1 {

	public static void main(String[] args) {
		Methods mm = new Methods(11);
		System.out.println(mm.toString());
	}

}
class Methods{
	 static int age=12;
	static {
		age = 15;
		System.out.println("我是静态块");
		
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Methods(int age) {
		super();
		this.age = age;
		
	}

	
	public String toString() {
		return "Methods [age=" + age + "]";
	}

}