package day9;

public class Day9_14 {
	public static void main(String[] args) {
		Atm a = new Atm();
		a.deposit(100);
		a.withdraw(80);
		a.deposit(1000);
		a.withdraw(90);
		a.deposit(10000);
		a.withdraw(900);
		a.Query();
		Card otherCard = new Card("1002", "李四");
		a.Transfer(10, otherCard);

	}

}

class Card {
	private String account;
	private String holder;
	private int time = 0;

	public Card(String account, String holder) {
		this.account = account;
		this.holder = holder;
	}

	public int setBalance(int num) {
		return time += num;
	}

	public void setBalance2(int num) {
		if (num <= time) {
			time -= num;
			System.out.println("取款成功,余额：" + this.getBalance());
		} else {
			System.out.println("you are a poor person.");
		}
	}

	public int getBalance() {
		return time;
	}

	public void Transfer(int num, Card otherCard) {
		if (num <= time) {
			this.time -= num;
			otherCard.time += num;
			System.out.println("转账成功，余额：" + this.time);
		}
	}

}

class Atm {
	Card c = new Card("1001", "张三");
	int[] log = new int[3];
	int[] log2 = new int[3];

	public void deposit(int num) {
		this.c.setBalance(num);
		System.out.println("存款成功！余额：" + this.c.getBalance());
		for (int i = 0; i < log.length; i++) {
			if (log[i] == 0) {
				log[i] = num;
				break;
			}
		}
	}

	public void withdraw(int num) {
		for (int i = 0; i < log2.length; i++) {
			if (log2[i] == 0 && num <= this.c.getBalance()) {
				log2[i] = num;
				break;
			}
		}
		this.c.setBalance2(num);

	}

	public void Query() {
		System.out.println(this.c.getBalance());
	}

	public void Transfer(int num, Card otherCard) {
		this.c.Transfer(num, otherCard);
	}
}
