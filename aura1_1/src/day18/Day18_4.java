package day18;

import java.io.File;
import java.io.IOException;

public class Day18_4 {

	public static void main(String[] args) {
		File f = new File("c:/1234.txt");//不是在硬盘上创建了文件，而是文件对象
		try {
			boolean tag = f.createNewFile();
			System.out.println(tag);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
