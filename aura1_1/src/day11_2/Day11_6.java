package day11_2;

import java.util.Date;

public class Day11_6 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Date date = new Date();
//		String year = String.format("%tY", date);
//		String month =  String.format("%tB", date);
//		String day = String.format("%td", date);
//		String days = String.format("%tj", date);
//		String dayss = String.format("%tA", date);
//		String time = String.format("%tI", date);
//		String timesecond = String.format("%tQ", date);
//	
//		System.out.println(year);
//		System.out.println(month);
//		System.out.println(day);
//		System.out.println(days);
//		System.out.println(dayss);
//		System.out.println(time);
//		System.out.println(timesecond);
//	}
//	public static void main(String[] args) {
//		Date date = new Date();
//		String hour=String.format("%tH", date);
//		String minute = String.format("%tM", date);
//		String second = String.format("%tS", date);
//		System.out.println("现在是："+hour+"时"+minute+"分"+second+"秒");
//	}
	public static void main(String[] args) {
		Date date = new Date();
		String time = String.format("%tR",date);
		System.out.println(time);
	}
}
