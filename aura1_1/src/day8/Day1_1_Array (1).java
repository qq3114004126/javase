package day8;

import java.util.Arrays;
import java.util.Scanner;

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
//		一、数组的声明
//		数组也属于一种数据类型，[]
//		形式：
//		方式一    ：元素类型 []  变量名 ; (建议)
//		方式二    ：元素类型   变量名 [];
//		int []a;//语法结构上，更容易识别，从一次性声明多个数组的时候，方便 。
//		int b[];
////		int [] x1,x2,x3;
//		int x1[],x2,x3;
		
//		二、数组的初始化：
//		一个数组在声明的同时，就可以对长度、内容进行初始化。
//		（1）长度初始化
//		通过长度初始化，可以设置一个数组的长度，属猪的容量大小
//		int []x1=new int[10];
//		初始化长度之后，数组中所有的元素，默认的整数的类型的初始化值0。
		
//		（2）内容的初始化
//		要求，元素符合数组的类型即可
//		形式一：声明={元素1,元素2,}  
//		形式二：声明=new 类型[]{元素1,元素2,}  
//		      易错的地方，形式二中不能够再初始化长度
//		int x1[]={1,2,3};
//		int x2[]=new int[]{1,2,3};
		
		
//		声明和初始化：
//		可以在声明之【后】，可以进行长度初始化，也可以进行内容初始化（注意格式）
//		int []x1;
//		int []x2;
//		x1=new int[10];
////		x2={1,2,3};  错误
//		x2=new int[]{1,2,3};
		
//		三、数组的访问
//		语法：数组名[index] index索引（下标）
//		语法要求index 从左到右 从0开始。
//		字符串  charAt（index） 访问字符串中的单个字符（元素）
//		索引越界也会出错
//		界限：0,length-1
//		length属性（注意跟字符串的区别 length()）
//		int []x1={1,2,3,4,5};
//		System.out.println(x1[0]);
//		System.out.println(x1[10]);
//		System.out.println(x1.length);
		
//		四、数组的内存结构
//		基本数据类型：数据域的名字：变量名，数据域中存储：变量值
//		属于引用类型：数据域中存储的是在堆中存储的对象地址。
//		                         数组是对象型的数据，本身的对象存储在堆中，
//		         数组对象中的最后一个元素，存储的length
//		int []x1={1,2,3,4,5};
		
