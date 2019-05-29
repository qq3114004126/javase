package day18;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

public class Day18_12 {

	public static void main(String[] args) {
		String path = "c:/student.java";
			try(InputStream in = new FileInputStream(path)){
				Writer w = new FileWriter("c:/newstudent.txt");
				int data;
				while((data=in.read())!=-1) {
					System.out.print((char)data);
					w.write(data);
					w.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
