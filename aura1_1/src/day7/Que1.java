package day4.day3homework;

import java.util.Scanner;

//1.	一个足球队在寻找年龄在10岁到12岁的小女孩（包括10岁和12岁）加入。
//编写程序，询问用户的性别（1表示男性，0表示女性）和年龄，然后显示一条消息指出这个人是否可以加入球队，
//询问10次后，输出满足条件的总人数。
public class Que1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int time=1;
		int count=0;
		while (time<=10){
			System.out.println("请输入性别：");
			int gender=sc.nextInt();
			System.out.println("请输入年龄：");
			int age=sc.nextInt(); 
			if (gender ==0&& age>9 && age<13){
				System.out.println("符合要求");
				count++;
			}else{
				System.out.println("不符合要求");
			}
		}
	}
}
