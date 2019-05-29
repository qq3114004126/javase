package day12;

public class Day12_7 {

	public static void main(String[] args) {
		Car cc = new Car();
		System.out.println("汽车的座位数"+cc.seatNum);//
		Car.wheel w = cc.new wheel("红色",4);
		w.show();
		w.display();
	}

}
class Car{
	public static int seatNum =6;
	
	public  class wheel{
		private String color;
		private int wheelNum;
		
		public wheel(String color, int wheelNum) {
			super();
			this.color = color;
			this.wheelNum =wheelNum;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getWheelNum() {
			return wheelNum;
		}
		public void setWheelNum(int wheelNum) {
			this.wheelNum = wheelNum;
		}
		public void show() {
			 
			System.out.println("车轮信息："+"车轮颜色"+this.color+"车轮数量"+this.wheelNum);
			
		}
		public void display() {
			System.out.println("汽车的信息是:");
			System.out.println("汽车颜色："+this.color+"  车轮数目："+this.wheelNum+"座位数目："+seatNum);
			
		}
	
	}
	

}