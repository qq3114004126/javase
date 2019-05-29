package day18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Day18_11 {

	public static void main(String[] args) {
		try(Writer w = new FileWriter("c:/haha.txt")){
			w.write("好好学习Java");
			w.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
