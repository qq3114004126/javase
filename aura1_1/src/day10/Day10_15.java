package day10;

public class Day10_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fruit121 f= new Apple();
		//f.show();
		Test1_ tt = new Test1_();
		Apple a = new Apple();
		tt.print(a);
		
	}

}
class Fruit121{
	public void show(){
		System.out.println("水果的show");
	}
	public void j(){
		System.out.println("苹果酱");
	}
}
class Apple extends Fruit121{
	public void show(){
		System.out.println("苹果的show");
}
	public void printlin(){
		System.out.println("asads");
	}
	
}
class Test1_{
	public void print( Fruit121 ff) {
		ff.show();
		ff.j();
	}
}
	
	//public static void main(String[] args) {
	//【父类引用指向子类对象】（非常用）
	