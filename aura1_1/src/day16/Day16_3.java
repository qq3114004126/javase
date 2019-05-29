package day16;

import java.util.Arrays;

public class Day16_3 {
	public static void insert(int []arr,int[] increasement) {
		for(int k:increasement) {
			
			for(int i = k;i<k;i+=k) {
				int temp = arr[i];
				int j = i-k;
				while(j>=0&&temp>arr[j]) {
					arr[j+1]=arr[j];
						j-=k;
						arr[j+1]=temp;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		int[] arr = {21,58,23,20,2,64,32,12,34,123,121};
		
		int []increasement = {4,2,1};
	}

}
