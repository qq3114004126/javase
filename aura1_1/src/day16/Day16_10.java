package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day16_10 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		List<Integer> s_ = new ArrayList<>();
		s_.add(1);
		s_.add(2);
		s_.add(3);
		s_.add(4);
		s_.add(5);
		s_.add(6);
		s_.add(7);
		Integer [] arr = new Integer[s_.size()];
		s_.toArray(arr);
		System.out.println(Arrays.toString(arr));
		//arr.forEach(System.out::println);
		List<Integer> ss_ = new ArrayList<>();
		ss_.addAll(s_);
		ss_.remove("2");
		//ss_.forEach(System.out::println);
		s_.removeIf((Integer s)->s>5);
		//s_.forEach(System.out::println);
		
//		Integer i =12;
//		System.out.println(i.parseInt("1443"));
		//System.out.println(str.par);

	}

	

}
class Gather{
	
}