package day16;

import java.util.Arrays;

public class Day16_9 {
	public static void test(int []arr,int []group) {
		for(int s:group ) {
			for(int k = 0;k<s;k++) {
				for(int i = k+s;i<arr.length;i+=s) {
					int temp = arr[i];
					int j = i-s;
					while(j>=0&&temp<arr[j]) {
						arr[j+s]=arr[j];
						j-=s;
					}
					arr[j+s]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr = {12,4,22,19,15,34,11,9,65,18};
		int[] group = {4,2,1};
		test(arr,group);
	}

}
