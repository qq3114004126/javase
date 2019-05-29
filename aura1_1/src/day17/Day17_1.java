package day17;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Day17_1 {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		for(int i = 0;i<10;i++) {
			list.add(i);
		}
		//1.addAll(int index,其他集合);
		//
//		List<Integer>list2 = new ArrayList<>();
//		list2.add(100);
//		list.addAll(list2);
//		list.forEach(System.out::println);
//		list.remove(10);
//		list.forEach(System.out::println);
//		list.set(5, 100);
//		list.replaceAll((t)->(t+100));
//		list.forEach(System.out::println);
		//indexof 返回参数在集合中第一次出现的位置
		//返回在集合中最后一次出现的位置 lastindexof;
		//9.list.sort(null)//按照自然排序
//		list.sort((t1,t2)->(t2-t1));//从大到小排序
//		list.subList(2, 6);//包含开头不包含结束,取子集
		//toArray将集合转换2成数组
//		ListIterator<Integer> li = list.listIterator();
		//可以指定参数位置
//		System.out.println(li.previous());
		//获得上一个元素的位置的时候指针不动,获得下一个元素的时候指针会动
		//
		List<Integer> lista = new LinkedList<>();
		for(int i = 10;i<20;i++) {
			lista.add(i);
		}
		//System.out.println(lista.get(4));
		lista.add(4, 100);
		lista.forEach(System.out::println);
		
		//System.out.println(lista.indexOf(19));
		lista.set(5, 1000);
		lista.sort(null);
		
		lista.forEach(System.out::println);
		Queue<Integer>q2 = new LinkedList();//可以放入null
		Queue<Integer>q1 = new PriorityQueue<>();//不可以放入null
		Queue<Integer>q3 = new ArrayBlockingQueue<>(5);
		q3.add(1);
		q3.offer(2);
		q3.offer(null);
		Queue<Integer>q = new PriorityQueue<>();
		q.add(-12);
		q.add(50);
		q.add(20);
		q.add(40);
		while(q2.size()>0) {
			System.out.println(q.poll());
			
			q.forEach(System.out::println);//不能够输出达到排序的效果
		}
		Deque <Integer> b = new LinkedList<>();
	}
	

}
