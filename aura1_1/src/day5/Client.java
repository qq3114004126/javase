package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) {
	  	try {
//	  		可以通过connection方法进行连接，也可以通过构造器进行连接
//	  		只要有ip和端口号（服务端），就可以进行连接：客户端跟服务端的第一次握手
			Socket socket =new Socket("127.0.0.1",8000);
			
			new Send(socket).start();
			new Receive(socket).start();
//			
//			//客户端想服务端发送消息---通过流---使用写，输出流
//			PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
//			Scanner sc=new Scanner(System.in);
//			pw.println(sc.nextLine());
//			
//			//客户端接受数据（服务端发送过来的数据）
//			BufferedReader br=new BufferedReader
//					(new InputStreamReader(socket.getInputStream()));
//			String s=br.readLine();
//			System.out.println(s);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	
	  	
  }
}
//接受
class Receive extends Thread{
	private Socket socket;
	
	public void run(){
		try {
			BufferedReader br = new BufferedReader
					(new InputStreamReader(socket.getInputStream()));
			String s;
			while((s=br.readLine())!=null&&!s.equals("exit"))
				System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

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
}
//发送
class Send extends Thread{
	private Socket socket;
	public void run(){
		Scanner sc=new Scanner(System.in);
		try {
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			while(true){
				pw.println(sc.nextLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public Send(Socket socket) {
		super();
		this.socket = socket;
	}
}
