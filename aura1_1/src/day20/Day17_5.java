package day20;

public class Day17_5 {

	public static void main(String[] args) {
		Music1 mm = new Music1();
		Thread t = new Thread(mm);
		t.setDaemon(true);
		t.start();
		System.out.println("唱歌开始");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("唱歌结束");
	}

}
class Music1 extends Thread{
	public void run() {
		System.out.println("乐队开始伴奏");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("乐队伴奏");
		System.out.println("乐队伴奏完毕");
	}
	
	
	
}