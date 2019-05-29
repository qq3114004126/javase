package day12;

import java.util.function.Predicate;

/*第十四章  内部类
 * jdk1.8之后lambda表达式————对于实现类的简化
 * 
 * 内部类：声明在一个类的【内部】，包含内部类的类，被称为外围类。如果一个类只有外围类，没有内部类————顶级类
 * 
 * 1.【背景】
// 把关系密切的类，声明到类的内部：枪和子弹
 * 
 * 顶层类之间访问是受访问权限控制。
 * 但是内部类是可以任意权限访问。
 * 内部类可以方位外围类的成员，外围类也可以访问内部类的所有（访问权限的）成员
 * 
 * 2. 内部类的分类
    根据内部类声明的位置：
 * （1）静态成员类 （了解）
 * （2）实例成员类  (了解)
 * （3）局部类（本地类）（掌握）
 * （4）匿名类（掌握）
 * 
 * 
 * 1. 静态成员类
 * 【定义】 结构上就类似于静态成员变量一样。跟（外围）类紧密相连，跟外围类的对象没什么关系，可以脱离外围类的对象使用。
 * 【定义的位置】 在外围类的内部，声明的时候，static声明一个 类即可
 * 【语法】  【访问权限修饰符（任意），习惯上写成public】
 *        【访问权限修饰符】 static   class 内部版类的名字{  类体   }
 * 【规则】
 * （1） 在外围类的内部，可以通过简单的名字(内部类的class后面的名字)访问内部类。
 *     在外围类的静态方法中，访问内部类，创建内部类的对象？ 可以：静态可以访问到静态
 *     
 *  (2)在外围类的外部：需要调用外围类的名字.静态成员类名
 *  (3) 在静态成员类中，可以访问到外围类的静态成员，但是不能访问到外围类的实例成员。
 *     为什么？静态成员类跟外围类相关，跟外围的对象无关。当调取外围类的实例成员时，实例很可能还没有。
 *     
 * 【应用】很少应用，有了相关规则的产物。
 */
//class Outer{
////	就将静态成员类看成“静态成员”
//	public static class Inner{
////		在静态成员类中，可以访问到外围类的静态成员，但是不能访问到外围类的实例成员。
//		public void f(){
//			System.out.println(x);Outer.x
//			x=2;
//			System.out.println(y);//不能访问  y本身就有对象 Outer.y

//		}
//		
//	}
//	public static int x;
//	public int y;
////	Inner i =new Inner();   可以
//	public static void m1(){
//		Inner i =new Inner();
//	}
//	public void m2(){
//		Inner i =new Inner();
//	}
//}
//
//
//public class Day9_1_InnerClass{
//	public static void main(String[] args) {
//			System.out.println(Outer.x);
//			Outer.Inner  oi=new Outer.Inner();
//	}
//}


/*
2. 实例成员类
   【定义】 跟  成员变量  地位类似，跟外围类的对象紧密相关，但是跟外围类无关。
   【声明的方式和位置】外围 类的内部，
             【访问权限修饰符】  class 内部类名字{ 类体  }
  【规则】
  （1） 实例成员类，在外围类的内部可以直接访问，在外围类的外部，必须通过外围类的对象才能访问。
            访问的形式：外围对象.new 内部类的名字:Outer.Inner  i=o.new Inner();
  （2）  在实例成员类中， 访问外部成员可以任意静态与非静态（原因：实例成员类非静态的，在非静态的环境下可以访问静态和静态）
     当实例成员类的对象产生的时候，外围类的对象一定产生了。
    【特殊的情况】 static  +final 也可以访问到。
    
  (3) 实例成员类中，不能够声明任何的静态成员、静态初始化块。
      为什么  假如可以  Outer.Inner.k  ，Inner本身就需要Outer对象产生。没有Outer对象，实例成员类的内部内容什么都不可能访问到。
      【特殊】 使用static final定义常量可以定义在实例内部类中。（为什么？）跟所有对象都没关系，甚至于跟类都没什么关系
//       在编译期，甚至于在字节码文件中根本不存在final类型变量名。常量的存储只要存储在静态区，访问的时候，直接访问存储的地址。
      *【关于静态存储（了解）】
      *
   （4）实例成员内部类会遮蔽外围类的同名成员变量。
//   相当于：成员变量
 *   局部变量会遮蔽成员变量，内部类的成员变量也会遮蔽外围的成员变量
 * 
   
      */
