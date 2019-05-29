package day17;
/*
 * 第二十三章  多线程
 */
//4.线程的并发修改
// 多线程造成最重要的影响。
//以多人同时购票
//【问题】：因为张三在进入while循环的时候，做了输出，结果还没有对ticket-1，李四也进入 了循环
//       李四也会显示ticket为100...
//【解决】：采用“同步”方式解决。排队--串行                    同时----“异步”
//【解决的方式】通过加锁，通过synchronized来解决
//    synchronized可以修饰语句块，也可以修饰方法。（两种方式）
//class BuyTicket implements Runnable{
//	private int ticket=100;
//	@Override
//	public void run() {
//		while (ticket>0){
//			
//			String name=Thread.currentThread().getName();
//			System.out.println(name+"抢到了第"+ticket);
//			ticket--;
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}
//public class Day17_2_thread {
//	public static void main(String[] args) {
//		BuyTicket buyTicket=new BuyTicket();
//		Thread t1=new Thread(buyTicket);
//		Thread t2=new Thread(buyTicket);
//		Thread t3=new Thread(buyTicket);
//		t1.setName("张三");
//		t2.setName("李四");
//		t3.setName("王五");
//		t1.start();
//		t2.start();
//		t3.start();
//		
//	}
//}

import java.util.List;
import java.util.Vector;

//第一种解决方式：使用synchronized语句块
//[语法]synchronized(对象){}
////第一次解决：问题：出现了0张  -1
//class BuyTicket implements Runnable{
//	private int ticket=100;
//	private Object lock=new Object();
//	@Override
//	public void run() {
//		while (ticket>0){
//			synchronized (lock) {
//				String name=Thread.currentThread().getName();
//				System.out.println(name+"抢到了第"+ticket);
//				ticket--;
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//}
//public class Day17_2_thread {
//	public static void main(String[] args) {
//		BuyTicket buyTicket=new BuyTicket();
//		Thread t1=new Thread(buyTicket);
//		Thread t2=new Thread(buyTicket);
//		Thread t3=new Thread(buyTicket);
//		t1.setName("张三");
//		t2.setName("李四");
//		t3.setName("王五");
//		t1.start();
//		t2.start();
//		t3.start();
//		
//	}
//}

//
////第二次解决：直接将锁加到while循环的外侧，其他线程无法获得锁，票全部被一个线程抢走
//class BuyTicket implements Runnable{
//	private int ticket=100;
//	private Object lock=new Object();
//	@Override
//	public void run() {
//		synchronized (lock) {
//			while (ticket>0){
//				String name=Thread.currentThread().getName();
//				System.out.println(name+"抢到了第"+ticket);
//				ticket--;
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//}
//public class Day17_2_thread {
//	public static void main(String[] args) {
//		BuyTicket buyTicket=new BuyTicket();
//		Thread t1=new Thread(buyTicket);
//		Thread t2=new Thread(buyTicket);
//		Thread t3=new Thread(buyTicket);
//		t1.setName("张三");
//		t2.setName("李四");
//		t3.setName("王五");
//		t1.start();
//		t2.start();
//		t3.start();
//		
//	}
//}

//第三次解决：在while设置if条件判断ticket是否>0,否则break
//class BuyTicket implements Runnable{
//	private int ticket=100;
////private Object lock=new Object();
//	@Override
//	public void run() {
//		while (true){
//			synchronized (this) {
//				if(ticket>0){
//					String name=Thread.currentThread().getName();
//					System.out.println(name+"抢到了第"+ticket);
//					ticket--;
//				}else{
//					break;
//				}
//			}
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}
//public class Day17_2_thread {
//	public static void main(String[] args) {
//		BuyTicket buyTicket=new BuyTicket();
//		Thread t1=new Thread(buyTicket);
//		Thread t2=new Thread(buyTicket);
//		Thread t3=new Thread(buyTicket);
//		t1.setName("张三");
//		t2.setName("李四");
//		t3.setName("王五");
//		t1.start();
//		t2.start();
//		t3.start();
//		
//	}
//}



