package day15;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class Day15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//解决之前集合元素的问题
		//1.5之前 list
     	
//		list.add("one");
//		list.add("3");
//		String s2 = list.get(1);
//		List<String>
		Collection <book> list = new ArrayList();
		book b1 = new book("java",100);
		book b2 = new book("Python",100);
		book[] b = new book[10];
		list.add(b1);
		list.add(b2);
		b[0]=b1;
		b[1]=b2;
		Store1<book>nbook = new Store1<book>();
		
		Computer1 cc = new Computer1("戴尔",5000);
		Computer1 cc1 = new Computer1("联想",6000);
		Computer1 cc2 = new Computer1("华硕",4000);
//		Computer1[] cgroup = {cc,cc1,cc2};
		Store1<Computer1> sComputer = new Store1();
		sComputer.setT(new Computer1[] {cc,cc1,cc2});
		List<String> list = new List();
		
		
		
	}

}
class book{
	private String name;
	private double price;
	
	public book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}
class Computer1{
	private String type;
	private double price;
	public Computer1(String type, double price) {
		super();
		this.type = type;
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
class Store1<T>{
	private T t;

	public T getT() {
		return t;
	}


	

	public Store1() {
		super();
		this.t = t;
	}

	
	
}
class List<String>{
	private String bookname;
	
}