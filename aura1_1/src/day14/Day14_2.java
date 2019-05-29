package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Day14_2 {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String a = sdf.format(date);
		//System.out.println(a);
		SimpleDateFormat sdf1= new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date b = sdf1.parse("2019/04/17");
			System.out.println(b);
		} catch (ParseException e) {
			System.out.println("格式错误");
			
		}
		Calendar cc = Calendar.getInstance();
		System.out.println(cc.get(Calendar.MONTH));
		System.out.println(cc.get(Calendar.DATE));
		System.out.println(cc.get(Calendar.YEAR));
		
		//三、Calendar 日历类
		//java.util下的类，
		//抽象类，不能够直接创建对象，提供了getInstance方法，来创建对象
		//public class Day11_1_API {
//			public static void main(String[] args) {
//				Calendar c=Calendar.getInstance();//默认是当前日志
//				System.out.println(c.get(Calendar.MONTH));//从0开始
//				System.out.println(c.get(Calendar.DATE));
//				System.out.println(c.get(Calendar.YEAR));
//				System.out.println(c.get(Calendar.HOUR));
//				System.out.println(c.get(Calendar.MINUTE));
//				System.out.println(c.get(Calendar.SECOND));
//				System.out.println(c.get(Calendar.MILLISECOND));
//				
				cc.set(2010, 4, 17, 14, 26);
	
				////				可以通过set方法设置年月日时分秒
////				c.set(2000, 3, 3, 12, 25, 35);
////				System.out.println(c.get(Calendar.MONTH));
//				
////				可以通过add方法跟其他日期进行加减
////				第一个参数指定年、月、日..（单位）
////				第二个参数指定要经历的时间（时间单位按照第一个参数） 正数，往后，负数，往前算
////				c.add(Calendar.YEAR, 10);//10年之后
//				c.add(Calendar.MONTH, -10);//10月之后
//				System.out.println(c.get(Calendar.YEAR));
//			}
		//}	
				ResourceBundle res=ResourceBundle.getBundle("info");
				
				System.out.println(res.getString("gender"+res.getString("name")));
				Locale local = new Locale("zh","CN");
				ResourceBundle res1=ResourceBundle.getBundle("day14/info",local);
				System.out.println(res1.getString("name"));
	}

}
