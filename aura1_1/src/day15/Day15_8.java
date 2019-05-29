package day15;

public class Day15_8 {

	public static void main(String[] args) {
		String s_ = "addfjadlldglfsahfadlrhr";
		String s = "ad";
		int index = 0;;
		int num = 0;
		while(index!=-1) {
			index = s_.indexOf(s);
			s_=s_.substring(index+2);
			index = s_.indexOf(s);
			num++;
		}
		System.out.println(num);

	}

}
