package day5;

import java.util.Arrays;

/*
 * 第六章 类和对象
 * 背景：需要存储的数据越来越复杂。
 * 名字，String name="tom"
 *     float s=99.5f;
 * 如果需要存储的内容比较复杂：小狗
 * 名字、年龄、毛色、吃饭、睡觉。。。
 * 
 * 业务性比较强的系统（需求经常变化）
 * 
 * 一、基本概念
 *    对象、类、类和对象之间的关系
 * 二、类的定义、初始化、类中成员
 * 1. 定义
 * 2. 应用类创建对象
 * 3. 类中属性（成员变量）
 * 4. 类中的行为（方法）
 * 5. 构造器
 * 6. 修饰符static（静态成员）
 * 7. 块
 * 
 * 
 * 一、 基本概念
 * 1.什么是对象？
 * 对象应该具有：属性、行为。
 * 桌子：颜色、大小
 * 小狗：属性：名字、年龄、品种、毛色.... （名词）
 *      行为：睡觉、吃饭、跑...        （动词）
 * 万物皆对象
 * 
 * 张三、李四
 * 毛毛小狗 、旺财。。。。
 * 
 * 2.什么是类？
 * 根据业务的需求，将已有分析出来的众多对象，划分成不同的类别。
 * 
 * 编码：定义一个class，就可以称为是一个类。
 * 
 * 在业务分析的时候，先有对象，从对象中划分出来的类。
 * 在编码的时候，是需要在编码上定义class，不同的类别之间总是有属性和行为上的不同。
 * 
 * 不同的业务需求划分出来类是不同的
 * 学籍管理系统：张三、李四、王五 Student类中。。  赵六老师，赵七老师。。。Teacher类中
 * 公交管理系统：张三、李四、王五 、赵六老师，赵七老师  Person类   跟Bus类不同。
 * 
 * 
 * 3. 类和对象之间的关系
 * 类：对象的抽象
 * 对象：是类的具体实现（如果从编码的角度来说：类创建了各个对象，类产生了各个对象，类生成了各个实例）
 * 
 * 对象（实例）
 * 
 * （注：已经是在业务分析之后，划分出了类，进行动手编码的时候。才涉及到知识二）
 * 二、类的定义和初始化、类下的成员
 * 1. 类的定义
 * 【语法】 
 * 【访问权限修饰符】 【修饰符】 class 类名{
 *    类体（类的成员）
 * }
 * 
 * 如果只写class  默认访问权限修饰符default
 * 
 * 如果一个class类需要执行，必须要有main方法（来源于c语言，程序的入口）
 */
//class Person {
//}

// 2.类创建对象
// 【语法】类型   变量名（引用）= new 类名(参数)

//3. 类中创建属性
//属性---成员变量
//变量分为：局部变量和成员变量
//成员变量需要在类中声明。 局部变量是在方法中。
//【成员变量声明的方式】
//【访问权限修饰符】 【修饰符】  数据类型   变量名（属性名）[=初始值]
//class Person {
//	String name="张三";
//	int age;
//	
//	String s;
//	int i;
//	short sh;
//	long l;
//	boolean b;
//	byte by;
//	char c;
//	float f;
//	double d;
//}
//【对于成员变量的赋值】
//可以在声明的同时进行赋值、也可以在使用（main，其他方法）之前进行赋值。
//【访问成员变量】
// 在main方法中，一定要有 对象，才可以访问到成员： 格式： 对象名.属性名

//【局部变量没有默认值】
//【成员变量的默认值】
/* boolean,false
 * byte 0
 * short 0
 * char  空格 /u0000
 * int  0
 * long 0
 * float  0.0
 * double 0.0
 * String(引用)  null
 * 
 * int [] x;
 */


//4. 类中的创建行为（方法）
// 类中行为本质上使用“函数”模式来实现的。
//（1） 函数的定义
//背景：有一段可以实现某一种功能。
// 问题:代码的冗余，但是代码的扩展性差，可读性差
// 解决：将一个固定功能的代码段（可能实现的一个或者是多个功能），抽取出来，形成一个函数。
// 【函数】的定义是在“面向过程的语言”
// 【方法】——面向对象的语言中，必须将方法写到类中，所以把“函数”————叫做“方法”
/*
 * 1-6行打印星星代码
 * 其他代码段
 * 1-6行打印星星代码
 * 其他代码段
 * 1-5行打印星星代码
 * 
 */

//（2）方法的声明
//【定义语法】
//【权限修饰符】【修饰符】 返回值类型  方法名字 (参数1,参数2,...){  方法体  }
//class Person {
//    void printStar(){
//    	for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//    }
//}

