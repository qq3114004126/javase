package day11;

import java.util.Scanner;

//5.	将之前的图书管理系统的例子扩展，判断是否是同一本书，如果是同一本书，则不允许添加。
//使用equals方法实现。
class Book{
	private int bookno;
	private String bookname;
	private double bookprice;
	public int getBookno() {
		return bookno;
	}
	public void setBookno(int bookno) {
		this.bookno = bookno;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}
	public Book(int bookno, String bookname, double bookprice) {
		super();
		this.bookno = bookno;
		this.bookname = bookname;
		this.bookprice = bookprice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookname == null) ? 0 : bookname.hashCode());
		result = prime * result + bookno;
		long temp;
		temp = Double.doubleToLongBits(bookprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookname == null) {
			if (other.bookname != null)
				return false;
		} else if (!bookname.equals(other.bookname))
			return false;
		if (bookno != other.bookno)
			return false;
		if (Double.doubleToLongBits(bookprice) != Double.doubleToLongBits(other.bookprice))
			return false;
		return true;
	}
	
	
}
public class Que5 {
	public static void main(String[] args) {
//		int [] bookno=new int[1];//默认值0 [1001 ,1002 ,0,1004.....]
//		String[] bookname=new String[1];//null[null,null,null]
//		double[] bookprice=new double[1];//0.0
		
		Book[] books=new Book[2];//[book1,book2]
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("请输入对应的操作：1添加，2修改，3删除，4查询所有书籍，5退出");
			int oper=sc.nextInt();
			switch(oper){
			case 1:
				//查找哪个位置可以放入书籍
				int index=-1;
				for(int i=0;i<books.length;i++){
					if(books[i]==null){
						index=i;
						break;
					}
				}
				if(index!=-1){
					System.out.println("请输入书籍的编号");
					int bn=sc.nextInt();
					System.out.println("请输入书籍的名称");
					String bname=sc.next();
					System.out.println("请输入书籍的价格");
					double bp=sc.nextFloat();
					Book nbook=new Book(bn,bname,bp);
//					if(nbook.equals(obj))
					//判断是否重复
					boolean tag = checkDuplicate(books, nbook);
					if(tag){
						books[index]=nbook;
						System.out.println("添加成功！");
					}
					
				}else{
					System.out.println("书籍已经填满，您可以删除一本书之后继续添加");
				}
				break;
			
				
			case 5:
				return ;
			}
		}
 	}

	private static boolean checkDuplicate(Book[] books, Book nbook) {
		boolean tag=true;
		for (Book b:books){
			if(b!=null&&b.equals(nbook)){
				//代表重复
				System.out.println("书籍有重复数据");
				tag=false;
				break;
			}
		}
		return tag;
	}
}
