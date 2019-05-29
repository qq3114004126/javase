package day16;

import java.util.Arrays;

public class Day16_4 {
	public static void bubble(int []arr) {
		boolean tag = true;
		for(int j = 0;j<arr.length-1;j++) {
			for(int i = 0;i<arr.length-1;i++) {
				if(arr[i]<arr[i+1]) {
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					tag = false;
				}
			}
			if(tag) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int []arr = {31,12,450,98,210,15};
		bubble(arr);

	}

}
