package day13;

import java.util.Date;

/*
 * 3.	创建一个Worker接口，具有打卡方法onduty，实现类在实现该方法时，
 * 只需要传入“打卡信息”，做简单信息输出即可。
 * 在测试端有一个time(Worker w)方法，可以让每个实现类打卡的时候，输出当前时间（new Date()即可）。
 * 尝试使用lambda表达式和静态方法调用实现。
 */
interface Worker{
	void onduty(String message,String name);
}
public class Que3 {
	public static void time(Worker w){
//		想去调用onduty
		w.onduty("打卡人是zst"+"\t"+new Date(),"zst");
		
		
	}
  public static void main(String[] args) {
	Worker w1=(message,name)->{System.out.print("第一个打卡的员工："+message);System.out.print("第一个打卡的员工："+name);};
	//Worker w2=message->System.out.println("第二个打卡的员工："+message);
	time(w1);
	//time(w2);
  }
}

