package day7;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		int[] arr = {12,6,7,4,15,16};
		boolean tag = true;
		for(int i =0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1-j;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					tag = false;
				}
				System.out.println(Arrays.toString(arr));
			}
			if (tag) {
				break;
			}
		}
		
	}
}