//【调用】
//如果是在main方法中
//对象名.方法名()
//调用方法之后，方法中局部变量的内容消失了。

//(3)方法的参数
//为什么要给方法加参数？为了方法的灵活性
//【设置参数的语法】
//【定义】：需要在定义时加入“形式参数”
//     【权限修饰符】【修饰符】 返回值类型  方法名字 (参数1,参数2,...){  方法体  }
//【调用】：调用的时候，需要传入“实际参数”
//【规则（普通参数）】：参数在定义的时候，个数要跟实际调用的时候，传入的实际参数，保持一致
//【形式参数】：只是形式而已， 对于调用者没有任何影响。
//【实际参数】：程序在执行的时候，参数真正的赋值。
// 在程序被调用的时候，实际参数会给形式参数赋值。赋值方式（变量名赋予变量名）
//class Person {
//    void printStar(int line1,int x){
//    	for (int i = 0; i < line1; i++) {
//			for (int j = 0; j < x; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//    }
//    
//}

//(4)返回值
//返回值的作用：给方法执行之后，传出一个值，给调用者。
//当调用者调用了方法之后，就相当于获得了返回值。
//【定义返回值】：在方法中 
//(第一步) return   返回的内容（可以是表达式，可以是变量）
//(第二步) 在方法定义的时候，将返回值的类型跟return 结果的类型保持一致
// 程序中执行到return ，方法中内容就会执行结束。（跳出当前方法）
// 程序中return后面的代码都不再执行？错误
//class Person {
//    int add(int x,int y){
////    	System.out.println(x+y);
//    	return x+y;
//    }
//}

//以下的mian是上面代码的测试
//public class Day5_1_ClassObject {
//	public static void main(String[] args) {
//		Person p= new Person();
////		new String("abc");匿名对象  没有引用
//		
//		Person p1;//声明引用类型的变量和创建对象是两个概念
//		System.out.println(p);
//		System.out.println(p.name);
//		p.age=20;
//		System.out.println(p.age);
		
		//成员变量的默认值
//		System.out.println(p.s);
//		System.out.println(p.i);
//		System.out.println(p.sh);
//		System.out.println(p.l);
//		System.out.println(p.b);
//		System.out.println(p.by);
//		System.out.println(p.c);
//		System.out.println(p.f);
//		System.out.println(p.d);
		
		//局部变量的默认值
//		int ii;
//		System.out.println(ii);没有默认值
//		int [] x=new int[5];//数组类型是引用类型，将每个元素看成成员，所以成员也有默认值0
		
		
//		在main方法中调用方法
//		Person p=new Person();
//		int x=100;
//		p.printStar(100,5);
		
//		关于方法中的返回值调用
//		System.out.println(p.add(2, 5));
//		int result=p.add(2, 5);
//		System.out.println(result+50);
		
//	}
//}

//练习：
/* 1. 定义Dog类
* 2. 类中有属性：name  age  type
* 3. 类中方法：吃饭、睡觉、叫
* 
*/



//（5）在类中其他方法中（除了main）访问属性
// 在类中，所有的方法存在的重要意义就是为了访问属性或者修改属性。
//第一点：在方法（除main以外）中访问属性
// 语法：可以直接访问属性

//第二点：如果在方法中，局部变量名字和成员变量重名
//【规则】局部变量会隐藏成员变量。
//【解决】使用this关键字   this.成员变量名
//this当前对象。 谁调用的regist方法，谁就是当前对象。
//class Person {
//	String name="张三";
//	int age;
//    void regist(){
//	   String name="hello";
//	   System.out.println(name);
//	   System.out.println(this.name);
//   }
//}

//成员变量和局部 变量的比较
/*共同点：都是变量，定义的格式都遵循     数据类型  变量名=初始化值;
 *      都有作用域。
 *不同点：
 *（1）声明位置不同：成员变量是类的内部，方法的外部；
 *    局部变量要声明在方法的内部（可以是形式参数，也可以是单独的局部变量）
 *（2）初始化值
 *  局部变量如果只声明，不初始化，直接使用会报错，
 *  成员变量如果没有初始化，会有默认值。
 *（3）二者的引用在内存中存放的位置不同
 *  成员变量：存放堆空间中。
 *  布局变量：栈空间中。
 *（4）权限设置不同
 *（5）修饰符不同
 */
//public class Day5_1_ClassObject {
//	public static void main(String[] args) {
//		Person p=new Person();
//		p.regist();
//	}
//}

