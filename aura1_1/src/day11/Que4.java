package day11;

//4.	银行卡，如果还有一张信用卡，信用卡也希望对操作记录日志，并可以打印日志？如何利用多态参数实现？
class Log{
	   public static void log(Card c,String  message){
		   int index=c.getIndex();
		   String[] loginfo=c.getLoginfo();
		   //记录日志信息
			if(index >2){
				index=0;
			}
			loginfo[index]=message;
			index++;
//			index是局部变量 index是基本数据类型。需要对card对象中index也进行维护
			c.setIndex(index);
	   }
	   public static void printlog(Card c){
		   for(String li:c.getLoginfo()){
				System.out.println(li);
			}
	   }
	}
	class  Card{
		public int id;
		public String name;
		public double balance=0;
		public String []loginfo=new String[3];
		public int index=0;//日志记录的索引（日志记录到了第几条）
//		[" 4","5","3"]
//		public void recordLog(){
//			如果日志记录功能设计在这里，只能当前卡使用日志功能，其他卡不可以。
//		}
		
		public Card(int id,String name,double balance){
			this.id=id;
			this.name=name;
			this.balance=balance;
		}
		void deposit(double money){
		}
		void withdraw(double money){
		}
		void query(){
			System.out.println(this.name+"当前余额"+this.balance);
		}
		void transfer(double money,Card otherCard){
			if(this.balance<money){
				System.out.println("余额不足");
			}else{
				this.balance-=money;
				System.out.println("已成功取出"+money+"元！");
			}
			
//			给对方的卡上+money
			otherCard.balance+=money;
			this.query();
			
//			日志
			//记录日志信息
//			if(index >2){
//				index=0;
//			}
//			this.loginfo[index]="日志：活期存款成功，存入了"+money;
//			index++;
			Log.log(this, "日志：转账成功，转出"+money);

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
		public String[] getLoginfo() {
			return loginfo;
		}
		public void setLoginfo(String[] loginfo) {
			this.loginfo = loginfo;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
	}
class CreditCard extends Card{
	public CreditCard(int id, String name, double balance) {
		super(id, name, balance);
	}
	void deposit(double money){
		Log.log(this, "日志：取钱成功，取出"+money);
	}
	void withdraw(double money){
		Log.log(this, "日志：取钱成功，取出"+money);
	}
}
class  SaveCard extends Card{
	void deposit(double money){
//		this.balance=this.balance+money;
		this.balance+=money;
		System.out.println("已成功存入"+money+"元！");
		this.query();
		
		//记录日志信息
//		if(index >2){
//			index=0;
//		}
//		this.loginfo[index]="日志：活期存款成功，存入了"+money;
//		index++;
		
		Log.log(this, "日志：活期存款成功，存入了"+money);
	}
	
	void withdraw(double money){
		if(this.balance<money){
			System.out.println("余额不足");
		}else{
			this.balance-=money;
			System.out.println("已成功取出"+money+"元！");
		}
		this.query();
		
		//记录日志
//		if(index >2){
//			index=0;
//		}
//		this.loginfo[index]="日志：活期存款成功，存入了"+money;
//		index++;
		Log.log(this, "日志：取钱成功，取出"+money);

	}
	public SaveCard(int id, String name, double balance) {
		super(id, name, balance);
	}
}

public class Que4{
	    public static void main(String[] args) {
			SaveCard c=new SaveCard(1001,"张三",1000);
//			c.deposit(100);
//			c.deposit(200);
//			c.deposit(300);
//			c.deposit(400);
			
			CreditCard c2=new CreditCard(1002,"张三",0);
			c2.deposit(100);
			c2.deposit(100);
			c2.deposit(100);
			c2.deposit(100);
			c2.deposit(100);
			
		
			Log.printlog(c2);
					

//			for(String li:c.getLoginfo()){
//				System.out.println(li);
//			}
//			Log.printlog(c);
		}
 }


