package day20;

public class Day17_10 {

	public static void main(String[] args) {
		A a = new A();
		Thread t = new Thread(a);
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		try {
			t.join(0);
			Thread.sleep(0);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("在主方法前");
		try {
			
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("在主方法中");
		System.out.println(t.isAlive());
		System.out.println(Thread.currentThread());
		t.setName("张世通");
	
		System.out.println(t.getName());
	}

}
class A implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("在类中");
		
	}
	
}