//class Outer{
//	public int x=123;
//	public static int y;
//	public static final  int z=123;
//	public  class Inner{//相当于属性
////		三个静态成员都不能在实例成员类中声明
////		public static int k;
////		public static void test1(){}
////		static {}
////		public static final int j=123;常量可以声明
//		public int x=456;
//		public void test(int x){
//			x=789;
//			System.out.println(x);
////          成员实例类中访问，成员实例类中的成员变量。（局部变量遮蔽成员变量）
//			System.out.println(this.x);
////			System.out.println(y);
////			非要实例成员类中访问外围类的成员变量：可以用外围类的名.内部类的实例.变量。（了解）
//			System.out.println(Outer.this.x);
//			
//			f1();
//			f2();
//		}
//	}
//	public void f1(){
//	   Inner i=new Inner();
//	}
//	public static void f2(){
//		
//	} 
//}
//public class Day9_1_InnerClass{
////	【static  final类型常量， 存储在静态区域中，访问的时候，直接访问内存地址】（了解）
////	final int q=1;
////	byte v=q;
//	
//	
//	public static void main(String[] args) {
//		Outer o=new Outer();
//		Outer.Inner  i=o.new Inner();
//		i.test(111);
//	}
//}

/*3. 局部类（本地类）
 * 【定义】声明在类内部，同时声明在局部范围内（方法（常用）、语句块）里面声明的类，被称为是本地类（局部类）
 *       理解成：局部变量
 * 【定义语法】 在方法中，语句块中
 *      【访问权限修饰符（没有）】  【修饰符static（没有）】  class 内部 类的名字{  类体 }
 * 【作用域】 同局部变量，从声明的位置到最小的语句块——（在方法中如果返回了实现类的对象可以扩大作用域）
 * 【规则】
 * 1. 不能使用访问权限修饰符和static修饰符
 * 2. 局部类 内部 不能声明静态成员（同实体类）(没有外部类的对象，不能访问到静态成员。Inner要依靠外部类的对象产生。)
   3. 非静态方法中---创建局部类----在局部类中创建非静态方法，
                         访问外围类的成员限制：无理论是访问静态成员还是非静态成员都可以。
               静态方法中----创建局部类----在局部类中非静态方法，
                         访问外围类的成员限制：可以访问静态成员，但是不能访问非静态成员（实例成员）
                        为什么？静态方法中只能访问静态的内容
   4.常见应用：在外围类的外面      声明 一个接口，在外围类的方法中，声明一个局部类，这个局部类实现实现外部的接口。
//          在实现中返回局部类的对象（接口对应）
 *          这样的局部类对象就可以在作用域外有效
            只用一句话：在外围类的方法中，实现接口中的方法。
            面向对象：类：这个 类的属性、这个类的方法。
 */
//class Outer  implement  接口1，接口2，{
//class Outer{
//	public static int x=1;
//	public int y=2;
//	public static void fun2(){
//		class Innner{
//			public void f1(){
//				System.out.println(x);
////				System.out.println(y);
//			}
//		}
//	}
//	public void fun(){
//		class Inner{//本地类，局部类
//			public  int x=1;
//			public void f1(){
//				System.out.println(x);
//				System.out.println(y);
//			}
//		}
//	}
//}


/*
// *        好处：
 *           （1）不需要当前的类本身去实现某个接口 ，只需要类中的某个方法实现接口即可。
 *               让接口和实现类之间“解耦”---解除耦合---能够让类和类之间的设计变得更加灵活
 *               类的拆装非常方面。
 *           （2）扩大局部类的作用域（局部类是一个实现类）
 */
