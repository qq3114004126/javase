package day20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Day20_4 {

	public static void main(String[] args) {
		String address = "day20.Dog";
		try {
			Class clazz = Class.forName(address);
			Object cc = clazz.newInstance();
			if(cc instanceof Dog) {
				Dog d = (Dog)cc;
				d.setName("张三");
				d.setAge(21);
				d.setSex("boy");
				System.out.println(d.getName());
				Field f = clazz.getDeclaredField("name");
				Field f1 = clazz.getDeclaredField("sex");
				f.setAccessible(true);
				f1.setAccessible(true);
				System.out.println(f.get(d));
				System.out.println(f1.get(d));
			}
			Constructor<Dog> dd =clazz.getConstructor(String.class,int.class,String.class);
					Dog p = dd.newInstance("李四",22,"girl"); 
					System.out.println(p.toString());
					Method mm =clazz.getMethod("methods",String.class);
					mm.invoke(p,"王五");
					
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
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
class Dog{
	private String name;
	private int age;
	private String sex;
	public Dog(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Dog() {
		super();
	}

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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	public void methods(String name) {
		System.out.println("这是"+name+"的方法");
	}

	
	
}