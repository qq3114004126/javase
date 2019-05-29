package day9;
//2.	编写一个银行卡类，具有账号，人名与余额属性。具有存款，提款，查询余额，转账功能。
class Card11{
	int id;
	String name;
	double balance;
	
	
	public Card11(int id,String name){
		this.id=id;
		this.name=name;
	}
	void deposit(double money){
//		this.balance=this.balance+money;
		this.balance+=money;
		System.out.println("已成功存入"+money+"元！");
		this.query();
	}
	void withdraw(double money){
		if(this.balance<money){
			System.out.println("余额不足");
		}else{
			this.balance-=money;
			System.out.println("已成功取出"+money+"元！");
		}
		this.query();
	}
	void query(){
		System.out.println(this.name+"当前余额"+this.balance);
	}
	void transfer(double money,Card11 otherCard){
		if(this.balance<money){
			System.out.println("余额不足");
		}else{
			this.balance-=money;
			System.out.println("已成功取出"+money+"元！");
		}
		
//		给对方的卡上+money
		otherCard.balance+=money;
		this.query();
	}

}
class ATM1{
	Card11 card11;
	
	public Card11 getCard() {
		return card11;
	}
	public void setCard(Card11 card11) {
		this.card11 = card11;
	}


	public void withdraw() {
		this.card11.withdraw(100);
		this.card11.query();
	}
	public void deposit() {
		this.card11.deposit(800);
		this.card11.query();
	}
	public void transfer() {
		this.card11.transfer(100,card11);
		this.card11.query();
	}

}

public class Que2 {
	public static void main(String[] args) {
		Card11 c=new Card11(1001,"张三");
		Card11 otherCard=new Card11(1002,"李四");
		ATM1 atm1 = new ATM1();
		//ATM1 othercard = new ATM1();//
		atm1.deposit();
//		atm1.withdraw();
//		atm1.transfer();
		//atm1.card11.query();
//		atm1.card11.transfer(100, otherCard);
//		c.deposit(1000);
		c.withdraw(200);
		c.withdraw(200);
		c.withdraw(800);
		c.transfer(90, otherCard);
//		otherCard.query();
	    
		
	}
}