//第二种解决方式：使用synchronized修饰方法
//被修饰的方法，每次只能被一个线程调用。
//public synchronized  void m(){    }  线程安全的方法
//class BuyTicket implements Runnable{
//	private int ticket=100;
////	private Object lock=new Object();
//	@Override
//	public void run() {
//		while (true){
//			if(!buy())
//				break;
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	public synchronized boolean buy(){
//		if(ticket>0){
//			String name=Thread.currentThread().getName();
//			System.out.println(name+"抢到了第"+ticket);
//			ticket--;
//			return true;
//		}else{
//			return false;
//		}
//	}
//}
//public class Day17_2_thread {
//	public static void main(String[] args) {
//		BuyTicket buyTicket=new BuyTicket();
//		Thread t1=new Thread(buyTicket);
//		Thread t2=new Thread(buyTicket);
//		Thread t3=new Thread(buyTicket);
//		t1.setName("张三");
//		t2.setName("李四");
//		t3.setName("王五");
//		t1.start();
//		t2.start();
//		t3.start();
//		
//	}
//}


//第三种方式，通过Lock对对象进行操作（用的少）
//Lock    ------ReentrantLock  的对象来进行加锁
// 对象下：lock()    加锁
//       unlock()  释放

//class BuyTicket implements Runnable{
//	private int ticket=100;
//	private Lock lock=new ReentrantLock();
//	@Override
//	public void run() {
//		while (true){
//			try{
//				lock.lock();
//				if(ticket>0){
//					String name=Thread.currentThread().getName();
//					System.out.println(name+"抢到了第"+ticket);
//					ticket--;
//				}else{
//					break;
//				}
//			}finally{
//				lock.unlock();
//				}
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//	}
//	public class Day17_2_thread {
//	public static void main(String[] args) {
//		BuyTicket buyTicket=new BuyTicket();
//		Thread t1=new Thread(buyTicket);
//		Thread t2=new Thread(buyTicket);
//		Thread t3=new Thread(buyTicket);
//		t1.setName("张三");
//		t2.setName("李四");
//		t3.setName("王五");
//		t1.start();
//		t2.start();
//		t3.start();
//		
//	}
//}



//5. 死锁
//【定义】当两个或者多个线程，同时拥有自己的资源，而互相等待对方释放资源。导致程序永远僵持——死锁。
//【死锁容易出现的情况】
//（1）如果是在同步synchronized的方法中，调用了另外一个对象的的同步方法，可能会造成死锁
//（2）如果是synchronized修饰语句块，如果在一个语句块中，调用了另外一个synchronized语句块（synchronized嵌套）
//class Fighter{
//	private String name;
//	public synchronized void hold(Fighter otherfighter){
//		System.out.println(this.name+"抓住了"+otherfighter.getName());
//		System.out.println("等待"+otherfighter.getName()+"放手");
//		otherfighter.loose();
//	}
//	public synchronized void loose(){
//		System.out.println(this.getName()+"放手了");
//	}
//
//	public Fighter(String name) {
//		this.name = name;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//}
//public class Day17_2_thread {
//	public static void main(String[] args) {
//		Fighter f1=new Fighter("张三");
//		Fighter f2=new Fighter("李四");
//		Thread t1=new Thread(()->{
//			f1.hold(f2);
//		}); 
//		Thread t2=new Thread(()->{
//			f2.hold(f1);
//		}); 
//		t1.start();
//		t2.start();
//	}
//}

/*
 * 6.关于集合框架中List的实现类：Vector
 * ArrayList在1.2出现 线程不安全
 * Vector   在1.0就出现   线程安全的  效率
 * 
 * String   StringBuffer   StringBuilder
 */
//[了解vector和ArrayList]
//结构上都是动态数组：扩容不一样 
//ArrayList:每次扩容1.5倍
//Vector ：默认每次扩容2倍，可以设置增长因子,可以在构造器中形成增长因子
//Vector线程安全，ArrayList 线程不安全
//Vector相对低   ArrayList相对高
//构造方式不同
public class Day17_2_thread {
	public static void main(String[] args) {
       List<Integer> list=new Vector<>();
//       list.
	}
}




