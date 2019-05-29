package day7;

public class Day7_2 {

	public static void main(String[] args) {
		
		System.out.println(calc(2));

	}
	public static  double calc(int day) {
		if(day==1) {
			return 50.0;
		}else {
			
			return (calc(day-1))/2; 
		}
		
	}

}
