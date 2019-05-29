
package day18;


import java.util.ArrayList;
import java.util.List;

/*
 * 
 * 
 * 7. 通知和等待
 * 火车票问题：tickect 从100   消费（买票线程多）
 * 多个线程的生产者和多个线程的消费者。
 * 需求：
 * 生产者：生产商品  +1  
 * 仓库（同步机制）：List  商品加入到仓库中
 * 消费者：消费商品  -1
 * 
 * 比如仓库的上限 3    应该处于阻塞   sleep
 * 
 * （1） 生产者、消费者是方法，一定是同步方法，保护仓库，将仓库设置成共享变量
 * （2）wait：阻塞，一边阻塞一边交出钥匙
 * （3）一旦生产处于阻塞，消费者可以进行消费，一旦消费成功，同时要通知生产者，可以继续生产
 *     notify:  任选一个阻塞的线程进入就绪。
 *     notifall：让所有处于等待的线程进入就绪状态。
 * 
 */
class Worker{
	private List<String> list=new ArrayList<>();
	public synchronized void product(int i){
		if(list.size()==3){
			System.out.println("仓库已满，生产阻塞");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
		   list.add("商品"+i);
		   try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   System.out.println("生产了商品"+i);
		   notifyAll();
		}
	}
	public synchronized void consume(){
		if(list.size()==0){
			System.out.println("仓库已空，消费阻塞");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("消费了"+list.remove(0));
			notifyAll();
		}
	}
}
public class Day18_1_Thread {
	public static void main(String[] args) {
		Worker w=new Worker();
		Thread product=new Thread(()->{
			int i=1;
			while(true){
				w.product(i);
				i++;
			}
//			for (int i=1;i<=4;i++){
//				w.product(i);
//			}
		});
		
		Thread consume=new Thread(()->{
			while(true){
				w.consume();
			}
//			for (int i = 1; i <=4; i++) {
//				w.consume();
//			}
		});
		product.start();
		consume.start();
		
	}
}
