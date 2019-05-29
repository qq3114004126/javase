package day9;

public class Day9_7 {

	public static void main(String[] args) {
		//Apple a = new Apple();
		//a.show();
		String str ="192.168.1.1";
		String[] firstArray = str.split("\\.");
//		System.out.println("["+str+"]");
//		for(String a:firstArray) {
//			System.out.println("["+a+"]");
		String[] secondArray = str.split("\\.",2);
		for(String b:secondArray) {
			System.out.println("["+b+"]");
		}
		
	}
	

}
class Fruit{
	void show() {
		
	}
}
class Apple extends Fruit{
	
}