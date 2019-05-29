package day12;

import java.util.ArrayList;
import java.util.List;

/*
 * 第十九章  泛型
 * 【背景】
 * 在jdk1.5之前，为了让“集合” （能够存放多个数据元素（对象型数据）的仓库——容器）
 * 能够处理各种类型，可以允许放入多种类型的元素。统一设置成Object
 * Object s=集合.get(0)
 * Object s=集合.get(1)
 * Integer t=(Integer)s
 * 大多数用户都是在使用集合的时候，放入同种类型的元素
 * 
 * jdk1.5之后，出现了泛型的概念（c++中泛型）
 * 在创建集合的时候，就必须规定好这个集合中，只能放入什么类型的元素
 * 解决之前集合中元素的问题：
 * （1）add(s)   String ss=集合.get(0)  解决繁琐性
 * （2）add入元素的时候，可以检测元素类型是否符合集合声明的泛型类型 ，安全性
 * 
 * 【面试】集合中是不是只能放入同种类型的元素？不是， 除非声明了泛型类型
 * 
 * 
 * 介绍集合简单操作：主要会应用到接口和实现类
 * List接口
 * ArrayList实现类
 * List list=new ArrayList();  使用父类引用指向子类对象
 * add方法：加入元素
 * get方法：获取元素
 */
//public class Day12_1_T {
//  public static void main(String[] args) {
//	 //1.5之前  list集合中可以放入Object
////	  缺点：不安全（可以随便放入元素，但是不允许随便取出元素）
////	        即使取出的是符合要求的类，操作也很繁琐（强制转换）
//	  List list=new ArrayList();
//	  list.add("one");
//	  list.add("two");
//	  list.add(Integer.valueOf(3));
//	  String s1=(String)list.get(0);
//	  String s2=(String)list.get(1);
//	  String s3=String.valueOf(list.get(2));
//  }
//}

//2.泛型应用
//【语法】  （泛型类）类型<类型T>：允许泛型类中，加入T类型的元素
//【使用的情形】：两种
//创建对象，声明泛型类型:  泛型类<类型>  变量名 
//方法定义，声明形式参数：   泛型类<类型>  形式参数名
//【本质】将所操作的数据类型指定一个参数类型。也被称为，参数化类型。
//public class Day12_1_T {
//	  public static void main(String[] args) {
//		  List<String> list=new ArrayList<String>();
//		  list.add("one");
//		  list.add("two");
//		  list.add("tree");
////		  list.add(3);
//		  String s1=list.get(0);
//		  String s2=list.get(1);
//		  String s3=list.get(2);
////	  	  String s3=String.valueOf(list.get(2));
//	}
//}
//【相关概念】
//对于泛型类型来说，在使用类型的时候，如果没有提供泛型类型 （没有<>），叫做原生类型
//                          如果提供了泛型类型，被称为参数化类型
//原生类型和参数化类型之间的转换
//public class Day12_1_T {
//	  public static void main(String[] args) {
//		  List list1=new ArrayList();  //原生
//		  List<String> list2=new ArrayList();//泛型
////	  list1=list2;
//		  list2=list1;  //有警告，但是不会出错
////		  原生类型直接赋予给泛型类型，不可以
////		  泛型类型直接赋予给原生类型，可以
//	}
//}


//3. 自定义泛型类型
//自定义泛型类型语法：
//class 类名  <大写字母E [ extends  父类类型]>
//意味着类中，可以装入E类型，也可以是父类的任意子类型
//E 字母：代表抽象的类型，可以任意定义
//习惯性  T(type)  E（element）   K（key）   V（value）
//需求，定义一个泛型类（仓库），使得泛型类中，能够装入一个本书，或者能够装入一台计算机
class Book{
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
	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
}
class Computer{
	private String type;
	private double price;
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
	public Computer(String type, double price) {
		super();
		this.type = type;
		this.price = price;
	}
	
}
//class Integer{
//	private int value;
//	public int intValue(){
//		return this.value;
//	}
//}

