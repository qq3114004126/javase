package day20;

//4.	编写买家与卖家交易的程序，一个钱锁，一个货锁，并造成死锁。
class Trading{
	private String name;
	public synchronized void buy(Trading otherTrade){
		System.out.println(this.name+"有钱，希望买货，希望从"+otherTrade.name+"得到货");
		otherTrade.sell(this);
	}
	public synchronized void sell(Trading otherTrade){
		System.out.println(this.name+"有货，希望卖货，希望从"+otherTrade.name+"得到钱");
		otherTrade.buy(this);
	}
	public Trading(String name) {
		super();
		this.name = name;
	}
	
}
public class Que4 {
   public static void main(String[] args) {
	   Trading trade1=new Trading("张三");
	   Trading trade2=new Trading("李四");
	   Thread t1=new Thread(()->{trade1.buy(trade2);});
	   Thread t2=new Thread(()->{trade2.buy(trade1);});
	   t1.start();
	   t2.start();
			  
	    
   }
}

