package day11;

//问题：在子类中调用this，super
//  this---当前对象、在构造器中重载自己的构造器
//  super--父类引用
//  如果在子类中  this.属性（成员变量）：属性在父类中？属性子类中？
//class Fruit{
//	public String name="水果";
//	public void test(){
//	}
//}
//class Apple extends Fruit{
//	public String name="苹果";
//	public Apple(){
////		this.name="苹果";
//	}
//	public void test(){
//		System.out.println(this.name);
//		System.out.println(super.name);
//	}
//    public static void main(String[] args) {
//    	Apple a=new Apple();
////    	a.test();//进入运行期
//    	System.out.println(a.name);
//	}
//}


//1.	编写三个类，矩形与正方形两个类，求周长与面积。分别使用不继承与继承两种方式，并总结出继承的优势。
// 继承中，子类属性少于父类的属性（特殊情况），重载构造器的方式（在父类下多重载一个有参数的构造器）。
//可以子类创建新的构造器，调用父类的构造器
class Rectangle{
	private int lon;
	private int width;
	
	public int perimeter(){
		return (this.lon+this.width)*2;
	}
	public int area(){
		return this.lon*this.width;
	}

	public int getLon() {
		return lon;
	}

	public void setLon(int lon) {
		this.lon = lon;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public Rectangle(int lon, int width) {
		super();
		this.lon = lon;
		this.width = width;
	}
	public Rectangle(int lon){
		this(lon, lon);
	}
}
class Square extends Rectangle{
	public Square(int lon){
//		super(lon,lon);
		super(lon);
	}
}
//class Square{
//	private int lon;
//	public int perimeter(){
//		return this.lon*4;
//	}
//	public int area(){
//		return this.lon*this.lon;
//	}
//
//	public int getLon() {
//		return lon;
//	}
//
//	public void setLon(int lon) {
//		this.lon = lon;
//	}
//	public Square(int lon) {
//		this.lon = lon;
//	}
//	
//}
public class Que1 {
	public static void main(String[] args) {
		Rectangle r=new Rectangle(2,3);
		System.out.println(r.perimeter());
		System.out.println(r.area());
		
		Square s=new Square(5);
		System.out.println(s.area());
		System.out.println(s.perimeter());
	}
	

}

