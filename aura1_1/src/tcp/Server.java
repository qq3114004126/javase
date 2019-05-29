package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//127.0.0.1 本地回环地址。---localhost
public class Server {
	public static void main(String[] args) {
		//如果是服务端，ServerSocket
		try {
			ServerSocket server=new ServerSocket(8000);//创建、绑定、监听
			
//			ServerSocket 和socket的区别：绑定当前的服务端、监听
//			接收：会新创建socket对象
			Socket socket=server.accept();
//			System.out.println(socket.getPort());
//			System.out.println(socket.getInetAddress());
			
//			new Receive(socket).start();
//			new Send(socket).start();
			//客户端发送数据，服务端接受 使用流操作  --- 读  ---- 输入流
			BufferedReader br = new BufferedReader
					(new InputStreamReader(socket.getInputStream()));
			String s=br.readLine();
			System.out.println(s);
			
			
			//服务端发送数据到客户端
			Scanner sc=new Scanner(System.in);
			PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
			pw.println(sc.nextLine());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//接受
//class Receive extends Thread{
//	private Socket socket;
//	
//	public void run(){
//		try {
//			BufferedReader br = new BufferedReader
//					(new InputStreamReader(socket.getInputStream()));
//			String s;
//			while((s=br.readLine())!=null&&!s.equals("exit"))
//				System.out.println(s);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public Socket getSocket() {
//		return socket;
//	}
//
//	public void setSocket(Socket socket) {
//		this.socket = socket;
//	}
//
//	public Receive(Socket socket) {
//		super();
//		this.socket = socket;
//	}
//}
////发送
//class Send extends Thread{
//	private Socket socket;
//	public void run(){
//		Scanner sc=new Scanner(System.in);
//		try {
//			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
//			while(true){
//				pw.println(sc.nextLine());
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public Socket getSocket() {
//		return socket;
//	}
//
//	public void setSocket(Socket socket) {
//		this.socket = socket;
//	}
//
//	public Send(Socket socket) {
//		super();
//		this.socket = socket;
//	}
//}


