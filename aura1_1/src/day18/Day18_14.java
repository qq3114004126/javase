package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Day18_14 {

	public static void main(String[] args) throws IOException {
		File f = new File("c:/abcd");
		System.out.println(f.createNewFile());
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.exists());
		System.out.println(f.canWrite());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		File f1 = new File("src/TXT");
		f1.mkdirs();
		f.delete();
		System.out.println(f.exists());
		System.out.println(f1.listFiles());
		File[] files = f1.listFiles();
		String path = "c:/a.txt";
		
			InputStream in = new FileInputStream(path);
//			int data;
//			while((data= in.read())!=-1) {
//				
//				System.out.print((char)data);
//			}
		byte[] b = new byte[10];
		int length;
		while((length=in.read(b))>0) {
			System.out.println(new String(b,0,length));
		}
		
		
	}

}
