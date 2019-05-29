package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * (五) 工具类
 * Arrays 工具：针对于数组的一系列操作
 * Collections工具：针对于集合的工具类
 *1. Arrays
 *   (1)sort
 *   (2)asList(数组对象)：将数组对象转换成集合
 */
//public class Day15_1_ToolClass {
//	public static void main(String[] args) {
////		不能将1，2,3,4转换成集合类型，能够把整个数组当成一个元素转换成集合类型的一个元素
////		int [] t=new int[]{1,2,3,4};
//		
////		能够Integer[] 转换成集合类型，数组中的每个元素，对应集合中的每个元素
//		Integer [] t=new Integer[3];
//		t[0]=200;
//		t[1]=300;
//		t[2]=400;
//		List<Integer> list=Arrays.asList(t);//转换成“假”arraylist对象
////		list.add(500);
////		list.forEach(System.out::println);
////		ArrayList
////		使用的时候需要注意的地方：
////		asList方法获得的集合，不是原本ArraysList，而是Arrays下面自定义内部类，
////		这个内部类也继承AbstractList类实现了一部分接口，但是，内部真正重写方法很少。
////		没有扩容以及删除元素的方法。
//		
////		放入到数组中？ 长度不变、访问速度要求很快。
////		如果asList设计成直接返回ArraysList（原本），返回对象会很大。
//		
////		设计者将返回值设置成了，Arrays下的内部类ArrayList
////		【造成的问题】无法扩容、删除元素
////		Collection接口addAll
//			List<Integer> linew=new ArrayList<>();
//			linew.addAll(list);//将假的arrayllist对象放入到真的arraylist
//			linew.add(500);
//			linew.forEach(System.out::println);
//	}
//}

//2. Collections工具类
//专门为集合提供的 一系列方法，很多方法都是静态的，（跟Arrays类似）

class Person implements Comparable<Person>{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		return this.getAge()-o.getAge();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
public class Day15_1_ToolClass {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(100);
		list.add(-200);
		list.add(300);
		list.add(400);
		
		
		//（1）sort  排序（要求实现comparable接口，实现comparator比较器）
		Collections.sort(list);
		list.forEach(System.out::println);
		
		List<Person> listp=new ArrayList<Person>();
		listp.add(new Person("张三",20));
		listp.add(new Person("张三1",30));
		listp.add(new Person("张三2",40));
//		Collections.sort(listp);
		Collections.sort(listp, (p1,p2)->p1.getAge()-p2.getAge());
		listp.forEach(System.out::println);
		
//		（2）binarySearch
		System.out.println(Collections.binarySearch(list, -100));
		
//		(3)reverse反转
		Collections.reverse(list);
		list.forEach(System.out::println);
		
//		(4)shuffle 洗牌
		Collections.shuffle(list);
		list.forEach(System.out::println);
		
//		(5)fill填充 将所有的元素都填充成第二个参数
//		Collections.fill(list, 1000);
//		list.forEach(System.out::println);
		
		
//		（6）min  max
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(listp,(p1,p2)->p1.getAge()-p2.getAge()));
//		System.out.println(Collections.min(listp));
		
//		(7)frequency
		list.add(100);
		System.out.println(Collections.frequency(list, 100));
		
//		(8)replaceAll
		Collections.replaceAll(list, 100, 10000);
		list.forEach(System.out::println);
	}
}

