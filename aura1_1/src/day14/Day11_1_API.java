package day14;
import java.util.Locale;
import java.util.ResourceBundle;

/*
 * 二、【Date类】
 * java.util包下。
 * 下面的很多方法都已经不被使用。
 */
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class Day11_1_API {
//	public static void main(String[] args) {
////		1.时间
//		Date date = new Date();
//		System.out.println(date);
////		System.out.println(new Date(毫秒数));linux产生时间，计算从1970年1月1日走过的对应的毫秒数后的时间。
//		System.out.println(new Date(1000));//返回值按照贝尔蒂时间计算。
////		getTime返回1970年1.1，0点到该date对象所走过的毫秒数。
//		System.out.println(date.getTime());//1555468225654
//		
////		2.日期类型的格式化。
////		需要通过SimpleDateFormat格式化日期，将时间date类型转换成指定的字符串类型。
////		格式模板：年yyyy   月 MM   日 dd  时（24）HH   分钟mm   秒ss
////		例如：yyyy-MM-dd HH:mm:ss
//		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String a = sdf.format(date);
//		System.out.println(a);
////		2019-02-05   字符串换成date.parse()；
//		SimpleDateFormat sdf1= new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			Date b = sdf1.parse("2019-04-17");
//			System.out.println(b);//Wed Apr 17 00:00:00 CST 2019
//		} catch (ParseException e) {
//			System.out.println("格式错误");
//		}
//	}
//}

//三、Calendar 日历类
//java.util下的类，
//抽象类，不能够直接创建对象，提供了getInstance方法，来创建对象
//public class Day11_1_API {
//	public static void main(String[] args) {
//		Calendar c=Calendar.getInstance();//默认是当前日志
//		System.out.println(c.get(Calendar.MONTH));//从0开始
//		System.out.println(c.get(Calendar.DATE));
//		System.out.println(c.get(Calendar.YEAR));
//		System.out.println(c.get(Calendar.HOUR));
//		System.out.println(c.get(Calendar.MINUTE));
//		System.out.println(c.get(Calendar.SECOND));
//		System.out.println(c.get(Calendar.MILLISECOND));
//		
////		可以通过set方法设置年月日时分秒
////		c.set(2000, 3, 3, 12, 25, 35);
////		System.out.println(c.get(Calendar.MONTH));
//		
////		可以通过add方法跟其他日期进行加减
////		第一个参数指定年、月、日..（单位）
////		第二个参数指定要经历的时间（时间单位按照第一个参数） 正数，往后，负数，往前算
////		c.add(Calendar.YEAR, 10);//10年之后
//		c.add(Calendar.MONTH, -10);//10月之后
//		System.out.println(c.get(Calendar.YEAR));
//	}
//}


//四、Random
//随机类，提供很多随机的方法
//public class Day11_1_API {
//	public static void main(String[] args) {
//		Random r=new Random();
////		(1) 返回随机数
//		System.out.println(r.nextInt());  //返回int整数类型
////		（2）返回某个区间的随机数
//		System.out.println(r.nextInt(100));//返回从0到指定参数-1的之间随机数
////		几乎所有的数据类型都支持nextX随机
//		
//		System.out.println(r.nextFloat());// 返回0到1.0之间浮点数float
//		System.out.println(r.nextDouble());// 返回0到1.0之间浮点数double
//	}
//}

//五、Scanner
//扫描键盘输入
//hasnext()  判断是否还有下个元素，如果没有，则会阻塞
//next()   取出输入的下一个元素，就可以赋予给String类型引用
//next()的使用，如果输入的元素之间有空格，会按照“两个”元素，如果有多个元素拆开输入
//public class Day11_1_API {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		while (sc.hasNext()){
//			String name=sc.next();
//			System.out.println(name);
//			if (name.equals("exit"))
//				break;
////				System.exit(0);//退出虚拟机
//		}
//		sc.close();
//	}
//}


//六、大整数类
//8种基本数据类型  long
//java中提供了java.math.BigInteger 可以对任意大小的整数进行操作。
//运算是通过方法，不是通过运算符
//public class Day11_1_API {
//	public static void main(String[] args) {
//		BigInteger bi1=new BigInteger("555555555555555555555555555555555555555555555555");
//		BigInteger bi2=new BigInteger("555555555555555555555555555555555555555555555555");
//	    System.out.println(bi1.add(bi2));
////	    add 相加
////	    substract 减
////	    multiply
////	    divide
////	    bi1.mod  余数
////	    返回值都还是BigInteger
//	}
//}

//七、国际化
//背景 当程序中需要使用不同的语言来存储“汉字、英语”信息，可以通过国际化进行编码的统一。防止乱码。
//需要使用的到类：
//（1）java.util.Locale :封装了特定国家的语言环境   CN---zh   US-en  国际-语言
//（2）java.util.ResourceBundle：用来加载一个国家语言的资源
//【资源】 properties文件存储，需要显示的“英文、中文”

//具体实现
//（1）产生一个资源文件  ：
//两类：默认的资源文件    文件名.properties  当没有指定locale就会去加载这个文件
//指定语言的资源文件：  文件名_zh_CN.properties   文件名_en_US.properties 
//name="姓名"（可以使用unicode编码）
//age="年龄"
//place="地点"

//(2) 通过上面java.util.Locale来确定运行环境。默认的是使用：文件名.properties文件
//构造器new Locale(语言,国际)，
//new Locale("zh","CN")

//(3)通过ResourceBundle调取资源文件中的内容，内容等号左侧的内容。
//   程序就显示=右侧的信息

public class Day11_1_API {
	public static void main(String[] args) {
//	  如果调用的时候，没有指定	Locale，则会使用默认的properties
		ResourceBundle res=ResourceBundle.getBundle("day11/info");
		System.out.println(res.getString("name")+res.getString("gender"));
		
//		加载指定语言环境文件
		Locale local=new Locale("en","US");
		ResourceBundle res1=ResourceBundle.getBundle("day11/info",local);
		System.out.println(res1.getString("name")+res1.getString("gender"));
	}
}









