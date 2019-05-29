package day17;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/*二、集合
 * （一）Collection接口
 *     第一个级别的
 * （二）List接口
 *     第二个级别的  还有Set
 *  Collection 下有两个子接口：为了实现集合中不同规范。
 *     List：有序（和放入元素的顺序相同）、元素可以重复
 *     Set：   是否有序、无序（也要取决于实现类）、不可以放入重复元素
 *   
 * 1. List接口的常用实现类 
 *   ArrayList(底层使用动态数组实现)：适合做查询
 *   LinkedList(底层使用链表实现)  ：适合做添加、删除元素，不适合做查询
 *  
 * 2. ArrayList创建集合对象、相关方法
 *   比Collction接口多出来的方法
 *   （注意比较：为什么Collction没有？跟Set接口的实现）
 */
//public class Day14_1_List {
//  public static void main(String[] args) {
//	List<Integer> list=new ArrayList<>();
////	1.addAll(int index,其他集合) 能够将参数集合插入到原集合对象中的index位置。
//	for (int i = 0; i < 10; i++) {
//		list.add(i);
//	}
//	List<Integer> list2=new ArrayList<>();
//	list2.add(100);
//	list2.add(200);
//	list.addAll(5, list2);
//	list.forEach(System.out::println);
	
//	[思考] Collction没有这个方法？ 
//	如果Collction有这个方法，那么意味着Set和List都会继承这个方法。
//	Set本身元素是无序的， 所以没有index
	
	
//	2.add(int index ,e)  将参数的元素插入到集合中指定的位置
//	list.add(5, 100);
//	list.forEach(System.out::println);
	
//	list.add(e)是Collction接口下的方法  对于List 和Set的规范来说一致，只是具体规则不同。
	
	
//	3.remove(int index) 根据位置删除某一个元素，并返回该元素
//	System.out.println(list.remove(5));
//	list.forEach(System.out::println);
	
//	4.remove(Object o) 根据元素内容删除某一个元素。
//	list.remove(Integer.valueOf(100));
//	list.forEach(System.out::println);
	
//	5. set(int index,e) 指定一个位置index上的元素，为e
//	list.set(5, 100);
//	list.forEach(System.out::println);
//	
	
//	6.replaceAll()根据某一个规则，替换掉所有符合规则的元素
//	UnaryOperator<Integer>接口：规则：传入一个old元素，传出有一个new元素
//	list.replaceAll((t)->t+100);
//	list.forEach(System.out::println);
//	
//	list.replace  set就可以设置某一个元素的值是另外一个值。
	
	
//	7.get(int index)返回参数指定位置上的元素
//	System.out.println(list.get(0));
	
//	8.indexof(元素)  返回参数在集合中第一次出现的位置 ，如果不存在则返回-1
//	lastIndexOf    返回参数在集合中最后一次出现的位置
//	list.set(6, 600);
//	System.out.println(list.indexOf(Integer.valueOf(600)));
//	System.out.println(list.lastIndexOf(600));
	
	
//	9.sort(比较器接口)
//	list.set(6, -6);
//	list.sort(null);  //按照自然排序  元素对象的Comparable接口
//	list.forEach(System.out::println);
	
//	list.sort((t1,t2)->t2-t1);
//	list.forEach(System.out::println);
	
//	10.subList(fromIndex, toIndex) 根据位置获取list的子集
//	包含开头不包含结束
//	List<Integer> l=list.subList(2, 6);
//	l.forEach(System.out::println);
	
//	11.listIterator list 迭代器
	
//3.关于list实现类对象的迭代器
//	ListIterator<Integer> li=list.listIterator();
//	ListIterator<Integer> li2=list.listIterator(2);//可以指定参数，指定指针位置
//	跟之前的Iterator迭代器对象对比来看多出来的功能：扩充了Iterator接口的功能。
//	可以获取前一个元素(索引、元素、是否有前一个元素、set  add )
//	(1)hasPrevious（）判断是否有前一个元素
//	System.out.println(li.hasPrevious());
//	System.out.println(li2.hasPrevious());
//	
//	(2)Previous（）获得前一个元素，指针会移动（next()）指针也会移动
//	System.out.println(li2.previous());
//	System.out.println(li.previous());
	
