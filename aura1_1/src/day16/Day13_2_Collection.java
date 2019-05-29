package day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/*
 * 二、集合
 * 【集合】：容器类，集合也可以看成一个容器，能够容纳多个元素的容器。
 * 数组的最大缺点：声明之后，长度不能再修改，同时，对于数组 操作也很麻烦。
 * Collection接口
 * 所有集合类的根接口：最直接的子接口Set   List
 * Map是独立出来的接口：键值对的形式存储数据
 * 
 * （一）collection接口
 * 不能实例化对象。选择ArrayList作为实现类，来创建对象
 * 接口引用  c=new ArrayList();
 * c.add(); AarryList下实现的方法
 * 
 * 1. 集合下的相关方法
 */
//public class Day13_2_Collection {
//  public static void main(String[] args) {
//	  Collection<Integer> c=new ArrayList<Integer>();
//	  Collection<Integer> c2=new ArrayList<Integer>();
//	  添加相关
//	  (1)add  向集合中添加元素，如果添加成功会返回true，否则返回false
//	  当实现类是Set的实现类的时候，如果有重复元素，则不能添加成功
//	  System.out.println(c.add(11));
	  
//	  (2)addAll(集合类型的对象) 将参数指定的所有元素都加入到当前集合
//	  返回值：当前集合发生变化的时候，就会返回true，否则则返回false（如果一个都加不进去才会false）
//	  c2.add(22);
//	  c.addAll(c2);
//	  for (Integer integer : c) {
//		System.out.println(integer);
//	  }
	  
//	  跟集合大小
//	  (3)size 返回集合中元素的个数
//	  判断一个集合类型是不是空(没有元素)的，尽量不要用对象!=null
//	 public List a(){ return list.getSize()>0?list:null;}
//	  其他调用a的人  List b=a();  if(b=null)
//	  System.out.println(c==null);
	  
//	  (4)isEmpty判断集合是否为空
//	  System.out.println(c.isEmpty());
	  
	  
//	  (5)判断集合是否包含某一个对象
//	  c.add(10);
//	  System.out.println(c.contains(10));
	  
//	  (6)c.containsAll(另外一个集合)  判断c中是否包含另外一个集合中的所有元素
//	  c2.add(10);
//	  c.add(10);
//	  c.add(11);
//	  System.out.println(c.containsAll(c2));

//	  跟删除相关
//	  (7)remove（Object o）删除集合中的某个元素
//	  当删除不成功（没有这个元素），会返回false，成功则返回true
//	  c.add(10);
//	  c.add(11);
//	  System.out.println(c.remove(12));
//	  for (Integer integer : c) {
//			System.out.println(integer);
//	  }
	  
//	  (8)removeAll(另外一个集合) 删除集合中，另外一个集合的所有元素（删除交集）
//	  如果当前集合发生变化，返回true，如果一个元素都没删除，则返回false
//	  c2.add(10);
//	  c.add(11);
//	  c.addAll(c2);
//	  c.removeAll(c2);
//	  for (Integer integer : c) {
//			System.out.println(integer);
//	  }

//	  （9）c.removeIf(filter)  Predicate中test方法：按照实现类的规则进行筛选数据。
//	  for (int i = 0; i < 10; i++) {
//		c.add(i);
//	  }
//	  c.removeIf((Integer t)->t>5);
//	  for (Integer integer : c) {
//		System.out.println(integer);
//	  }
	  
	  
//	  (10)retainall(集合类型)：将参数集合中存在于当前集合的元素保留下来（保留下交集）
//	  for (int i = 0; i < 10; i++) {
//		c.add(i);
//	  }
//	  for (int i = 0; i < 9; i++) {
//		c2.add(i);
//	  }
//	  c.retainAll(c2);
//	  for (Integer integer : c) {
//		System.out.println(integer);
//	  }
//	  c.forEach(System.out::println);
	  
	  
//	  (11)clear清空给所有元素
//	  c.add(11);
//	  c.clear();
//	  System.out.println(c.isEmpty());
	  
//	  (12)toArray  能将集合对象转换成数组
//	  for (int i = 0; i < 10; i++) {
//		c.add(i);
//	  }
//	  Object[] i= c.toArray();
//	  System.out.println(Arrays.toString(i));
	  
	  
//	  (13) c.toArray(数组)    将c的集合中的元素，装入到参数的数组中。
//	  Integer[] array=new Integer[c.size()];
//	  c.toArray(array);
//	  System.out.println(Arrays.toString(array));
//  	}
//}

//2.集合的遍历
//（1）使用iterator接口。（原始方法）
//（2）使用iterator接口。（1.8之后新增的方法）
//（3）增强for循环
//（4）forEach方法
//（5）使用聚合操作 

//（1）使用iterator接口。（原始方法）
//next获得下一个元素
//hasnext 用来 判断是否还有下一个元素
//remove  删除最后一个next元素：

//public class Day13_2_Collection {
//	public static void main(String[] args) {
//	    Collection<Integer> c=new ArrayList<Integer>();
//	    c.add(10);
//	    c.add(11);
//	    c.add(12);
//	    Iterator<Integer> it=c.iterator();//获得集合下的迭代器（迭代器是集合根本）
//	    迭代器中 会存储集合中的元素 ，如果迭代器中的元素全部被访问完毕，再继续调用next会报错
//	    可以看成迭代器是一次性。
	    
//	    System.out.println(it.next());
//	    System.out.println(it.next());
//	    System.out.println(it.next());
//	   
	    
    	//每次在for循环的开头位置当便利完毕元素之后，重新创建一个迭代对象。
//   	 c.iterator()
//	    for (Integer i : c) {
//			System.out.println(i);
//		}
//	    for (Integer i : c) {
//			System.out.println(i);
//		}

//	    while(it.hasNext()){
//	    	Integer ite=it.next();
//	    	System.out.println(ite);
//	    }
	    
//	    remove：删除刚刚访问过 next（）的元素 ,如果没有访问过，直接运行remove会报错
//	    System.out.println(it.next());//10
//	    it.remove();
//	    System.out.println(c.contains(10));
	    
        /* 编程的时候，需要注意的地方：
         * 对于集合元素中进行迭代器的遍历时，不要同时对集合帝乡进行添加、删除元素（不要边遍历边删除、添加）
         * 会发生并行修改的异常。	    
         */
//	    while (it.hasNext()){
//	    	System.out.println(it.next());
//	    	c.remove(11);
//	    }
	    
//	}
//}

//（2）Iterator接口  1.8之后新增接口

//public class Day13_2_Collection {
//	public static void main(String[] args) {
//		Collection<Integer> c=new ArrayList<Integer>();
//	    c.add(10);
//	    c.add(11);
//	    c.add(12);
//	    Iterator<Integer> it=c.iterator();
////	    it.forEachRemaining((Integer i)->System.out.println(i));
////	    it.forEachRemaining(i->System.out.println(i));
////	    it.forEachRemaining(System.out::println);
//	}
//}

//(3)增强for循环
//(4)foreach方法
//public class Day13_2_Collection {
//	public static void main(String[] args) {
//		Collection<Integer> c=new ArrayList<Integer>();
//	    c.add(10);
//	    c.add(11);
//	    c.add(12);
//	    c.forEach(System.out::println);
//	}
//}
//(5) 使用聚合操作
//public class Day13_2_Collection {
//	public static void main(String[] args) {
//		Collection<Integer> c=new ArrayList<Integer>();
//	    c.add(10);
//	    c.add(11);
//	    c.add(12);
//	    c.stream().forEach(System.out::println);
//	}
//}



