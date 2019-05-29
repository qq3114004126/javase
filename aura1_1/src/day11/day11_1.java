	package day11;

import java.util.concurrent.SynchronousQueue;

public class day11_1 {
	public static void main(String[] args) {
//		Rectangle r = new Rectangle(12,10);
//		r.area();
//		r.sumlen();
		Square s = new Square(10);
		System.out.println(s.area());
//		s.sumlen();
	}
}
class Rectangle{
	int len;
	 int width;
	
	public Rectangle(int len) {
		super();
		this.len = len;
		
	}
	public Rectangle() {
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
	public double area() {
		
		return this.len*this.len;
	}
	void sumlen() {
		System.out.println("矩形的周长是："+(len+width)*2);
	}
}
class Square extends Rectangle{
	public Square(int len) {
		super(len);
	}
}

	
	


	
