package day9;

import java.util.Scanner;

public class Day9_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		int n = 0;
		System.out.println("请输出要选择的项目：1.存款  2.取款");
		int num = sc.nextInt();
		while (n < 3) {
			switch(num) {
			case 1:
				System.out.println("请输出要存储的金额：");
				b.deposit(sc.nextDouble());
				break;
			case 2:
				System.out.println("请输出要取款的金额");
				b.withdraw(sc.nextDouble());
				n++;
				break;
			}
		}

	}

}

class Bank {
	Diary diary;
	double money=100;
	int times = 0;

	public Diary getDiary() {
		return diary;
	}

	public void setDiary(Diary diary) {
		this.diary = diary;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}
	void moneyleft() {
		System.out.println("当前余额"+this.money);
	}

	void deposit(double money) {
		this.money += money;
		this.times = times + 1;
		this.moneyleft();
		System.out.println(this.times);

	}
	void withdraw(double money) {
		if(this.money>money) {
			this.money-=money;
		}else {
			System.out.println("余额不足");
		}
		this.moneyleft();
	}
}

class Diary {
	int[] record = new int[3];

}