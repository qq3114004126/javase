package day10;

public class Day10_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit1_1 f = new Fruit1_1();
		Apple1 a =new Apple1();
		Fruit1_1 f1 = new Apple1();
		
		f=a;
		a=(Apple1)f;
	}

}
class Fruit1_1{
	
}
class Apple1 extends Fruit1_1{
	void show() {
		System.out.println("qesd");
	}
}