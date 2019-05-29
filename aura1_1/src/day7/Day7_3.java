	package day3;

public class Day3_9 {

	public static void main(String[] args) {
		int num =0;
		for(int i =1;i<=4;i++) {
			for(int j = 1;j<=4;j++) {
				for(int k = 1;k<=4;k++) {
					if((i!=j)&&(j!=k)&&(i!=k)) {
						System.out.print(i*100+j*10+k+" ");
						num++;
						if(num%4==0) {
							System.out.println();
						}
					}
				}
			}
		}
		System.out.println("¸öÊýÎª"+num);

	}

}
