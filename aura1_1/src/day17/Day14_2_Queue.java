package day14;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * （四）Queue队列
 * 第一个：Queue接口
 * java下的Queue接口，对应于数据结构中的：堆栈、队列
 * 实现类不同，接口不同
 * 
 * 使用实现类：LinkedList    PriorityQueue （非阻塞，没有容量）
 * 队列实现类不仅仅包含上面两种：阻塞、非阻塞
 * LinkedList : 先进先出   ---队列
 * PriorityQueue：优先队列---可以实现堆栈的效果 ，甚至高于堆栈的效果
 */
public class Day14_2_Queue {
  public static void main(String[] args) {
//	1. 创建
//	  Queue<Integer> q1=new LinkedList<>();//LinkedList  1.2
//	  Queue<Integer> q2=new PriorityQueue<>();//PriorityQueue1.5 
//	  Queue<Integer> q3=new ArrayBlockingQueue<>(5);
	  
	  
//	2.相关方法
//	  （1）add 添加元素。如果成功添加则返回true，否则，添加失败会报错。
////	  q1.add(1);
//	  q2.add(1);
////	    offer 跟add一样，不同就是如果添加失败返回false
//	  q2.offer(2);
//	  q2.offer(3);
//	  q2.offer(4);
//	  q2.add(null); 
//	  q1.add(null);  null对于队列来说，不允许放入null的元素。
	  
//	  （2）remove 删除队列头部元素，如果删除失败，报错
//	  q2.remove();
//	  System.out.println(q2.poll()) ;//实现了删除的功能，但是如果删除失败，会返回null
	  
//	  (3)element() 返回队列头部的元素  如果失败则抛异常
//	     peek() 失败反会null
//	  System.out.println(q2.element());
//	  
//	  while(q2.size()>0){
//			 System.out.println(q2.poll());
//	  }
//	  System.out.println(q2.poll());
	  
	  
//	 3.优先队列自定义排序
//	  构造器下实现比较器
	  Queue<Integer> q2=new PriorityQueue<>((a,b)->b-a);
	  q2.add(200);
	  q2.add(50);
	  q2.add(-50);
	  q2.add(80);
	  while(q2.size()>0){
		  System.out.println(q2.poll());//才可以按照顺序（比较器的顺序）进行输出
	  }

	  q2.forEach(System.out::println);//不能够输出达到排序的效果
	  
//  第二个：Deque接口：双端队列
//	  可以实现队列的效果，也可以实现堆栈的效果。
//	 实现类也可以使用LinkedList
//	  Deque<Integer> q=new LinkedList<>();
//	  q.addLast(1);
//	  q.addFirst(100);
	  
//	  Deque可以实现堆栈的功能。单独实现了对于堆栈的方法
//	  q.push(200);
//	  q.pop();  //q.remove();
	  
//	  [实现类]LinkedList 、ArrayDeque
//	                 双向链表                        数组实现
	  
	  
	  

	  
	  
	  
	  
	  
	  
}
}
