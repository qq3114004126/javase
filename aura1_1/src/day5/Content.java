package day5;
/*
 * 二、套接字编程
 * 网络是两个程序（客户端、服务端）互相建立沟通或者链接，
 * Socket  ServerSocket
 * 
 * 两个重要的通信协议：
 * TCP:一个点连接另外一个点，之间协议（确定的某个端口，到确定的另外一个端口）
 *   分为三次握手：
 *   客户端：我能连你吗？
 *   服务端：可以
 *   客户端：继续说话、发送信息。。。
 *   
 *   打电话：准确的、安全、可靠
 * 
 * UDP：不安全，不可靠无连接协议
 *    快
 *    即时消息
 *    统计丢包率
 *    
 *    
 *    
 *使用套接字，来对TCP进行套接字编程
 *（1）   先获得sockect对象（服务端、客户端）
 *（2）服务端：
 *       进行绑定：地址、端口号
 *       监听：使用是刚刚创建的socket
 *            返回：客户端的信息
 *                 新创建socket：真正要跟客户端，沟通的socket
 *       使用新socket进行接收客户端传递的消息  accept
 *       读、写
 *       关闭
 *       
 *（3）   客户端：
 *      connect连接 
 *      发送信息 （写）、接收消息
 *      关闭
 *      
 */
public class Content {
	
}
