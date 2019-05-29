package day7;

import java.util.Arrays;
import java.util.Scanner;

public class Test9 {

	  public static void main(String[] args) {
	        int [] arr = {5,45,7,9,63,47,61} ;    
	        Arrays.sort(arr);
	        System.out.println(Arrays.toString(arr));
	        System.out.println("请输入要查询的数：");             
	        Scanner sc = new Scanner(System.in);
	        int find = sc.nextInt();   
	        boolean flag = true;                              
	        int start=0;   
	        int end = arr.length-1;
	        int mid;
//	        时间复杂度log n
	        while(start <= end){                                
	            mid = (end+start)/2 ;
	            if(arr[mid] == find){
	                System.out.println("数字: "+find+" 所在位置为："+(mid));
	                flag = false;
	                break;
	            }
	            else if(arr[mid] > find)                        
	                end = mid-1;
	            else if(arr[mid] < find)                        
	                start = mid+1;
	        }
	        if(flag){
	            System.out.println("-1");
	        }
	    }
	}
	
