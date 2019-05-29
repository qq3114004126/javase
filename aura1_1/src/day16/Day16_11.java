package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Day16_11 {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		for(int i = 0;i<6;i++) {
			c.add(i+1);
		}
		
		Iterator<Integer> ite = c.iterator();
		while(ite.hasNext()) {
			Integer s = ite.next();
			System.out.print(s+" ");
		}
		//（1）使用iterator接口。（原始方法）
		//next获得下一个元素
		//hasnext 用来 判断是否还有下一个元素
		//remove  删除最后一个next元素：
		
//		for(int i = 1;i<6;i++) {
//			c.iterator();
//			System.out.println(ite.next());
//		}
	
	
		
	}

}