//class Store<T>{
//	private T[] t ;
//
//	public T[] getT() {
//		return t;
//	}
//
//	public void setT(T[] t) {
//		this.t = t;
//	}
//}
//
//public class Day12_1_T {
//	public static void main(String[] args) {
//	   Book b1=new Book("java",100.0);
//	   Book b2=new Book("java",100.0);
//	   Book [] bs={b1,b2};
//	   Computer c=new Computer("intel7",10000.0);
//	   Store<Book> sbook=new Store();
//	   sbook.setT(bs);
//	   Store<Computer> cstore=new Store();
//	   cstore.setT(new Computer[]{c});
//	}
//}

//4. 泛型类型的继承
/* T  t=new T();
 * T[]  ta=new T[3] ;
 * Object o=new Object();
 * Object[] oa=new Object[3];
 * 当定义了一个类型之后，如果这类型有父类型，
 * 那么这个类型对应数组类型，也是对应父类型数组类型的子类。
 * 
 * List<Object>   T继承Object
 * List<T>不继承List<Object>
 * 泛型类型不保持原有的参数类型的继承关系。
 * 但是数组类型保持元类类型之间的继承关系。
 */
//class T{}
//public class Day12_1_T {
//	public static void main(String[] args) {
//	  T t=new T();
//	  Object o =new Object();
//	  T[] ta=new T[3];
//	  Object[] oa=new Object[3];
//	  System.out.println(t instanceof T);
//	  System.out.println(t instanceof Object);
//	  System.out.println(ta instanceof T[]);
//	  System.out.println(ta instanceof Object[]);
//	  
//	  
//	  List<Object> listo=new ArrayList<>();
//	  List<T> listt=new ArrayList<>();
//	  System.out.println(listt instanceof List);
//	}
//}

//class Fruit{
//	String name;
//	public void show(){
//		System.out.println("水果");
//	}
//}
//class Apple extends Fruit{
//	public void show(){
//		System.out.println("苹果");
//	}
//}
//
//public class Day12_1_T {
//	public static void doSomething(List<Fruit> fs){
//		
//	}
//	public static void main(String[] args) {
//		List<Fruit> fs =new ArrayList();
//		List<Apple> as =new ArrayList();
//		doSomething(fs);
//		doSomething(as);
//		
//	}
//}


//5.泛型类型参数的通配符
//（可以泛型类型父类型）——通过通配符来实现的。
//（1）无界通配符
//【语法】? 不确定的类型
//List<?>是所有List<>泛型类型的父类型
//class Fruit{
//	String name;
//	public void show(){
//		System.out.println("水果");
//	}
//}
//class Apple extends Fruit{
//	public void show(){
//		System.out.println("苹果");
//	}
//}
//
//public class Day12_1_T {
//	public static void doSomething(List<?> fs){
//	
//	}
//	public static void main(String[] args) {
//		List<Fruit> fs =new ArrayList();
//		List<Apple> as =new ArrayList();
//		List<String> ss =new ArrayList();
//		doSomething(fs);
//		doSomething(as);
//		doSomething(ss);
//}
//}

//（2）上限通配符
//如果只希望往里面装入水果类型的 List 可以通过上限通配符来设置
//【语法】  <? extends X> 表示可以是X类型，也可以是X类型子类型
//  (了解) extends 可以多继承。  <?  extends X&Y> 代表同时继承
//class Fruit{
//String name;
//public void show(){
//	System.out.println("水果");
//}
//}
//class Apple extends Fruit{
//public void show(){
//	System.out.println("苹果");
//}
//}
//
//public class Day12_1_T {
//public static void doSomething(List<? extends Fruit> fs){
//
//}
//public static void main(String[] args) {
//	List<Fruit> fs =new ArrayList();
//	List<Apple> as =new ArrayList();
//	List<String> ss =new ArrayList();
//	doSomething(fs);
//	doSomething(as);
//	doSomething(ss);
//}
//}

