package day14;
//写一个方法void isTriangle(int a,int b,int c)，判断三个参数是否能构成一个三角形，
//如果不能则抛出异常IllegalArgumentException，显示异常信息 “a,b,c不能构成三角形”，
//如果可以构成则显示三角形三个边长，
//调用此方法，并捕获异常。
public class Day14_8 {

	public static void main(String[] args) {
		Methods m = new Methods();
		try {
			m.isTriangle(10, 5, 11);
		}catch(IllegalArgumentException e) {
			System.out.println("a,b,c不能构成三角形");
		}
		
	}

}
class Methods{
	int a;
	int b;
	int c;
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	void isTriangle(int a,int b,int c)  {
		if((a+b>c)&&(a-b<c)&&(a+c>b)&&(a-c<b)&&(c+b>a)&&(c-b<a)) {
			System.out.println("可以组成三角形,三条边的长度分别为"+a+","+b+","+c);
			
		}else {
			throw new IllegalArgumentException("出错了");
			
		}
	}
}