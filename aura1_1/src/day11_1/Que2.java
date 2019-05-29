package day7.day6homework;

//2.	编写一个银行卡类，具有账号，人名与余额属性。编写提款机类，接收一张银行卡，
//并且具有存款，提款，查询余额，转账功能。
//class  Card{
//	private int id;
//	private String name;
//	private double balance=0;
//	
//	public Card(int id,String name,double balance){
//		this.id=id;
//		this.name=name;
//		this.balance=balance;
//	}
//	void deposit(double money){
////		this.balance=this.balance+money;
//		this.balance+=money;
//		System.out.println("已成功存入"+money+"元！");
//		this.query();
//	}
//	void withdraw(double money){
//		if(this.balance<money){
//			System.out.println("余额不足");
//		}else{
//			this.balance-=money;
//			System.out.println("已成功取出"+money+"元！");
//		}
//		this.query();
//	}
//	void query(){
//		System.out.println(this.name+"当前余额"+this.balance);
//	}
//	void transfer(double money,Card otherCard){
//		if(this.balance<money){
//			System.out.println("余额不足");
//		}else{
//			this.balance-=money;
//			System.out.println("已成功取出"+money+"元！");
//		}
//		
////		给对方的卡上+money
//		otherCard.balance+=money;
//		this.query();
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getBalance() {
//		return balance;
//	}
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//}
//class ATM{
//	Card c;
////	public ATM(Card c){
////		this.c=c;
////	}
//	public void insertCard(Card c){
//		this.c=c;
//	}
////	public void withdraw(double money,Card c){
//	public void withdraw(double money){
//		this.c.withdraw(money);
//	}
//	public void deposit(double money){
//		this.c.deposit(money);
//	}
//	public void transfer(double money,Card otherCard){
//		this.c.transfer(money, otherCard);
//	}
//}
//
//public class Que2 {
//	public static void main(String[] args) {
//		ATM atm=new ATM();
//		Card c=new Card(1001,"张三",1000);
////		atm.withdraw(100, c);
//		atm.insertCard(c);
//		atm.withdraw(100);//将card设置成属性的时候可以直接进行调用
//	}
//}
