package day20;

public class Day17_6 {

	public static void main(String[] args) {
		Game gg = new Game();
		
		
		Thread t1 = new Thread(gg);
		Thread t2 = new Thread(gg);
		t1.start();
		t2.start();
		
		
	}

}
class Game implements Runnable{
	private int times =0;
	
	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	@Override
	public void run() {
		for(int i = 0;i<100000;i++) {
			times++;
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			System.out.println("times的值为："+times);
		}
		
	}
	
}