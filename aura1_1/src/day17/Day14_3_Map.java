package day14;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * （四）Map接口
 *  Map接口 对应的实现类中，存储的是很多个键值对：（两个元素对象）
 *  key：键
 *  value：值
 *  key不能重复：因为key的底层是使用set来实现。
 *  Map<K,V>
 *  实现类：
 *  （1）HashMap
 *  （2）LinkedHashMap
 *  （3）TreeMap(用来实现子接口 SortedMap，NaviableMap)
 *  
 *  注意，就是跟之前set不同，在于每个元素都是键值对，针对的是否可排序、有序，针对key来说的。
 *  
 */
public class Day14_3_Map {
   public static void main(String[] args) {
//	   1 创建
//	   HashMap为例：无序、key不可重复的
	   Map<Integer,Integer> map=new HashMap<>();	
	   
//     2.相关方法
//	   （1）put(key,value)加入键值对
	   map.put(1, 100);
	   map.put(2, 200);
	   map.put(1, 1000);
	   
//	   get(key)获取键值对---根据key获取值 ,得到value
	   System.out.println( map.get(1));
	   System.out.println( map.get(2));
	   
//	  (2) map.putAll(m); 将参数指定的键值对，放入到当前map对象中
	   Map<Integer,Integer> map1=new HashMap<>();	
	   map1.put(10, 10000);
	   map1.put(1, 20000);
	   map.putAll(map1);
	   System.out.println(map.get(10));
	   System.out.println(map.get(1));
	   
//	   put方法，只要key相同，就会覆盖掉
//	   (3)map.putIfAbsent(key, value) 当key不存在的时候，就会加入键值对
//	   如果已经存在，则不会加入
	   map.putIfAbsent(3, 300);
	   System.out.println(map.get(3));
	   
//	  (4) remove(key) 根据key删除指定的键值对，同时返回删除key对应的value
//	   System.out.println(map.remove(3));
//	   System.out.println(map.get(3));
	   System.out.println("========");
//	   （5）remove（key,value） 根据key和value删除键值对。
//	   map.remove(3, 200);
	   map.remove(3, 300);
	   System.out.println(map.get(3));
	  
//	  (6) clear清空键值对
//	   map.clear();
//	   System.out.println(map.size());
	   
//	   (7)getOrDefault(key,defaultValue) 
//	      如果key不存在，则使用defaultValue来代替value输出
	   System.out.println(map.getOrDefault(1, 999));
	   
//	   (8)size 返回键值对的格式
//	   （9）map.isEmpty()判断map是否没有键值对
	   System.out.println(map.isEmpty());
	   
//	   (10) map.containsKey(key) 判定是否包含指定的key
//	   （11）map.contatinsValue(value) 判定是否包含指定的value
	   System.out.println(map.containsKey(1));
	   System.out.println(map.containsValue(999));
	   
//	  (12)获取全部的键，全部的值
//	   map.keySet()
	  
//	   map.values()
	   System.out.println(map.keySet());
	   System.out.println(map.values());
	   
//	   (13)获取全部的键值对
	   
	   Set<Map.Entry<Integer, Integer>> entry=  map.entrySet();
	   System.out.println(entry);
	   for (Map.Entry<Integer, Integer>  e: entry) {
		   System.out.println(e.getKey()+":"+e.getValue());
	   }
	   
//	   (14) map.replace(key, value)  使用参数key到map中找到对应的键值对，将value替换原来的value
	   map.replace(2, 20000);
	   System.out.println(entry);
	  
//	   (15) map.replace(key, oldValue, newValue)  根据key和oldvalue找键值对，使用newValue来替换值
	   map.replace(2, 50000, 40000);
	   System.out.println(entry);
	   
//	   (16)map.replaceAll(BiFunction接口（ k,v,newvalue）);
//	   将键值为k和v 将它的v替换成newvalue
	   map.replaceAll((k,v)->v*100);
	   System.out.println(entry);
	   
//	   (17) map.computeIfAbsent(key, mappingFunction) 按照规则加入不存在的键值对
//	   如果存在，则不会进行更新value
	   map.computeIfAbsent(4, (k)->k*10000);
	   System.out.println(entry);
	   
//	   (18)map.computeIfPresent(key, remappingFunction) 
//	   如果key存在，而且在方法中，调用到key和value的值。则使用计算的值来替换原来的值
	   map.computeIfPresent(4, (k,v)->k+1);
	   System.out.println(entry);
	   
//	   (19)map.compute(key, remappingFunction) 无论key是否存在，都会使用function
//	   计算之后的值替换oldvalue。如果不存在 ，则追加键值对
	   map.compute(100, (k,v)->k+5);
	   System.out.println(entry);
	   
	  
//	   (20)map.merge(key, value, remappingFunction) 合并
//	   如果key不存在，则使用参数value当value
//	 如果key存在，则使用function计算出来的newvalue来替换原来的oldvalue
//	   注意：新计算的值，里面的参数使用的全部都是oldvalue
	   map.merge(200, 600, (k,v)->k+10);
	   System.out.println(entry);
	   map.merge(200, 600, (k,v)->k+10);
	   System.out.println(entry);
	   
//3. 遍历
//	   三种方式 
//	   (1)keyset
	   Set<Integer> s=map.keySet();
	   s.forEach(k->System.out.println(k+":"+map.get(k)));
	   
//	   (2)entryset
	   Set<Map.Entry<Integer, Integer>>  set2=map.entrySet();
//	   [(key1:value1),(key2:value2),(key3:value3) ]
	   set2.forEach(e->System.out.println(e.getKey()+":"+e.getValue()));
	   
//	   (3)forEach   
	   map.forEach((k,v)->System.out.println(k+":"+v));
	   //map.forEach((k,v)->System.out::prinln); 不能简化。  接口参数和system参数一致，都是一个
	   
	   
//4. 子接口SortedMap（地位跟SortedSet类似）	 
//	 继承了Map接口，另行创建的新接口 必须要放入可排序的元素
	   
//	【可排序】对于key可排序
//	   SortedMap<Integer,Integer> tmap=new TreeMap<>();
	   SortedMap<Integer,Integer> tmap=new TreeMap<>((k1,k2)->k2-k1);
	   tmap.put(1, 100);
	   tmap.put(2, 200);
	   tmap.put(5, 500);
	   tmap.put(3, 300);
	   tmap.put(4, 400);
	   System.out.println(tmap.entrySet());
	   
	   
	   
	   
	   
//5. 子接口NavigableMap 继承SortedMap子接口（地位跟NavigableSet类似）	
//	   提供了导航方式，可以找到大一号、小一号的元素。。。
	   NavigableMap<Integer,Integer> tmap1=new TreeMap<>();
	   tmap1.put(1, 100);
	   tmap1.put(2, 200);
	   tmap1.put(5, 500);
	   tmap1.put(3, 300);
	   tmap1.put(4, 400);
	   tmap.
   }
}
