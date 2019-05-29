package day15;

import java.util.Arrays;

public class Day15_5 {
	
	public static void main(String[] args) {
		Integer i1 = 10;
		Integer i2 = 15;
		Double b3 = 15.0;
		Double b4 = 16.0;
		String s1 = "1";
		String s2 = "2";
		Box<Integer> istore = new Box(i1, i2);
		istore.setHeight(i2);
		istore.setWidth(i1);
		Box<Double> dstore = new Box(b3, b4);
		dstore.setWidth(b4);
		dstore.setHeight(b3);
		Box <String>sstore = new Box(s1, s2);
		sstore.setHeight(s1);
		sstore.setWidth(s2);
		System.out.println(istore.toString());
		System.out.println(sstore.toString());
		System.out.println(dstore.toString());

	}

}
class Box<T>{
    private T width;
    private T height;
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
	