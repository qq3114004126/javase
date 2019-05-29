package day16;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//class A{}
//class B{}
//class C{}
//class E{}
//class D{
//	public Object creatD(){
//		new A();
//		new B();
//		new C();
//		return new Object();
//	}
//}
//
////工厂模式
//class Factory{
//	public D creatD(){
//		new A();
//		System.out.println("对于A进行操作");
//		new B();
//		System.out.println("对于B进行操作");
//		new C();
//		System.out.println("对于C进行操作");
//		return new D();
//	}
//}
//
//public class Day16_3_IOC{
//	public static void main(String[] args) {
//		Factory f=new Factory();
//		f.creatD();
//	}
//}

//spring下的IOC
// 控制反转 ：将创建对象的工作，交给spring的IOC容器   Ioc 相当于上面的Factory
//一、使用工厂模式
interface Fruit{
	void eat();
}
class Apple implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃苹果");
	}
}
class Orange implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃橘子");
	}
}

//没有反射的时候，创建的工厂
//class Factory{
//	public static Fruit getInstance(String classname){
//		Fruit f=null;
//		if(classname.equals("apple")){
//			f=new Apple();
//		}else if (classname.equals("orange")){
//			f=new Orange();
//		}
//		return f;
//	}
//}


//利用反射创建工厂
class Factory{
	public static Fruit getInstance(String classname){
		Fruit f=null;
		try {
			f=(Fruit)Class.forName(classname).newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
}
//public class Day16_3_IOC{
//	public static void main(String[] args) {
////		Apple a=new Apple();
////		采用工厂模式创建苹果对象或者是橘子对象
////		Fruit f=Factory.getInstance("day16.Apple");
//		Fruit f=Factory.getInstance("day16.Orange");
//		f.eat();
//	}
//}


//将资源全部配置在properties中。
//【properties文件的处理】
// 专门的类Properties 也是集合类型，继承Hashtable ，实现了Map接口
//1. 使用Properties类的对象载入properties文件
//字节流处理FileInputStream
//InputStream  in =new FileInputStream(文件名)
//Properties p=new Properties()
//p.load(in);可以将properties文件中的内容获取到p对象中。

//2. Properties类的对象，如何获取key  value
//p.getProperty(key)

public class Day16_3_IOC{
	//加载properties文件，装入到properties的对象中
	public static  Properties init(){
		Properties pro=new Properties();
		try(InputStream  in =new FileInputStream("src/day16/a.properties")){
			pro.load(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pro;
	}
	public static void main(String[] args) {
	//	Apple a=new Apple();
	//	采用工厂模式创建苹果对象或者是橘子对象
	//	Fruit f=Factory.getInstance("day16.Apple");
		Properties pro=Day16_3_IOC.init();
//		Fruit f=Factory.getInstance(pro.getProperty("apple"));
		Fruit f=Factory.getInstance(pro.getProperty("orange"));
		f.eat();
		Fruit f1=Factory.getInstance(pro.getProperty("apple"));
		Fruit f2=Factory.getInstance(pro.getProperty("pear"));
		f2.eat();
		
	}
}

/*
 * spring容器真正的底层，使用的配置文件，不是properties，使用是xml
 * <bean id="beed" class="day16.Beed">
 * <bean id="apple" class="day16.Apple">
 *    <property name="name" value="2"/>
 *    <property name="beed"  value="beed">
 * </bean>
 * 
 * class Apple{
 *    private  Beed  beed;
 * }
 * 
 */

class Pear implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃梨");
	}
	
}