//(3) 下限通配符
//可以是X类型，也可以是X类型父类型
//【语法】<?  super X>

//class Food{
//	
//}
//class Fruit extends Food{
//String name;
//public void show(){
//	System.out.println("水果");
//}
//}
//class Apple extends Fruit{
//public void show(){
//	System.out.println("苹果");
//}
//}
//
//
//public class Day12_1_T {
//public static void doSomething(List<? super Apple> fs){
//
//}
//public static void main(String[] args) {
//	List<Fruit> fs =new ArrayList();
//	List<Apple> as =new ArrayList();
////	List<String> ss =new ArrayList();
//	List<Food> fo =new ArrayList();
//	List oo =new ArrayList();
//	doSomething(fs);
//	doSomething(as);
//	doSomething(fo);
//	doSomething(oo);
////	doSomething(ss);
////	Properties
//	
//}
//}

//6.泛型类型的擦除
//【泛型类型背景】：java中的泛型类型，仿照c++下的泛型类型，c++泛型类型不仅仅在编译期起作用，在运行期也会起作用
//             泛型类型检查仅仅是在编译期有效，在编译期过后，在运行期时，素有的泛型参数都会丢失<>
//             编译期取的元素的类型，取泛型类型擦除之后的类型.
//List<String> list=
//class Store<T> { 
//   private T t;
//}
// 调用的时候， Store <Book> sbook=new Store();
//泛型类型在擦除的时候，取什么样的类型
//【规则】：如果泛型类型内部，没有继承任何的父类，擦除之后类型取Object类型
//       如果泛型类型内部，有继承了父类，擦除之后的类型取父类类型。
//public class Day12_1_T {
//	public static void main(String[] args) {
////		Store <Book> sbook=new Store();
////		编译过后
////		Store sbook=new Store();  泛型类型擦除之后的 样子
//
//		List<Integer> list=new ArrayList();
////		擦除之后List  list=new ArrayList();
//	}
//}
//class Number{
//	
//}
//class Store<T >{
//	private T t;
//}
////编译之后，被擦除泛型类型
//class Store {
//	private Object t;
//}
//class Store<T extends Number>{
//	private T t;
//}
////编译之后，被擦除泛型类型
//class Store {
//	private Number t;
//}

//(1)关于重载方法中的泛型
//重载：在同一个类中，有相同名字的方法
//名字必须相同
//参数类型必须不同
//只有返回值不同的不叫重载
//[重载的要求中，对于类型]：是否能够构成重载，要看擦除类型后，参数类型是否相同，如果擦除之后，相同，则不能构成重载。
//class Fruit{
//	
//}
//interface A{
//	
//}
//interface B{
//	
//}
//class T{
//	
//}
//public class Day12_1_T {
////	public void m(List<String> ls){}
////	public void m(List<Integer> li){}
//	
////	上面两个方法擦除之后的样子，相当于参数相同，不是重载
////	public void m(List ls){}
////	public void m(List li){}
//	
////	public void  m(B b){}
////	public void  m(List<? extends A&B> ss){
////	}问题
//	
//	public static void main(String[] args) {
//		
//		}
//	}
//（2）关于方法重写泛型规则
//【规则】名字相同，子类中重写父类的方法。
//参数：要求参数类型一样。如果泛型类型擦除之后一样也可以。
//子类扩展
//子类的参数类型是原生类型，父类参数类型擦除类型跟子类类型一致。
//父类类型的参数，擦除泛型类型后，跟子类参数类型一致，也可以算是重写。
//但是反过来，子类类型如果擦除泛型之后，跟父类类型一致，不能构成重写。
class Fruit{
	public void m(List<String> list){
	}
}
class Apple extends Fruit{
	public void m(List list){
	}
}










