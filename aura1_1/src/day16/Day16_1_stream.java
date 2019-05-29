package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 第二十一章  输入输出流
 * java对于文件的读写。
 * 一、File类
 * 二、字节流
 * 三、字符流
 * 四、缓冲流
 * 五、转换流
 * 六、数据流
 * 七、对象流
 * 数据流和对象流 都是为了将   数据（基本数据类型、String、普通的引用类型） 写到文件或者读出
 * 数据流专门来处理基本数据类型和String类型的数据：进行输入和输出。 将内容存储成二进制的模式。

 */
/*
 * 六、数据流
 * 数据流实现的接口：DataInput   DataOutput
 * 对应的实现类 DataInputStream    DataOutputStream  
 * 使用的时候，直接创建对象，传入字节流。
 * 因为子类下面的方法：
 * write.writeInt
 * write.writeFloat  处理基本数据类型
 * write.writeUTF  处理字符串
 * ...
 * 注意：读的顺序跟写入的顺序保持一致，因为writeX 对应的readX方法，是一一对一个的。
 * 基本数据类型和字符串类型：序列化。数据类型写到文本文档中（可能会有很多格式）
 */

//public class Day16_1_stream {
//	public static void read(){
//		try(DataInputStream in=new DataInputStream(new FileInputStream("c:/2.txt"))){
//			while(true){
//				int v=in.readInt();
//				String s=in.readUTF();
//				System.out.println(v+","+s);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("数据流已经没有数据了。");
//		}
//	}
//	public static void write(int [] ins,String []ss){
//		try(DataOutputStream out =new DataOutputStream(new FileOutputStream("c:/2.txt"))){
//			 for (int i = 0; i < ins.length; i++) {
//				 out.writeInt(ins[i]);
//				 out.writeUTF(ss[i]);
//			 }
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
// public static void main(String[] args) {
////	 int [] ins={1,2,3,4,5};
////	 String [] ss={"a","b","c","d","f"};
////	 write(ins,ss);
//	 read();
//}
//}

//七、对象流
//处理除了基本数据类型和字符串类型 以外的其他引用类型。
//使用对象流来进行序列化（将数据读、写到txt中）
//使用对象流处理：
//接口：ObjectInput         ObjetOutput
//实现类：ObjectInputStream    ObjetOutputStream
//需要对象类实现序列化接口。

//class Person implements Serializable{
//	private String name;
//	private int age;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//}
//
//public class Day16_1_stream {
//	public static void read(){
//		try(ObjectInputStream oos=new ObjectInputStream(new FileInputStream("c:/person.txt"))){
//			Person p=(Person)oos.readObject();
//			System.out.println(p.getName()+p.getAge());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	public static void write(Person p){
//		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c:/person.txt"))){
//			oos.writeObject(p);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	public static void main(String[] args) {
//		Person p=new Person("张三",20);
////		write(p);
//		read();
//		
//	}
//	
//}





