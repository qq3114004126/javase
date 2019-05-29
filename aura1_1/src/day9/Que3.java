package day9;
//编写一个计数器，能够记录一个类创建了多少个对象。
//记录不应该跟对象有关系，只应该跟类有关系，所以应该设计成静态属性（类属性）
//如果一个类中没有显式的构造器，编译器自动会产生一个无参数的构造器，代码上来说看起来构造器中没有任何代码。
class Counter{
	static int count;
	public Counter(){
		count++;
	}
	
}
public class Que3 {
	 public static void main(String[] args) {
		 Counter c1=new Counter();
		 Counter c2=new Counter();
		 System.out.println(Counter.count);
	 }
}
