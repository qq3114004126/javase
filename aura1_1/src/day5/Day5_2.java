package day5;

public class Day5_2 {

	public static void main(String[] args) {
		Point p = new Point(-1,54,6);
//		p.setX(0);
//		p.setY(0);
//		p.setZ(0);
		System.out.println("这是main方法");
		p.getPoint();
	}

}
class Point{
	int x;
	int y;
	int z;
	public Point(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public void getPoint() {
		System.out.println(x*x+y*y+z*z); 
	}
}