//（6）成员变量和方法的内存结构
// 对象在堆中存储
// 对象中的成员变量，对于每个对象分别存储一份，存储在堆中。
// 方法是所有的对象共享一份。存在在方法区中
/*
 * Person p1= new Person();
 * Person类中还有run方法
 * p1.name="张三"
 * p1.age=20;
 * 
   Person p2= new Person();
 * Person类中还有run方法
 * p2.name="李四"
 * p2.age=30;
 * 
 */

//（7）方法中参数的值传递
/* 实际参数给形式参数赋值：
 * 对于基本数据类型的数据来说， 值传递，相当于从实际参数中复制一份数据（数值）给形式参数。
 *              所以在方法中如果对形式参数发生了变化，对于实际参数不影响。
 *              
 * 对于引用类型的数据：值传递，相当于将引用对象的地址复制一份传递给形式参数，形式参数指向的对象和 
 *              实际参数指向的对象是同一个对象。
 * 值传递：无论是基本数据类型，还是引用类型作为参数，值传递，原则都是将栈中数据域中存储的内容
 *       传递给形式参数。如果数据域中存放的是基本数据类型，那就复制基本数据类型，如果数据域
 *       中存储的引用地址，那就将地址复制一份传递给形式参数。
 */

//引用类型的值传递例子
//class Pubclass{
//	String name;
//}
//class Person {
//	void modifyPubclass(Pubclass c){
//		System.out.println("在modifyPubclass方法下c.name="+c.name);
//		c.name="修改后的名字";
//		System.out.println("在modifyPubclass方法执行之后c.name="+c.name);
//	}
//}
//
//public class Day5_1_ClassObject {
//	public static void main(String[] args) {
//		Pubclass c=new Pubclass();
//		c.name="java1班";
//		Person p=new Person();
//		p.modifyPubclass(c);
//		System.out.println("在main方法中，modifyPubclass方法执行之后c.name="+c.name);
//
////	    T t=new T();
////		T t1=t;
//	}
//}


//基本数据类型值传递的例子
//class Person {
//    int computeadd(int a,int b){
////    	a b都是形式参数 
//    	System.out.println("在computeadd方法下a="+a);
//    	System.out.println("在computeadd方法下b="+b);
//    	a+=50;
//    	System.out.println("在computeadd方法执行之后a="+a);
//    	return a+b;
//    }
//}
//public class Day5_1_ClassObject {
//	public static void main(String[] args) {
//		Person p=new Person();
////		实际参数
//		int x=1;
//		int y=2;
//		System.out.println("在main方法中x="+x);
//		System.out.println("在main方法中y="+y);
//		p.computeadd(x, y);
//		System.out.println("在main方法中，调用了computeadd之后，x="+x);
//	}
//}


//（8）方法的重载 
//背景：需求：实现两个整数int类型的和，浮点类型求和,long类型的求和。。。
//add(int x,int y)
//add(float x,float y)
//【方法的重载解决】
//第一点 ：重载的定义：
//【重载】java中，如果有多个同名，但是不同参数的方法，被称为方法的重载。
// 当实现了重载方法之后 ，java虚拟机执行的时候，会自动按照实际参数来分配方法。
//p.add(2,3)
//长   长幼有序   寸短尺长
//【语法规则】：
//  规则1：定义的函数名字相同
//  规则2: 作用域相同
//  规则3： 参数不同（数量的不同，类型的不同，顺序不同）
//class Person{
//	void add(int a ,int b){
////		System.out.println(a+b+"int a , int b");
//		add(a,b,0);//可以调用自己的重载方法，来实现减少参数的效果
//	}
//	void add(int a,int b,int c){
//		System.out.println(a+b+c);
//	}
//	void add(float a,float b){
//		System.out.println(a+b);
//	}
//	void add(int b,float a){
//		System.out.println(a+b);
//	}
//	void add(float a,int b){
//		System.out.println(a+b);
//	}
//}

// 不是重载的情况
/* (1)只有参数名不同，不能够成重载
 * (2)不同作用域下的同名方法，不能构成重载
 * (3)只有返回值不同的方法不能构成重载。(容易错的地方)，原理：虚拟机无法判定语言环境
 */
//已学过的内容中的重载 String中很多方法都应用了重载。
//【重载的优点】
// 对于函数的提供者来说：声明方法的时候，可以把“功能相似”的方法定义成重载方法。
// 对于函数的使用者来说：在调用方法时，只需要提供一个方法名，提供不同的参数就可以实现不同的功能。

