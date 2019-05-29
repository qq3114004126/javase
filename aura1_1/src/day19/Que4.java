package day16.day15homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

/*
 * 4.复制文档：使用FileWriter类将一个Student.java文档复制到newstudent.txt文件中。
 */
public class Que4 {
 public static void main(String[] args) {
	 try(BufferedReader r=new BufferedReader(new FileReader("c:\\abc.java"));
			 PrintWriter bw=new PrintWriter(new FileWriter("c:/newabc1.txt"),true)){
		 String str;
		 while((str=r.readLine())!=null){
			 bw.println(str);//实际的执行效果跟write一样。但是构造器中设置了自动刷新缓存，可以达到刷新缓存的目的
		 }
	 } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

private static void method1() {
	try(BufferedReader r=new BufferedReader(new FileReader("c:\\abc.java"));
			 BufferedWriter bw=new BufferedWriter(new FileWriter("c:/newabc.txt"))){
		 String str;
		 while((str=r.readLine())!=null){
			 bw.write(str);
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
