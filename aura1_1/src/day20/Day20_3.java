package day20;

public class Day20_3 {

}
class buyTicket implements Runnable{
	private int ticket =100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(ticket>0) {
			String name = Thread.currentThread().getName();
			ticket--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}