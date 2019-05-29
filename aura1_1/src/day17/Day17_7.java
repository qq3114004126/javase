package day17;

import java.util.PriorityQueue;
import java.util.Queue;

public class Day17_7 {

	public static void main(String[] args) {
		 Queue<Integer> q2=new PriorityQueue<>((a,b)->a-b);
		  q2.add(200);
		  q2.add(50);
		  q2.add(-50);
		  q2.add(80);
		  q2.add(80);
		  q2.add(80);
		  while(q2.size()>0){
			  System.out.println(q2.poll());//才可以按照顺序（比较器的顺序）进行输出
		  }

		  q2.forEach(System.out::println);

	}

}
