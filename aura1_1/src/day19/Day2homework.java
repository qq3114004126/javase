package day3;

import java.util.Scanner;

public class Day2homework {
	public static void main(String[] args) {
//		6.	定义一个字符串s="   hello，world，"
//		 (1) 去掉字符串前面的空格
		String s="   hello，world，";
		s=s.trim();
		System.out.println(s);
//		（2）截取hello
		System.out.println(s.substring(0, 5));
//		（3）去掉字符串最后的逗号
		System.out.println(s.substring(0, s.length()-1));
		System.out.println(s.substring(0, s.lastIndexOf("，")));
//		（4）将（3）结果中的逗号替换成-
		s=s.substring(0, s.length()-1);
		System.out.println(s.replace("，", "-"));
//		-----------
//		1.	编写程序，从键盘输入某个分钟数，将其转换成小时和分钟表示。
//		Scanner sc=new Scanner(System.in);
//		int ms=sc.nextInt();
//		//61  122  132
//		int hour=ms/60;
//		System.out.println(hour+"小时");
//		System.out.println(ms-hour*60+"分钟");
//		System.out.println(ms%60+"分钟");
		
		//% 经常 被使用的场景：判断余数、 判断是否能被整除
		
//		2.	输入一个三位正整数，输出该数值的百位，十位与个位。
		Scanner sc=new Scanner(System.in);
//		String ms=sc.next();//123
		
		//第一种方式，利用字符串的charat
//		System.out.println("个位"+ms.charAt(0));
//		System.out.println("十位"+ms.charAt(1));
//		System.out.println("百位"+ms.charAt(2));
		
		//第二种方式，利用数字的运算符
//		int num=sc.nextInt();//123
//		//123/100
//		System.out.println(num/100);
//		System.out.println(num/10%10);
//		System.out.println(num%10);
		
		//想如果是四位数
		int num=1234;
		System.out.println(num/1000%10);
		System.out.println(num/100%10);
		System.out.println(num/10%10);
		System.out.println(num/1%10);
		
		
//		3.	编写程序，证明&&的优先级高于||。
		System.out.println(true||false&&false);
		
//		4.	7&-3 ， 7|-3手工计算，并验证
		//  7     原码          0111 
		//-3  1011    1101
//		              0101  正数5
		System.out.println(7&-3);
		
//		5.	-5跟哪个数进行&操作仍然得-5，如何能显示出补码格式？
//		原码  1101
//		    1101---1011 补码
//		       &   1（0/1）11
//		           1011
//		两个结果 1011  -5
//		      1111  1001----原码  -1
		
		System.out.println(-5&-5);
		System.out.println(-5&-1);
		System.out.println(Integer.toBinaryString(-5&0b1111));
		
		
//		6.	给出将-27 << 3与-27 >> 3的过程。并在程序上验证是否正确
//		-27 补码 1111111111100101
//		       1111111100101000-----1000000011011000---  -128-64-16-8=
		System.out.println(Integer.toBinaryString(-27));
		System.out.println(-27*8);
		System.out.println( -128-64-16-8);
		
		
		
//		7.	输入一个数，输出该数*7的结果。（不允许使用*，也不允许连续累加）
		int i=2;
		System.out.println((2<<3)-2);
//		7 = 1  2  4
		
		System.out.println((2<<3)-2);
		System.out.println((2<<0)+(2<<1)+(2<<2));
//
//
//				----------
//		1.	一个足球队在寻找年龄在10岁到12岁的小女孩（包括10岁和12岁）加入。
//		编写程序，询问用户的性别（1表示男性，0表示女性）和年龄，然后显示一条消息指出这个人是否可以加入球队。
//		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入年龄");
//		int age=sc.nextInt();
//		System.out.println("请输入性别");
//		int gender=sc.nextInt();
//		if(gender==0 && (age<=12 && age>=10)){
//			System.out.println("可以加入球队");
//		}else{
//			System.out.println("不可以加入球队");
//		}
//
//		2.	输入3个数，找到最大值和最小值输出
//		a  b  c 
//		20  1  30  50
//		思路：前两个先比较，找到max，再跟第三个数进行比较
		int a=20,b=300,c=50;
		int min=a;
		int max=a;
		if(max<b){
			max=b;
		}else{
			min=b;
		}
		if(max<c){
			max=c;
		}
		if (a>b){
			min=b;
		}
		if(min>c){
			min=c;
		}
		System.out.println("最大值"+max);
		System.out.println("最小值"+min);
		
//
//		3.	输入一个三位数，输出各个位：123
//		        1
//		        2
//		        3
//
//		4.	一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
		int num1=5123415;
		//方式一：字符串的特性
		String n=String.valueOf(num1);
		if(n.charAt(0)==n.charAt(4)&&n.charAt(1)==n.charAt(3))
			System.out.println("回文数");
		else
			System.out.println("不是回文数");
		
		//方式二：利用数字各个位
		int a1=num1/10000;
		int a2=num1/1000%10;
		int a3=num1/100%10;
		int a4=num1/10%10;
		int a5=num1%10;
		if(a1==a5&&a2==a4){
			System.out.println("回文数");
		}else{
			System.out.println("不是回文数");
		}
		
		

	}
}
