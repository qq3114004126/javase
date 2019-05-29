package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 1.利用集合和递归，写出快速排序
 * java语言中快速排序：时间复杂度  O（nlogn）  
 *                 稳定排序--取决于实现方式。
 * 
 */
public class Que1 {
	public static List<Integer> quick_sort(List<Integer> list){
		Integer mid;
		List<Integer> right=new ArrayList<>();
		List<Integer> left=new ArrayList<>();
		if(list.size()>1){
			mid=list.get(0);
			for(int i=1;i<list.size();i++){
				if(list.get(i)>=mid){
					//留在右边  放入右边的集合
					right.add(list.get(i));
				}else{
					left.add(list.get(i));
				}
			}
		}else{
			return list;
		}
		List<Integer> result=quick_sort(left);
		result.add(mid);
		result.addAll(quick_sort(right));
		return result;
	}
	public static void main(String[] args) {
		Integer [] i={1,5,-6,8,9,33,-5,22,2};
		quick_sort(Arrays.asList(i)).forEach(System.out::print);;
		
	}
}
