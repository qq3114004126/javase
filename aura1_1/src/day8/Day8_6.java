package day8;

public class Day8_6 {

	

	public static void main(String[] args) {
		Counter cc = new Counter();
		Counter cc1 = new Counter();
		Counter cc2 = new Counter();
		System.out.println(Counter.count);
		
	}

}
class Counter{
	static int count;

	public Counter() {
		count++;
		
	}

	
}