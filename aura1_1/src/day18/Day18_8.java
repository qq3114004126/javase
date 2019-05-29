package day18;

import java.util.ArrayList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class Day18_8 {
	
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(19);
		li.add(12);
		li.add(10);
		li.add(30);
		li.add(35);
		li.add(23);
		System.out.println(fun(li));
	}
	public static Integer fun(List<Integer> li) {
		if(li.size()==1) {
			return li.get(0);
		}else {
			
			List<Integer> left = new ArrayList<>();
			List<Integer> right = new ArrayList<>();
			List<Integer> end = new ArrayList<>();
			for(int i = 0;i<li.size();i++) {
				Integer mid = li.get(i);
				if(mid>li.get(i)) {
					left.add(li.get(i));
				}else {
					right.add(li.get(i));
				}
				
			}
			end.addAll(left);
			
			end.addAll(right);
			
			return end.get(5);
		}
		
	}

}
