package day16.day15homework;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * 3.使用FileWriter   将 字符串“好好学习Java”写入 写数据到  haha.txt 中。
 * 读： 入  向内存中读
 * 写： 出  从内存中拿出，向硬盘中写
 */
public class Que3 {
  public static void main(String[] args)   {
	try(Writer w=new FileWriter("c:/haha.txt",true)){
//		w.write("好好学习Java");
		char[] a="好好学习Java".toCharArray();
		w.write(a,0,a.length);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
