package day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

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
 */
//一、File类
//对于文件对象的操作
//1.构造器
// File(String path)
// File(String path,String name)
//路径：绝对路径和相对路径
//编程语言中，路径中的分隔符使用\\或者/

//2. 文件对象下的相关方法
//public class Day15_4_InputOutPut {
//  public static void main(String[] args) {
//	  File f=new File("c:/1234.txt"); //不是在硬盘上创建了文件。只不过是在内存中，创建了文件对象。
////  （1）creatNewFile()
////	  如果成功创建，则返回true，否则，如果文件已存在，则返回false
////	  try {
//////		boolean tag=f.createNewFile();
//////		System.out.println(tag);
////		
////	} catch (IOException e) {
////		// TODO Auto-generated catch block
////		e.printStackTrace();
////	}
//	  
////	  （2）getName() 获得文件名
////	     getPath() 获得文件路径
//	  System.out.println(f.getName());
//	  System.out.println(f.getPath());
//	  
////	  (3)exists 判断路径是否存在  在硬盘中是否已存在
//	  System.out.println(f.exists());
//	  
////	  (4)文件的可读可写  
////	  canread   canwrite
//	  System.out.println(f.canRead());
//	  System.out.println(f.canWrite());
//	  
////	  （5）判断f是文件还是文件夹
////	  isFile   isDirectory
//	  System.out.println(f.isFile());
//	  System.out.println(f.isDirectory());
//	  
////	  (6)根据当前对象生成一个对象，对象符合参数的路径，
////	  mkdir要求父路径必须存在
////	  mkdirs 连同父路径一起创建
////	  File f2=new File("c:/111/12345");
//////	  f2.mkdir();
////	  f2.mkdirs();
//	  
////	  （7）删除一个文件
////	  f.delete();
//	  
////	  (8)list 返回所目录下文件和子路径，返回了字符串的数组
//	  try {
//		f.createNewFile();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	  File f2=new File("c:/111/12345");
//	  f2.mkdirs();
//	  String [] files=f2.list();
//	  System.out.println( Arrays.toString(files));
//	  
////	  (9)listFile()  返回文件类型的数组
//	  File[] fs=f2.listFiles();
//	  for (File file : fs) {
//		System.out.println("名称："+file.getName());
//	}
//  
//  }
//}


//二、字节流
//流：理解成水流  将每个元素（字节、字符）理解成一滴一滴的水。
//流的操作：输入、输出
// 参照物是内存：
// 把数据读到内存中， 输入  read操作                            读----入
// 把数据从内存中写到外部设备  ，输出 ，write    写----出

//字节流：用来处理【字节】的输入和输出。 
//InputStream（读）      OutputStream（写）  ———抽象类
//创建对象的时候，使用子类，FileInputStream    FileOutputStream

//public class Day15_4_InputOutPut {
//	public static void main(String[] args) {
////		InputStream
////		OutputStream
//		
////		1.InputStream ----FileInputStream 
////		FileInputStream:构造器有两个
////		  FileInputStream(String path)
////		  FileInputStream(File file)
//		 
//		String path="c:/1234.txt"; //读 相当于将 外部文件，读取到内存中 in对象中
////		String path="src/day15/test.txt"; //读取相对路径的文件   路径起始点 从当前项目下。
//		
////		String path="resource/a.properties"; //读取相对路径的文件   路径起始点 从当前项目下。
//		InputStream in=null;
//		try {
//			in= new FileInputStream(path);
//			
////      2.read() 读取一个字节，返回所读取的字节	，如果读取完毕会返回-1
////			int data;
////			while((data=in.read())!=-1){
////				System.out.println((char)data);
////			}
////      3.read(byte[] b) 读取b.length个字节到数组b中，并且返回读入字节的长度
////			将byte[] 转换成String   String构造器
////			String 构造器指定长度 String(byte[],0,end)
//			byte[] b=new byte[10];
//			int length;
//			while ((length=in.read(b))>0){
//				System.out.print(new String(b,0,length));
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
////		4.关闭流
//		try {
//			in.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
////		try()中加with rescourse语法（专门用来处理资源文件。）
////		功能：在调用完资源之后，可以自动的进行流对象的关闭 。
////		使用规则则 ：资源对象（流）必须实现Closeable，可以在try完毕之后，自动执行close方法
//
//	}
//}


public class Day15_4_InputOutPut {
	public static void main(String[] args) {
		String path="c:/1234.txt";
		try(InputStream in=new FileInputStream(path)){
			int data;
			while((data=in.read())!=-1){
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}








