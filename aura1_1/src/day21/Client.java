package day21;

import java.io.IOException;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try {
			//可以通过connecttion
			Socket socket = new Socket("127.0.0.1",8000);
			//输出流
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			pw.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
