package day20;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Day12_2 {

	public static void main(String[] args) {
		buyTicket bb = new buyTicket();
		Thread t = new Thread(bb);
		t.setName("张三");
		
		Thread t1 = new Thread(bb);
		t1.setName("李四");
		
		Thread t2 = new Thread(bb);
		t2.setName("王五");
		t.start();
		t1.start();
		t2.start();
		
	}

}
class buyTicket implements Runnable{
	private int ticket =100;
//	private Lock lock=new ReentrantLock();
	private Lock lock = new ReentrantLock();
	@Override
	public void run() {
		while(true) {
			try {
				lock.lock();
				if(ticket>0) {
					
					String name = Thread.currentThread().getName();
					System.out.println(name+"抢到了"+"第"+ticket+"票");
					ticket--;
					
				}else {
					break;
				}
				
			}finally {//退出虚拟机
				lock.unlock();
			}
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}