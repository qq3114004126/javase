package day15;

import java.util.ArrayList;
import java.util.List;

public class Day15_7 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("张三",23);
		list.add("李四");
		list.add("王五");
		list.add("one");
		list.add("two");
		list.add(Integer.valueOf(3));
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
//		  String s1=(String)list.get(0);
//		  String s2=(String)list.get(1);
//		  String s3=String.valueOf(list.get(2));
	}

}
