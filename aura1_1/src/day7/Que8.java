package day4.day3homework;

import java.util.Random;
import java.util.Scanner;

//9.	 Random r=new Random();r.nextInt(10)可以随机输出0到9之间的数字。
//      通过输入猜随机产生的数字是什么。记录猜错的次数，如果错误超过3次，则退出，并输出“小笨蛋。。。”，如果3次之内猜对了，则输出“真聪明”

public class Que8 {
	public static void main(String[] args) {
		Random r = new Random();
		int realvalue = r.nextInt(10);
		Scanner sc = new Scanner(System.in);
	    int time=1;
		while (true) {
			if(time==4){
				System.out.println("小笨蛋");
				break;
			}
			int guess = sc.nextInt();
			if (realvalue == guess) {
				System.out.println("猜对了，真聪明");
				break;
			} else {
				System.out.println("猜错了");
				time++;
				if (realvalue > guess) {
					System.out.println("小了，大一点");
				} else {
					System.out.println("大了，小一点");
				}
			}
		}

	}
}
