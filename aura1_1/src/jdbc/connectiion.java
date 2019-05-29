package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class connectiion {
/**
 * 1.加载驱动
 * 2.创建Connection对象
 * 3.创建执行SQL 语句对象 statement
 * 4.处理返回结果
 * 5.释放资源
 * 
 * 
 * @param args
 * @throws ClassNotFoundException 
 * @throws SQLException 
 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection connection;
		
		
		Class.forName("com.mysql.jdbc.Driver");
		//2创建连接
		//com.mysql.jdbc.Driver
	    connection = DriverManager.getConnection("jdbc:mysql:///db1903", "root", "root");
		System.out.println(connection);
		String sql = "select * from students";
     	Statement stat = connection.createStatement();
     	//stat.executeUpdate(sql);
     	ResultSet rs = stat.executeQuery(sql);
     	while(rs.next()) {//hasnext
     		//rs.getString(columnIndex)
     		//rs.getInt(columnIndex)
     		//rs.getObject(columnIndex)
     		String sid = rs.getString("sid");
     		String sname = rs.getString("sname");
     		
     		System.out.println("sid:"+sid+"sname"+sname);
     		
     		
     	}
     	
     	rs.close();
     	stat.close();
     	connection.close();
	}

}
