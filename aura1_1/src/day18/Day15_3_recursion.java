package day15;
/*
 * 递归的思想：
 * 分为两个过程：递推、回归
 * 
 * 直接调用：A--->A
 * 间接调用：A-->B-->A
 * 
 * 当某个条件成立的时候，递归终止。使用循环解决的部分问题。
 * 
 * 例子：
 */
public class Day15_3_recursion {
//	1.1+2+3+...100
//	1+2+3+...100    100+99项的累加和
//	1+2+3+...99     99+98项的累加和
//	1+2+3+...98     98+97项的累加和
//	...
//	1+2             2+1项的累加和
//	1               1
//	突破点：n=1     1
//	      n>1     [n-1项的和]+n
	public static int fun(int i){
		if(i==1)
			return 1;
		else
			return fun(i-1)+i;
	}
	
	
//	2.n！=n*(n-1)(n-2).....1
//	n==1  1   n>1 n*f(n-1)
	public static int fun2(int n){
		if(n==1)
			return 1;
		else{
			return n*fun2(n-1);
		}
	}
	
	

//   3.斐波那切数列
//   除了前两项以外，每一项都是前两项的和
//   1 1 2  3  5 8  13  21  34  55 ......
//	 突破点  
//	n==1 || n==2  1
//	n>2   f(n-1)+f(n-2)
	public static int  fun3(int n){
		if(n==1 ||n==2)
			return 1;
		else
			return fun3(n-1)+fun3(n-2);
	}

	    
//	   4.汉诺塔
	  public static void fun4(int n,String A,String B,String C){
		  if(n==1)
			  System.out.println(A+"-->"+C);
		  else{
			  fun4(n-1,A,C,B);
			  System.out.println(A+"-->"+C);
			  fun4(n-1,B,A,C);
		  }
		  
	  } 
	   
	   
	   public static void main(String[] args) {
//		   System.out.println(fun(100));
//		   System.out.println(fun2(10));
//		   System.out.println(fun3(10));
		   fun4(3,"A","B","C");
	   }	   
}
