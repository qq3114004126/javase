package day6;

import day6.other.DifferentPackage;
import day6.other.OutPublic;

//import day6.other.Another;
/*
 * 第八章 访问权限
 * 一、包
 * 1. 概念和作用
 * 包 package 类似于操作系统中的文件夹，提供独立的命名空间。
 * 包的作用：
 * （1）将相关的类组织在一起。
 * （2）可以提供独立的命名空间，解决命名冲突
 * （3）包可以提供访问权限的控制
 * 
 * 2. 声明方式
 * 对于每个java文件，第一行，都会指明当前类所在的包，如果有子包会使用.分隔
 * 一个源文件只能有一条包声明的语句
 * 【语法】  package 包.子包....
 * 【全限定名】 是一个类真实的名字 [包.子包...类名]
 * 了解：
 * 包的级别 ，
 * 第一级别，按照项目类型划分，com    gov    org
 * 第二级别，开发者或者运行商的名称   com.huawei
 * 第三级别，项目名称  erp  student
 * 第四级别，模块的名称  teacher
 * com.huawei.student.teacher  
 * 
 * 
 * 二、引用包中的类
 * 1. import关键字
 * 【规则】
 * 对于包内的类，可以使用类的简单名称（不是全限定名）就可以访问
 * 对于包外的类，需要使用两种方式：
 *     （1）使用全限定名(如果类只用一次)
 *     （2）import 导入相关的类，再使用导入后的简单名称
 *       import动作会增加编译时间，不会增加执行时间，因为导入是在编译期间完成。
 *       一般来说，可以有很多个import，要求位置必须在package之后，会在class定义之前
 *       
 *       import 包...指定类
 *       import 包.*  ：可以导入包下的所有类，（但是不导入子包中的类）
 *                    如果导入的时候，不同的包中有同名的类，会有名称冲突。
 *                    解决方式：
 *                    （1）加全限定名
 *                    (2)import重新导入指定的类
 *                    
 *      注意：java.lang包会被自动导入
 *            
 */
//
//import java.util.*;
//import java.awt.*;
//import java.util.List;
//public class Day6_3_Privileges {
//	public static void main(String[] args) {
//		Other o=new Other();//同包中的类，可以直接访问
//		day6.other.Another a=new day6.other.Another();//不同包下，可以使用全限定名
//		Another a1=new Another();
//		List list=null;
//	}
//  
//}

//2. import static关键字（了解）
// 导入类型中声明的静态成员，导入之后，就像在自己代码中定义了变量一样。
// 注意：容易造成命名冲突，原来被导入的方法或者属性被覆盖
//import java.lang.Math;
//import static java.lang.Math.sqrt;
//
//import java.util.Arrays;
//public class Day6_3_Privileges {
//	public static void sqrt(int a){
//		System.out.println("hello");
//	}
//	public static void main(String[] args) {
////		Math.sqrt(100);
//		sqrt(100);
////		Arrays.toString(a);
//	}
//}

//三、访问权限修饰符
//虽然我们可以使用import导入其他类，但是不是全能，也要受到权限的限定。
//java中有四种访问权限修饰符：从大到小：
//public：公有  ，可以任意访问，可以修饰类、属性、方法、构造器
//protected：受保护，  可以访问同包，如果不是同包的类，必须是该类的子类才可以访问 。可以修饰属性、方法。
//default：没有写权限的时候，就是default：默认权限，只能被同包中的类访问。可以修饰类、属性、方法
//private :私有，只有在本类中可以访问。修饰属性和方法。

//类（接口）：只有public和default权限
//属性和方法：以上四种都可以
//public class Day6_3_Privileges {
//	public static void main(String[] args) {
//		Other o=new Other();//可以访问同包下的类
////		Another a=new Another(); ，default不能访问,不同包下的类
//	}
//}

//详细权限设置
//1.对于类来说， 两种权限public  default ，每一种权限都分为包内和包外
//有四种情况
//本包中访问public default
//包外访问public  default
//public class Day6_3_Privileges {
//	public static void main(String[] args) {
//		InDefault o=new InDefault();//包内的default可以访问
//		InPackagePublic x=new InPackagePublic();//包内的public可以访问
//		OutPublic op=new OutPublic();//包外public可以，但是要求import
////		OutDefault od=new OutDefault();//包外default不可以访问
//	}
//}


//2. 对于成员变量和方法
//只考虑三个修饰符  private  default  public
// 类内部、包内部、包的外部
//第一种情况，在本类中访问三种权限 ,【结论】：都可以访问
//class Person1{
//	private int privateAttr;
//	int defaultAttr;
//	public int publicAttr;
//	private void privatefun(){
//		
//	}
//	void defaultfun(){
//		
//	}
//	public void publicfun(){
//		
//	}
//	public static void main(String[] args) {
//		Person1 p=new Person1();
//		System.out.println(p.defaultAttr);
//		System.out.println(p.privateAttr);
//		System.out.println(p.publicAttr);
//		p.defaultfun();
//		p.publicfun();
//		p.privatefun();
//	}
//}

//第二种情况 同包中
//【结论】私有的属性和私有的方法都不可以访问，public和default的可以
//public class Day6_3_Privileges {
//	public static void main(String[] args) {
//		SamePackage p=new SamePackage();
//		System.out.println(p.defaultAttr);
//		System.out.println(p.privateAttr);
//		System.out.println(p.publicAttr);
//		p.defaultfun();
//		p.publicfun();
//		p.privatefun();
//	}
//}

//第三种情况不同包中的类成员
//【结论】 public可以访问，default和private 不可以访问
//public class Day6_3_Privileges {
//	public static void main(String[] args) {
//		DifferentPackage p=new DifferentPackage();
//		System.out.println(p.defaultAttr);
//		System.out.println(p.privateAttr);
//		System.out.println(p.publicAttr);
//		p.defaultfun();
//		p.publicfun();
//		p.privatefun();	
//	}
//}

// 构造器的访问权限
// 构造器也可以声明成public  private  default
// 本类 ，本包 ，包外
