package day11;

class Day11_12{
	public static void main(String[] args) {
		UU uu = new UU("张三");
		Test1_1 t = new Test1_1();
		 Mv mv = new Mv("李四");
		 Mp3 mp = new Mp3("王五");
		 t.print(uu);
		 t.print(mv);
		 t.broad(mp);
		
	}

}
class ComputerStore{
	String name;
	
	public ComputerStore(String name) {
	
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void read() {
		System.out.println(this.name+"读书");
	}
	public void write() {
		System.out.println(this.name+"写作");
	}
}
class UU extends ComputerStore{
	String name;
	
	

	public UU(String name) {
		super(name);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class Mv extends ComputerStore{
	String name;

	public Mv(String name) {
		super(name);
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class Mp3 extends ComputerStore{
	String name;

	public Mp3(String name) {
		super(name);
		
	}
	public void broadcast(String name) {
		System.out.println("播放"+name+"的音乐");
	}
}
class Test1_1{
	public void print(ComputerStore cc){
		cc.read();
		cc.write();
	}
	public void broad(Mp3 m) {
		m.broadcast("周杰伦");
	}
}