//	(3)nextIndex 获得下一个元素的位置   :指针不动 
//	previousIndex获得上一个元素的位置  :指针不动
//	
//	System.out.println(li2.nextIndex());//2
////	System.out.println(li.nextIndex());//0
//	ListIterator<Integer> li2=list.listIterator(10);
//	list.listIterator(10)参数含义：调用next方法 时候，即将获取的元素位置。
//	System.out.println(li2.previous());//9
//	System.out.println(li2.previousIndex());//8
	
//	(4)remove: 最后一次调用next返回的元素，最后一次previous，返回的元素
//	如果没有前驱或者没有后继，调用会报错
//	ListIterator<Integer> li2=list.listIterator(10);
//	System.out.println(li2.previous());//9
//	System.out.println(li2.previous());//8
//	System.out.println(li2.previous());//7
//	li2.remove();
//	while(li2.hasPrevious()){
//		System.out.println(li2.previous());
//	}
//	while(li2.hasNext()){
//		System.out.println(li2.next());
//	}
//    
//	list.forEach(System.out::println);
	//迭代器是list对象的底层数据结构，如果删除了某个元素，则list对象也是被改变
	
//	(5)set（元素e）当前操作的元素修改成e （最后一次调用的next，最后一次调用previous）
//	ListIterator<Integer> li2=list.listIterator(10);
//	System.out.println(li2.previous());//9
//	li2.set(5000);//将9这个位置的元素修改成e
	
//	ListIterator<Integer> li2=list.listIterator();
//	li2.next();
//	li2.set(5000);
//	System.out.println(li2.previous());
//	list.forEach(System.out::println);

	
//	(6)add(元素e) 下一次调用next方法，返回元素的前面 加入e
//	ListIterator<Integer> li2=list.listIterator(10);
////	System.out.println(li2.next());
//    li2.previous();
//    li2.add(5000);
//    System.out.println(li2.previous());
    
//	li2.add(6000);
////	System.out.println(li2.next());
//	System.out.println(li2.previous());
//	
////	list.forEach(System.out::println);
//	
//	
////其他的实现类：Linkedlist 和ArrayList区别
//	List<Integer> listA=new ArrayList<>();
//	List<Integer> listL=new LinkedList<>();
//	对象下的方法几乎完全一致，但是底层存储不一样。
//	ArrayList 动态数组
//	LinkedList 采用链表
//  }
//}

/*
 *（三）Set接口 
 *Set继承了Collection接口，相对于List来说，Set原接口：不可重复，但是是否有序，取决于子接口
 *常用实现类：
 *(1)HashSet： 注重于元素不可重复
 *(2)LinkedHashSet：继承HashSet，内部使用链表来存储数据结构。所以可以有序（进入元素顺序和出去的顺序一致）
 *(3)TreeSet: 用来实现Set的子接口（SortedSet、NavigableSet）
 *
 *1.HashSet 最普通的实现Set 的实现类： 注重于元素不可重复
 *底层数据结构来实现：采用哈希码来决定每个元素存储的位置。
 *    不能重复：hash码不能重复
 *    没有顺序：hash码产生的规则，来存储元素，不能够保证元素本身的大小确定存储位置的前后。
 *    虽然没有顺序，但是每一次输出的结果是一致 的（set的同一性，每一次规则得到的y都是一致 ）
 */
//public class Day14_1_List {
//	  public static void main(String[] args) {
//		  Set<Integer> set=new HashSet<>();
//		  set.add(1000);
//		  set.add(500);
//		  set.add(10);
//		  set.add(100000);
//		  set.forEach(System.out::println);
//	  }
//  }


//2.LinkedHashSet
//继承了HashSet，底层使用双向链表来维护元素的顺序。
//public class Day14_1_List {
//	  public static void main(String[] args) {
//		  Set<Integer> set=new LinkedHashSet<>();
//		  set.add(1000);
//		  set.add(500);
//		  set.add(10);
//		  set.add(100000);
//		  set.forEach(System.out::println);
//	  }
//}


