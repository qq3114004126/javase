package day10;

import org.omg.Messaging.SyncScopeHelper;

/* 第九章    面向对象特征
 * 一、封装——成员变量的私有化
 * 二、继承
 * 1. 背景
 * 2. 实现
 * 3. 成员的继承
 * 4. 子类的扩充
 * 5. 重写
 * 
 * 类关联： A类设置成B 的属性 —— 在B类下就可以调用到A的 的方法
 * 继承      B类继承了A类，          —— 在B类下就可以调用到A的 的方法
 * 
 * 继承：一般和特殊之间    父子继承关系。设计成继承。 减少代码的冗余   设计的角度，先有子类，才有父类
 * 关联关系的类：根本没有直接关系。
 * 为什么？
 * 
 * 
 * 5.重写
 * 【重写】：在子类下创建跟父类的方法名、参数、返回值都相同的方法。
 *   方法名：相同。
 *   参数：相同，1.5之后 有泛型的可擦除类型
 *   返回值：相同，1.5之后，返回父类的子类型也可以。
 *        （1）void
 *        （2）都是基本数据类型，int  ---int
 *        （3）父类方法中返回了Fruit    子类方法中也可以返回Fruit ，也可以返回Apple
 *            ——可替换类型
 * 【作用】如果子类没有重写父类的方法，则会调用父类下的方法，如果重写 了父类的方法，则调用子类自己的方法。
// *      是多态体现的根基。
 * 
 * 6. 成员变量的隐藏
 * 属性--“重写”————本质上不是真的重写，只是隐藏而已。
 * 如果在父类中声明了一个成员变量，在子类中也声明一个“同名”的成员变量，当调用子类对象时，子类的成员会隐藏父类的成员
 * 【形式】只要名字相同就是隐藏，无论类型是否相同，都会隐藏
 * 【建议】不要这样设计。
 */
//class Fruit{
//	public int aaa=0;
//}
//class Apple extends Fruit{
//	public String aaa="hello";
//}
//
//public class Day7_1_OOP {
//   public static void main(String[] args) {
//	   Apple a=new Apple();
//	   System.out.println(a.aaa);
//}
//}

//7.关于构造器的继承
//（1）继承中的构造器
//【原则】
// 构造器不是类的成员，所以不能够被继承，但是可以调用父类的构造器。
// 调用父类构造器的使用，需要使用super关键字，要求super必须放在子类构造器的第一行
// 创建子类对象的时候，【一定】会先运行父类的构造器。（换句话说，一定会创建一个匿名的父类对象）
//   第一：如果子类中没有定义构造器，或者子类构造器中没有显式的调用父类其他有参数的构造器，创建子类对象的时候就一定
//       会调用父类的无参数构造器,然后再调用自己的构造器。
//   第二：如果子类中super父类的有参数构造器，创建子类对象的时候，会先调用父类有参数的构造器。然后再调用自己的构造器。
//【笔试的陷阱】当子类在构造器中没有显式的调用父类的构造器，父类只有有参数的构造器，会出现什么情况？会出错
//【思考】【一定】会先运行父类的构造器？为什么？
//      原因：在创建子类对象的时候，需要创建里面的成员，有一些成员是在父类下的，只有有父类对象，才能找到父类的成员。
//           所以java底层要求先去创建父类对象。
//      所有的类在产生对象的时候，其实都创建了一个Object的类，（Object的构造器）

//【super要求放在第一行】：为了先调用父类的构造器， 再初始化自己的内容，否则放在下面，父类构造器的内容就会覆盖掉子类的内容。
//class Fruit{
//	public Fruit(){
//		System.out.println("父类Fruit无参数的构造器");
//	}
//	public Fruit(String name){
//		System.out.println("父类Fruit有参数的构造器");
//	}
//	public void show(){
//	}
//}
//class Apple extends Fruit{
//	public Apple(){
////		super();//如果子类中没有明确的调用父类的构造器，相当于在子类构造器中加了这一句
////		super("hello");
//		System.out.println("子类Apple无参数的构造器");
//	}
//}
//
//public class Day7_1_OOP {
//	public static void main(String[] args) {
////		 Apple a=new Apple("红富士");
////		 Apple对象下应该创建show方法。
//	}
//}

