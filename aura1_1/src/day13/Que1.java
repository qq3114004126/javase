package day13;
/*
 * 1.	使用成员内部类解决如下问题
 * 复习知识点，真正使用场合的时候：所有的类都是独立定义的，独立成一个.java文件
定义一个汽车类外围类，汽车有：
1.	座位数量
2.	车轮（成员内部类——实例成员类----成员变量）
i.	颜色
ii.	个数
iii.显示车轮信息
3.	显示汽车信息（）
要求：创建一辆车,展示车的信息。
 */
//如果将轮子定义在外侧，其他的车辆也可以使用Wheele
//真正开发的时候，Public class Wheele 独立java文件
class Wheele{
	
}
class  Car{
	private int seats;
	public void showcar(){
		System.out.println("汽车的信息:座位数"+this.seats);
		Wheele w=new Wheele("黑色",4);
		w.show();
	}
	
	public class Wheele{//只代表是Car的轮子
		private String color;
		private int count;
		
		public void show(){
			System.out.println("车轮的颜色"+this.color+"一共有"+this.count+"个轮子");
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public Wheele(String color, int count) {
			super();
			this.color = color;
			this.count = count;
		}
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public Car(int seats) {
		super();
		this.seats = seats;
	}
	
}

public class Que1 {
   public static void main(String[] args) {
	Car  c=new Car(5);
	c.showcar();
}
}
