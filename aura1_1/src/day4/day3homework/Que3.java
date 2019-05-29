package day4.day3homework;
//题目：有四个数字�?1�?2�?3�?4，能组成多少个互不相同且无重复数字的三位数？各是多少�?
//程序分析：可填在百位、十位�?�个位的数字都是1�?2�?3�?4。组成所有的排列后再�? 掉不满足条件的排列�??

public class Que3 {
	public static void main(String[] args) {
//		for (int i=1;i<=4;i++){
//			for (int j=1;j<=4;j++){
//				for (int k=1;k<=4;k++){
//					if(i!=j&&j!=k&&i!=k){
//						System.out.println(""+i+j+k);
//					}
//				}
//			}
//		}
		int i=1,j=1,k=1;
		while(i<5){
			while (j<5){
				while(k<5){
					if(i!=j&&j!=k&&i!=k){
						System.out.println(""+i+j+k);
					}
					k++;
				}
				j++;
				k=1;
			}
			i++;
			j=1;
		}
	}

}
