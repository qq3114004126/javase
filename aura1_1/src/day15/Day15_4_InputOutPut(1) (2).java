package day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

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

//(一)输入流：将文件读取到内存中（输入流对象in中）
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
//		    String path="c:/1234.txt"; //读 相当于将 外部文件，读取到内存中 in对象中
////		String path="src/day15/test.txt"; //读取相对路径的文件   路径起始点 从当前项目下。
//		
////		String path="resource/a.properties"; //读取相对路径的文件   路径起始点 从当前项目下。
//		    InputStream in=null;
//		    try {
//			    in= new FileInputStream(path);
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

//public class Day15_4_InputOutPut {
//	public static void main(String[] args) {
//		String path="c:/1234.txt";
//		try(InputStream in=new FileInputStream(path)){
//			int data;
//			while((data=in.read())!=-1){
//				System.out.print((char)data);
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}

//(二)输出流：将内存对象中的数据写出到硬盘上（文件）
//OutputStream-----FileOutputStream
//append参数是指定是否进行覆盖、追加
//默认值append=false 覆盖
//public class Day15_4_InputOutPut {
//	public static void main(String[] args) {
//		try(OutputStream out=new FileOutputStream("c:/abc.txt")){
////			1. write(int b)  一次写入一个字节
////			out.write(65);
//			
////			2.write(byte[]) 一次写入一个byte数组
//			out.write("ABCD".getBytes());
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}

//复制文件
//public class Day15_4_InputOutPut {
//	public static void main(String[] args) {
//		try(InputStream in=new FileInputStream("c:/abc.txt");
//			OutputStream out =new FileOutputStream("c:/abc_copy.txt")){
//			int data;
//			while((data=in.read())!=-1){
//				out.write(data);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}

//注意：字节流可以处理字符流。

//三、字符流
//【背景】为了使用方便，可以取出整个字符（字节流取出的内容可能将字符中的编码拆开），增加缓存流。
//字符流主要用来操作文本（txt ...）
//【抽象类】
//输入 Reader 
//输出 Writer

//【子类】
//FileReader  Reader子类
//FileWriter  Writer子类

//(一)字符输入流FileReader  Reader子类
//public class Day15_4_InputOutPut {
//	public static void main(String[] args) {
//		try(Reader r=new FileReader("c:/abc.java")){
////			1. read() 一次读取一个字符
////			int c;
////			while((c=r.read())!=-1)
////				System.out.print((char)c);
//			
////			2.read(char[] cbuf) 一次读取cbuf长的字符，返回char数组的长度
//			char []data=new char[10];
//			int length;
////			while((length=r.read(data))!=-1){
////				for (int i = 0; i < length; i++) {
////					System.out.print(data[i]);
////				}
////			}
////			为什么不用增强for循环？因为不是每次一定都会读出个字符，最后一次可能不够10个字符
////			会将上一次读取的数据重复显示
//			while((length=r.read(data))!=-1){
//				for (char c : data) {
//					System.out.print(c);
//				}
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}

//(二)输出流
//将内存中的对象内容，写硬盘中的文件
//Writer------FileWriter
//flush：清缓存：将缓存中的数据提交到文件中。
//close方法在关闭资源的时候，会自动调用flush
//public class Day15_4_InputOutPut {
//	public static void main(String[] args) {
//		try(Writer w=new FileWriter("c:/def.txt")){
////			1.write(String str) 一次写入一个字符串
//			w.write("我爱中国abc");
//			
////			2.write(char[] )将内容写入到数组中。
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}


//没有进行flush操作
//public class Day15_4_InputOutPut {
//	public static void main(String[] args) {
//		try{
//			Writer w=new FileWriter("c:/def1.txt");
////			1.write(String str) 一次写入一个字符串
//			w.write("我爱中国abc");
////			w.flush();如果注释掉 ，写的内容就会被提交到缓存中，但是没有真正的被写到硬盘文件中。
//			
////			2.write(char[] )将内容写入到数组中。
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}

//四、缓冲流（缓存流）
//字符流中：做了缓存处理（缓存比较小）
//缓冲流比较大。
//【作用】：加入读、写的效率
//【分类】 缓存输入流、缓存输出流————————对于字符流操作。
//（一）缓存输入流 ： BufferedReader
//（二）缓存输出流:BufferedWriter\PrintWriter

//（一）缓存输入流 ： BufferedReader
//使用方法：创建对象，在构造器中加入原本的  输入字符流
//（二）缓存输出流:BufferedWriter\PrintWriter
//使用方法：创建对象，在构造器中加入原本的  输出字符流
//public class Day15_4_InputOutPut {
//	public static void main(String[] args) throws IOException {
//		Reader r=new FileReader("c:/abc.java");
//		BufferedReader br=new BufferedReader(r);
//		BufferedWriter bw=new BufferedWriter(new FileWriter("c:/ghi.txt"));
//		
////		从缓存流中读取
//		String line;
//		while((line=br.readLine())!=null){
//			bw.write(line);
//		}
//		bw.close();
//	}
//}

//除了BufferedWriter 以外，还可以使用PrintWriter
//好处：
//（1）不用层层包括 ，PrintWriter的构造器中直接可以加入操作文件的路径
//（2）内部进行了异常处理。
//public class Day15_4_InputOutPut {
//	public static void main(String[] args) throws IOException {
//		Reader r=new FileReader("c:/abc.java");
//		BufferedReader br=new BufferedReader(r);
//		PrintWriter bw=new PrintWriter("c:/ghi1.txt");
//		
////		从缓存流中读取
//		String line;
//		while((line=br.readLine())!=null){
//			bw.write(line);
//		}
//		bw.close();
//	}
//}


//五、转换流
//【背景】
//字节没有缓存机制
//字符流和缓冲流有缓存机制
//如果希望对字节流也能够进行缓存。 必须将字节流处理成字符流，然后再将字符流处理成缓冲流。
//【实现的目的】 字节流--->字符流
//输入字节流--->输入字符流  InputSteamReader
//输出字节流--->输出字符流  OutputStreamWriter
//使用方法：直接转换流的构造器，构造器中 参数就是字节流。
public class Day15_4_InputOutPut {
	public void transfer(InputStream in,OutputStream out){
//		将字节流----字符流----缓冲流
		Reader r=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(r);
		
		Writer w=new OutputStreamWriter(out);
		BufferedWriter bw=new BufferedWriter(w);
		
//		PrintWriter 自动将字节流转换成字符流。  缓冲流
		PrintWriter pw=new PrintWriter(out);
		
	}
	public static void main(String[] args) throws IOException {
		}
	}




























