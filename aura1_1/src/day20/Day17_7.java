package day20;

public class Day17_7 {

	public static void main(String[] args) {
			Result rr = new Result();
			Thread t = new Thread(rr);
			Thread t1 = new Thread(rr);
			
			t.start();
			t1.start();
			

	}

}
class Result implements Runnable{
	private int age;
	@Override
	public void run() {
		int num=0;
		for(int i = 0;i<100000;i++) {
			num++;
			
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("num的值为："+num);
		
	}
	
}