package day4.day3homework;

//输出10行内容，每行的内容都不一样，�?1行一个星号，�?2�?2个星号�??
//圣诞�?
public class Que5 {
	public static void main(String[] args) {
	   for (int i=1;i<11;i++){
		   for(int j=1;j<i+1;j++){
	    	   System.out.print("*");
	       }
	       System.out.println();
	   }
	   
	   for (int i=1;i<11;i++){//每一�?
		   for(int k=1;k<11-i;k++){
			   System.out.print(" ");
		   }
		   for(int j=1;j<i+1;j++){
	    	   System.out.print("*");
	       }
		   for(int j=1;j<i;j++){
	    	   System.out.print("*");
	       }
	       System.out.println();
	   }
	   
	}
}
