package day4.day3homework;

//一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
public class Que11 {
	public static void main(String[] args) {
		// float high=100.0f;
		// float s=0;
		// for (int i =1;i<11;i++){
		// if (i==1){
		// s=high;
		// }else{
		// s+=high*2;
		// }
		// high/=2;
		// }
		// System.out.println(high);
		// System.out.println(s);

		float s = 100;
		float high = 100;
		for (int i = 1; i < 11; i++) {
			s += high;
			high /= 2;
			
		}
		System.out.println(high);
		System.out.println(s-high*2);
	}

}
