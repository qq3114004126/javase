package bookstoresystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SYS {
	public static List<BookSystem> query(List<BookSystem> list) {
		//list.forEach(System.out::println);
		return list;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<BookSystem> list = new ArrayList<>();
		BookSystem bb = new BookSystem();
		list.add(new BookSystem(1001,"西游记",100.0,0,10));
		list.add(new BookSystem(1002,"三国演义",120.0,1,18));
		list.add(new BookSystem(1001,"水浒传",150.0,0,10));
		list.add(new BookSystem(1001,"红楼梦",200.0,1,8));
		int index = 0; 
		boolean tag = true;
		while(index!=-1) {
			System.out.println("书籍菜单：1.查看所有书籍	2.借阅书籍	  3.归还书籍 	4.退出系统");
			System.out.println("请输入选项");
			int num = sc.nextInt();
		switch(num) {
			case 1:
				System.out.println(list.toString());
				System.out.println("是否继续：(y/n)");
				String saying = sc.next();
				if(saying.equals("y")) {
					index=0;
					
				}else {
					index = -1;
					System.out.println("退出系统");
				}
				break;
				
			case 2:
				System.out.println("请输入要借阅的书籍");
				String book = sc.next();
				for(int i= 0;i<list.size();i++) {
					if(list.get(i).name.equals(book)) {
						System.out.println("次书存在");
						index = i;
						break;
						}
					}
				
				if(index!=-1) {
					if(list.get(index).state==0) {
						System.out.println("成功借出");
						list.get(index).times++;
						list.get(index).state=1;
						
					}else {
						System.out.println("此书存在但已被借出");
						break;
					}
				}else {
					System.out.println("书籍不存在");
				}
				System.out.println("是否继续：(y/n)");
				saying = sc.next();
				if(saying.equals("y")) {
					index=0;
				}else {
					index = -1;
					System.out.println("退出系统");
				}
				
				System.out.println("是否继续：(y/n)");
			    saying = sc.next();
				if(saying.equals("y")) {
					index=0;
					
				}else {
					index = -1;
					System.out.println("退出系统");
				}
				break;
			case 3:
				System.out.println("请输入要归还的书籍");
				String book1 = sc.next();
				boolean flag =true;
				for(int i = 0;i<list.size();i++) {
					if(list.get(i).equals(book1)) {
						flag = true;
						System.out.println("成功归还");
						break;
					}
				}
				if(flag) {
					System.out.println("成功归还");
				}else {
					System.out.println("此书已存在,未被借出");
				}
				System.out.println("是否继续：(y/n)");
			    saying = sc.next();
				if(saying.equals("y")) {
					index=0;
					
				}else {
					index = -1;
					System.out.println("退出系统");
				}
				break;
				
			default:	
				break;
			}
		}
	}
}

class BookSystem{
	Integer IdNum;
	String name;
	double price;
	Integer state;
	Integer times;
	
	public BookSystem() {
		super();
	}
	public BookSystem(Integer idNum, String name, double price, Integer state, Integer times) {
		super();
		IdNum = idNum;
		this.name = name;
		this.price = price;
		this.state = state;
		this.times = times;
	}
	public Integer getIdNum() {
		return IdNum;
	}
	public void setIdNum(Integer idNum) {
		IdNum = idNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getTimes() {
		return times;
	}
	public void setTimes(Integer times) {
		this.times = times;
	}
	@Override
	public String toString() {
		return "BookSystem [IdNum=" + IdNum + ", name=" + name + ", price=" + price + ", state=" + state + ", times="
				+ times + "]";
	}
	
	
}