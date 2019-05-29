package day4.day3homework;

//4.	�?�?5位数，判断它是不是回文数。即12321是回文数，个位与万位相同�?
//十位与千位相同�?�判断更多位数的数字
public class Que4 {
	public static void main(String[] args) {
		//方式�?字符串的特�?? charAt(i)
//		int num=121;
//		//0   len-1;
//		//1   len-1-1
//		//2   len-1-2
//		//i   len-1-i
//		String numStr=String.valueOf(num);
//		int len=numStr.length();
//		boolean tag=true;
//		for(int i=0;i<len/2;i++){
//			if(numStr.charAt(i)!=numStr.charAt(len-1-i)){
//				System.out.println("不是回文�?");
//				tag=false;
//				break;
//			}
//		}
//		if(tag){
//			System.out.println("是回文数");
//		}
//		
		
		//方式�?  利用数字，取每一�?
		int num=12381;
//		int a=num/10000%10;  //10^4
//		int b=num/1000%10;//10^3
////		.a..
//		int e=num/1%10;//10^0   e*10^4+d*10^3+c*10^2+b*10^1+a*10^0
		
		int len=String.valueOf(num).length();
		int num_new=0;
		for(int i=0;i<len;i++){//0 1 2 3 4
			int a=(int)(num/Math.pow(10, i))%10;
			num_new+=Math.pow(10, len-1-i)*a;
		}
		if(num==num_new){
			System.out.println("是回文数");
		}else{
			System.out.println("不是回文�?");
		}
		
		
		
		
		
	}

}
