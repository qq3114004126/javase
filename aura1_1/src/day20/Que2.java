package day18.day17homework;

//2.	编写两个线程，对同一个成员变量增加若干次（次数多一点），会出现什么情况。
class Mythread  implements  Runnable{
	public int g=0;
	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			g++;
		}
		System.out.println("在"+Thread.currentThread().getName()+"线程中g="+g);
	}
}
public class Que2 {
	   public static void main(String[] args) {
		   Mythread my=new Mythread();
		   Thread t1=new Thread(my);
		   Thread t2=new Thread(my);
		   t1.start();
		   t2.start();
//		try {
////			t1.join();
////			t2.join();t1和t2一起抢占主线程的时间片。但是对于多线程共享变量修改的问题，依然存在
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		   
		   System.out.println("在"+Thread.currentThread().getName()+"线程中g="+my.g);
	   }
}


//结论：共享变量会多个线程的共享影响，得到的值大多数情况都是<200000   