package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;

//编写程序，设计单张扑克牌类Card，具有花色，牌面与具体值。
//同时设计整副扑克牌类Cards，具有52张牌，展示52张牌即可。
//（如果学过实现排序接口的同学）设计一个发牌的函数，对任意三张牌断定牌的类型。
//（如果学过集合、map的同学可以尝试砸金花）
//类型包括：
//三条：三张牌value一样
//一对：两张value一样
//顺子：三张牌挨着    realvalue   3 5 4
//同花：三张牌type一样
//同花顺：挨着，类型一样
//其余都是散牌
//同包中不能有相同的类名字
class Card1 implements Comparable<Card1>{
	String type;
	String value;
	int realvalue;
	public Card1(String type, String value, int realvalue) {
		this.type = type;
		this.value = value;
		this.realvalue = realvalue;
	}
	@Override
	public String toString() {
		return "【" + type + value + realvalue+"】";
	}
	@Override
	public int compareTo(Card1 o) {
		return this.realvalue-o.realvalue;
	}	
	
}

class Cards1{
	static Random r =new Random();
	//52张牌，52个Card类型的对象
	int a;
	List<Card1> cardlist=new  ArrayList<>();
	List<Card1> samplelist=new  ArrayList<>();
	public Cards1(){
		//{card1,card2,card3 }
		//拼凑52张牌
		String [] types=new String[]{"♠","♥","♣","♦"};
		String [] values=new String[13];
		for (int i=0;i<9;i++){
			values[i]=String.valueOf(i+2);
		}
//		 2 3 4 5 6 7....10  J    Q   K   A
//		 2 3                11   12  13  14
		
		values[9]="J";//
		values[10]="Q";
		values[11]="K";
		values[12]="A"; //14
		int index=0;//数组做索引
		for(String t:types){
			for(int i=0;i<values.length;i++){
				this.cardlist.add(new Card1(t,values[i],i+2));
				index++;
			}
		}
		
		for(Card1 c:this.cardlist){
			System.out.println(c.type+c.value);
		}
	}

	public List<Card1> getCardlist() {
		return cardlist;
	}
	
//	public void sample(){
//		Card1[] cardlist=this.getCardlist();
//		int i=0;
//		while (true){
//			if(samplelist[2]!=null)
//				break;
//			int index=r.nextInt(cardlist.length);
//			if (cardlist[index]==null)//刚好抽取到了已经移除的牌
//				continue;
//			this.samplelist[i]=cardlist[index];
//			cardlist[index]=null;
//			i++;
//		}
////		System.out.println(Arrays.toString(samplelist));
//	}
	
	public void sample(){
		List<Card1> cardlist=this.getCardlist();
		for(int i=0;i<3;i++){
			int index=r.nextInt(cardlist.size());
			this.samplelist.add(cardlist.get(index));
			cardlist.remove(index);
		}
	}
	public  void getResult(){
		List<Card1> samplelist=this.samplelist;
//		Arrays.sort(samplelist);
//		Arrays.sort(a, Comparator<T>);
		samplelist.sort((c1,c2)->c1.realvalue-c2.realvalue);
		samplelist.forEach(System.out::println);
		Card1 c1=samplelist.get(0);
		Card1 c2=samplelist.get(1);
		Card1 c3=samplelist.get(2);
		//三条：三张牌value一样
		//一对：两张value一样
		//顺子：三张牌挨着    realvalue   3 5 4   3 4 5
		//同花：三张牌type一样
		//同花顺：挨着，类型一样
		//其余都是散牌
		if(c1.realvalue==c2.realvalue && c1.realvalue==c3.realvalue){
			System.out.println("三条");
		}else if(c1.realvalue==c2.realvalue || c2.realvalue==c3.realvalue){
			System.out.println("一对");
		}else if(c1.realvalue+1==c2.realvalue && c2.realvalue+1==c3.realvalue
				&&c1.type.equals(c2.type)&&c2.type.equals(c3.type)){
			System.out.println("同花顺");
		}else if(c1.realvalue+1==c2.realvalue && c2.realvalue+1==c3.realvalue){
			System.out.println("顺子");
		}else if(c1.type.equals(c2.type)&&c2.type.equals(c3.type)){
			System.out.println("同花");
		}else{
			System.out.println("散牌");
		}
	}
}

public class CardGame {
   public static void main(String[] args) {
	  Cards1 cs=new Cards1();
	  cs.sample();
	  cs.getResult();
   }
}
