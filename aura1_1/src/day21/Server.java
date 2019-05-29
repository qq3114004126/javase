package day21;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*使用Socket创建对象，对象和对象之间的连接
 * DatagramSocket
 * 服务端：没有监听
 * 客户端：不需要连接，但是仍然需要服务端的地址
 * 数据使用字节的数组进行发送
 * */
public class Server {
   public static void main(String[] args) {
	 try {
		byte []b=new byte[50];
		DatagramSocket ds=new DatagramSocket(8001);
//		数据报协议 接受客户端发送过来的数据报
		DatagramPacket dp=new DatagramPacket(b,b.length);
		
//		使用ds下的receive方法进行接收数据报
		ds.receive(dp);//阻塞方法
//		获得接收到的的数据
		System.out.println(dp.getData());
		
	} catch (SocketException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
