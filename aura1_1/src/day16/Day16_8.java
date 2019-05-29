package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
	//int a;
//	Card1[] cardlist=new Card1[52];
//	Card1[] samplelist=new Card1[3];

	public Cards1(){
		//{card1,card2,card3 }
		//拼凑52张牌
		
		
		List<String> l1 = new ArrayList<String>();
		l1.add("♠");l1.add("♥");l1.add("♣");l1.add("♦");
		
		List<String> l2 = new ArrayList<String>();
		l2.add("2");l2.add("3");l2.add("4");l2.add("5");l2.add("6");
		l2.add("7");l2.add("8");l2.add("9");l2.add("10");l2.add("J");
		l2.add("Q");l2.add("K");l2.add("A");
		
		List<String>l3 = new ArrayList();
		l3.addAll(l2);
		l3.addAll(l1);
		String str1 = "";
		String str = "";
		
		for(int i = 0;i<l1.size();i++) {
			
			for(int j = 0;j<l2.size();j++) {
				//System.out.println(l1.get(i)+l2.get(j));
				 str = (l1.get(i)+l2.get(j));
				 str1=str1+str+",";
				 
				 
				
			}
			
		}		
		System.out.println(str1);
		List<String> l5 = new ArrayList<String>();
		l5.addAll(l5);
		
////				System.out.print(l1.get(i));
////				System.out.print(l2.get(j));
//			}
//			
//		}
////		for(String t:types){
////			for(int i=0;i<values.length;i++){
////				this.cardlist[index]=new Card1(t,values[i],i);
////				index++;
////			}
////		}
//		
//		for(Card1 c:){
//			System.out.println(c.type+c.value);
//		}
//	}
//
//	public Card1[] getCardlist() {
//		return cardlist;
//	}
//	
//	public void sample(){
//		List l4 = new ArrayList();
//		int index=r.nextInt();
//		l4.add()
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
//		
//	}
//	public void getResult(){
//		Card1[] samplelist=this.samplelist;
//		Arrays.sort(samplelist);
////		Arrays.sort(a, Comparator<T>);
//		System.out.println(Arrays.toString(samplelist));
//		Card1 c1=samplelist[0];
//		Card1 c2=samplelist[1];
//		Card1 c3=samplelist[2];
//		//三条：三张牌value一样
//		//一对：两张value一样
//		//顺子：三张牌挨着    realvalue   3 5 4   3 4 5
//		//同花：三张牌type一样
//		//同花顺：挨着，类型一样
//		//其余都是散牌
//		if(c1.realvalue==c2.realvalue && c1.realvalue==c3.realvalue){
//			System.out.println("三条");
//		}else if(c1.realvalue==c2.realvalue || c2.realvalue==c3.realvalue){
//			System.out.println("一对");
//		}else if(c1.realvalue+1==c2.realvalue && c2.realvalue+1==c3.realvalue
//				&&c1.type.equals(c2.type)&&c2.type.equals(c3.type)){
//			System.out.println("同花顺");
//		}else if(c1.realvalue+1==c2.realvalue && c2.realvalue+1==c3.realvalue){
//			System.out.println("顺子");
//		}else if(c1.type.equals(c2.type)&&c2.type.equals(c3.type)){
//			System.out.println("同花");
//		}else{
//			System.out.println("散牌");
//		}
//	}
		

		
		 List l4 = new ArrayList();
		 //随机产生三张牌
		 int num = r.nextInt(52)+1;
		}
	}
public class Day16_8 {
   public static void main(String[] args) {
	  Cards1 cs=new Cards1();
//	  Card1[] css=cs.cardlist;
//	  Card1[] cardlist=cs.getCardlist();
//	  cs.sample();
//	  cs.getResult();
	
	  
   }
}

