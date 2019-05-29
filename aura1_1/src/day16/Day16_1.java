package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Day16_1 {
	public static 
	public static void insert(int[] t) {
		//插入元素从第二个元素开始，插入到现有的已排好序的数组中
		//-3,-1,3,10,-9,11,7,-1
		int i = 1;
		int temp = -2;
	}
	public static void choose(int []t) {
		int min_index =0;
		for() {
			
		}
	}
	//每次找到最小元素
	public static void bubble(int []t) {
		for(int i = 0;i<t.length-1;i++) {
			if(t[i]>t[i+1]) {
				int temp = t[i+1];
			}
		}
	}
	public static void binarySearch(int[]t,int key) {
		Arrays.sort(t);
		int start = 0;
		int end= t.length-1;
		int mid = (start+end)/2;
		
		
	}
	public static void main(String[] args) {
		int[] arr = {12,2354,12,1,13,32,11};
		binarySearch(arr,1);
		Collection<String>list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		Iterator<String>its = list.iterator();//创建迭代器
		while(its.hasNext()) {
			String str =(String)its.next();
			System.out.println(str);
			
		
		}
	}

}
