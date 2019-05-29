package day20;
//3.	编写两个线程，对同一个局部变量增加若干次（次数多一点），会出现什么情况。

class Mythread1  implements  Runnable{
	@Override
	public void run() {
		float g=0;
		for (float i = 0; i < 1000000000; i++) {
			g++;
		}
		System.out.println("在"+Thread.currentThread().getName()+"线程中g="+g);
	}
}
public class Que3 {
	   public static void main(String[] args) {
		   Mythread1 my=new Mythread1();
		   Thread t1=new Thread(my);
		   Thread t2=new Thread(my);
		   t1.start();
		   t2.start();
		  
	   }
}
//局部变量不是多线程的共享变量，所以 ，多线程对于这种变量没有影响。两个值都是100000000
