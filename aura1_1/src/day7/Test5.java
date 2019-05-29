package day7;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] bookId = new int[3];
		String[] bookname = new String[3];
		double[] bookprice = new double[3];
		
	
	while(true) {
		System.out.println("请输入对应的操作：1添加，2修改，3删除，4查询所有书籍");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			//查找哪个位置
			int index = -1;
			for(int i = 0;i<bookname.length;i++) {
				if(bookId[i]==0) {
					index=i;
					break;
				}
		    }
				if(index!=-1) {
					System.out.println("请输入书籍编号：");
					bookId[index]=sc.nextInt();
					System.out.println("请输入书籍名称：");
					bookname[index]=sc.next();
					System.out.println("请输入书籍价格：");
					bookprice[index]=sc.nextDouble();
				}else {
					System.out.println("书籍已添加满。");
					
					
				}
				break;
		case 2:
			System.out.println("请输入要修改的书籍：");
				String str = sc.next();
				boolean tag = true;
				for(int i = 0;i<bookId.length;i++) {
					if(bookname[i]==str) {
						tag = true;
						bookname[i]="史记";
						bookprice[i]=120;
						break;
					}
				}
				if(tag) {
					System.out.println("书籍存在");
					
				}
				break;
		case 3:
			System.out.println("请输入要删除的书籍");
			String ss = sc.next();
			for(int i = 0;i<bookname.length;i++) {
				if(bookname[i]==ss) {
					System.out.println("此本书存在");
					bookname[i]=null;
					bookId[i]=0;
					bookprice[i] = 0.0;
				}
			}
			break;
		
		case 4:
			System.out.println("查看书籍：");
			for(String i: bookname) {
				System.out.println("书名："+bookname+",编号："+bookId+",书价："+bookprice);
			}
		
			break;
		case 5:
			default:
				
		
		}
		
		
	}

	}
}