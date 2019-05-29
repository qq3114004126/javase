package day6;
/*
 * 第九章    面向对象特征
 * 概述背景：
 * OOP
 * 编程规范：
 * 面向过程: 编程思想 ，程序按部就班的执行 ，解决问题，如果有重复代码，使用函数解决。大量函数的堆积。
 *        适合：业务不会经常被修改。业务本身逻辑不复杂
 *        
 * 面向对象：先不解决问题，先是分析“谁（对象）”，有哪些属性、哪些行为
 *        适合：业务复杂，而且经常修改
 * 员工请假：请假--审批---人事记录
 * 请假(员工，领导)
 * 审批(领导，员工)
 * 记录（人事，员工）
 * 
 * 员工请假：请假--审批---人事记录 OOP
 * class  员工{
 *   属性
 *   请假（领导）
 *   撤销（领导）
 *   
 * }
 * class 领导{
 *   审批（员工）
 *   
 * }
 * class 人事{
 *    记录（员工）
 * }
 * 
 * 领导对象 m
 * 员工对象 e
 * 人事对象 h
 * e.请假（m）
 */



// 面向对象的特性：
// 封装、继承、多态

//一、封装
/* 封装含义：隐藏，隐藏具体实现的细节，只提供给外界调用的统一接口
 *【封装目的】：（1）保护数据的安全性  （2）方便调用者调用
 * 
 * 成员变量私有化是封装性很好体现
 * 
 * 1.【成员私有化的方式】
 * 使用private权限修饰成员变量。
 * 2.【成员私有化后的效果】
 * 被私有化的成员，只有在类的内部可以被访问，在类外部不能够被访问
 * 3.【希望访问私有成员】
 * 需要提供对外的统一接口（提供统一的public权限get（获取）或set（赋值））
 * 
 * eclipse中的快捷键产生get和set shift+alt+s  右键source
 */
//class Person2{
//	public String name="张三";
//	private int age1=100;
//	public void test(){
//		System.out.println(this.name);
//		System.out.println(this.age1);
//	}
//	public String getAgeStr(){
//		return "[年龄]："+this.age1;
//	}
//	public int getAge(){
//		return this.age1;
//	}
//	public void setAge(int age){
//		this.age1=age;
//	}
//}
//public class Day6_4_OOP {
//   public static void main(String[] args) {
//	  Person2 p=new Person2();
//	  System.out.println("姓名："+p.name);
//	  p.name="李四";
////	  System.out.println(p.age);
//	  System.out.println(p.getAgeStr());
//	  System.out.println(p.getAge());
//	  p.setAge(40);
//	  System.out.println(p.getAge());
//	   
//   }
//}

//二、继承
//1. 背景 ：经过需求分析， 创建两种 JavaTeacher  PythonTeacher
//属性和行为
/* JavaTeacher:名字、年龄，自我介绍、讲课
 * PythonTeacher：名字、年龄，自我介绍、讲课
 * PhpTeaher
 * 【使用继承实现代码的重复】
 * 通过继承：实现代码的重用性，相当于设计类的时候，将多个类公共的部分（普通的部分），放到父类中，
 * 让子类继承父类。相当于子类中会有父类下成员（private的成员不继承，构造器不继承）
 * 
 * 2.实现
 * 继承实现一般和特殊的关系。
 * 一般：父类
 * 特殊：子类（扩展类，衍生类）
 * 
 * 继承之后的效果：子类下会具有父类下的成员，如果子类需要有更高级的功能，可以单独实现。
 * （1）继承的类型
 * 隐式继承： 当一个类没有显式的继承任何类的时候，每个java类都会默认的继承Object
 *  关于Object类后期课讲
 * 
 * 显式继承：
 * 语法：在定义类的时候，使用   子类名  extends  父类名
 *      java中一个类只能继承一个父类（单继承），可以多层继承  儿子继承父亲 ，父亲继承祖辈。
 *  水果（父）和苹果（子）
 *  
 *  重要操作符instanceof
 *  关键字
 *  使用方法：判断对象是不是由某个类（父类）产生的
 *  语法：  对象  instanceof  类型（父类）
 *  【使用场合】中学生  小学生  大学生   如果是学生对象就可以半价
 *  s 学生对象
 *  if (s instanceof 中学生||s instanceof 小学生||s instanceof 大学生)
 *  学生的父类Student
 *  if (s instanceof Student)
// */
//class Fruit{
//	public void show(){
//		System.out.println("水果");
//	}
//}
//class Apple extends  Fruit{
//	
//}
//public class Day6_4_OOP{
//	public static void main(String[] args) {
//		Apple a=new Apple();
//		Fruit f=new Fruit();
////		a.show();
//		System.out.println(a instanceof Apple);
//		System.out.println(a instanceof Fruit);
//		System.out.println(a instanceof Object);
//		
//		
//		
//	}
//}

//3. 成员的继承
//子类继承父类的时候，可以继承成员
//【结论】
/* 当子类和父类在同一个包中，子类可以继承父类 public  protected 和default
 * 当子类和父类不再同一个包中，子类可以继承父类public protected
 * 但是所有情况都不能继承private 
 * protected成员，如果是同包中类，子类可以继承到父类成员，
 * 如果是不同包中，声明public class 子类，可以访问到父类下protected成员
 */
//pulic class Fruit{
//	private int privatAttr;
//	protected int protectedAttr;
//	public int publicAttr;
//	int defaultAttr;
//}
//public class Apple extends Fruit{
//	
//}

//public class Day6_4_OOP{
//	public static void main(String[] args) {
//		Apple a=new Apple();
//		System.out.println(a.publicAttr);不能访问
//		System.out.println(a.protectedAttr);
//		System.out.println(a.defaultAttr);
//	}
//}

//4.重写（覆盖）
//如果子类认为父类下方法不可用，不够用，不合适，可以自己实现方法——覆盖（重写）父类下方法
//【重写之后效果】
//当调用子类下的方法，如果有重写方法，调用子类方法，如果没有重写，则调用父类下的方法
//【重写方式】：定义跟父类一样的方法（方法名、参数、返回值都跟父类一致）（返回值和参数也可以是泛型类型可擦除类型）

//【重写规则】
//（1）定义跟父类一样的方法（方法名、参数、返回值都跟父类一致）
//（2）要求子类方法的权限不能低于父类方法的权限（相同可以）———— 为了扩充父类的方法和属性
//（3）参数类型和返回值的泛型（后面讲）
//（4）子类不能比父类方法抛出更多的异常（后面讲）

//【重写标记（了解）】@Override： 为了标记重写，以为有的情况下，方法不是重写，但是也不报错，为了满足重写要求，可以加入标记
//        可以提示子类是否有重写成功。
class Fruit{
	String name="初始值";
	public void setName(){
		this.name="aaa";
	}
	public void show(){
		System.out.println("水果");
	}
}
class Apple extends Fruit{
	
//	public void show(){
//		System.out.println("我是苹果");
//	}
//	@Override
	public void show(int a,int b){
		
	}
	public void newfun(){
		System.out.println("子类下的特殊方法");
	}
}

public class Day6_4_OOP{
	public static void main(String[] args) {
		Apple a=new Apple();
		Fruit f=new Fruit();
		a.show();
		a.newfun();
		f.show();
//		f.newfun();
		a.setName();
		System.out.println(a.name);
		System.out.println(f.name);
	}
}


