package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Day8_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输出要查询的数值：");
		int num = sc.nextInt();
		int []arr = {12,4,8,2,17,78,11};
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length;
		int mid;
		boolean tag = true;
		while(start<=end) {
			 mid = (start+end)/2;
			if(num==arr[mid]) {
				System.out.println("找到,下标为"+(mid));
				tag = false;
				break;
			}else if(arr[mid]<num) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		if(tag) {
			System.out.println("-1");
		}

	}

}
