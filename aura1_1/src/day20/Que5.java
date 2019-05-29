package day20;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//4.	编写买家与卖家交易的程序，一个钱锁，一个货锁，并造成死锁。
public class Que5{
	public static  Lock money=new ReentrantLock();
	public static Lock goods=new ReentrantLock();
	public static void main(String[] args) {
		Thread t1=new Buyer();
		Thread t2=new Seller();
		t1.start();
		t2.start();
		
	}
}
class Buyer extends Thread{
	public void run(){
		Que5.money.lock();
		System.out.println("买家有钱，等待卖家发货");
		Que5.goods.lock();
		Que5.money.unlock();
		Que5.goods.unlock();
	}
	
}
class Seller extends Thread{
	public void run(){
		Que5.goods.lock();
		System.out.println("卖家有货，等待买家出钱");
		Que5.money.lock();
		Que5.goods.unlock();
		Que5.money.unlock();
	}
}
