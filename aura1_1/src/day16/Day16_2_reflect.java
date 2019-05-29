package day16;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * 第二十二章     反射
 * 1.背景：
 * 可使用一个java类，创建对象之后，就可以使用对象下属性、方法；通过类名，访问静态成员。
 * 能不能只通过类的名字（接到了一个字符串） ，来调用这个类下的方法？属性？
 * 通过反射。
 * 通过反射来创建“指定类”的对象，然后再通过反射的原理，调用对象下的“指定方法”。
 * 
 * 最终的要的类 Class 类加载器
 * 
 * 2.反射的定义：
 * java中，反射指的是，在运行时，动态的获取一个类的信息，创建类的对象、访问类的成员。
 * 
 * java的运行机制：
 * 获得.class文件
 * 通过“加载类”加载class文件。（本质上也是通过流来处理）
 * 加载后 ，形成对应“类的对象”  ----Person这个类。把Person类称为对象（加载器加载类产出的对象）
 * Person.class----Person的类
 * 【类加载器】最原始的类Class,还有子类 ClassLoader（系统类加载器）
 * 【由类加载器运行方法——创建类】：就相当于，给一个（字符串名字）---全限定名 ，可以通过加载器的方法，获得真正的类。
 * 【方法】getSystemClassLoad（）获取系统加载器对象。
 * 
 * 获得系统加载对象cl，获得Person类，通过cl.loadClass()
 * 这种方式获得的Person类，没有对Person类进行初始化（连static静态块都没有运行）
 */
//public class Day16_2_reflect {
//	public static void main(String[] args) {
//		String name="day16.Person";
//		//使用类加载器 ClassLoader，getSystemClassLoad是静态方法，直接调用
//		 ClassLoader cl= ClassLoader.getSystemClassLoader();
//	//	 获得系统加载对象cl，获得Person类，通过cl.loadClass()
//		 try {
//			Class clazz= cl.loadClass(name);//clazz就相当于是Person这个类
//	//		System.out.println(clazz);//Class<?>  
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}

/*
 * 3. 使用Class加载器，获得指定类的对象其他三种方法：
 * （1）通过Object类中getClass方法
 * 可以 获得类，而且可以对类进行初始化。（跟ClassLoader不同的地方）
*/
//public class Day16_2_reflect {
//	public static void main(String[] args) {
//		Person p= new Person("张三",20);
//		Class clazz=p.getClass();
//		System.out.println(clazz);
//	}
//}
//（2）直接通过类名  .class方法，可以获取出当前类
//可以获得类名，但是不能对类进行初始化
//public class Day16_2_reflect {
//	public static void main(String[] args) {
//		Class clazz=Person.class;
//		System.out.println(clazz);//Class<?>---Person
//	}
//}

//（3）（掌握） Class类下的静态方法forName（类的全限定名）
//Class.forName("全限定名")：默认初始化，加载器系统加载器。
//Class.forName(参数1,参数2)
//第一：这种方法可以设置是否对类进行初始化；默认设置初始化，可以通过其他构造器来设置初始化状态
//第二：这种方法还可以设置要使用哪一个类加载器进行加载；
//[加载器的知识]
/* 类加载器，由原始的加载在器（启动类加载器），作为引导的boot，不是java实现的。
 * 原始加载器父类加载器，同时会衍生出了两类子类加载：
 * （1）系统加载器ClassLoader   静态方法getSystemClassLoader
 * （2）扩展类加载器
 * 
 * 启动类加载器是：用来加载java中的 已有类型（String   Integer）
 * 系统加载器和扩扎类加载器：用来加载自定义的java类
 * 
 * 当编译期编译的时候“双亲委派加载机制"。当一旦遇到一个类的时候，需要加载，会先让父类加载亲（启动类加载器）加载类，
 * 如果无法加载，则使用系统类加载或者扩展类加载加载。
 */
//public class Day16_2_reflect {
//	public static void main(String[] args) {
//		String name="day16.Person";
//		try {
////		Class clazz=Class.forName(name);
////		Class clazz=Class.forName(name, false, ClassLoader.getSystemClassLoader());
//			Class clazz=Class.forName(name, false, null);//如果加载器的参数不写，默认启动类加载器
//			System.out.println(clazz);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}

//4.通过Class.ForName的形式找到Person类，
//使用反射出 来的Person类创建对象
//涉及到三个方法
//（1）newInstance    :真正的用来创建对象（默认使用无参数构造器）
//（2）getConstructor :找到这个类的构造器（public的构造器）（包括有参数的和无参数的）
//（3）getDeclaredConstructor：找到这个类的全部构造器

