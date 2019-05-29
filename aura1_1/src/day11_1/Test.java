package day11_1;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DepositCard dd =new DepositCard("张三",10,1000); 
		CreditCard cc = new CreditCard("李四",11,10000);
		Test2 tt = new Test2();
		tt.print(dd);
		for(String i:dd.getLogRecord()) {
			System.out.println(i);
			
		}
	}

}
class log{
	public static void Log(Card c,String message){
		String[] logrecord=c.getLogRecord();
		int index =c.getIndex();

		if(index>2) {
			index=0;
		}
		
		logrecord[index]=message;
				
		index++;
		c.setIndex(index);
	}
}
class Card{
	String name;
	int id;
    double balance;
	int index=0;
	String[]logRecord=new String[3];
	public String[] getLogRecord() {
		return logRecord;
	}
	public void setLogRecord(String[] logRecord) {
		this.logRecord = logRecord;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	
	public Card(String name, int id, double balance) {
		super();
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double money) {
		this.balance+=money;
		//this.query();
		
//		for(int i =index;i<this.logRecord.length;i++) {
//			String message = "第"+index+"次存款"+money+",当前余额："+this.balance;
//			this.logRecord[i]=message;
//			this.index++;
//			
//		}
		log.Log(this,this.getName()+"第"+(this.index+1)+"次存款"+money+",当前余额："+this.balance);
		
	}
	public void withdraw(double money) {
		this.balance-=money;
		this.query();
	}
	public void query() {
		System.out.println("当前余额："+this.balance);
	}
	
}
class DepositCard extends Card{

	public DepositCard(String name, int id, double balance) {
		super(name, id, balance);
		
	}
	
}
class CreditCard extends Card{

	public CreditCard(String name, int id, double balance) {
		super(name, id, balance);
		
	}
	
}
class Test2{
	public void print(Card c) {
		c.deposit(1000);
		c.deposit(1000);
		c.deposit(1500);
		c.deposit(1500);
		c.deposit(1500);
		c.deposit(1500);
		
		
		
		
		
		
	}
}