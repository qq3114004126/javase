package test01_;

import java.io.IOException;
import java.net.Socket;

public class Test3 {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("127.0.0.1",8000);
			new Send(socket).start();
			new Receive(socket).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
