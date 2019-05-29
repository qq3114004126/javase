package day8;

import java.util.Scanner;

//使用3个数组存储书籍的编号、名字，和书籍的价格，规定只能存放100本书。
//可以对每一本数可添加、修改、删除，可以查询所有的书籍列表。
//定义三个数组存储编号、名字，和价格
public class Day8_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []bookId = new int[2];
		String []bookname = new String[2];
		double[] bookprice = new double[2];
		System.out.println("请选择操作：1.添加  2.修改  3.删除  4.查询");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			int index = -1;
			for(int i = 0;i<bookId.length;i++) {
				if(bookId[i]==0) {
					System.out.println("有空位");
					System.out.println("请输入要添加的书籍:");
					bookname[i]=sc.next();
					System.out.println("请输入书籍编号:");
					bookId[i]=sc.nextInt();	 	
					System.out.println("请输入书籍价格:");
					bookId[i]=sc.nextInt();
					System.out.println("添加成功!");
					index = i;
				}
			}if(index!=-1) {
				System.out.println("已存满");
	
			for(int i:bookId) {
				System.out.println("编号"+(i+1)+"："+bookname[i]);
			}
			
			
			break;
		}
	}
}
	
	
		
		
	

}