//（2）关于super关键字
//super是在继承关系的类中，代表父类的引用（父类对象的名字）
//作用：第一个：放在子类构造器中，放在第一行，用来调用父类构造器
//    第二个：super.成员变量名：在子类中引用父类的成员变量（可以访问，可以修改（注意权限））
//    第三个：super.方法名：可以用来在子类中引用父类的方法。
//【真正的应用场合】，在设置父类的私有成员
//class Fruit{
//	public String name="水果";
//	private int age;
//	
//	public Fruit(){
//		System.out.println("父类Fruit无参数的构造器");
//	}
//	public void show(){
//		System.out.println("父类的show方法");
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//}
//class Apple extends Fruit{
//	public Apple(){
////		super();//如果子类中没有明确的调用父类的构造器，相当于在子类构造器中加了这一句
////		super("hello");
//		System.out.println("子类Apple无参数的构造器");
//		System.out.println(super.name);//调用父类的属性
////		System.out.println(super.age);
//		super.setAge(10);
//	}
//	public void test(){
//		super.show();
//	}
//}
//
//public class Day7_1_OOP {
//	public static void main(String[] args) {
//		 Apple a=new Apple();
////		 Apple对象下应该创建show方法。
//		 a.test();
//	}
//}
//(3) 用继承的方式实现背景提到的
//* JavaTeacher:名字、年龄，自我介绍、讲课
//* PythonTeacher：名字、年龄，自我介绍、讲课
//思路：提取出来父类Teacher 公用的属性name和age   introduce 和teach

//8.final关键字
//背景：一个类认为自己设计的很完善，不希望被扩展（不希望有子类）
//final
/*(1)可以修饰属性、布局变量，但是被修饰的变量都不能修改
 *(2)可以修饰方法，被修饰的方法不许被重写
 *(3)可以修饰类，被修饰的类不能够被继承
 *   一个类声明了final类型，那么它下面的所有方法都被认为是final的方法。
 *   
 * 【用法】
 * (1)final修饰变量（成员变量、局部变量）
 *
 * 【规则】被修饰的变量都不能修改
 *  
 *  第一个：修饰成员变量
 *        成员变量需要被初始化，而且一旦被初始化之后，就不能被改动了。
 *        初始化的方式：可以在声明的同时初始化，也可以在构造器中进行初始化，只能任选其一。
 *        目的：就是在对象创建之前，将final类型变量确定值。
 *  第二个：修饰局部变量
 *        可以是形式参数、在方法中声明的局部变量。
 *        
 *  static是可以修改的，static声明的成员，多个对象公用一个，只跟类有关，不是不可以修改
 *  final是真正的不可修改。
 *  当时使用static 和final一起声明一个常量的时候，常量只能在声明的同时被赋值。
 *     （因为static的成员，只跟类有关，跟对象无关，构造器是为了构造对象的。）
 */
//class Apple{
////	private final String name="aaa";
//	private final String name;
//	private static final int V=123;
//	public Apple(){
//		this.name="bbb";
////		System.out.println(this.name);
//	}
//	public void show(final int age){
////		当调用show方法的时候，形式参数一定会去绑定实际参数，在绑定同时就赋予值。
////		下面赋值就会变成修改
////		age=10;
//		final String type="hello";
////		type="new"; final局部变量不可以再次修改
//	}
//}
//
//

//(2)final修饰方法
//【规则】使用final修饰的方法不可以被重写
//class Fruit{
//	public final void show(){
//		
//	}
//}
//class Apple extends Fruit{
////	public final void show(){不能被重写
////		
////	}
//}


//（3）使用final修饰类不能被继承
//【规则】修饰类不能被继承，所有的父类的方法都被认为是final类型方法
//final class Fruit{
//	public  void show(){
//		
//	}
//}
//class Apple extends Fruit{
//	public  void show(){
//		
//	}
//}


//9.引用类型之间的转换
//引用类型之间，如果毫无关系的引用类型之间根本无法转换（包括隐式转换和强制转换都不可以）
//如果有父子关系继承的 类
//[结论]
//父类型对象赋值给子类类型（高->低），可以经历强制转换（但是有条件）
//子类对象赋值给父类类型（低->高），可以的，隐式转换。
//class Fruit{
//}
//class Apple extends Fruit{
//}
//public class Day7_1_OOP {
//	public static void main(String[] args) {
//		Fruit f=new Fruit();
//		Apple a=new Apple();
//		
//		//没有任何关系的类型之间不能转换
////		String s=(String)f;
////		String s="hell";
////		Fruit f=(Fruit)s;
//		f=a;//因为有这个赋值，将a指向的对象给f，a存储的地址给f中存储的地址  f真的变成了子类对象
//		a=(Apple)f;
//		Apple a2=(Apple)f;
//		Fruit f2=a;
//	}
//}

