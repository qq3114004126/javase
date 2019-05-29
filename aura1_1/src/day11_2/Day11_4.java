package day11_2;

public class Day11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICBC icbc = new ICBC("深圳工商银行支行");
		Card cc = new Card(1000000,"王五");
//		icbc.open();
//		icbc.close();
		cc.ic.deposit(1000000);
	}

}
interface Building{
	String name = "商业大厦";
	void open();
	void close();
	
	
	
}
interface Bank{
	
	void deposit(double money);
}
class finance implements Bank,Building{
	String name;
	
	Card c;
	public finance(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void open() {
		System.out.println("早上9点开门");
		
	}

	@Override
	public void close() {
		System.out.println("晚上6点关门");
		
	}

	@Override
	public void deposit(double money) {
		this.c.balance+=money;
		System.out.println("当前余额为："+this.c.balance);
	}
	
}
class ICBC extends finance {
	
	String name = "工商银行支行";
	public ICBC(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	
}
class Card {
	ICBC ic;
	double balance;
	String name;
	public Card(double balance, String name) {
		super();
		this.balance = balance;
		this.name = name;
		
	}
	
}