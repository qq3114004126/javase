package day11;

public class Day11_8 {

	public static void main(String[] args) {
		boolean tag = true;
		for(int i = 10;i<100;i++) {
			for(int d= 2;d<i-1;d++) {
				int num = i%10*10+i/10;
				if(i%d==0||num%d==0) {
				    tag = false;
					break;
				}else {
					tag = true;
				}
			}
			
			if(tag) {
				System.out.println(i);
			}
			
		}

	}

}
