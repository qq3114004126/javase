package day10;
/*
 * 第十六章  String类
 * 特殊的引用类型
 * =
 * new
 * 一、常量池机制
 * 字符类型也是不可变类型，常量池机制，对于String在编译期能够确定的常量，就可以被创建到常量池中。
 * String s="abc";
 * String s1="abc";
 * 
 * s和s1最终指向了同一个内存。多个引用指向同一个对象。
 * 
 * 二、重说创建
 * 1. = 创建字符串，一定是先检测=右侧的字符串是否在常量池中已存在，=右侧的数据必须是编译期就可以确定的字符串。
 *               如果编译期不能够确定的字符串常量，则不会加入到字符串常量池。
 *   【面试陷阱】
 *   String s2="abc"+"def":  问：创建了几个对象？
 *   不知道。因为虚拟机启动的时候，会创建很多的对象，但是创建了多少个字符串对象，
 *   创建了多少个字符串对象？
 *   如果不记常量池中已有字符串对象，那么创建了三个对象：abc   def   abcdef
 * 2. 使用new
 * new 一个对象，就会向堆中申请一小块空间。
 * String s=new String("abc");
 * （1）先到字符串常量池中检测， 是否已存在abc，如果不存在，则创建。
 * （2）到堆中创建字符串对象。将常量池中的字符串对象复制过来放到堆内存中。 "abc"---char[]（c语言底层指向char类型的数组）
System.identityHashCode(s1) 如果s1引用的是堆内存的对象，那么返回堆内存的地址
                             如果s1指向的是常量池的字符串对象，返回的是常量池中的地址
   【面试陷阱】String s=new String("abc");
   创建了多少个字符串对象？
   如果常量池中原本没有abc，则  会创建两个对象，分别是常量池中一个，堆中一个。                 
 */
//public class Day10_3_String {
//	public static void main(String[] args) {
//		String s1="abc";
//		String s2="abc";
//		System.out.println(System.identityHashCode(s1));
//		System.out.println(System.identityHashCode(s2));
//	}
//}

import java.util.Arrays;
import java.util.Comparator;

/*
 * 3. 细说字符串创建
 * 字符串常量池：
 * 当在编译期能够确定的字符串常量，会在编译期的时候被创建到字符串常量池中
 *程序在运行期的时候，除非手动的通过intern方法向常量池中添加常量，否则虚拟机不会自动的添加常量到常量池。
 *在运行期创建出来字符串对象，存储到堆内存。
*/
//public class Day10_3_String {
//	public static void main(String[] args) {
//		String s1="abc";
//		String s2="abc";
//		String s3=new String("abc");
//		String s4=new String("abc");
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s3==s4);
//		String s5="abcd";//新创建
////		在字符串常量池中，判断是否相同，判断是字符序列（equals方法的返回值）
//		
//		
//		String s6="a"+"bc";//+的两端都是常量，在编译期就加载出来常量，所以会存储到常量池
//		System.out.println(s1==s6);//true 原因：都指向常量池
//		
//		String s7="a".concat("bc");
//		System.out.println(s1==s7);//false 
////		原因：s7的产生需要到运行期才能确定，所以不会在字符串常量池中创建字符串
////		     只是在堆中创建了字符串对象
//		
//		String s8=""+s1;//除了""，以外，只能在堆中创建abc的字符串对象
//		System.out.println(s1==s8);
//		
//		final String s9="abc";//abc在编译的时候，已经是一个常量
//		String s10=""+s9;//在编译期就可以确s9是常量,意味着s10就是常量，就会将s10装入常量池
//		System.out.println(s9==s10);
//		
//		
////		介绍 字符串对象下的intern方法
////		功能：会先到字符串常量池中使用equals方法检查， 是否存在，
////		如果已存在，会返回字符串常量池中的对象
////		如果不存在，则会将字符串对象在常量池中创建一份
////		无论是否存在， 都会返回字符串常量池中的对象 。
////		String s11="abc";
//		String s12=new String("abc");
//		String s13=s12.intern();
////		System.out.println(s11==s13);
//		
////		【问题】 有没有一种情况，是在调用intern方法的时候，向常量池中加入字符串常量的？
//		String s14="bccccc"+s1;//bcccccabc  只会在堆中创建。不会在字符串常量池中创建。
//		String s15=s14.intern();
//		System.out.println(System.identityHashCode(s15));
//		String s16="bcccccabc";
//		System.out.println(s15==s16);
//		
////		s9.intern  
//		
////		System.out.println(System.identityHashCode(s1));
////		System.out.println(System.identityHashCode(s2));
//	}
//}


