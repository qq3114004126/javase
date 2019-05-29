package day10;

//2.	编写一个银行卡类，具有账号，人名与余额属性。编写提款机类，接收一张银行卡，
//并且具有存款，提款，查询余额，转账功能。
class Card1_1 {
	private int id;
	private String name;
	private double balance = 0;

	public Card1_1(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	void deposit(double money) {
		// this.balance=this.balance+money;
		this.balance += money;
		System.out.println("已成功存入" + money + "元！");
		this.query();
	}

	void withdraw(double money) {
		if (this.balance < money) {
			System.out.println("余额不足");
		} else {
			this.balance -= money;
			System.out.println("已成功取出" + money + "元！");
		}
		this.query();
	}

	void query() {
		System.out.println(this.name + "当前余额" + this.balance);
	}

	void transfer(double money, Card1_1 otherCard) {
		if (this.balance < money) {
			System.out.println("余额不足");
		} else {
			this.balance -= money;
			System.out.println("已成功取出" + money + "元！");
		}

		// 给对方的卡上+money
		otherCard.balance += money;
		this.query();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}

class ATM11 {
	Card1_1 c;

//	public ATM11(Card1_1 c) {
//		this.c = c;
//	}

	public void insertCard(Card1_1 c) {
		this.c = c;
	}

//	public void withdraw(double money,Card1_1 c){
	
	public void withdraw(double money) {
		this.c.withdraw(money);
	}

	public void deposit(double money) {
		this.c.deposit(money);
	}

	public void transfer(double money, Card1_1 otherCard) {
		this.c.transfer(money, otherCard);
	}
}

public class Que2 {
	public static void main(String[] args) {
		ATM11 atm = new ATM11();
		Card1_1 c = new Card1_1(1001, "张三", 1000);
		Card1_1 c_ = new Card1_1(1001, "李四", 500000);
		
	//	atm.withdraw(100);
		atm.insertCard(c);
		atm.insertCard(c_);
		atm.withdraw(100);// 将card设置成属性的时候可以直接进行调用
	}
}
