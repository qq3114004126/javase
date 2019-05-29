package day8;
/*第十二章  接口
 * 背景：
 * java中继承关系——单继承，一般和特殊的关系----不仅仅因此才有接口
 * 
 * Person 使用Phone[方法名]，A下的[方法名]，并不是想真正的继承（没有想继承属性）。
 * Person对方法名进行重写。
 * 
 * 出现了接口概念，接口可以实现“多继承”---实现多个接口
 * 单一  继承
 * 多个  实现多个接口
 * 
 * 【接口】：特殊的抽象类。当抽象类下全部都是抽象方法的时候，可以定义成接口（jdk1.8稍微改）
 * 1.8之后，可以加入非抽象的方法。
 * 接口：就可以成，方法都是抽象方法。接口没有构造器。（底层实现的时候，“子类（实现类）创建可以不通过父类（接口）”）
 *
 * 一、接口的定义
 * 1. 语法 ：类class  接口interface
 * 【修饰符】 interface 接口名  [extends 父接口名列表(多继承)]
 * 【修饰符】：接口可选择的就只有public，默认值就是public，（跟类区分）
 * 接口名：跟类名类似，首字母大写
 * extends：接口可以继承多个父级别的接口（接口的实现，接口的继承，都是多继承，多实现）
 
       接口中的内容成员：
      常 量[public] [static] [final]  常量
      抽象方法	[public]  [abstract]  方法名();
      以上[]中的内容都可以省略
      
//  jdk1.8中还可以加入非抽象的方法（静态方法、非静态方法——方法体）
 */
//interface A{
////	[public] [static] [final] 类型  常量名 = 初始化值;
////	[public]  [abstract]  方法名();
//	int x=1;
//	void test();
//	
////	1.8之后的新特性
//	default void fun1(){
//	}
//	static void fun2(){
//	}
//} 


//二.实现接口
//语法 ，创建类实现接口，使用关键字implements，多实现，使用,分隔开不同接口
//定义一个学生的接口，上学抽象方法。
//interface Student{
//	void gotoSchool();
//}
//class Student1 implements Student{
//	public void gotoSchool(){
//		System.out.println("走路上学");
//	}
//}
//class Student2 implements Student{
//	public void gotoSchool(){
//		System.out.println("骑自行车上学");
//	}
//}
//class Student3 implements Student{
//	public void gotoSchool(){
//		System.out.println("坐公交上学");
//	}
//}
//
//public class Day8_1_Interface {
//   public static void main(String[] args) {
//	   Student s1=new Student1();
//	   s1.gotoSchool();
//   }
//}


//【思考】
//从继承到接口，设计上，经历了几个层次？
//  继承： 父子关系，子类 继承父类，继承父类下的所有成员。（设计思想偏重在成员继承上）
//  抽象：父子关系，重点关注方法的实现。子类下要求必须重写父类的抽象方法（对继承重写语法规范），重点在于抽象方法实现
//  接口： A B C D 都同时去实现 Z 类下的方法，不 要求Z 有具体的实现，要求ABCD都使用相同的名字。
//       接口的设计理念跟抽象的设计理念相比：第一 ，抽象父子关系   第二，希望实现多继承
//       接口的关注点：在于多个接口下的方法，实现类，要去实现多个接口下的方法。
//                 不关注父子关系。
//       接口的地位：规范，实现类之所以去实现接口：意味着实现类接受了接口中的规范（抽象方法）
//interface School{
//	void gotoSchool();
//}
//interface Sport{
//	void swim();
//}
//class Student1 implements School,Sport{
//	public void gotoSchool(){
//		System.out.println("走路上学");
//	}
//	public void swim(){
//		System.out.println("去游泳池游泳");
//	}
//	
//}
//class Student2 implements School,Sport{
//	public void gotoSchool(){
//		System.out.println("骑自行车上学");
//	}
//	public void swim(){
//		System.out.println("去游野泳");
//	}
//}
//class Student3 implements School{
//	public void gotoSchool(){
//		System.out.println("坐公交上学");
//	}
//}
//
//
//public class Day8_1_Interface {
//   public static void main(String[] args) {
//	   School s1=new Student1();
//	   Sport ss1=new Student1();
//	   s1.gotoSchool();
//	   ss1.swim();
//   }
//}


//【应用】最常见的就是java跟不同的数据库进行连接的时候，java只提供一个数据库驱动包的接口  ---方法名；
//      要种众多的数据库厂商只要实现了数据库驱动包的接口，java连接数据库了，每个厂商自己实现的方式不同。
// 实现类对象.getConnection()

