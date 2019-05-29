package day18;

import java.io.File;
import java.io.IOException;

public class Day18_6 {

	public static void main(String[] args) {
		File f = new File("c:/111/12345");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
