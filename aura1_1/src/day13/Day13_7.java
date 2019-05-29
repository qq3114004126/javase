package day13;

public class Day13_7 {
	public static void main(String[] args) {
	String [] x={"fff","aaa","ccc","ddd"};
	Arrays.sort(x);
	System.out.println(Arrays.toString(x));
	
	Course c1=new Course("java",100.0);
	Course c2=new Course("python",200.0);
	Course c3=new Course("python3",150.0);
	Course[] courses=new Course[]{c1,c2,c3};
	Arrays.sort(courses);
	System.out.println(Arrays.toString(courses));
}
}

class Course implements Comparable<Course>{
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Course(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public int compareTo(Course o) {
	//	按照价格排序
		if(this.price>o.price)
			return 1;
		else if (this.price<o.price)
			return -1;
		else
			return 0;
	  return this.price-o.price;
}
@Override
public String toString() {
	return "Course [name=" + name + ", price=" + price + "]";
}

}
//仿造Arrays中sort的实现。
class Arrays{
public void sort(Object o){
	Comparable c=(Comparable)o;
	c.compareTo(o);
}
}