//三、字符串下相关法
//1.Comparable.compareTo 抽象方法
//thisstr.compareTo（String value）方法
//功能：用来判断字符串的大小
//     当前字符串对象大于value对象，返回>0
//     当前字符串对象等于value对象，返回0
//     当前字符串对象小于value对象，返回<0
// Java中很多API都实现了对Comparable中的compareTo方法。
// 只要实现了Comparable.compareTo 方法对象，都可以使用Arrays下sort排序
//public class Day10_3_String {
//	public static void main(String[] args) {
//		String [] x={"fff","aaa","ccc","ddd"};
//		Arrays.sort(x);
//		System.out.println(Arrays.toString(x));
//		
//		Course c1=new Course("java",100.0);
//		Course c2=new Course("python",200.0);
//		Course c3=new Course("python3",150.0);
//		Course[] courses=new Course[]{c1,c2,c3};
//		Arrays.sort(courses);
//		System.out.println(Arrays.toString(courses));
//	}
//}

//class Course implements Comparable<Course>{
//	private String name;
//	private double price;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	public Course(String name, double price) {
//		super();
//		this.name = name;
//		this.price = price;
//	}
//	@Override
//	public int compareTo(Course o) {
////		按照价格排序
//		if(this.price>o.price)
//			return 1;
//		else if (this.price<o.price)
//			return -1;
//		else
//			return 0;
//      return this.price-o.price;
//	}
//	@Override
//	public String toString() {
//		return "Course [name=" + name + ", price=" + price + "]";
//	}
//	
//}
// 仿造Arrays中sort的实现。
//class Arrays{
//	public void sort(Object o){
//		Comparable c=(Comparable)o;
//		c.compareTo(o);
//	}
//}

//2. Arrays.sort(Comparator接口)
//Comparator接口比较器接口
//哪个类在调用sort方法的时候，实现了Comparator接口，就可以利用规则进行排序
//class Course {
//	private String name;
//	private int price;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public Course(String name, int price) {
//		super();
//		this.name = name;
//		this.price = price;
//	}
//	@Override
//	public String toString() {
//		return "Course [name=" + name + ", price=" + price + "]";
//	}
//	
//	
//}
//public class Day10_3_String {
//	public static void main(String[] args) {
//		Course c1=new Course("java",100);
//		Course c2=new Course("python",200);
//		Course c3=new Course("python3",150);
//		Course[] courses=new Course[]{c1,c2,c3};
//
////		Arrays.sort(courses,new Comparator<Course>() {
////			@Override
////			public int compare(Course o1, Course o2) {
////				return o1.getPrice()-o2.getPrice();
////			}
////		});
////		
//
////		Arrays.sort(courses,(Course o1,Course o2)
////				->{return o1.getPrice()-o2.getPrice();});
//		Arrays.sort(courses,(o1, o2)
//				-> o1.getPrice()-o2.getPrice());
//		System.out.println(Arrays.toString(courses));
//	}
//}


//四、String  StringBuilder  StringBuffer关系和区别
//1.String  是在jdk1.0就已经有类
//2.StringBuffer  jdk1.4之后增加 类
//3.StringBuilder jdk1.5之后增加类
//关系：亲兄弟 用来存储字符串
//String 不可变对象。
//好处：多线程的时候，可以避免数据共享，可以达到线程安全。
//不可变的类型，如果需要持续性存储多个字符串,会创建非常多的字符串对象，
//第一内存会消耗的很多
//第二：慢
// a ab  abc  abcd
//public class Day10_3_String {
//	public static void main(String[] args) {
//		String s="";
//		for (int i = 0; i < 1000; i++) {
//			s+=i;
//		}
//	}
//}


//1.StringBuffer
//跟String的不同，在于【可变】字符串，——字符串缓冲区
//StringBuffer中字符串，从来都不会创建到字符串常量池。跟普通的引用类型一样。严格的使用new来创建
//String s="abc";
//StringBuffer s1=new StringBuffer("abc");只在堆中创建一个对象
//下面的相关方法，都是原地修改。
public class Day10_3_String {
	public void testString(){
		long start=System.nanoTime();
		String s="";
		for (int i = 0; i < 1000; i++) {
			s+=i;
		}
		long end=System.nanoTime();
		System.out.println(end-start);
	}
	public void testStringBuffer(){
		long start=System.nanoTime();
		StringBuffer s1=new StringBuffer();
		for (int i = 0; i < 1000; i++) {
			s1.append(i);
		}
		long end=System.nanoTime();
		System.out.println(end-start);
	}
	public void testStringBuilder(){
		long start=System.nanoTime();
		StringBuilder s1=new StringBuilder();
		for (int i = 0; i < 1000; i++) {
			s1.append(i);
		}
		long end=System.nanoTime();
		System.out.println(end-start);
	}

	public static void main(String[] args) {
//		StringBuffer s1=new StringBuffer("abc");
//		s1.append("hello");//原地操作（可变字符串）
//		System.out.println(s1);
		Day10_3_String d=new Day10_3_String();
		d.testString();
		d.testStringBuffer();
		d.testStringBuilder();
	}
}


//2. StringBuilder
//跟StringBuffer类似，可变字符串，
//跟StringBuffer 不同的地方在于：线程不安全的。
//StringBuilder使用线程作为代价，来换取更好的操作性和速度。
//方法跟buffer类似，几乎所有的方法都是原地修改。添加、修改、删除元素（单个字符）





