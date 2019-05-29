package day7;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		int []arr = {21,2,5,23,17,8,9,1};
		int [][]arr1 = {{1,2,4},{6,8,9},{12,14}};
		arr1[1][2]=3;
		int []arr2 = new int[5];
		Arrays.fill(arr2, 6);
		System.out.println(Arrays.toString(arr2));
		Arrays.fill(arr2, 2, 5, 5);
		System.out.println(arr2);
		int[] dest = new int[6];
		System.arraycopy(arr, 1, dest, 2, 3);
		System.out.println(Arrays.toString(dest));
		int[] arr4 = Arrays.copyOf(arr, 10);
		int[] arr5 =arr.clone();
		System.out.println(Arrays.toString(arr5));
		
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		Arrays.binarySearch(arr, 5);
//		int[]f = new int[15];
//		Arrays.fill(f, 10);
//		Arrays.fill(f, 2, 5, 15);
//		System.out.println(Arrays.toString(f));
//		String str = Arrays.toString(f);
//		System.out.println(str.charAt(0));
//		int[] src = {1,2,3,4,5};
//		int[] dest = new int[5];
//		System.arraycopy(src, 3, dest, 2, 2);
//		System.out.println(Arrays.toString(dest));
//		int[] arr2=Arrays.copyOf(src, 9);
//		System.out.println(Arrays.toString(arr2));
//		int[] arr3 = src.clone();
	}

}
