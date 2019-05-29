package day16;

public class Test2 {

	public static void main(String[] args) {
		Integer a1 = 12;
		Integer a2 = 10;
		Box<Integer> b = new Box(a1,a2);
		String s1 = "12";
		String s2 = "10";
		Box<String> s = new Box(s1,s2);
		Double d1 = 12.0;
		Double d2 = 110.0;
		Box<Double> d = new Box(d1,d2);
		Double d3 = 123.0;
		Double d4 = 115.0;
//		Box<Double> d5 = new Box(d1,d2);
		
		Box<Double> group = new Box();
		Double[] dd = {d1,d2,d3,d4};
		group.setT(dd);
		System.out.println(d.getHeight()*d.getWidth());
		
	}

}
class Box<T>{
	private T[] t;
	private T width;
	private T height;
	
	public Box() {
		super();
	}

	public T[] getT() {
		return t;
	}

	public void setT(T[] t) {
		this.t = t;
	}

	public Box(T width, T height) {
		super();
		this.width = width;
		this.height = height;
	}

	public T getWidth() {
		return width;
	}

	public void setWidth(T width) {
		this.width = width;
	}

	public T getHeight() {
		return height;
	}

	public void setHeight(T height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + "]";
	}

	
	
}