//【父类引用指向子类对象】（非常用）
//既然f=a  可以使用父类引用f接住子类对象a
//可不可以直接创建一个父类引用，使用子类对象给引用赋值。
//【父类引用指向子类对象】结果：
//如果调用这种对象下的方法，如果在子类中重写了，则调用的是重写之后的方法；
//                   如果在子类中没有重写，则调用的是父类下的方法；

/*【父类引用指向子类对象】说法：使用子类创建了父类类型对象
 * 向上造型： 上（父） ：将子类对象硬造成父类的类型---【父类引用指向子类对象】
 * 向下造型：下（子） ：将父类对象硬造成子类类型（需要有条件，需要提前将对象转换成子类对象）
 */
//class Fruit{
//	public void show(){
//		System.out.println("水果的show");
//	}
//}
//class Apple extends Fruit{
//	public void show(){
//		System.out.println("苹果的show");
//	}
//	public void j(){
//		System.out.println("苹果酱");
//	}
//}
//public class Day7_1_OOP {
//	public static void main(String[] args) {
////		【父类引用指向子类对象】（非常用）
//		Fruit f=new Apple();
//		f.show();
////		Apple a =new Fruit();不可以：如果Apple下有父类没有的方法或者属性，a.特殊的方法。
//	}
//}


//三、多态
//多态的含义：就是一种对外的表现形式，内在具有多种具体的实现。
//在java中多态的具体体现：
/*(1) 方法的重载：方法名是一个，但是实现的功能不同。 
 *(2) 方法的重写：父类中方法，和子类中方法同，但是实现的功能不同 。
 *(3) 多态参数
 */
//1.父类引用指向子类对象
// java如果需要执行，需要经历两个时期，一个是编译期，一个是运行期
// 创建一个引用类型的时候  T t = new T();
// =左边的部分编译期：指定要创建的类型（为了留出空间）
// =右边的部分运行期：真正要创建的对象。
//当程序中出现了对象，调用对象下的属性或者方法时候：
//【t.attrfun】
//程序会判断时期，根据对象中的属性或者方法产生的时期不同，去调用不同的内容。
//编译期产生：  attrfun名字在编译期是否可以调用的到，要检测是否符合编译期的类型。
//运行期产生： attrfun名字在运行期是否可以调用的到，要检测是否符合运行期的类型。
//（1）运行期和编译期的类型相同。
//A a=new A();
//当声明a的时候，如果声明的是A类型，编译期是处于A类型，当访问属性或者方法，是否满足编译期类型中声明的内容
//a.show();检测show方法是否在A中存在。
//在创建真正的对象的时候，执行的构造器，在运行期执行，当访问属性或者方法，就会去运行期类型中检测属性或者方法是否存在。
//编译期产生的内容：属性（静态和非静态）、静态的成员
//运行期产生的内容：方法、构造器、实例块

//（2）运行期和 编译期的类型不相同（父类引用指向子类对象）
//Father f=new Son();
//按照上面的理论
//当我们访问属性、静态方法的时候，会到Father类中验证有效性。
//当我们访问方法、构造器、实例块，会到Son类中验证有效性，执行Son中的内容。

//2.验证成员的调用
//块、静态成员、实例成员
//在创建父类引用指向子类对象的时候：
//【结论】
/*如果有父类引用指向子类对象：
 * 当调用子类对象的相关成员时：
 * 如果是属性、静态成员：会调用到父类的属性和静态成员。
 * 如果是方法、构造器：   会调用到子类的方法或构造器。
 */

//（1）静态块和实例块：全部都执行
//class Fruit{
//	static{
//		System.out.println("父类下的静态块");
//	}
//	{
//		System.out.println("父类下的实例块");
//	}
//}
//class Apple extends Fruit{
//	static{
//		System.out.println("子类下的静态块");
//	}
//	{
//		System.out.println("子类下的实例块");
//	}
//}
//
//
//public class Day7_1_OOP {
//	public static void main(String[] args) {
//		Fruit f=new Apple();//子类构造器在调用的时候，一定会去调用父类的构造器
//	}
//}

