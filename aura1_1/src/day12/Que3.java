package day12;
//3.编写电脑类，提供一个方法，能够与移动设备（U盘，MP3，移动硬盘）进行读写交互。
//MP3除了读与写之外，还额外具有一个播放音乐的功能。（使用接口完成）
class Computer {
	public void connect(MoveStore ms){
		ms.read();
		ms.write();
		
		if (ms instanceof MP3){
			MP3 mp3=(MP3)ms;
			mp3.play();
		}
	}
}


// 往内存中写： 针对于内存来说，往内存中存储数据，Scanner  String name=sc.next();
// 从内存中往外读：   读操作  system.out.println


interface Readable{
	void read();
}
interface Writable{
	void write();
}
//abstract class MoveStore{
interface MoveStore extends Readable,Writable{
//	public void read(){
//		System.out.println("正在读");
//	}
//	public void write(){
//		System.out.println("正在写");
//	}
	
//	abstract void read();
//	abstract void write();
}



class Udisk implements MoveStore{
	public void read(){
		System.out.println("UDISK正在读");
	}
	public void write(){
		System.out.println("UDISK正在写");
	}
}
class mobileDisk implements  MoveStore{
	public void read(){
		System.out.println("mobileDisk正在读");
	}
	public void write(){
		System.out.println("mobileDisk正在写");
	}
}
class SDDisk implements MoveStore{
	@Override
	public void read() {
		// TODO Auto-generated method stub
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
	}
	
}
class MP3 implements MoveStore,Player{
	public void read(){
		System.out.println("MP3正在读");
	}
	public void write(){
		System.out.println("MP3正在写");
	}
	public void play(){
		System.out.println("MP3播放音乐");
	}
}

//play方法放在接口中，形成一种接口规模
interface Player{
	void play();
}


// 设计模式中：开闭原则：  对于修改关闭，对于扩展开放。

public class Que3 {
    public static void main(String[] args) {
    	Computer c=new Computer();
    	Udisk udisk=new Udisk();
    	c.connect(udisk);
    	
    	SDDisk sd=new SDDisk();	
    	c.connect(sd);
    	
//    	String
	}
}
