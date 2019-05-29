package day13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Day13_15 {

	public static void main(String[] args) {
		String s = "abc";
		int num =Math.abs(Byte.MIN_VALUE);//128
		System.out.println();
		Date date = new Date();
		System.out.println(new Date(1000));
		date.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//sdf.parse(source);
		Calendar c = Calendar.getInstance();
		c.get(Calendar.MINUTE);
		c.set(2000,2, 21, 12,21);
		System.out.println(c.get(Calendar.MINUTE));
																																																																																																																																																									c.add(Calendar.YEAR, 10);
		System.out.println(c.get(Calendar.YEAR));
	}

}
