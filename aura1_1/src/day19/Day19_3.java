package day19;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Day19_3 {

	public static void main(String[] args) throws NoSuchFieldException {
		String name = "day19.Person_";
		
		try {
			Class clazz = Class.forName(name);
			Constructor<Person_> person=clazz.getConstructor(String.class,Integer.class);
			Person_ p = person.newInstance("张三",21);
			Person_ p1 = person.newInstance("张三",22);
			Method mm = clazz.getMethod("setName", String.class);
			mm.invoke(p,"李四");
			mm.invoke(p1, "王五");
//			Field f =clazz.getField("age");
//			System.out.println(f.get(p));
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
		}

	}

}
class Person_{
	String name;
	Integer age;
	
	public Person_(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("姓名:"+name+",年龄:"+age);
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}