package day8;

import java.util.Scanner;

public class Day8_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank(1001,"张三",12000);
//		bank.seek();
		while(true) {
			System.out.println("请输入要选择的项目：1.存款 2.取款 3.查询 4.转账");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				bank.deposit();
				break;
			case 2:
				bank.withdraw();
				break;
			case 3:
				bank.seek();
				break;
			case 4:
				bank.transferaccount();
				break;
			case 5:
				default:
					System.out.println("输入错误请重新输入!");
			}
		}
		
		
		
		
	}

}
class Bank{
	int id;
	String name;
	double leftmoney;
	
	public Bank(int id, String name, double leftmoney) {
		super();
		this.id = id;
		this.name = name;
		this.leftmoney = leftmoney;
	}
	public Bank() {
		
	}
	void deposit() {
		System.out.println("欢迎进入存款功能");
		System.out.println("请输入要存入的金额");
		Scanner sc = new Scanner(System.in);
		double money = sc.nextDouble();
		this.leftmoney = leftmoney+money;
		System.out.println("当前余额为"+this.leftmoney);
	}
	void withdraw() {
		System.out.println("欢迎进入取款功能");
		System.out.println("请输入要取的金额:");
		Scanner sc = new Scanner(System.in);
		double takemoney = sc.nextDouble();
		if(takemoney<=this.leftmoney) {
			System.out.println("取款成功");
			System.out.println("当前余额为:"+(leftmoney-takemoney));
		}else {
			System.out.println("余额不足");
		}
	}
	void seek() {
		System.out.println("欢迎进入查询功能");
		System.out.println("显示用户的账号:"+id);
		System.out.println("显示用户的姓名:"+name);
		System.out.println("显示用户的余额:"+leftmoney);
		
	}
	void transferaccount() {
		System.out.println("欢迎进入转账功能");
		System.out.println("请输入要转账的金额");
		Scanner sc = new Scanner(System.in);
		double transfermoney = sc.nextDouble();
		if(transfermoney<=this.leftmoney) {
			System.out.println("取款成功");
			System.out.println("当前余额为:"+(leftmoney-transfermoney));
		}else {
			System.out.println("余额不足");
		}
		
	}
}
