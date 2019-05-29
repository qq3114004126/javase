package day20;
class Seller{
	private String name;
	private String bargins= "货物";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBargins() {
		return bargins;
	}
	public void setBargins(String bargins) {
		this.bargins = bargins;
	}
	public Seller(String name) {
		super();
		this.name = name;
	}
	public synchronized void hold(Buyer b) {
		System.out.println(this.name + "抓住了" + b.getName()+"钱");
		System.out.println(this.name+"等待" + b.getName()+"的钱");
		b.loose();
	}
	public synchronized void loose() {
		System.out.println(this.getName() + "放手了");
	}
	
}
class Buyer {
	private String name;
	
	public synchronized void hold(Seller ss) {
		System.out.println(this.name + "抓住了" + ss.getBargins());
		System.out.println(this.name+"等待" + ss.getName()+ss.getBargins());
		ss.loose();
	}

	public synchronized void loose() {
		System.out.println(this.getName() + "放手了");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Buyer(String name) {
		super();
		this.name = name;
		
	}
	
	
}

public class Day17_9 {
	public static void main(String[] args) {
		Buyer f1 = new Buyer("买家");
		Seller f2 = new Seller("卖家");
		
		Thread t1 = new Thread(() -> {
			f1.hold(f2);
		});
		Thread t2 = new Thread(() -> {
			f2.hold(f1);
		});
		t1.start();
		t2.start();
	}
}
