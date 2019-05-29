package day11_2;

public class Day11_5 {

	public static void main(String[] args) {
		Computer c = new Computer("MP3");
		c.write();
		c.read();
		c.broadcast();
		Computer c1 = new Computer("U盘");
		c1.write();
		c1.read();
		Computer c2 = new Computer("移动硬盘");
		c2.write();
		c2.read();
	
	}

}
interface A{
	void read();
	void write();
}
class Computer implements A{
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Computer(String name) {
		super();
		this.name = name;
	}

	@Override
	public void read() {
		System.out.println(this.name+"可以读写");
		
	}

	@Override
	public void write() {
		System.out.println(this.name+"可以写");
		
	}
	void broadcast() {
		System.out.println(this.name+"正在播放音乐");
	}

	

	

	
	
}