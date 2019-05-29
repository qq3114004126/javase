package day7;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr = new int[5];
		int max = 0;
		int min = 0;
		boolean flag = true;
		for(int i = 0;i<arr.length;i++) {
			System.out.println("请输入数组元素");
			arr[i] = sc.nextInt();
			if(i==0) {
				max = arr[0];
				min = arr[0];
				flag = false;
			}else {
				if(arr[i]>max) {
					max = arr[i];
				}
				if(arr[i]<min) {
					min = arr[i];
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(max);
		System.out.println(min);
		

	}

}
