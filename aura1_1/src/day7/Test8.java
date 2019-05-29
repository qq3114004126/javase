package day7;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输出年月日：");
		int num = sc.nextInt();
		int year = num/10000;
		int month =num%10000%100;
		int day = num%100;
		int days= calc(year,month,day);
		System.out.println(days);
		
		
	}
	public static int calc(int year,int month,int day) {
		int days = 0;
	    switch(month) {
	    case 12:
	    	days+=31;
	    case 11:
	    	days+=30;
	    case 10:
	    	days+=30;
	    case 9:
	    	days+=31;
	    case 8:
	    	days+=31;
	    case 7:
	    	days+=30;
	    case 6:
	    	days+=31;
	    case 5:
	    	days+=30;
	    case 4:
	    	days+=31;
	    case 3:
	    	if(year%4==0&&year%100!=0 || year%400==0) {
	    		days+=29;
	    	}else {
	    		days+=28;	
	    	}
	    case 2:
	    	days+=31;
	    case 1:
	    	days=day;
	    	
	    }
		return days;
	   
	    
	}
}