//class Outer{
////	public void a(){
////		class Phone  implements Mobile{//Phone 是Inner类
////			public void call(){
////				System.out.println("使用Phone打电话");
////			}
////		}
//////		想去调用call方法，必须先创建Phone
////		Phone p=new Phone();
////		p.call();
////	}
//	
//	public Mobile getMobile(){
//		class Phone  implements Mobile{//Phone 是Inner类
//			public void call(){
//				System.out.println("使用Phone打电话");
//			}
//		}
////		想去调用call方法，必须先创建Phone
//		Mobile p=new Phone(); //父类引用指向子类对象
////		p.call();
//		return p;
//	}
////	思考，在Outer中，如果想调用到 Phone对象。希望使用classPhone
//	public void other(){
//		Mobile phone=this.getMobile();
//	}
//	
//}
//class Phone2{
//	有的时候，只是希望Phone2下的某一个方法，去实现Mobile
//   相当于不想让Phone2类 本身实现的接口越来越多的
//   只希望通过某个方法来实现Mobile，如果不希望Phone2实现Mobile，主需要注释掉该方法就可以
//}
//interface Mobile{
//	void call();
//}
//public class Day9_1_InnerClass{
//	public static void main(String[] args) {
//		Outer o=new Outer();
////		o.a();
//	    Mobile phone=	o.getMobile();
//	    phone.call();
//	}
//}
//练习：让ipad打电话，创建新的Outer2  
//
//class Outer2{
//	public Mobile getMobile(){
//		class Ipad implements Mobile{
//			@Override
//			public void call() {
//			   System.out.println("ipad进行打电话");
//			}
//		}
//		return new Ipad();
//	}
//}
//
//public class Day9_1_InnerClass{
//	public static void test(Mobile m){
//		m.call();
//	}
//	public static void main(String[] args) {
//		Outer o=new Outer();
////		o.a();
//	    Mobile phone=o.getMobile();
//	    phone.call();
//	    
//	    Outer2 o2=new Outer2();
//	    Mobile ipad=o2.getMobile();
//	    
//	    test(phone);
//	    test(ipad);
//	}
//}

/*
 * 4. 匿名类
 * 没有名字的局部类
 * 【意义】 如果类产生的对象，只使用一次，代码非常简洁。
 * 【规则】同局部类
 * 【定义】方法的{ }内部就相当于实现类 ， new 后面的类型，相当于要实现的接口
 * 【容易误解的地方】 new后面是接口类型，new  接口(){ 实现接口的实现类（匿名）  };
 * 【使用的时候，需要注意】局部类（没有名字）实现外面的接口；一定是接口实现本身非常简单；实现类只使用一次。
 * public class Outer{
 *    public 接口类型 fun(){
 *       class Inner (可以去实现外部接口){
 *       
 *       }
 *       Inner inner=new Inner();
 *       return  inner;
 *    }
 * }
 * 
 * 简化：
  * public class Outer{
 *    public 接口类型 fun(){
 *       //省略class Inner (可以去实现外部接口){
 *       }//省略
 *       Inner inner=new Inner(){
 *          内部类的类体
 *       };
 *       return  inner;
 *    }
 * }
 * * 
 * 更简化
  
 * 简化：
  * public class Outer{
 *    public 接口类型 fun(){
 *       return  new 接口类型(){
 *          内部类的类体
 *       };
 *    }
 * }* 
 * 
 */
//class Outer2{
//	public Mobile getMobile(){
////		class Ipad implements Mobile{
////			@Override
////			public void call() {
////			   System.out.println("ipad进行打电话");
////			}
////		}
////		Mobile  pad=
//		return new Mobile(){//{}内部就相当于实现类  new 相当于要实现的接口
////			实现类没有名字
//			@Override
//			public void call() {
//			   System.out.println("ipad进行打电话");
//			}
//		};
//	}
//}
//interface Mobile{
//	void call();
//}
//public class Day9_1_InnerClass{
//	public static void test(Mobile m){
//		m.call();
//	}
//	public static void main(String[] args) {
//	    Outer2 o2=new Outer2();
//	    Mobile ipad=o2.getMobile();
//	    test(ipad);
//	}
//}
// JavaTeacher 和PythonTeacher
// Teacher 教师标准  teach下的抽象方法。
//（1）javaTeacher 和PythonTeacher形成实现类（局部类），方法javafun 和pythonfun 
//（2）javaTeacher 和PythonTeacher形成匿名类

