package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Day4homework {
	public static void main(String[] args) {
//1.	创建int类型数组，数组容量为5，元素由控制台输入，
//		输入完毕后显示出数组，以及数组中的最小值、最大值、平均值
//		int []x=new int[5];
//		Scanner sc=new Scanner(System.in);
		
		//方式一：使用Arrays类下的方法
//		for(int i =0;i<x.length;i++){
//			x[i]=sc.nextInt();
//		}
//		
//		
//		Arrays.sort(x);
//		System.out.println(Arrays.toString(x));
//		System.out.println(x[0]);
//		System.out.println(x[x.length-1]);
		
		//自定义获取最大值最小
//		int max=0,min=0;
//		for (int i = 0; i < x.length; i++) {
//			x[i]=sc.nextInt();
//			if(i==0){
//				max=x[i];
//				min=x[i];
//			}else{
//				if(max<x[i])
//					max=x[i];
//				if(min>x[i])
//					min=x[i];
//			}
//		}
//		System.out.println(max);
//		System.out.println(min);
		
		
//2.	创建int数组，数组长度为20，数组元素的内容是索引值的二倍，其中奇数索引取负数，
//		偶数索引取正数。对数组进行排序。
//		int []x=new int[20];
//		for (int i = 0; i < x.length; i++) {
//			if(i%2==0){//偶数和0
//				x[i]=i*2;
//			}else{
//				x[i]=-i*2;
//			}
//		}
//		Arrays.sort(x);
//		System.out.println(Arrays.toString(x));
//		
		
//3.	对于数组的赋值、新建、拷贝等几种情况，修改数组中的基本类型元素和嵌套数组中的元素，
//		查看结果，并画出内存图。
//		int []i1=new int[]{1,2,3};
//		int []i2=new int[]{1,2,3};
//		//int []i2={1,2,3};  //其实是上面写法的简化
//		int []i3=i1;
//		int [] i4=i1.clone();
//		
//		i1[0]=100;
//		System.out.println(Arrays.toString(i1));
//		System.out.println(Arrays.toString(i2));
//		System.out.println(Arrays.toString(i3));
//		System.out.println(Arrays.toString(i4));
//		
//		System.out.println(System.identityHashCode(i1));
//		System.out.println(System.identityHashCode(i2));
//		System.out.println(System.identityHashCode(i3));
//		System.out.println(System.identityHashCode(i4));
//		
//		//不要使用System.identityHashCode()去校验基本数据类型
//		System.out.println(System.identityHashCode(i1[0]));
//		System.out.println(System.identityHashCode(i2[0]));
//		System.out.println(System.identityHashCode(i4[0]));//1 基本数据类型  Integer ---引用类型
		
		//对于二维数组
		int [][]i1=new int[][]{{1,2},{3,4}};
		int [][]i2=new int[][]{{1,2},{3,4}};
		int [][]i3=i1;
		int [][]i4=i1.clone();
		
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		System.out.println(System.identityHashCode(i3));
		System.out.println(System.identityHashCode(i4));
		System.out.println(System.identityHashCode(i1[0]));
		System.out.println(System.identityHashCode(i2[0]));
		System.out.println(System.identityHashCode(i3[0]));
		System.out.println(System.identityHashCode(i4[0]));
		i1[0][0]=100;
		for (int[] i : i1) {
			System.out.print(Arrays.toString(i));
		}
		System.out.println();
		for (int[] i : i2) {
			System.out.print(Arrays.toString(i));
		}
		System.out.println();
		for (int[] i : i3) {
			System.out.print(Arrays.toString(i));
		}
		System.out.println();
		for (int[] i : i4) {
			System.out.print(Arrays.toString(i));
		}
	
				
		
		
//4.	输入某年某月某日，判断这一天是这一年的第几天？
//		int y=2019;
//		int m=12;
//		int d=31;
//		
//		//思路  1 2 3 所有天数加在一起
//		int [] months={0,31,28,31,30,31,30,31,31,30,31,30,31};
//		if(1<=m && m<=12){
//			int sum=0;
//			for (int i = 0; i < m; i++) {
//				sum+=months[i];
//			}
//			if(m>2&&(y%4==0&&y%100!=0 || y%400==0)){
//				sum+=1;
//			}
//			System.out.println("是今年的第"+(sum+d)+"天");
//			
//		}
		
		
		
		
//5.	设置一个int类型的数组，里面有若干元素，查找一个int类型的整数是否存在于数组中？
//		如果存在则输出“存在”，否则输出-1
//      查找：两种方式：顺序查找；折半查找
//		int [] x=new int[]{1,2,3,4,5,666,777,44};
//		int key=5;
//		方式一 顺序查找
//		boolean tag=true;
//		for (int i = 0; i < x.length; i++) {
//			if(key==x[i]){
//				System.out.println("找到了，在第"+i+"个位置");
//				tag=false;
//				break;
//			}
//		}
//		if(tag)
//			System.out.println("没找到");
		
//		折半查找(二分查找)
//		Arrays.sort(x);
//		int start=0;
//		int end=x.length;
//		boolean tag=true;
//		while(start<=end){
//			int mid=(start+end)/2;
//			if(key==x[mid]){
//				System.out.println("找到了，位置在第"+mid+"位置");
//				tag=false;
//				break;
//			}else if(key<x[mid]){
//				end=mid-1;
//			}else{
//				start=mid+1;
//			}
//		}
//		if(tag)
//			System.out.println("没找到");
//		
//		思考：是不是折半查找就一定优于顺序查找呢？
//		折半查找：前提是需要排序
//		顺序查找：适合查找一次。
//		折半查找：适合查找多次。排序一次之后，可以多次利用排序的结果进行折半查找。
		
		
//
//
//6.	手写冒泡排序算法（大-小）
//        输出100以内的质数
	}
}