//(2) 非静态方法的调用（常用）
//class Fruit{
//	public void show(){
//		System.out.println("父类下的show");
//	}
//}
//class Apple extends Fruit{
//	public void show(){
//		System.out.println("子类下的show");
//	}
//	public void j(){
//		System.out.println("子类下的j方法（父类中没有）");
//	}
//}
//
//public class Day7_1_OOP {
//	public static void main(String[] args) {
//		Fruit f=new Apple();
////		f.j();编译不通过
//		f.show();//方法是在运行期创建的，执行的时候，执行运行期对象下的方法。
//	}
//}


//（3）对于静态方法的调用
//class Fruit{
//	public static void show(){
//		System.out.println("父类下的show");
//	}
//}
//class Apple extends Fruit{
//	public static void show(){
//		System.out.println("子类下的show");
//	}
//}
//
//public class Day7_1_OOP {
//	public static void main(String[] args) {
//		Fruit f=new Apple();
//		f.show();//因为静态方法是在编译期产生，执行的时候执行的是父类类型下的方法
//	}
//}


//（4）成员变量
//属性来说，即使子类下有覆盖父类的属性，访问【父类引用指向子类对象】的时候，访问的也是父类的属性。
//原因就是因为属性是编译期产生。
//class Fruit{
//     public String name="水果";
//     public void setApple(){
//	 }
//}
//class Apple extends Fruit{
////	 public String name="苹果";
//	 public String name;
//	 public Apple(){
//		 this.name="苹果";
//	 }
//	 public void setApple(){
//		 this.name="苹果";
//		 System.out.println(this.name);
//	 }
//}
//public class Day7_1_OOP {
//	public static void main(String[] args) {
//		Fruit f=new Apple();
//		f.setApple();
//		System.out.println(f.name);//永远访问的都是父类（编译期类型）下的属性
//	}
//}

/*
 * 对于方法：有重写
 * 对于属性：隐藏（对于属性的“重写”---本质不是重写，是隐藏）
 * 是否能够实现java中的多态，是重写和隐藏的本质区别。
 * 重写可以实现多态，会根据运行时对象的真正类型来决定调用哪一个成员，
 * 隐藏不能实现多态，永远都执行的是编译期的属性
 */



//3.多态参数
//对于父类引用指向子类对象的【间接】使用
//javaTeacher  pythonTeacher 下面都是teach方法
//背景： 需求，希望Test类，javaTeacher  pythonTeacher ，通过 依赖关系实现了和类之间引用。
//   比如Test中有一个record方法，方法中Teacher作为形式参数
// 希望在record中，希望调用到javaTeacher和pythonTeacher下的teach方法，怎么办？
//class PyhtonTeacher{
//	public void teach(){
//		System.out.println("python上课");
//	}
//}
//class JavaTeacher{
//	public void teach(){
//		System.out.println("java上课");
//	}
//}
//public class Day7_1_OOP {
////	public void record(PyhtonTeacher pt,JavaTeacher jt){
//////		希望调用到PyhtonTeacher   JavaTeacher下的teach方法。
////		pt.teach();
////		jt.teach();
////	}
//	public void record(PyhtonTeacher pt){
//		pt.teach();
//	}
//	public void record(JavaTeacher jt){
//		jt.teach();
//	}
//	
//	public static void main(String[] args) {
//		
//	}
//}

//【多态参数的定义】：将形式参数定义为一个父类的类型，各个子类中都重写父类中的方法，在方法调用的时候，
//            实际参数传入的是哪一个子类的对象，就会调用到哪一个子类对象下的方法。
//            将这个形式参数称为：多态参数
// 实际参数会给形式参数赋值：
// 变量名绑定变量名一样。
// T t=new T();
// T t2=t;
// 多态改建的建立：继承、覆盖（重写）

class Teacher{
	public void teach(){
	}
}
class PyhtonTeacher extends Teacher{
	public void teach(){
		System.out.println("python上课");
	}
}
class JavaTeacher extends Teacher{
	public void teach(){
		System.out.println("java上课");
	}
}
public class Day7_1_OOP {
	public void record(Teacher t){
//		相当于经历了  Teacher t=pt;    父类引用  t=子类对象
		t.teach(); //会调用到子类对象下的方法
	}
	public static void main(String[] args) {
		Day7_1_OOP test=new Day7_1_OOP();
		PyhtonTeacher pt=new PyhtonTeacher();
		JavaTeacher jt=new JavaTeacher();
		test.record(pt);
		test.record(jt);
	}
}






