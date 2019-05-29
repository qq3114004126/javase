package day4;

import java.util.Arrays;

/*
 * 第五章 数组
 * 背景 
 * String name1="tom";
 * String name2="jerry";
 * int score=100;
 * 
 * 新的数据类型，来存储多个数据——数组（容器）
 * java中是数组：
 * （1）必须要求相同类型元素的数组。
 * （2）数组本身是引用类型（对象型数据）
 * 
 */
public class Day1_1_Array {
	public static void main(String[] args) {
		// 一、数组的声明
		// 数组也属于一种数据类型，[]
		// 形式：
		// 方式一 ：元素类型 [] 变量名 ; (建议)
		// 方式二 ：元素类型 变量名 [];
		// int []a;//语法结构上，更容易识别，从一次性声明多个数组的时候，方便 。
		// int b[];
		//// int [] x1,x2,x3;
		// int x1[],x2,x3;

		// 二、数组的初始化：
		// 一个数组在声明的同时，就可以对长度、内容进行初始化。
		// （1）长度初始化
		// 通过长度初始化，可以设置一个数组的长度，属猪的容量大小
		// int []x1=new int[10];
		// 初始化长度之后，数组中所有的元素，默认的整数的类型的初始化值0。

		// （2）内容的初始化
		// 要求，元素符合数组的类型即可
		// 形式一：声明={元素1,元素2,}
		// 形式二：声明=new 类型[]{元素1,元素2,}
		// 易错的地方，形式二中不能够再初始化长度
		// int x1[]={1,2,3};
		// int x2[]=new int[]{1,2,3};

		// 声明和初始化：
		// 可以在声明之【后】，可以进行长度初始化，也可以进行内容初始化（注意格式）
		// int []x1;
		// int []x2;
		// x1=new int[10];
		//// x2={1,2,3}; 错误
		// x2=new int[]{1,2,3};

		// 三、数组的访问
		// 语法：数组名[index] index索引（下标）
		// 语法要求index 从左到右 从0开始。
		// 字符串 charAt（index） 访问字符串中的单个字符（元素）
		// 索引越界也会出错
		// 界限：0,length-1
		// length属性（注意跟字符串的区别 length()）
		// int []x1={1,2,3,4,5};
		// System.out.println(x1[0]);
		// System.out.println(x1[10]);
		// System.out.println(x1.length);

		// 四、数组的内存结构
		// 基本数据类型：数据域的名字：变量名，数据域中存储：变量值
		// 属于引用类型：数据域中存储的是在堆中存储的对象地址。
		// 数组是对象型的数据，本身的对象存储在堆中，
		// 数组对象中的最后一个元素，存储的length
		// int []x1={1,2,3,4,5};

		// 五、数组的遍历
		// 1.普通的循环
		String[] names = new String[] { "tom", "jerry", "kate" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// 2.增强for循环
		// 从遍历所有元素的角度来说，语法简洁。
		// 也叫foreach
		// 可以对于数组里面的每个元素，依次赋予给一个变量，使用变量执行循环体。
		// 语法 for(元素的类型 变量名:数组){
		// 循环体
		// }
		// for (String n:names){
		// System.out.println(n);
		// }

		// 增强for循环的缺点
		// （1）逆序访问数组，增强for循环不可以
		// int []x={1,2,3,4,5};
		//// 4 3 2 1 0
		// for (int i=x.length-1;i>=0;i--){
		// System.out.println(x[i]);
		// }

		// (2) 访问数组中的一部分元素，不是所有的元素。增强for循环不可以
		// for(int i=0;i<3;i++){
		//
		// }

		// (3)在遍历数组的过程中，希望修改数组中元素的值。
		// for (int i=0;i<x.length;i++){
		//// x[i]=x[i]+10;
		// x[i]+=10;
		// }
		// for (int i=0;i<x.length;i++){
		// System.out.println(x[i]);
		// }

		// for(int n:x){
		// n+=10;
		// }
		// for (int i=0;i<x.length;i++){
		// System.out.println(x[i]);
		// }

		// 六、数组的应用---排序
		// 数据结构：排序的方法。 不是使用已有的方法进行排序。
		// 1.选择排序
		// 核心思想：每次选择一个最小（最大）的元素，放到数组前面，排好序。
		// 从小到大
		// int []x={3,-2,5,10,-9,11,7,-1};
		//// 第0次
		// int min=x[0];
		// for (int j=1;j<x.length;j++){
		// if(x[0]>x[j]){
		// int temp=x[0];
		// x[0]=x[j];
		// x[j]=temp;
		// }
		// System.out.println(Arrays.toString(x));
		// }
		//
		// int x[]={-9, 3, 5, 10, -2, 11, 7, -1};
		//// 第1次
		// int min=x[1];
		// for (int j=1+1;j<x.length;j++){
		// if(x[1]>x[j]){
		// int temp=x[1];
		// x[1]=x[j];
		// x[j]=temp;
		// }
		// System.out.println(Arrays.toString(x));
		// }
		//

		// 第一次选择排序
		// int []x={3,-2,5,10,-9,11,7,-1};
		// for(int i=0;i<x.length-1;i++){
		//// 第i次
		// int min=x[i];
		// for (int j=i+1;j<x.length;j++){
		// if(x[i]>x[j]){
		// int temp=x[i];
		// x[i]=x[j];
		// x[j]=temp;
		// }
		// }
		// System.out.println(Arrays.toString(x));
		// }

		// int []x={3,-2,5,10,-9,11,7,-1};
		// for(int i=0;i<x.length-1;i++){
		//// 第i次
		// int min_index=i;
		// //找最小值索引
		// for (int j=i+1;j<x.length;j++){
		// if(x[min_index]>x[j]){
		// min_index=j;
		// }
		// }
		// int temp=x[i];
		// x[i]=x[min_index];
		// x[min_index]=temp;
		// System.out.println(Arrays.toString(x));
		// }

		// 2.冒泡排序
		// 核心思想：俩俩（i和i+1）进行比较，如果不符合 （小 大），就交换位置。
		// 第0轮
		// int []x={3,-2,5,10,-9,11,7,-1};
		// for(int i=0;i<x.length-1;i++){
		// if(x[i]>x[i+1]){
		// int temp=x[i];
		// x[i]=x[i+1];
		// x[i+1]=temp;
		// }
		// System.out.println(Arrays.toString(x));
		// }
		// 第j轮
		// int []x={-2, 3, 5, -9, 10, 7, -1, 11};
		// for(int i=0;i<x.length-1-j;i++){
		// if(x[i]>x[i+1]){
		// int temp=x[i];
		// x[i]=x[i+1];
		// x[i+1]=temp;
		// }
		// System.out.println(Arrays.toString(x));
		// }

		// 加外循环
		// int []x={3,-2,5,10,-9,11,7,-1};
		int[] x = { -9, -2, -1, 3, 5, 7, 10, 11 };
		// int []y={-9, -2, -1, 3, 5, 7, 10, 11}
		boolean tag = false;
		for (int j = 0; j < x.length - 1; j++) {
			for (int i = 0; i < x.length - 1 - j; i++) {
				if (x[i] > x[i + 1]) {
					int temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
					tag = true;
				}
				System.out.println(Arrays.toString(x));
			}
			if (!tag) {
				break;
			}
		}

	}
}
