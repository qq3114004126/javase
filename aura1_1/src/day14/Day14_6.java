package day14;

public class Day14_6 {

	public static void main(String[] args) {
			//BankCard c = new  BankCard();
		BankCard cc = new BankCard("张三",2000);
			ATM atm = new ATM();
			
		 try {
			 atm.insertCard(cc);
		 }catch(InsufficientFundsError e) {
			 System.out.println("余额不足");
		 }
		

	}

}
class ATM{
	
	
	private BankCard c;
	public ATM(BankCard c) {
		super();
		this.c = c;
	}

	public ATM() {
		
	}
	
	public void insertCard(BankCard c) throws InsufficientFundsError {
		c.withdraw(1000);
		this.c = c;
	}
//	public void display() throws InsufficientFundsError  {
//			//c.withdraw(3000);
//		}
	
	
}
class BankCard{
	ATM a;
	String name;
	double balance;
	
	public BankCard(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
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
	
	public void show(){
		System.out.println(this.name+"当前余额为"+this.balance);
	}
	public void withdraw(double money) throws InsufficientFundsError {
		if(money>this.balance) {
			System.out.println("余额不足");
			throw new InsufficientFundsError("出错了");
		}else {
			this.balance-= money;
			this.show();
			
			
		}
	}
	
	
}
class InsufficientFundsError extends Exception{
	public InsufficientFundsError() {}
	public InsufficientFundsError(String message) {
		super(message);
	}
}