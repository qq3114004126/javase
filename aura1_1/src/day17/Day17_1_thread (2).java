package day17;
/*
 * 第二十三章  多线程
 * 一、基本概念
 * 1. 线程、进程、程序
 * 程序：程序就是一些列的指令集，静态的。
 * 进程：程序运行起来之后，就会创建一个（一个或者多个）进程
 * 线程：一个进程中的，多个任务的的基本执行单元。 一个进程中，至少会有一个线程（主线程）。
 * 
 * 进程和线程的资源共享问题：
 * 对于进程来说，进程的资源是相互独立的，不共享。
 * 对于线程来说，因为多个线程可能处于同一个进程下，线程资源可能共享的。
 * 
 * 2. 多线程
 * 为什么使用多个线程去执行一个进程任务？
 * 多核  单核    
 * 并发、并行：同时完成任务的意思。
 * 并发：A   同时---同一个时间段   内部串行完成  单核完成    cpu 频次
 * 并行：A B 同时---同一个时刻  真正的同时    多核
 * 
 * 对于单核cpu来说，要多线程的作用？
 * 多线程可以将cpu和Io设备任务分开来进行，可以利用cpu执行。
 * 
 * 
 * 二、java实现多线程
 * 多线程缺点：
 * （1）线程也是程序，也需要创建对象，也需要占用内存。
 * （2）多个线程之间需要协调管理，cpu需要分配时间片，也需要占用cpu执行效率
 * （3）线程不安全（多个线程共享一个资源），可以通过同步锁来解决线程不安全
 * 
 * 线程创建的基本方式：
 * （1）通过继承Thread类，重写run方法。  创建线程类
 * （2）实现Runnable接口 ，实现内部方法，创建线程类。
 */
//1. 线程的创建
//（1）通过继承Thread类，重写run方法。  创建线程类
//希望执行线程，一定不要去执行run方法。 run方法是真正执行线程的方法。
//希望线程并发执行，应该去执行start()，不是真正的执行线程的方法，只是向cpu提交了任务列表
//cpu可以对线程进行时间片的分配。
//class MyThread1 extends Thread{
//	public MyThread1(String name){
//		super(name);
//	}
//	public void run(){
////		通过线程要执行的任务  
////		run方法是真正执行线程时，会执行的方法。
//		for (int i = 0; i <100; i++) {
//			System.out.println(i);
////			try {
////				Thread.sleep(50);
////			} catch (InterruptedException e) {
////				e.printStackTrace();
////			}
//		}
//	}
//}
//public class Day17_1_thread {
//   public static void main(String[] args) {
//	   Thread t1=new MyThread();
//	   Thread t2=new MyThread();
//	   t1.start();
//	   t2.start();
////	   t1.run();
////	   t2.run();
//}
//}

//(2)通过Runnable接口，实现run方法
//class Mythread2 implements Runnable{
//	@Override
//	public void run() {
//		for (int i = 0; i <100; i++) {
//		   System.out.println(i);	
////			try {
////				Thread.sleep(50);
////			} catch (InterruptedException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
//		}
//	}
//}
//
//public class Day17_1_thread {
//	public static void main(String[] args) {
//		Mythread m=new Mythread();
////		Mythread m2=new Mythread();
////		需要通过Thread才能创建线程对象。 target属性进行赋值。无论是有参数构造器，还是无参数构造器
////		无参数构造器，直接调用当前的thread的对象，赋予给target
////		有参数构造器，会将参数中实现了runnable接口的类，赋予给target
//		Thread t1=new Thread(m);
//		Thread t2=new Thread(m);
//		t1.start();
//		t2.start();
//	}
//}


/*
 * 比较两种方法
 * （1）继承了Thread方法，只能继承Thread，不能再继承其他父类
 *     实现了Runnable接口的形式，可以继承其他父类，甚至实现多个接口
 *  (2) 如果希望两个Thread 对象有共享的变量，可以通过 实现了Runnable接口形式，只要传入相同的实现类对象即可。
 *     继承了Thread方法也可以实现属性的共享，但是需要使用静态内容，或者是通过构造器参数给属性赋值。
 */

