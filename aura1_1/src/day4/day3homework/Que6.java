package day4.day3homework;

//输出�?有的水仙花数（三位数，各位数字的立方和等于自身）�?
public class Que6 {
	public static void main(String[] args) {
		for(int num=100;num<1000;num++){
			int a=num/100;
			int b=num/10%10;
			int c=num%10;
			if (a*a*a+b*b*b+c*c*c==num){
				System.out.println(num);
			}
		}
		

	}
}
