package test01_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import day19.Day16_3_IOC;
import day19.Factory;
import day19.Fruit;

public class Test1 {
	public static  Properties init(){
		Properties pro=new Properties();
		try(InputStream  in =new FileInputStream("src/test01_/p.properties")){
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
		Properties pro=Day16_3_IOC.init();
//		Fruit f=Factory.getInstance(pro.getProperty("apple"));
		Fruit f=Factory.getInstance(pro.getProperty("orange"));
		f.eat();
		Fruit f1=Factory.getInstance(pro.getProperty("apple"));
		Fruit f2=Factory.getInstance(pro.getProperty("pear"));
		f2.eat();
		
	}
}
		
class Factory{
	public static Fruit getInstance(String classname) {
		Fruit f=null;
		try {
			f=(Fruit)Class.forName(classname).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
}
interface Fruit{
	void eat();
	
}
class Apple implements Fruit{

	public void eat() {
		System.out.println("吃苹果");
		
	}
	
}
class Pear implements Fruit{
	
	
	public void eat() {
		System.out.println("吃梨");
		
	}
	
}
