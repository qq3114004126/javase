package day10;

/*第十四章：内部类
 * 方法引用
 * 【本质前提】：必须先要有接口，然后在工具类中或者自身类中进行实现。
 * 简化调用——方法引用
 * 如果已有方法已经实现了相关的内容，我们可以直接使用方法的引用，来调用实现的内容。
 * （1）引用静态方法（重要）
 * （2）通过对象引用实例方法
 * （3）通过类引用实例方法
 * （4）引用构造器（了解）类::new 必须有有一个接口，返回创建对象的方法
 * 
 * 一、引用引用静态方法
 *通过已有的静态方法来实现实现类
// */
//class Person{
//	private String name;
//
//	public String getName() {

//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Person(String name) {
//		super();
//		this.name = name;
//	}
//}
//interface Friend{
//	void makeFriend(Person p1,Person p2);
//}
//class ToolStatic{
////    makeFriend的名字参数，都跟接口中一致
//	public static void makeFriend(Person p1,Person p2){
//		System.out.println("交朋友的方法");
//	}
//}
//public class Day10_1_InnerClass {
//	public static void test(Friend f){
//		Person p1=new Person("张三");
//		Person p2=new Person("李四");
//		f.makeFriend(p1, p2);
//	}
//	  public static void main(String[] args) {
////		  希望能够实现Friend接口
////		  如果使用lambda表达式来实现，【获得实现接口的实现类对象】。
////		  Friend f1=(Person p1,Person p2)->{
//////			  希望在这里实现真正交朋友的方法
////			  ToolStatic.makeFriend(p1, p2);
////		  };
//		  
////		  简化
////		  Friend f1=(p1, p2)-> ToolStatic.makeFriend(p1, p2);
////		 更加简化 :静态方法：类名::静态方法名
////		  【省略的内容】：传过来的参数（形式参数），方法名字中的参数（实际参数）
//		  Friend f2=ToolStatic::makeFriend;
//		  【上面功能】：将Friend接口中的两个形式参数，传递给ToolStatic类下的makeFriend方法

////		  【问题】参数
////		  （1）如果达到方法引用的效果，必须是函数是接口。 
////		  （2）参数，直接到接口下找，对应。
////		  要求()中的形式参数 ，必须实际参数（类中的静态方法中（形式参数））一一对应。
////		      静态方法 跟重写接口中方法一样。
//		  test(f2);
//	  }
//}

//二、通过实例：方法的引用
//interface Friend{
//	void makeFriend(Person p1,Person p2);
//}
//class ToolStatic{
////	makeFriend的名字参数，都跟接口中一致
//	public  void makeFriend(Person p1,Person p2){
//		System.out.println("交朋友的方法");
//	}
//}
//public class Day10_1_InnerClass {
//	 public static void test(Friend f){
//		Person p1=new Person("张三");
//		Person p2=new Person("李四");
//		f.makeFriend(p1, p2);
//	 }
//	  public static void main(String[] args) {
//		  ToolStatic ts = new ToolStatic();
//		  Friend f2=ts::makeFriend;
//		  test(f2);
//	  }
//}

//三、通过类型：方法的引用
//让Person类自己去实现Friend接口中的东西
class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}
//	实现了接口中的方法
	public  void makeFriend(Person p2){
		System.out.println("交朋友的方法");
	}
}
interface Friend{
	void makeFriend(Person p1,Person p2);
}

public class Day10_1_InnerClass {
	 public static void test(Friend f){
		Person p1=new Person("张三");
		Person p2=new Person("李四");
		f.makeFriend(p1, p2);
	 }
	 public static void main(String[] args) {
//		  Friend f2=(p1,p2)->{p1.makeFriend(p2);};
//		  Friend f2=(p1,p2)->p1.makeFriend(p2);
		  Friend f2=Person::makeFriend;
		  test(f2);
//		  [为什么]可以通过类名，调用类下方法。
//		  因为接口下void makeFriend(Person p1,Person p2); 有两个参数
//		  “实现类” Person中有 public  void makeFriend(Person p2){}
//		  会自动将第一个参数当成Person对象，第二个参数当成实现方法中的参数。
			
	}
		  
}