//3.Set的子接口SortedSet
//不仅仅有序，同时还要求放入的元素必须是可排序的元素
//【可排序元素】：（1）元素对象实现Comparable接口   (2) SortSet，实现类中，加入Compartor比较器
//            任选其一。
//（1）创建（实现比较的功能）：想创建SortedSet对象成功，必须遵循元素可排序
//实现类【TreeSet】
//class Person implements Comparable<Person>{
//class Person {
//	private String name;
//	private int age;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	}
//	@Override
//	public int compareTo(Person o) {
//		return o.getAge()-this.getAge();//大到小
//	}
	
//}
//public class Day14_1_List {
//	  public static void main(String[] args) {
////		  Integer内部实现了Comparable下面compareTo方法
////		  SortedSet<Integer> set=new TreeSet<>();
////		  set.add(1000);
////		  set.add(500);
////		  set.add(10);
////		  set.add(100000);
////		  set.forEach(System.out::println);
/  /	                                       	  
////		  方式一：元素放入Person对象(可以自己Person下实现Comparable)
////		  SortedSet<Person> set=new TreeSet<>();
////		  set.add(new Person("张三1",20));
////		  set.add(new Person("张三2",30));
////		  set.add(new Person("张三3",40));
////		  set.forEach(System.out::println);
//		  
////      方式二：也可以在创建TreeSet对象时指定Comparator比较器
//		  SortedSet<Person> set=new TreeSet<>((p1,p2)->p2.getAge()-p1.getAge());
//		  set.add(new Person("张三1",20));
//		  set.add(new Person("张三2",30));
//		  set.add(new Person("张三3",40));
//		  set.forEach(System.out::println);
//		  
////		  如果两种方式都有，则方式二覆盖方式一
//	  }
//}

//  （2）SortedSet接口下的方法
//public class Day14_1_List {
//	public static void main(String[] args) {
//		SortedSet<Integer> set=new TreeSet<>();
////		1.set.comparator();//返回TreeSet对象的比较器
////		System.out.println(set.comparator());
//		
////		2.subset(startE,endE) 返回子集
////		startE:开始元素(不是索引，是元素)
////		endE  ：结束元素（不包含）
////		元素不存在也不会报错
//		set.add(100);
//		set.add(300);
//		set.add(200);
////		SortedSet<Integer> sub=set.subSet(100, 300);
////		SortedSet<Integer> sub=set.subSet(100, 10000);
////		sub.forEach(System.out::println);
//		
////		3. headset(元素) ：返回前n个元素（参数是元素， 不是位置）， 但是不包含第n元素
////		set.headSet(300).forEach(System.out::println);
//		
////		4.tailset(元素)：返回后n个元素，包含第n个元素
//		set.tailSet(100).forEach(System.out::println);
//		
////		5.first\last返回第一个元素、返回最后一个元素（sorted）
//		System.out.println(set.first());
//		System.out.println(set.last());
//	}
//}
//4.Set的子接口SortedSet，SortedSet的子接口NavigableSet
//对于SortedSet的扩展（有序、必须排序、多了扩展方法）
public class Day14_1_List {
	public static void main(String[] args) {
		NavigableSet<Integer> set= new TreeSet<>();
		for (int i = 0; i < 10; i+=2) {
			set.add(i);
		}
//		1.lower(e)元素e，返回比e小一号的值
		System.out.println(set.lower(5));
		
//		2.floor(e) 小于等于参数e的值
		System.out.println(set.floor(5));
		                          
//		3.higher(e) 大于参数e一号的值： 
		System.out.println(set.higher(5));
		
//		4.ceiling(e) 大于等于参数e的值
		System.out.println(set.ceiling(5));
		
//		
//		5.set.pollFirst() 返回最小值，而且删除这个值
//		System.out.println(set.pollFirst());
//		System.out.println("=======");
////		set.forEach(System.out::println);
		
//		6.set.pollLast() 返回最大值，而且删除这个值
//		
//		System.out.println(set.pollLast());
//		System.out.println("=======");set.forEach(System.out::println);
		Iterator<Integer> it=set.descendingIterator();//获得逆序的迭代器
		it.forEachRemaining(System.out::println);
		
		
		
		
		
		
		
		
	}
}
		
        
        
		
		
		
		
		
		