//javaEE java做系统的开发时，接口。
// 分成三层： 表示层、业务逻辑层、数据层
//从页面中传入username  password  ---java程序接到----到数据库中进行校验
//  架构师：维护学籍。
//面向接口的编程：StudentService ----StudentImpl(addStudent(Student t),.....)
//            TeacherService
//            LogService


//三、实现类“继承”接口的成员
//【继承】---【实现】
// 实现类对接口中的成员，还是可以有继承关系。
// 涉及到的成员：常量、抽象方法、非抽象方法
//[结论]：
// 实现类继承接口的：常量（因为是final所以不能修改）、抽象方法（调用的时候，调用是自己实现的方法），非抽象的非静态方法
//      不能继承：非抽象的静态方法不能继承。（为了父类应用指向子类对象，对象不能够调用到编译期的内容（静态非抽象方法））

//interface A{
//	public static final int x=1;
//	void abstractFun();
//	default void unAbstractfun(){
//		System.out.println("unAbstractfun");
//	}
//	static void staticUnAbstractfun(){
//		System.out.println("staticUnAbstractfun");
//	}
//}
//class Aimpl implements A{
//	@Override
//	public void abstractFun() {
//		// TODO Auto-generated method stub
//	}
//}
//
//public class Day8_1_Interface {
//	public static void main(String[] args) {
//		Aimpl a=new Aimpl();
//		System.out.println(a.x);
//		a.x=2;
//		a.abstractFun();
//		a.unAbstractfun();
////		
//	}
//}


//四、接口继承接口
//接口的本质也是“抽象类”，所以也有继承关系。
//不同的地方在于：抽象类的继承是单继承
//            接口的继承是多继承（原因：接口的实现设计思想本身就是为了更多的重写方法，调用到重写方法）
//                           将接口设计成多继承的，实现类可以实现更多的方法。
//语法：子接口  extends 父接口1,父接口2....
//  一个实现类，如果继承了一个接口 ，那么它就必须实现这个接口以及这个接口上的所有父类接口的抽象方法。
//interface X{
//	public static final int a=1;
//	void m();
//}
//interface Y{
//	public static final  int b=2;
//	void n();
//}
//
//interface Z extends X,Y{
//	int c=a+b;
//}
//class Zimpl implements Z{
////	只要在Zimpl能够调用m和n,那就说明Z继承X和Y成功了。
//	@Override
//	public void m() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void n() {
//		// TODO Auto-generated method stub
//		
//	}
//}

//【思考】 如果两个父接口中都有完全相同m方法，那么子接口继承的是哪个方法？实现类中实现的是哪个方法呢？
// 继承只需要继承一个，实现类中只要实现 其中一个即可。
// 原因：接口中根本没有对方法进行实现，所以 实现类中，继承接口中，继承哪一个，实现哪一个都无所谓。
// 真正实现的过程中，这样的设计是不合理的。
//interface Run{
//	void m();
//}
//interface Swim{
//	void m();
//}
//
//class pangxie implements Run,Swim{
//	@Override
//	public void m() {
//		// TODO Auto-generated method stub
//	}
//}

//五、空接口
////实现了空接口的实现类不是什么都不能调用，至少可以调用Object下的内容
//interface Empty{
//}
//class  EmptyImpl extends Object implements Empty{
////	是不是意味着这个类什么都不能调用？
//}


//六、再看jdk1.8的新功能
//1.8之前，不允许接口中有非抽象的方法
//1.8之后允许接口中有非抽象的方法
//【为什么】
// 接口，下包含抽象方法，要求实现类来实现，接口，高
// java本身也有很多的接口，java本身自己也要更新
// 接口也有可能更新。
//interface Car{
//	void start();
//	void stop();
//	default void fly(){};
//}
//class CarImpl1 implements Car{
//	@Override
//	public void start() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void stop() {
//		// TODO Auto-generated method stub
//		
//	}
//}
//class CarImpl2 implements Car{
//	@Override
//	public void start() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void stop() {
//		// TODO Auto-generated method stub
//		
//	}
//}

//1.8之前怎么解决:定义新接口，让实现类去实现。
interface Car{
	void start();
	void stop();
//	void fly();
}
interface FlyCar{
	void fly();
}
class CarImpl1 implements Car,FlyCar{
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}


//七、接口和抽象类之间的区别
//属性：   接口要求必须是常量，抽象类没要求
//构造器：接口没有构造器 ，抽象类有构造器
//普通方法：1.8之前必须是抽象，可以有非抽象，   抽象类：可以全部都是非抽象方法（设计不合理而已），可以有抽象方法
//子类（实现类）：接口多重实现，抽象类单一继承


