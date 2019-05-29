package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;

public class Test1 {

	public static void main(String[] args) {
		Integer[] t = new Integer[5];
		t[0]=1;
		t[1]=2;
		t[2]=3;
		t[3]=4;
		t[4]=5;
		
		List<Integer>list = Arrays.asList(t);
		list.add(500);
		list.forEach(System.out::println);
		List<Integer>listp = new ArrayList<>();
		listp.addAll(list);
		listp.add(500);
		
		System.out.println();
	}

}