//		五、数组的遍历
//		1.普通的循环
		String []names=new String[]{"tom","jerry","kate"};
		for (int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		
//		2.增强for循环
//		从遍历所有元素的角度来说，语法简洁。
//		也叫foreach
//		可以对于数组里面的每个元素，依次赋予给一个变量，使用变量执行循环体。
//		语法 for(元素的类型  变量名:数组){
//		  循环体
//	    }
//		for (String n:names){
//			System.out.println(n);
//		}
		
//		增强for循环的缺点
//		（1）逆序访问数组，增强for循环不可以
//		int []x={1,2,3,4,5};
////		4 3 2 1 0
//		for (int i=x.length-1;i>=0;i--){
//			System.out.println(x[i]);
//		}
		
//		(2) 访问数组中的一部分元素，不是所有的元素。增强for循环不可以
//		for(int i=0;i<3;i++){
//			
//		}
		
		
//		(3)在遍历数组的过程中，希望修改数组中元素的值。
//		for (int i=0;i<x.length;i++){
////			x[i]=x[i]+10;
//			x[i]+=10;
//		}
//		for (int i=0;i<x.length;i++){
//			System.out.println(x[i]);
//		}
		
//		for(int n:x){
//			n+=10;
//		}
//		for (int i=0;i<x.length;i++){
//			System.out.println(x[i]);
//		}
		
//		六、数组的应用---排序
//		数据结构：排序的方法。  不是使用已有的方法进行排序。
//		1.选择排序
//		核心思想：每次选择一个最小（最大）的元素，放到数组前面，排好序。
//		从小到大
//		int []x={3,-2,5,10,-9,11,7,-1};
//		第0次
//		System.out.println(Arrays.toString(x));
//		int min=x[0];
//		for (int j=1;j<x.length;j++){
//			if(x[0]>x[j]){
//				int temp=x[0];
//				x[0]=x[j];
//				x[j]=temp;
//			}
//			System.out.println(Arrays.toString(x));
//		}

//		第i次
//		System.out.println(Arrays.toString(x));
//		for(int i=0;i<x.length-1;i++){
//			int min=x[i];
//			for (int j=i+1;j<x.length;j++){
//				if(x[i]>x[j]){
//					int temp=x[i];
//					x[i]=x[j];
//					x[j]=temp;
//				}
//				System.out.println(Arrays.toString(x));
//			}
//		}
		
		
		//选择排序优化，不是见到比i个 元素小的就交换，而是遇到真正的最小值才交换
//		int []x={3,-2,5,10,-9,11,7,-1};
//		int []x={-9, -2, -1, 3, 5, 7, 10, 11};
//		System.out.println(Arrays.toString(x));
//		for(int i=0;i<x.length-1;i++){
//			int min_index=i;
//			for (int j=i+1;j<x.length;j++){
//				if(x[min_index]>x[j]){
//					min_index=j;
//				}
//			}
//			int temp=x[i];
//			x[i]=x[min_index];
//			x[min_index]=temp;
//			System.out.println(Arrays.toString(x));
//		}
		
		
		
		
		
//		2.冒泡排序
//		排序按照从小--大
//		核心思想：俩俩（i和i+1）进行比较，如果不符合 （小  大），就交换位置。
//		int []x={3,-2,5,10,-9,11,7,-1};
//		//第0轮
//		for(int i=0;i<x.length-1;i++){
//			if(x[i]>x[i+1]){
//				int temp=x[i];
//				x[i]=x[i+1];
//				x[i+1]=temp;
//			}
//			System.out.println(Arrays.toString(x));
//		}
//	
//		//第1轮
//		for(int i=0;i<x.length-1-1;i++){
//			if(x[i]>x[i+1]){
//				int temp=x[i];
//				x[i]=x[i+1];
//				x[i+1]=temp;
//			}
//			System.out.println(Arrays.toString(x));
//		}
		
		//第j轮
		//相当于优化冒泡排序，如果一个已经排好序的数组，程序只走一次for循环
		boolean tag=true;
		int []x={-9, -2, -1, 3, 5, 7, 10, 11};
		for (int j=0;j<x.length-1;j++){
			for(int i=0;i<x.length-1-j;i++){
				if(x[i]>x[i+1]){
					int temp=x[i];
					x[i]=x[i+1];
					x[i+1]=temp;
					tag=false;
				}
			}
			System.out.println(Arrays.toString(x));
			if(tag)
				break;
		}
		//冒泡排序，如果做了处理，会出现最佳时间复杂度（O(n)） 平常的时间复杂度O（n^2）
		
//		了解
		//时间复杂度O（时间复杂度）

		//稳定排序、不稳定排序
//		1  2(1)  2(2) 3 
		
//		冒泡排序： 稳定排序
//		选择排序：不稳定排序
//		5（1）   7   9  5（2）   4
//		4     7   9  5（2）  5（1）
		
//		七、多维数组
//		java中根本没有多维数组，本质上来说数组的数组
//		数组元素中，每个元素依然还是数组。
//		int[] t;
//		T t;
//		int[][] t; 二维数组
//		1.声明、初始化
//		int []x;
//		int [][] y;
		
//		int []x1={1,2,3};
//		int []x2=new int[3];
//		int [][]y=new int[3][4];
//		int [][][]z= new int[3][4][5];
//		[1,2,3]
//		[[1,2],[3,4],[5,6,7]]
//		[[[1,2,3],[4,5]],[]]
		
//		高维数组也可以先声明，声明后再进行初始化，初始化的时候可以先分配高维，再分配低维
//		int [][]x1=new int[2][];//[[1,2,3],[4,5,6,7]]
//		x1[0]=new int[3];
//		x1[1]=new int[4];
//		java中的数组可以有不同维度
		
//		2.高维数组的内存结构
		int [][]k=new int[3][];
		k[0]=new int[3];	
		k[1]=new int[2];
		k[2]=new int[2];
		
		
//		3.多维数组的访问
//		int x1[]={1,2,3}
//		x1[index]
//	                      索引的维度	高---低
//		语法：变量名[高维index][低维索引]
		
//		int [][]z=new int[][]{{1,2},{3,4},{5,6,7}};
//		System.out.println(z[1][1]);
//		System.out.println(Arrays.toString(z[1]));
//		
//		int [][][]j=new int [][][]{{{1,2},{3,4},{5}},{}};
//		System.out.println(j[0][2][0]);
		//正常使用下，维度<=3
		
//		4.遍历
//		int [][]z=new int[][]{{1,2},{3,4},{5,6,7}};
//		for (int i=0;i<z.length;i++){
////			System.out.println(z[i]);
//			for (int j=0;j<z[i].length;j++){
//				System.out.println(z[i][j]);
//			}
//		}
//		
//		for(int[] i:z){
//			for(int j:i){
//				System.out.println(j);
//			}
//		}
		
//		八、数组下的相关方法
//		Arrays工具类  ，可以说是java专门为数组设计的一个工具类。
//		1.sort/parallelsort 排序
//		原地排序,就是在原来的数组上进行排序（原数组发生 了变化）
//		int[] i={1,-2,3,-4,5,6,7};
//		Arrays.sort(i);
//		也可以指定区间进行排序 start  end（不包含end）
//		Arrays.sort(i, 2, 5);
		
//		parallelSort 并行排序，利用了计算机的多核cpu，1.8之后的新特性
//		Arrays.parallelSort(i);
//		for(int t:i){
//			System.out.println(t);
//		}
		
//		2.binarySearch() 查找（原理实现是折半查找）
//		注意：使用折半查找的前提：数组必须是排好序的数组
//		返回值：元素排序之后的所在位置,如果查找不到则会返回负值（插入点负值-1）。
//		int[] i={1,-2,3,-4,5,6,7};
//		Arrays.sort(i);
//		-4 ，-2,1,3,5,6,7
//		int pos=Arrays.binarySearch(i, 4);
//		System.out.println(pos);
		
//		3.equals
//		判断两个数组是否“相等”——长得 一样（长度和内容）
//		如果是，则返回true，否则false
//		int[] i1={1,-2,3,-4,5,6,7};
//		int[] i2={1,-2,3,-4,5,6,7};
//		System.out.println(Arrays.equals(i1, i2));
		
		
//		4.fill 填充
//		使用某一个元素对数组进行填充
//		int [] f=new  int[10];
//		第一个参数要操作的数组，第二个参数是要填入的值
//		Arrays.fill(f, 100);
//		for(int i:f){
//			System.out.println(i);
//		}
//		可以指定区间进行填充，包含开头不包含结束
//		Arrays.fill(f, 2, 5, 100);
//		for(int i:f){
//			System.out.println(i);
//		}	
		
//		5.toString
//		将数组转换成字符串
//		int[] i1={1,-2,3,-4,5,6,7};
//		String s=Arrays.toString(i1);
//		System.out.println(s);
//		System.out.println(s.charAt(0));
		
//		九、数组的拷贝
//		三种方式可以实现数组的拷贝
//		(1)System.arraycopy()
//		(2)Arrays.copyOf()
//		(3)数组对象下的clone()
		
//		(1)System.arraycopy()
//		第一个参数 src：源数组
//		第二个参数srcPos：源数组复制开始的位置
//		第三个参数 dest:目标数组
//		第四个参数destPos：目标数组开始的位置
//		第五个参数length：复制的长度
//		int[] src={1,2,3,4,5};
//		int[] dest=new int[5];//0 0 0 0 0
//		System.arraycopy(src, 0, dest, 0, 5);
//		System.out.println(Arrays.toString(dest));
//		System.arraycopy(src, 3, dest, 2, 2);
//		System.out.println(Arrays.toString(dest));
		
		//检测索引越界问题和长度问题
		//索引不可以越界 ，长度的范围一定从开始位置到结束位置差 。
//		System.arraycopy(src, 3, dest, 2, 20);
//		System.out.println(Arrays.toString(dest));
		
//		(2)Arrays.copyOf(源数组,需要拷贝的长度)
//		返回出来的是拷贝之后的数组
//		int[] src={1,2,3,4,5};
//		int[] dest=new int[5];//0 0 0 0 0
//		int []c2=Arrays.copyOf(src, src.length);
		//检测length长度越界，不会出错 ，但是会对数组 进行扩容，元素使用默认值
//		int []c2=Arrays.copyOf(src, 100);
//		System.out.println(Arrays.toString(c2));
		
//		(3)数组对象下的clone()
//		int[] src={1,2,3,4,5};
//		int[] dest=src.clone();
//		System.out.println(Arrays.toString(dest));
//		
////		三种拷贝方式的共同点：所有的复制方式都是浅拷贝
////		浅拷贝：只对当前的数组对象进行拷贝。
////		结果：对于数组元素是基本数据类型和引用类型有区别。
////		基本类型的 数据：在堆中复制一个新“数组”对象。新对象中的基本类型相当于复制过来一份。
////		引用类型的数据： 在堆中复制一个新“数组”对象。但是只复制 这一层对象。
//		
////		（一）如果数组中的元素是基本数据类型
//		int [] a1={1,2,3};
//		int [] a2=a1.clone();
//		System.out.println(Arrays.toString(a1));
//		System.out.println(Arrays.toString(a2));
//		
//		System.out.println(System.identityHashCode(a1));
//		System.out.println(System.identityHashCode(a2));
//		
//		a1[0]=100;
//		System.out.println(Arrays.toString(a1));
//		System.out.println(Arrays.toString(a2));
//		
//		int[][] aa1={{1,2,3},{4,5}};
//		int[][] aa2=aa1.clone();
//		System.out.println(System.identityHashCode(aa1));
//		System.out.println(System.identityHashCode(aa2));
//		
//		System.out.println(System.identityHashCode(aa1[0]));
//		System.out.println(System.identityHashCode(aa2[0]));
//		aa1[0][0]=100;
//		
//		for(int[] i:aa1){
//			for(int j:i)
//				System.out.print(j+" ");
//		}
//		System.out.println();
//		for(int[] i:aa2){
//			for(int j:i)
//				System.out.print(j+" ");
//		}
		
//		达到获一样的数据数据：
//		（1）新创建一模一样的数组
//		（2）赋值
//	 	(3) 拷贝
		
//		代码和内存图结合
		
		
//		使用3个数组存储书籍的编号、名字，和书籍的价格，规定只能存放100本书。
//		可以对每一本数可添加、修改、删除，可以查询所有的书籍列表。
//		定义三个数组存储编号、名字，和价格
		int [] bookno=new int[1];//默认值0 [0 , 0 ,0 ,0.....]
		String[] bookname=new String[1];//null[null,null,null]
		double[] bookprice=new double[1];//0.0
		
		System.out.println("请输入对应的操作：1添加，2修改，3删除，4查询所有书籍");
		Scanner sc=new Scanner(System.in);
		
		while(true){
			int oper=sc.nextInt();
			switch(oper){
			case 1:
				//查找哪个位置可以放入书籍
				int index=-1;
				for(int i=0;i<bookno.length;i++){
					if(bookno[i]==0){
						index=i;
						break;
					}
				}
				if(index!=-1){
					System.out.println("请输入书籍的编号");
					bookno[index]=sc.nextInt();
					System.out.println("请输入书籍的名称");
					bookname[index]=sc.next();
					System.out.println("请输入书籍的价格");
					bookprice[index]=sc.nextFloat();
					System.out.println("添加成功！");
				}else{
					System.out.println("书籍已经填满，您可以删除一本书之后继续添加");
				}
				break;
			}
			
			//
			System.out.println(Arrays.toString(bookno));
			System.out.println(Arrays.toString(bookname));
			System.out.println(Arrays.toString(bookprice));
		}
		
		

	}
}
