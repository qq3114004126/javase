package day12;

import java.util.Arrays;


class Coursees {
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Coursees(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", price=" + price + "]";
	}
	
	
}
public class Day10_3_String {
	public static void main(String[] args) {
		Coursees c1=new Coursees("java",100);
		Coursees c2=new Coursees("python",200);
		Coursees c3=new Coursees("python3",150);
		Coursees[] courses=new Coursees[]{c1,c2,c3};

//		Arrays.sort(courses,new Comparator<Course>() {
//			@Override
//			public int compare(Course o1, Course o2) {
//				return o1.getPrice()-o2.getPrice();
//			}
//		});
//		

//		Arrays.sort(courses,(Course o1,Course o2)
//				->{return o1.getPrice()-o2.getPrice();});
		Arrays.sort(courses,(o1, o2)
				-> o1.getPrice()-o2.getPrice());
		System.out.println(Arrays.toString(courses));
	}
}