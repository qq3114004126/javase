package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Day14_5 {

	

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		SimpleDateFormat ss = new SimpleDateFormat("yyyy/MM/dd");
			Date start = ss.parse("1996/09/08");
			Date end = ss.parse("2019/4/17");
		double days = (end.getTime() - start.getTime())/(24*60*60*1000);
		 System.out.println("我来到这个世界上"+(int)days+"天了");
//		
	}

}
