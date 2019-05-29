package day15.day14homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//（三）	使用HashMap存放国家名称信息并打印，创建Main类，在其main方法中一个HashMap对象ht，
//将数个国家的信息加入其中，加入国家信息时，以国家英文缩写(字符串类型)为key，国家中文名称(字符串类型)为value
public class Que3 {
	public static void main(String[] args) {
		Map<String ,String> map=new HashMap<>();
		map.put("CH", "中国");
		map.put("USA", "美国");
		map.put("CA", "加拿大");
		
		System.out.println(map.get("CH"));
		System.out.println(map.get("CDH"));
		System.out.println(map.getOrDefault("CDH", "无此国家"));
		
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		
		Set<Map.Entry<String, String>> entry=map.entrySet();
		for (Map.Entry<String, String> e : entry) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
	}
}
