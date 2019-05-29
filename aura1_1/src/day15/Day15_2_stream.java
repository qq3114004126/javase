package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/*
 * （六）聚合操作
 * 1. 【概念】对于集合元素，进行一连串相关操作（过滤、映射、迭代），跟数据库中聚合函数（min  max  count）
 * 多条记录的结果合成一个。区别在于 ，java中的聚合操作，结果不一定是将多条记录合成一条记录，也有可能是扩展、过滤
 * 
 * 【管道】一序列顺序的聚合操作，叫成管道，管道包括多个操作。（1,2,3,4,5）
 *       多个操作又分为两类：中间操作，终端操作
 *       
 * 【流】   是 一个元素序列，聚合操作通过流来进行操作的。
 *      看成是传送带上面的被处理元素。
 *      被处理：可以添加元素、修改元素、删除元素
 *      
 * 2. 聚合操作跟普通的迭代访问区别
 *    例如：foreach
 *    （1）对比来说，两种操作都可以输出数据源中的元素。
 *    （2）不同：
 *        第一：外部迭代器对集合进行操作，使用 是数据源（集合对象下迭代器）来进行迭代。
 *            聚合操作，使用的的内部迭代方式（list.stream(),内部迭代器）
 *        第二：外部迭代器迭代元素之后，可以对数据的底层元素进行修改操作。
 *            聚合操作是通过流来进行运算，不会将数据的源数据进行修改（相当于流数据是复制的数据）
 */
class Dog{
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
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	
}
public class Day15_2_stream {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
////		外部集合下的迭代器访问元素(使用外部迭代器)
//		list.forEach(System.out::println);
////		stream内部迭代器（流内部的迭代器）
//		list.stream().forEach(System.out::println);
		
//	3.聚合操作（中间操作）
//	(1)filter过滤
		//对流的操作不修改数据源
		list.stream().filter(t-> t>=5).forEach(System.out::println);
//		list.forEach(System.out::println);
		
		list.removeIf(t->t<5);
//		list.forEach(System.out::println); 使用list下的方法，相当于修改了数据源
	
//    （2）map、mapToInt  mapToLong
//	    map映射的意思，将一个值，映射成一个特定的值
		List<Dog> listp=new ArrayList<>();
		listp.add(new Dog("abc",2));
		listp.add(new Dog("bcd",13));
		listp.add(new Dog("def",4));
		listp.add(new Dog("def1",6));
		listp.add(new Dog("def2",10));
		
//		函数式编程
//		listp.stream().filter(d->d.getAge()<4).map(d->"名字："+d.getName()).forEach(System.out::println);;
		
		
//	 (3) distinct 去重重复
//		distinct使用是equals比较
//		listp.stream().distinct().forEach(System.out::println);
		
//	(4)sorted排序
//		listp.stream().mapToInt(d->d.getAge()).sorted().forEach(System.out::println);
//		listp.stream().sorted((d1,d2)->d1.getAge()-d2.getAge()).forEach(System.out::println);
//		
//	(5) peek
//		跟foreach实现的功能一样，只不过中间操作，不是终端操作。
//		listp.stream().mapToInt(d->d.getAge()).sorted().forEach(System.out::println);
//		void forEach(IntConsumer action);
//  	IntStream peek(IntConsumer action);
//		listp.stream().mapToInt(d->d.getAge()).sorted().peek(System.out::println);

//	(6)limit(maxsize)做一个限制  如果集合中元素的个数>limit个数，其余的删除
//		listp.stream().limit(2).forEach(System.out::println);
		
//	(7)skip(n) 跳过元素，n代表跳过n个元素之后才输出
		listp.stream().skip(2).forEach(System.out::println);
	
		
//	4.缩减操作——终端操作
//		（1）max
		System.out.println(listp.stream().mapToInt(d->d.getAge()).max().getAsInt());
		System.out.println(listp.stream().max((d1,d2)->d1.getAge()-d2.getAge()));
		
//		（2）min
		System.out.println(listp.stream().mapToInt(d->d.getAge()).min().getAsInt());
		System.out.println(listp.stream().min((d1,d2)->d1.getAge()-d2.getAge()));
		
//		（3）sum
		int v=listp.stream().mapToInt(d->d.getAge()).sum();
		System.out.println(v);
		
//		（4）count 个数
		System.out.println(listp.stream().mapToInt(d->d.getAge()).count());
		System.out.println(listp.stream().count());
		
//		（5）average
		System.out.println(listp.stream().mapToInt(d->d.getAge()).average());
		
		
//		（6）reduce
//		合二为一
//		{1,2,3,4,5}
//		 a b    条件 +
//		 1 2    
//		 3 3
//		 6 4
//		 10 5
//		 15
		System.out.println(listp.stream().mapToInt(d->d.getAge()).reduce((a,b)->a+b).getAsInt());
//		获取最大值或者最小值的工功能
		System.out.println(listp.stream().mapToInt(d->d.getAge()).reduce((a,b)->a>b?a:b).getAsInt());
		System.out.println(listp.stream().mapToInt(d->d.getAge()).reduce((a,b)->a<b?a:b).getAsInt());
		
		
		
		
	}

}
