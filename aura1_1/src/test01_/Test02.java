package test01_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(8000);
			Socket socket = server.accept();
			new Receive(socket).start();
			new Send(socket).start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
class Receive extends Thread{
	private Socket socket;

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public Receive(Socket socket) {
		super();
		this.socket = socket;
	}
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String s;
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
class Send extends Thread{
	private Socket socket;
	
	public Send(Socket socket) {
		super();
		this.socket = socket;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			PrintWriter pp = new PrintWriter(socket.getOutputStream(),true);
			while(true) {
				pp.println(sc.next());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}