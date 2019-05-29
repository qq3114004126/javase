package day13;
import java.util.Arrays;
public class Day13_11 {



	public static void main(String[] args) {
		
		String str1 ="abcsadghjklabcghjabchjktyuiop";
		char[] arr = str1.toCharArray();
		//System.out.println(Arrays.toString(arr));
		char tag = 0;
		for(int i = 0;i<arr.length-i;i++) {
			 tag = arr[i];
			 arr[i]=arr[arr.length-1-i];
			 arr[arr.length-1-i]=tag;
		}
		String str0 = String.valueOf(arr);
		System.out.println(str0);
		str0.replaceAll(1, z);
		
//		for(int i = 0;i<str1.length();i++) {
//			char ch = str1.charAt(i);
//			char ch1 = str1.charAt(str1.length()-i-1);
//		     char temp = 0;
//			ch = temp;
//			ch1 = ch;
//			temp = ch1;
			
		
		
		

	}

}
