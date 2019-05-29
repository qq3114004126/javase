package day17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Day17_5 {

	public static void main(String[] args) {
		
		Map<String,String>ht = new HashMap<>();
		ht.put("CHN","中华人民共和国(People's Republic of China)");
		ht.put("EU","欧盟");
		ht.put("UK","大不列颠王国");
		ht.put("USA","美利坚合众国");
		ht.put("FR","法兰西第五民主共和国");
		ht.put("J","倭寇国,小人国");
		System.out.println(ht.get("J"));
		System.out.println(ht.get("FR"));
		System.out.println(ht.get("FR"));
		System.out.println(ht.get("CHN"));
		ht.put("USA", "大傻个国");
		System.out.println(ht.get("USA"));
		ht.remove("USA");
		System.out.println(ht.get("USA"));
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		Set<Map.Entry<String,String>> ss = ht.entrySet();
		System.out.println(ss);
		ht.replace("CHN", "历史悠久的中华人民共和国");
		ht.replaceAll((k,v)->(v+"country"));
		System.out.println(ss);
		ht.computeIfAbsent("UK", (K)->"英国");
		System.out.println(ht.get("UK"));
		ht.merge("CHN", "CHINA", (K,V)->("中国"));
		System.out.println(ht.get("CHN"));
		ht.compute("K",(k,v)->"朝鲜");
		System.out.println(ss);
		//三种遍历方式
		Set<String> s = ht.keySet(); 
		//s.forEach(k->System.out.println(k+":"+ht.get(k)));
//		ht.forEach((k,v)->System.out.println(k+":"+v));
		SortedMap<Integer,String> tree = new TreeMap<>((k1,k2)->k1-k2);
		tree.put(15,"张三");
		tree.put(18,"李四");
		tree.put(12,"王五");
		tree.put(11,"赵六");
		System.out.println(tree.entrySet());
		tree.forEach((k,v)->System.out.println(k+":"+v));
	}

}
