package day7;

import java.util.Arrays;

public class Test7 {

	public static void main(String[] args) {
		int[] arr = new int[20];
		for(int i = 0;i<arr.length;i++) {
			if(i%2==0) {
				arr[i]=2*i;
			}else {
				arr[i]=-2*i;
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	

	}

}
