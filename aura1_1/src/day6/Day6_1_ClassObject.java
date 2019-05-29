package day6;

/* 一、基本概念
 *    对象、类、类和对象之间的关系
 * 二、类的定义、初始化、类中成员
 * 1. 定义
 * 2. 应用类创建对象
 * 3. 类中属性（成员变量）
 * 4. 类中的行为（方法）
 * 5. 构造器
 * 6. 修饰符static（静态成员）
 * -------------
 * 7. 块
 * 块，在类中声明，类似于声明成方法的方法体，相当于方法没有名字，也没有返回值，也没有参数，只有方法体
 * java中块分为两种：静态块、构造块（实例块）
 * 
 */

// （1）静态块
//	   所有的静态内容都跟每个对象无关，只跟类有关
//	【规则】虚拟机加载类的时候，会执行静态块中的方法体，只被执行一次（类只有一个）
//	【语法】 static {   }  一个类可以有多个静态块 ，按照先后顺序执行
//  【应用场景】加载类的时候，需要预先初始化内容的时候，例如：日志、连接。。。

//class Person{
//	static{
//		System.out.println("这是person的静态块1");
//	}
//	static{
//		System.out.println("这是person的静态块2");
//	}
//}
//
//public class Day6_1_ClassObject {
//	public static void main(String[] args) {		
//		Person p1=new Person();
//		Person p2=new Person();
//	}
//}

//（2）构造块（实例块）
//【规则】跟每个对象相关，在创建一个实例的时候，就会执行一次实例块中的代码
//      每创建一个对象，都会执行一次。
//【语法】{  }   
//class Person{
//	String name;
//	{
//		System.out.println("这是person的实例块");
//	}
//	
//}
//public class Day6_1_ClassObject {
//	public static void main(String[] args) {		
//		Person p1=new Person();
//		Person p2=new Person();
//	}
//}

//（3）成员变量三种初始化方式
// 第一：在声明的同时初始化
// 第二：实例块中初始化
// 第三：构造器中初始化
//【顺序】声明处初始化和实例块初始化，谁在前面谁先执行，构造器最后一个执行
//      初始化的结果以构造器中为准。
/*在创建对象时候，如果没有对象，哪里来的属性？
 * 真正在编译时执行的代码
 * public Person(){
	 * 声明处的初始化
	 * 实例块
	 * 构造器中其他的代码
 * }
 * 
 */
class Person{
	
	//实例块中初始化
	{
		System.out.println("------实例块中初始化------");
		name="张三2";
	}
	
	
		
	//构造器中初始化
	public Person(){
		System.out.println("------构造器中初始化------");
		this.name="张三3";
	}
	
	//声明时初始化
	String name=this.setNameInit();
	String setNameInit(){
		System.out.println("------声明的时候初始化------");
		return "张三1";
	}
}
public class Day6_1_ClassObject {
	public static void main(String[] args) {		
		Person p=new Person();
		System.out.println(p.name);
	}
}

