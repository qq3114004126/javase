package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day14_9 {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat ss = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("请输入出生年月日");
		 String time = sc.next();
		// Date b = ss.parse(time);
		 long t0 = ss.parse(time).getTime();
		 long day = (long)(date.getTime()-t0)/(24*60*60*1000)/365;
		 
		 System.out.println(day+"年");
		
	}

}
