package day21;

import java.util.ArrayList;
import java.util.List;

public class Day21_2 {

	public static void main(String[] args) {
		Worker w = new Worker();
		Thread

	}

}
class Worker{
	private List<String>list = new ArrayList();
	public synchronized void product() {
		if(list.size()==3) {
			System.out.println();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			list.add("");
			this.notifyAll();
		}
		
	}
	public synchronized void consume() {
		if(list.size()==0) {
			
		}else {
			list.remove(0);
		    notifyAll();
		}
	}
}