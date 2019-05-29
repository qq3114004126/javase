package day10;

import java.util.concurrent.SynchronousQueue;

public class Day10_11 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(12,10);
		r.area();
		r.sumLen();
		 Square s = new Square(15,15);
		 s.area();
		 s.sumLen();
	}
}
class Quadrilateral{
	int len;
	int width;
	
	public Quadrilateral(int len, int width) {
		super();
		this.len = len;
		this.width = width;
	}
	public Quadrilateral() {
		super();
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void area() {
		System.out.println("矩形的面积:"+this.len*this.width);
	}
	public void sumLen() {
		System.out.println("矩形的周长:"+(this.len+this.width)*2);
	}
	
}



class Rectangle extends Quadrilateral{
	int width;
	int len;
	
			
	public Rectangle(int len, int width) {
		super(len, width);
		
	}
	
}
class Square extends Quadrilateral{
	int len;
	int width;
		
		public Square(int len,int width) {
		super(len, width);
		
	}

}