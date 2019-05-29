package day20;

import java.util.Random;
import java.util.Scanner;

public class Day17_4 {

	public static void main(String[] args) {
		
		Tablestyle tt = new Tablestyle();
		Thread t = new Thread(tt);
		t.start();
		
	}

}
class Tablestyle implements Runnable{
	static Random r = new Random();
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("表格");
		System.out.println("请输出数值");
		
		for(int i = 0;i<r.nextInt(50);i++) {
			System.out.println(i);
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}