//interface Teacher{
//	void teach();
//}
//class Outer {
//	public Teacher  javafun(){
////		class JavaTeacher implements Teacher{
////			public void teach(){
////				System.out.println("java讲师讲课");
////			}
////		}
//		return new Teacher(){
//			public void teach(){
//				System.out.println("java讲师讲课");
//			}
//		};
//	}
//	public Teacher  pyhtofun(){
////		class PythonTeacher implements Teacher{
////			public void teach(){
////				System.out.println("python讲师讲课");
////			}
////		}
//		return new Teacher(){
//			public void teach(){
//				System.out.println("python讲师讲课");
//			}
//		};
//	}
//}
//
//public class Day9_1_InnerClass{
//	public static  void test(Teacher t ){
//		t.teach();
//	}
//	public static void main(String[] args) {
//		Outer o=new Outer();
//		Teacher javat=o.javafun();
//		Teacher pythont=o.pyhtofun();
//		javat.teach();
//		pythont.teach();
//		test(javat);
//		test(pythont);
//	}
//}


//3.内部类型的.class的文件名（了解）
//内部类在编译之后，也会生成字节码文件
//对于成员类，字节码文件的名字：外围类$成员类.class
//对于局部类，字节码文件的名字：外围类$数字局部类名.class
//对于匿名类，字节码文件的名字：外围类$数字.class

// 4. lambda表达式
// 1.8之后引入 重要概念
// 【目的】让匿名类的使用上更加简化
//（1）相关概念
//【函数式接口】
// 函数式接口、函数式编程.....
// 定义：当一个接口中，【必须】【只声明一个】【未实现的抽象方法】，称为函数式接口。
// 函数式接口中（可以有抽象方法也可以有非抽象）
//【要求严格的原因】在使用lambda表达式实现接口的时候，默认实现的就那一个未实现的接口。
//【java中提供了标记】@FunctionalInterface，这种就是函数式接口,为了容易识别函数式接口。
//               不加也没错
//@FunctionalInterface
//interface F {
//	void m();
//	default void k(){
//		
//	}
//	String toString();//F接口默认继承了Object，Object下是有toString方法 实现
//}

//（2）lambda表达式
//【lambda作用】专门用来实现函数式接口的。
//最终都是一个表达式。相当于实现类---匿名实现类-----表达式 (使用表达式实现的时候，没有方法的名字)
//【语法】 可以看成是一个匿名的方法
// [return]  (参数列表)->{方法的具体实现}
//参数列表：在实现 接口中方法的时候，传入的参数，
//{}：是具体实现
//return可以省略
//关于mobile  ipad实现案例
//实现类可以使用lambda表达来表示
//【比匿名类还要省略掉的内容】
//（1）在外围类中定义的方法（为了创建一个实现类，实现接口中固定方法）
//（2）为了调用外围类中定义的方法，而在测试类中创建的外围类对象，可以不用创建了。
//【本质】通过lambda表达式实现接口中一个方法。（连实现类都不需要）
//class Outer2{
//	public Mobile getMobile(){
//		return new Mobile(){//{}内部就相当于实现类  new 相当于要实现的接口
//			@Override
//			public void call() {
//			   System.out.println("ipad进行打电话");
//			}
//		};
//		return ()->{
//			System.out.println("ipad进行打电话");
//		};
//	}
//}
//interface Mobile{
//	void call();
//}
//public class Day9_1_InnerClass{
//	public static void test(Mobile m){
//		m.call();
//	}
//	public static void main(String[] args) {
////	    Outer2 o2=new Outer2();
////	    Mobile ipad=o2.getMobile();
//	    Mobile ipad=()->{
//			System.out.println("ipad进行打电话");
//		};//如果需要在一个类中，实现Mobile中的唯一抽象方法，只需要在测试调用中，加lambda表达式即可
////		   ()传参数    {}传实现
//	    test(ipad);
//	}
//}



