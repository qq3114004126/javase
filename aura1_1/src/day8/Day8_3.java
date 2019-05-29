package day8;

public class Day8_3 {

	public static void main(String[] args) {
		Person1 pp = new Person1();
		 pp.method3(1,2,3);
		

	}

	

}
class Person1{
	
	void method1(int x) {
		System.out.println(x);
		method2(2,1);
	}
	void method2(int x,int y) {
		System.out.println(x+","+y);
		method3(5,2,0);
		
	}
	void method3(int x,int y,int z) {
		System.out.println(x*x+y*y+z*z);
	}
	void powSum(int... a) {
		System.out.println();
		int s = 0;
		for(int x:a) {
			s+=x*x;
		}
		System.out.println(s);
	}
}