//2. 线程的生命周期
/* （1）新建状态     new  Thread（子类）  处于新建状态，  不具备执行能力。
 * （2）就绪状态     调用了start之后的线程： cpu会分配时间执行线程，但是具体什么时间执行，由cpu的时间列表
 * （3）运行状态     cpu将时间片分配给线程对象之后，线程真正的运行，会调用run方法
 * （4）阻塞状态     因为某些条件，将线程处于等待状态，这个时候，cpu会将时间片分配给其他线程
 * （5）死亡状态     线程方法执行完毕，线程在执行run方法的时候，出现了异常，结果没有任何程序进行捕获，线程就会死亡。
 */

/*3.线程下的相关方法
 * 包含：Thread类下方法和Thread对象下的方法
 */
//1）.Thread.currentThread()  静态方法为了获得当前正在运行的线程。
//主线程
//public class Day17_1_thread {
//	public static void main(String[] args) {
//		System.out.println(Thread.currentThread());
//	}
//}


//2）.线程对象下，getName,获得线程的名字
//           setName，设置线程名字
//         name可以在创建线程的时候，在构造器中直接初始化
//public class Day17_1_thread {
//	public static void main(String[] args) {
//		Mythread2 m=new Mythread2();
//		Thread t1=new Thread(m);
//		System.out.println(t1.getName());
//		t1.start();
//		
//		MyThread1 t2=new MyThread1("子线程1");//name可以在创建线程的时候，在构造器中直接初始化
//		System.out.println(t2.getName());
//		System.err.println(t1.isAlive());
////		Thread t=Thread.currentThread();
////		t.setName("main_modify");
////		System.out.println(Thread.currentThread().getName());
//	}
//}

//3）.isAlive（）判断线程是否存活（从就绪---阻塞）（新建和死亡不算存活）
//4）.join 在一个线程A中，如果调用了另外一个线程B对象的join方法，那么意味着，B线程占用了A 的时间片。
//  join(最大等待时间)：超过了时间之后，A继续执行，无论b有没有运行完毕，
//                   如果没有设置时间，则A会一直等待B运行完毕。
//                   如果最大等待时间，超过了B线程运行的时间，则以B线程运行时间为节点，继续运行A线程。
//class Mythread extends Thread{
//	public void run(){
//		System.out.println("修路开始");
//		System.out.println("修路中");
//		
////		try {
////			Thread.sleep(2000);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		Thread.yield();
//		System.out.println("修路完成");
//	}
//}
//public class Day17_1_thread {
//	public static void main(String[] args) {
//		Mythread t=new Mythread();
//		t.start();
//		System.out.println("想要过马路");
//		try {
////			t.join();
////			t.join(50);
//			Thread.sleep(50);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("正在过马路");
//	}
//}


//5）. yield   Thread类下的静态方法
//   让当前正在运行的线程，有意让出cpu资源，但是这仅仅是一个提示，cpu可能会继续选择当前线程
//   也可能会选择其他线程，相当于“谦让不一定成功”  注意sleep区分。

//6）.daemon 设置线程是否为守护线程
//守护线程----后台线程
//默认创建的线程都是非守护线程(daemon=false)
//非守护线程(前台线程)：如果两个线程都是非守护线程，运行的时候，谁也不管谁。
//守护线程：   如果一个线程是守护线程，一个线程是非守护线程，那么非守护线程执行完毕的时候，就会让守护线程中断。
// 唱歌：非守护线程
// 乐队：非守护线程
//设置守护线程：线程.setDaemon(true)  注意：位置 必须在start之前
class  Music extends Thread{
	public void run(){
		System.out.println("乐队开始伴奏");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("乐队伴奏...");
		System.out.println("乐队伴奏...");
		System.out.println("乐队伴奏完毕");
	}
}


//唱歌：非守护线程
//乐队：守护线程
//public class Day17_1_thread {
//	public static void main(String[] args) {
//		Music t=new Music();
//		t.setDaemon(true);
//		t.start();
//		System.out.println("唱歌开始");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("唱歌完毕");
//		
//	}
//}
//

//7）.setPrority设置线程的优先级：
//线程的优先级只是意味着可能获得更多的执行机会，但是不一定真的就能获得。其他优先级低的线程也可能会运行
//优先级  1--10
//     低    高
//public class Day17_1_thread {
//	public static void main(String[] args) {
//		Music t=new Music();
//		t.start();
//		System.out.println("唱歌开始");
//		t.setPriority(Thread.MAX_PRIORITY);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("唱歌完毕");
//	}
//}


