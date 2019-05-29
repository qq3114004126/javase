package day20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//2.	定义一个标准的JavaBean，名叫Person，包含属性name、age。使用反射的方式创建一个实例、
//调用构造函数初始化name、age，使用反射方式调用setName方法对名称进行设置。
class Person{
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String run(String place){
		System.out.println("在跑步");
		return "success";
	}
	
}

public class Que2 {
   public static void main(String[] args) {
	  try {
		Class clazz=Class.forName("day17.day16homework.Person");
		Constructor con=clazz.getConstructor(String.class,Integer.class);
		Object o=con.newInstance("张三",20);
		Method m=clazz.getMethod("run", String.class);
		m.invoke(o, "操场");
		
		Method m1=clazz.getMethod("setName", String.class);
		m1.invoke(o, "李四");
		
		Method m2=clazz.getMethod("getName");
		System.out.println(m2.invoke(o));;
		
		Field f=clazz.getDeclaredField("name");
		f.setAccessible(true);
		System.out.println(f.get(o));
		
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
