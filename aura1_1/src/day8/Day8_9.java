package day8;

public class test4 {
	public static void main(String[] args) {
		Day8_9 ca = new Day8_9();
		ca.all();
	}
}
//单张牌方法
public class CardOne {
	String[] colour = { "梅花", "方片", "红桃", "黑桃" };
	int num;

	void one(int num) {
		for (int i = 0; i < 4; i++) {
			if (num == 11) {
				System.out.println(colour[i] + 'j');
			} else if (num == 12) {
				System.out.println(colour[i] + 'Q');
			} else if (num == 13) {
				System.out.println(colour[i] + 'K');
			} else if (num == 14) {
				System.out.println(colour[i] + 'A');
			} else {
				System.out.println(colour[i] + num);
			}
		}
	}
}
//全部牌
public class Day8_9 {
	
	void all() {
		int[] array= {0,2,3,4,5,6,7,8,9,10,11,12,13,14};
		for(int i= 1;i<14;i++) {
			CardOne co =new CardOne();
			co.one(array[i]);
		}
	}

}

