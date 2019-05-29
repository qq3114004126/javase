package day16;

import java.util.Arrays;

public class Day16_6 {
	public static void test(int[] arr,int key) {
		
		int start = 0;
		int end = arr.length-1;
		int mid=(start+end)/2;;
		boolean tag = true;
		while(start<=end) {
			if(key==arr[mid]) {
				System.out.println("找到了,元素下标为"+mid);
				tag = false;
				break;
			}else if(key<arr[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
			mid=(start+end)/2;
			
		}
		if(tag) {
			System.out.println("没找到");
		}
		
		
	}
	public static void main(String[] args) {
		int []arr = {21,42,12,43,15,19,120};
		Arrays.sort(arr);
		test(arr,231);

	}

}
