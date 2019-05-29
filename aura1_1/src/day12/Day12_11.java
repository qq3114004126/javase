package day12;

import java.util.Date;
import java.util.Scanner;

public class Day12_11 {
	public static void test(Worker p) {
		Date date = new Date();
		String hour = String.format("%tH", date);
		String minute = String.format("%tM", date);
		String second = String.format("%tS", date);
		System.out.println("当前时间是"+hour+"时"+minute+"分"+second+"秒");
		p.onduty("打卡信息");
//		p.onduty("打卡成功");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outters o = new Outters();
		 Worker w = o.getWorker();
		 Worker y = o.getWorker();
		// w.onduty("打卡信息");
		 test(w);
		 
	}

}
interface Worker{
	String onduty(String str);
}
class Outters{
	public Worker getWorker(){
		//class Employee implements Worker{
//			public String onduty(String str) {
//				if(str=="打卡信息") {
//					System.out.println("打卡成功");
//				
//				}else {
//					System.out.println("打卡失败");
//				}
//				return str;
//			}
//	    }
		return new Worker(){
			
			public String onduty(String str) {
				if(str=="打卡信息") {
					System.out.println("打卡成功");
				
				}else {
					System.out.println("打卡失败");
				}
				return str;
			}
			
		};
	}	
}