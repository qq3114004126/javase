package day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Day18_10 {

	public static void main(String[] args) {
		try(Reader r = new FileReader("c:/Hello.java")){
			r.read();
			int c;
			while((c=r.read())!=-1){
				System.out.print((char)c+" ");
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