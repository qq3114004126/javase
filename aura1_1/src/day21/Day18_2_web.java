package day18;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/*
 * 第二十四章   网络编程
 * 一. 网络基础
 * 1. 计算机网络
 * 将地理位置不同的，具有独立功能的多台计算机和外部设备，通过通信线路连接起来，为了实现信息和资源的共享。
 * 如果没有计算机网络，只能通过硬件设备完成信息的共享。
 * 
 * 2. 通信协议
 * 七层结构：
 * 应用层
 * 表示层
 * 会话层
 * 传输层
 * 网络层
 * 数据链路层
 * 物理层
 * 
 * 计算机通信协议：
 * 就是网络中，计算机之间，计算机网络的结构之间传输数据的规范。
 * 
 * 网络协议涉及到三个要素：
 * 语义：用来解释哪一段是用来干什么的。要做什么
 * 语法：要怎么做
 * 时序：表示做的顺序。
 * 
 * HTTP:  超文本传输协议
 * IP  :  计算机地址    端口号每个程序都会占用的一个端口号
 * TCP ：传输控制协议  点对点的协议    
 * UDP ：数据报协议     无连接协议
 * FTP ：文件传输协议
 *
 * 3. url
 * URL  统一资源定位，是一个字符串序列，包含两个部分：
 * （1）协议标识符
 * （2）资源名称,可以分为  主机名称、端口号、文件名（路径），相关引用
 *    http://192.168.0.1:8080/studentManger/student/....html
 * 使用java解析url
 * URL类(包装器类很像啊，非可变类)   ，可以创建一个url对象 ， 需要解析那个url，则需要先使用URL类创建url对象。
 * 
 * 步骤：
 * 1. 使用URL创建url对象    URL url=new URL(网址)
 * 2. 通过url对象调取关于url的信息
 *     （1）getProtocol  获得协议
 *     (2) 主机和端口号
 *     (3) openStream   使用java ，访问url的获取源码
 *          返回的是字节流
 *     (4)访问图片
 *     
 * */
//public class Day18_2_web {
//   public static void main(String[] args) {
//	   URL url=null;
//	   try {
//		   url=new URL("https://www.baidu.com/?tn=62095104_14_oem_dg");
//	   }catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//	   
////		URL url=new URL("http://192.168.0.1:8080/studentManger/student");
////		System.out.println(url.getProtocol());
////		System.out.println(url.getHost());
////		System.out.println(url.getPort());
//		try(InputStream  in=url.openStream();){
//			//可以对字节流---字符流----包装成字符缓冲流
//			BufferedReader br=new BufferedReader(new InputStreamReader(in));
//			String s=null;
//			while((s=br.readLine())!=null){
//				System.out.println(s);
//			}
//		}  catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//   }
//}


//从百度中下载图片
//public class Day18_2_web {
//	   public static void main(String[] args) {
//		   URL url=null;
//		   try {
//			   url=new URL("https://www.baidu.com/img/bd_logo1.png?where=super");
//		   }catch (MalformedURLException e) {
//				e.printStackTrace();
//			}
//		   
//			try(InputStream  in=url.openStream();
//					OutputStream out=new FileOutputStream("c:/baidu.jpg")){
//				int data;
//				while((data=in.read())!=-1){
//					out.write(data);
//				}
//			}  catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	   }
//	}

//【介绍】 URLconnection类  会跟web网络之间相互操作。
//对于url获得 的响应内容封装
public class Day18_2_web {
	   public static void main(String[] args) throws IOException {
		   URL url=new URL("https://www.baidu.com/img/bd_logo1.png?where=super");
	       URLConnection con=url.openConnection();
	       con.getInputStream();//返回字节流  等价于直接使用  url.openstream()
	   }
   }







 /* 
 * 二、套接字编程
 * 1. TCP
 * 2. UDP
 */

