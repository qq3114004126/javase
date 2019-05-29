package day7;

public class Day3_1_6 {

	public static void main(String[] args) {
		int num = 0;
		boolean flag = true;
		for (int i = 1; i <= 100; i++) {
			for (int d = 2; d <= Math.sqrt(i)+1; d++) {
				if (i % d == 0) {
					flag = false;
					break;
				} else {
					flag = true;

				}
				
			}
			if (flag) {
				System.out.println(i);
			}

		}
	}

}
