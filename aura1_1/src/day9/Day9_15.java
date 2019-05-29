package day9;

public class Day9_15 {

	public static void main(String[] args) {
		Gaozao g = new Gaozao();

	}

}
class Gaozao{
	String name;
	Interview interview;
	int age;
	public Gaozao() {
		this(6);
		System.out.println("我是构造器");
	}
	protected Gaozao(int d) {
		this(4,5);
	    System.out.println("我是d");
	}
	 Gaozao(int d,int e) {
		 this(1,2,3);
		System.out.println("我是d和e");
	}
	private Gaozao(int d,int e,int f) {
		System.out.println("我是"+d+"和"+e+"和"+f);
	}
	
	
}
class Interview{
	int Id;
	Gaozao gaozao;
	void visit() {
		
	}
	public Interview(int id) {
		this.gaozao(1,2);//无法访问另外一个类
		System.out.println("我是ID");
		
	}
	
	
}