package day18;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Day18_13 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter bw = new PrintWriter("c:/a.txt");
        bw.write("我爱学习");
        bw.flush();
	}

}