//【重载一定要注意的地方】：不要把功能上根本不相关的方法进行重载。
//
//class Person{
//	void add(int a){
//		System.out.println(a+"int a , int b");
//	}
//	int add(int a,int b){
//		return 0;
//	}
//	int add(int a,int b,int c){
//		System.out.println(a-b+c);
//	}
//	void add(int b){
//		System.out.println(b);
//}
//class A{
//	void add(int a,int b){//不是重载
//		System.out.println(a+"int a , int b");
//	}
//}
//public class Day5_1_ClassObject {
//	public static void main(String[] args) {
//		Person p=new Person();
//	    p.add(1);	
//	    String s="hello";
//	}
//}

//(9)可变参数的方法
//jdk1.5之后产生的内容
//背景：实现两个数的平方和
//class Person{
//	void powSum(int a,int b){
//		System.out.println(a*a+b*b);
//	}
//	void powSum(int a,int b,int c){
//		System.out.println(a*a+b*b+c*c);
//	}
//}
//可以使用可变参数来代表多个参数
//【语法结构】 定义方法的时候，在参数中使用...代表可变参数
//可变参数将传递过来的所有实际参数，打包成数组形式 
//不能使用可变参数和数组类型的参数构成重载，因为可变参数的底层就是数组类型。
//如果还有其他类型的参数 和可变参数在一起 ，可变参数一定是放在最后。

//因为历史原因（需要对程序进行向下兼容），所以如果只传入一个整数类型，会调用指定的方法
//不会调用可变参数的方法。
//class Person{
//	void powSum(int y,int z){
//		System.out.println("void powSum(int y)");
//	}
//	void powSum(int...a){
////		System.out.println(a*a+b*b);
//		System.out.println(a);
//		int s=0;
//		for(int x:a){
//			s+=x*x;
//		}
//		System.out.println(s);
//	}
//}
//public class Day5_1_ClassObject {
//	public static void main(String[] args) {
//		Person p=new Person();
////		p.powSum();
////		p.powSum(1);
////		p.powSum(1,2,3,4);
//		p.powSum(1);
//	}
//}
//


//5.构造器（构造方法）
//构造器名字更准确，因为构造器本身不是方法，如果是方法应该是 可以被继承的，但是构造器不能够被继承
//背景
//class Person{
//	String name;
//	int age;
//	void setName(String name){
//		this.name=name;
//	}
//}
//public class Day5_1_ClassObject {
//	public static void main(String[] args) {
//		Person p1=new Person();
////		p1.name="张三";
//		p1.setName("张三");
//		System.out.println(p1.name);
//		
//		Person p2=new Person();
//		p2.name="李四";
//		System.out.println(p2.name);
//	}
//}

//构造器：在创建一个对象的时候，要执行的代码块。存在的意义就是为了创建对象，
//      可以在创建对象的同时，初始化对象中的成员变量。
//1. 构造器的创建
//【语法】：
// 【访问权限修饰符】类名 (参数){ 构造器执行的内容 }
//【注意的规则】
// （1）构造器名字必须跟类名相同
// （2）没有修饰符，也没有返回值
//class Person{
//	String name;
//	int age;
//	public Person(String name,int age){
//		this.name=name;
//		this.age=age;
//		System.out.println("这是Person的构造器");
//	}
//}
//public class Day5_1_ClassObject {
//	public static void main(String[] args) {
//		Person p=new Person("张三",20);
//		Person p1=new Person("李四",30);
////		Person();
//		System.out.println(p.name);
//		System.out.println(p.age);
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//	}
//}

//2.构造器的应用
//一个类中，如果没有显式的声明构造器，则编译器会自动的创建一个无参数的构造器。
//如果显式的声明了有参数的构造器，那么编译器自动产生的无参数的构造器失效 了。

//3.构造器的重载
//如果一个类中，既希望有有参数的构造器，也希望有无参数的构造器，
//需要显式的声明无参数的构造器。
//在有参数的构造器中，可以通过参数的形式来初始化成员变量，
//   如果是强依赖关系的属性，可以通过以上方式
//   如果是弱依赖关系的属性，可以先不赋值，在使用之前再初始化成员变量即可。

//构造器虽然不是方法，语法上来说是符合方法规则。
//构造器调用构造器：不能直接调用构造器的名字。
//解决：只能通过this()关键字。
//【构造器调用构造器的规则】
//（1）只能通过this(参数)关键字。
//（2）必须位置上放在第一句话
//（3）必须在构造器之中调用，不能在构造器的外面调用this();
//class Person{
//	String name;
//	int age;
//	String place;//弱依赖关系的属性
//	public void test(){
////		this();
////		new Person();
//	}
//	public Person(){
//		
//	}
//	public Person(String name){
//		this.name=name+"new";
//	}
//	public Person(String name,int age){
////		name和age是强依赖关系的属性
////		强弱由业务需求
//		this();//要求放在第一句
//		this.name=name;
//		this.age=age;
//		
//		System.out.println("这是Person的构造器");
//	}
//}
//public class Day5_1_ClassObject {
//	public static void main(String[] args) {
//		Person p=new Person("张三",20);
//		Person p1=new Person("李四",30);
//		System.out.println(p.name);
//		System.out.println(p.age);
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		
//		
//		Person p2=new Person();
//		System.out.println(p2.name);
//		System.out.println(p2.age);
//	}
//}

