package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Day8_2 {

	public static void main(String[] args) {
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
		}
		

	}

}