//当lambda表达式中有返回值的时候。
//@FunctionalInterface
//interface X{
//	int value(int a);
//}
//class Outer{
//	public X getX(){
//		class Inner implements X{
//			@Override
//			public int value(int a) {
//				return a*10;
//              syso.out.print(a*10)
//			}
//		}
//		X x = new Inner();
//		return x;
		
//		匿名类
//		return new X(){
//			public int value(int a) {
//				return a*10;
//			}
//		};
		
//		lambda表达式
//		return (int b)->{
//			return b*10;
//		};
//	}
//}

//public class Day9_1_InnerClass{
//	public static void main(String[] args) {
//		X x=(int b)->{return b*10;};
//		System.out.println(x.value(50));
//	}
//}
//再继续简化
//【lambda表达的简化规则】
//（1）参数列表，类型可以省略，如果只有一个参数()也可以省略，如果没有参数()就不能省略
//（2）return无论是否有返回值，都可以省略
//（3）如果方法体只有一句话，{}可以省略
//public class Day9_1_InnerClass{
//	public static void main(String[] args) {
//		X x= b->b*10;//实现X接口中的value方法。
//		System.out.println(x.value(50));
//	}
//}


//【应用】
/*编写一个方法，针对一个人员的数组实现的方法，处理人员的数组
 * Person：name  age   height  weight....
 * {Person1,Person2,Person3}
 * 一次判断数组中的每个元素，是否符合指定的条件，
 * 如果符合指定的条件，就将Person元素输出。
 */

class Person{
	private String name;
	private int age;
	private int height;
	private int weight;
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Person(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}
//实现单一规则可以 测试类
interface Rule{
	boolean check(Person p);//方法
}
class MyRule1 implements Rule{
	@Override
	public boolean check(Person p) {
		return p.getAge()>=18&&p.getAge()<=52;
	}
}
public class day9_1_InnerClass{
//	public void dealwith(Person [] persons,int min,int max){
	public void dealwith(Person [] persons,Rule r){
//		比如，筛选>=18的人
		for (Person p:persons){
//			if(p.getAge()>=min&&p.getAge()<=max){
		    if(r.check(p)){
				System.out.println(p.getName());
			}
		}
	}
	
//	直接使用java已提供的API Predicate接口，是函数式接口  test方法
	public void dealwith1(Person [] persons,Predicate<Person> r){
//		比如，筛选>=18的人
		for (Person p:persons){
//			if(p.getAge()>=min&&p.getAge()<=max){
		    if(r.test(p)){
				System.out.println(p.getName());
			}
		}
	}
	public static void main(String[] args) {
		day9_1_InnerClass c=new day9_1_InnerClass();
		Person[] persons=new Person[3];
		persons[0]=new Person("张三",18,150,130);
		persons[1]=new Person("李四",20,180,130);
		persons[2]=new Person("王五",52,150,130);
		c.dealwith(persons, new MyRule1());//有实现类,有了规则，按照实现类删选Person的规则
		
		c.dealwith(persons, new Rule(){//匿名实现类
			public boolean check(Person p2){
				return p2.getAge()>=18&&p2.getAge()<=52;
			}
		});
//		c.dealwith(persons,(Person p2)->{return p2.getAge()>=18&&p2.getAge()<=52;});//lambda表达
		c.dealwith(persons,p2->p2.getAge()>=18&&p2.getAge()<=52);//lambda表达
		c.dealwith(persons,p2->p2.getHeight()>170);//lambda表达
		
		c.dealwith1(persons,p2->p2.getHeight()>170);//lambda表达
		
	}
}


















