package day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Day21_3 {

	
	/**
	 * 使用套接字，来对TCP进行套接字编程
	 * （1）先获得socket对象
	 * （2）服务端
	 * 		进行绑定，地址，端口号
	 * 		使用刚刚创建的SOCKET
	 * 		返回客户端的信息
	 * 		新创建socket
	 * 		接受
	 * 		读写
	 * 客户端
	 * 		connect连接
	 * 		发送信息（写）
	 * 		输出流，接收消息	
	 */

	}


class Server{
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			Socket socket = server.accept();
			
			
			//读操作
			BufferedReader br = new BufferedReader(socket.)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	//127.0.0.1本地回环地址
	//如果是服务端使用seversocket