//(1)newInstance
//public class Day16_2_reflect {
//	public static void main(String[] args) {
//		String name="day16.Person";
//		try {
//			Class clazz=Class.forName(name);
////			//直接调用newInstance，相当于调用了无参数构造器
//			Object o=clazz.newInstance();
//			if (o instanceof Person){
//				Person p=(Person)o;
//				System.out.println(p.getName());
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			// 不能够成功创建对象的异常：可能是构造器是私有、没有无参数构造器，还直接调用了newInstance
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// 可能不能够保证所有的，有参数构造器或者无参数构造器，都是public
////			在调用有参数构造器的时候，参数不合法：个数、类型
//			e.printStackTrace();
//		}
//	}
//}

//(2)getConstructor获得public类型的构造器
//(3)getDeclaredConstructor获得全部权限的构造器，
//   如果需要访问private的，需要设置权限setAccessible（true）
//public class Day16_2_reflect {
//	public static void main(String[] args) {
//		String name="day16.Person";
//		try {
//			Class clazz=Class.forName(name);
//	//		如果需要调用类下的有参数构造器，需要先获取有参数构造器才可以
//	//		getConstructor获得是对应类型的（Person）的构造器:获得public类型的构造器
//	//		person有参数构造器
//	//		Constructor<Person> person=(Constructor<Person>) clazz.getConstructor(String.class,Integer.class);
//	//		Person p=person.newInstance("张三",20);
//			
//	//		如果希望获得private的构造器（全部构造器），需要调用getDecalaredConstructor（）
//			Constructor<Person> person=(Constructor<Person>) clazz.getDeclaredConstructor(String.class,Integer.class);
//	//		还需要设置访问权限
//			person.setAccessible(true);//默认值是false
//			//通过构造器创建对象
//			Person p=person.newInstance("张三",20);
//			System.out.println(p.getName());
//			System.out.println(p.getAge());
//			
//		} catch (ClassNotFoundException|InstantiationException |
//				IllegalAccessException|InvocationTargetException|
//				NoSuchMethodException|SecurityException e) {
//			e.printStackTrace();
//		}
//	}
//}

//Class 类加载器
//"全限定名"   类----对象---进一步调用成员。。。。

//5.通过反射调用对象下的成员（属性、方法）
//通过反射，调用对象下的构造器：先获得构造器对象，然后再去调用构造器对象，创建真实的对象。
//【规则】：通过反射，先获得【属性对象】、【方法对象】，然后再去支配【属性对象】、【方法对象】
//        比如【方法对象】---包含方法参数、方法的返回值、方法名字、方法调用。
//获得【方法对象】
//getMethod： 获得对象下的全部public方法
//getDeclaredMethod：获得对象下的全部方法，如果希望访问private方法，则修改accessible(true)
//返回的的[方法对象]，包含：
//（1）返回类型  getReturnType
//（2）参数类型  getParameter
//（3）方法名字 getName
//（4）调用方法 invoke()

//获得【属性对象】
//getField：获得对象下的全部public属性
//getDeclaredField：获得对象下的全部属性，如果希望访问private方法，则修改accessible(true)
//
//public class Day16_2_reflect {
//	public static void main(String[] args) {
//		String name="day16.Person";
//		try {
//			Class clazz=Class.forName(name);
//			Constructor<Person> pc=clazz.getConstructor(String.class);
//			Person p=pc.newInstance("李四");
//			//通过反射， 访问对象下的方法
////			Method run=clazz.getMethod("run", String.class,Integer.class);
//			Method run=clazz.getDeclaredMethod("runPrivate", String.class,Integer.class);
//			run.setAccessible(true);
//			System.out.println(run.getReturnType());
//			System.out.println(run.getParameterTypes());
//			for (Class c : run.getParameterTypes()) {
//				System.out.println(c);
//			}
//			System.out.println(run.getName());
//			String result=(String)run.invoke(p, "操场",1000);//p.run("操场",1000);
//			System.out.println(result);
//			
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NoSuchMethodException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalArgumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InvocationTargetException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}


//获得【属性对象】
//getField：获得对象下的全部public属性
//getDeclaredField：获得对象下的全部属性，如果希望访问private方法，则修改accessible(true)
public class Day16_2_reflect {
	public static void main(String[] args) {
//		System.setSecurityManager(new SecurityManager());
		String name="day16.Person";
			try {
				Class clazz = Class.forName(name);
				Constructor<Person> pc=clazz.getConstructor(String.class);
				Person p=pc.newInstance("李四");
				
//				通过反射访问属性，需要先获得属性对象
				Field f=clazz.getField("gender");
				System.out.println(f.get(p));
				Field f1=clazz.getDeclaredField("name");
				f1.setAccessible(true);
				System.out.println(f1.get(p));
				
				for (Field string : clazz.getFields()) {
					System.out.println(string);
				}
				for (Field string : clazz.getDeclaredFields()) {
					System.out.println(string);
				}
//				静态方法
				Method m=clazz.getMethod("walk",null);
				m.invoke(null, null);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

//6.安全经理
//通过SecurityManager创建对象来阻止通过反射访问私有成员
//System.setSecurityManager(new SecurityManager())
