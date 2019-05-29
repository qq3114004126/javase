package day13;

import java.nio.ShortBuffer;

public class Day13_10 {

	public static void main(String[] args) {
		
		
		String str2 = "abc";
		String str1 ="abcsadghjklabcghjabchjktyuiop";
		String str3 = "";
		//String st = str1.substring(0, 3);
//		if(st.equals(str2)) {
//			System.out.println("true");
//		}
	
		int num = 0;
		boolean tag = true;
		for(int i = 0;i<str1.length();i++) {
			if(i<=str1.length()-3) {
				String st = str1.substring(i, i+3);
				if(str2.equals(st)) {
					tag = true;
					num++;
						
				}
			}else {
				break;
			}
			
		}
		System.out.println(num);
		
		
	}

}

	
