package bookstoresystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Book;

public class Test {

	static List<Book> books = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	//0����ɽ�,1�����ѽ����
	static{
		Book book = new Book(1, "��������", 0, 10);
		books.add(book);
		book = new Book(2, "��¥��", 1, 20);
		books.add(book);
		book = new Book(3, "��ϰ¼", 0, 50);
		books.add(book);
		book = new Book(4, "����ͨ��", 1, 16);
		books.add(book);
		book = new Book(5, "���Ĺ�ֹ", 1, 12);
		books.add(book);
	}
	
	
	public static void load(){
		System.out.println("��ӭ�����������ͼ���̳ǹ���ϵͳ");
		System.out.println("-----------------------------------------");
		System.out.println("1.�鿴�鼮");
		System.out.println("2.�����鼮");
		System.out.println("3.�黹�鼮");
		System.out.println("4.�˳�ϵͳ");
		System.out.println("-----------------------------------------");
	}
	
	public static void main(String[] args) {
		int choose = 0;
		int menu = 0;
		do{
			load();
			System.out.println("������ѡ��:");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("ͼ����\t\tͼ������\t\tͼ��״̬\t\t�������");
				for (Book book : books) {
					if(book.getStatus() == 0){
						System.out.printf("%s\t\t%s\t\t�ɽ�\t\t%s\n",
								book.getBid(),book.getBname(),book.getCount());
					}else{
						System.out.printf("%s\t\t%s\t\t���\t\t%s\n",
								book.getBid(),book.getBname(),book.getCount());
					}
				}
				System.out.println("********************************************************");
				break;
			case 2:
				System.out.println("��������Ҫ���ĵ��鼮����:");
				String name = sc.next();
				boolean flag = false;
				for (Book book : books) {
					if(name.equals(book.getBname())){
						flag = true;
						if(book.getStatus() == 0){
							book.setStatus(1);
							book.setCount(book.getCount()+1);
							System.out.println("�ɹ����ĵ���"+name+"��");
						}else{
							System.out.println("��"+name+"���ѽ��,������ѡ��");
						}
					}
				}
				if(!flag) {
					System.out.println("δ�ҵ���ͼ��");
				}
				System.out.println("********************************************************");
				break;
			case 3:
				System.out.println("��������Ҫ�黹���鼮����:");
				name = sc.next();
				flag = false;
				for (Book book : books) {
					if(name.equals(book.getBname())){
						flag = true;
						if(book.getStatus() == 0){
							System.out.println("��"+name+"��δ���,������ѡ��");
						}else{
							book.setStatus(0);
							System.out.println("��"+name+"���ѳɹ��黹,��ӭ�´�ʹ��");
						}
					}
				}
				if(!flag) {
					System.out.println("δ�ҵ���ͼ�����״̬");
				}
				System.out.println("********************************************************");
				break;
			default:
				System.out.println("��ӭ�´�ʹ��!");
				choose = 1;
				break;
			}
		}while(choose == 0);
		
	}

}
