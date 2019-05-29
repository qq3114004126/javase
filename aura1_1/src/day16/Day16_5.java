package day16;

import java.util.Arrays;

public class Day16_5 {
	public static void choose(int []arr) {
		for(int j = 0;j<arr.length-1;j++) {
			
			for(int i = j+1;i<arr.length;i++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		int []arr = {21,32,12,109,65,18};
		choose(arr);
	}

}
