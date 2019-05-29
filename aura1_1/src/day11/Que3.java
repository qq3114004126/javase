package day11;
//3.	编写电脑类，提供一个方法，能够与移动设备（U盘，MP3，移动硬盘）进行读写交互。
//MP3除了读与写之外，还额外具有一个播放音乐的功能。
class Computer1_1{
	public void connect(BaseStore bs){
		bs.read();
		bs.write();
	}
	public void player(MP3 m){
		m.play();
	}
}
class BaseStore{
	public String name;
	public void read(){
		System.out.println(this.name+"正在读取数据....");
	}
	public void write(){
		System.out.println(this.name+"正在写数据....");
	}
	public BaseStore(String name) {
		super();
		this.name = name;
	}
	
}
class UDisk extends BaseStore{
	public UDisk(String name) {
		super(name);
	}
	
}
class MP3 extends BaseStore{
	public MP3(String name) {
		super(name);
	}
	public void play(){
		System.out.println(this.name+"正在播放音乐");
	}
	
}
class MoveDisk extends BaseStore{
	public MoveDisk(String name) {
		super(name);
	}
}
public class Que3 {
  public static void main(String[] args) {
	  UDisk u=new UDisk("u盘");
	  MoveDisk md=new MoveDisk("移动硬盘");
	  MP3 m3=new MP3("MP3");
	  Computer1_1 c=new Computer1_1();
	  c.connect(u);
	  c.connect(md);
	  c.connect(m3);
	  c.player(m3);
}
}