//4.this关键字的作用
//(1)this关键字可以代表当前对象，可以在方法中调用属性。
//(2)this关键字可以在构造器中调用其他构造器（注意，会有规则要求，放在第一句，必须使用this关键字）
//(3)this关键字可以代表当前对象，可以在方法中调用其他方法。
//class Person{
//	String name;
//	void fun1(){
//		System.out.println("这是fun1方法");
//	}
//	void fun2(String name){
//		this.fun1();
//	}
//}


//6.static修饰符
//static可以修饰成员变量，还可以修饰方法，修饰块，内部类
//普通的成员变量（非静态成员变量和非静态方法）——隶属于每一个对象，每一个对象独享。
//背景
//new关键字可以创建对象，堆中分配内存存储，通过对象可以调用到成员变量、方法。
//也有的时候，可能希望成员变量和方法跟每一个对象无关，只跟当前的类有关。
//这时，可以将他们声明成static
//【静态成员】：包括静态成员变量和静态方法 ，定义的时候，直接加static关键字作为修饰符即可。
//【调用】：通过类名就可以调用

//1.static修饰变量（static属性）
//无论有多少个对象，都跟这个static的属性无关，属性只跟当前类有关。
//误区：认为静态是不能修改的变量。 其实所指的“静态”——是针对内存空间来说。
//静态的内容是存储在方法区的静态区。
//static属性的定义
//static 类型  变量名;
//[访问]：对象名.静态属性名
//       类名.静态属性名（建议）
//class Person{
//	String name;
//	static int count;
//	public Person(){
//		count++;
//	}
//	
//}
//public class Day5_1_ClassObject {
//	public static void main(String[] args) {
//		Person p1=new Person();
//		Person p2=new Person();
//		System.out.println(p1.count);
//		System.out.println(p2.count);
//		System.out.println(Person.count);
//	}
//}
/*比较静态变量和成员变量的区别：
 * （1）所属不同，
 * 静态变量：属于类，是类的属性
 * 成员变量：属于对象，对象的变量，实例变量，实例属性
 * （2）内存位置不同
 * 静态变量：方法区的静态区中 （多个对象公用一个变量）
 * 成员变量：堆中，每个对象拥有一个。
 * （3）生命周期不同
 * 静态变量：随着类的加载而加载。
 * 成员变量：随着对象的创建而创建，对象消失了，成员变量消失。
 * （4）调用方式不同
 * 静态变量：通过类名调用，也可以通过对象名调用
 * 成员变量：只能通过对象名调用
 * 
 */

//2.static修饰方法----静态方法
//跟类有关，跟对象无关。
//【语法】 static  返回值类型 方法名()
//【调用】类名.静态方法名
//应用场合，Arrays
//class Person{
//	static void staticfun(){
//		System.out.println("这是Person的静态方法");
//	}
//}
//public class Day5_1_ClassObject {
//	public static void main(String[] args) {
//		Person.staticfun();
////		Arrays.sort(a);
//		
//	}
//}
//成员变量、方法、静态变量、静态的方法
//在方法访问成员
//[规则]： 非静态方法可以访问任何的变量、和方法（静态的和非静态）
//       静态的方法：只能访问静态方法和静态的变量（静态只能访问静态）
/* 非静态方法中访问成员变量：可以
 * 非静态方法中访问静态变量：可以
 * 静态方法中访问成员变量：不可以
 * 静态方法中访问静态变量：可以
 */
class Person1{
	int a=1;
	static int  statica=2;
	void fun(){
		System.out.println(a);
		System.out.println(this.a);
		fun2();
		this.fun2();
		System.out.println(statica);
		staticfun();
		System.out.println("这是Person的非静态方法");
	}
	void fun2(){
		
	}
	static void staticfun2(){
		
	}
	static void staticfun(){
//		System.out.println(a);//不能访问成员变量
		System.out.println(statica);
		System.out.println("这是Person的静态方法");
//		this.fun();//不能访问非静态方法
		staticfun2();
		
	}
}
//public class Day5_1_ClassObject {
//	public static void main(String[] args) {
//	   Person p=new Person();
////	   p.fun();
//	   Person.staticfun();
//		
//	}
//}



