package day16.day15homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * 2.使用FileReader类，读取一个Hello.java文档，并将文档内容在控制台上打印输出。
// 字符流
 */
public class Que2 {
	public static void main(String[] args) {
		try(Reader r=new FileReader("c:\\abc.java")){
			int t;
			while((t=r.read())!=-1){
				System.out.print((char)t);
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
