package day9;

import java.util.Arrays;
import java.util.Random;

import day15.Card1;

//编写程序，设计单张扑克牌类Card，具有花色，牌面与具体值。
//同时设计整副扑克牌类Cards，具有52张牌，展示52张牌即可。
//（如果学过实现排序接口的同学）设计一个发牌的函数，对任意三张牌断定牌的类型。
//（如果学过集合、map的同学可以尝试砸金花）
//类型包括：
//三条：三张牌value一样
//一对：两张value一样
//顺子：三张牌挨着
//同花：三张牌type一样
//同花顺：挨着，类型一样
//其余都是散牌
//同包中不能有相同的类名字
class Card1111 implements Comparable<Card1111>{
	String type;
	String value;
	int realvalue;
	public Card1111(String type, String value,int realvalue) {
		this.type = type;
		this.value = value;
		this.realvalue=realvalue;
		
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getRealvalue() {
		return realvalue;
	}

	public void setRealvalue(int realvalue) {
		this.realvalue = realvalue;
	}

	@Override
	public String toString() {
		return "Card1111 [type=" + type + ", value=" + value + ", realvalue=" + realvalue + "]";
	}

	@Override
	public int compareTo(Card1111 o) {
		// TODO Auto-generated method stub
		return this.realvalue-o.realvalue;
	}
	
}

class Cards1 {
	static Random r = new Random();
	//52张牌，52个Card类型的对象
	Card1111[] cardlist=new Card1111[52];
	Card1111[] samplelist=new Card1111[3];
	
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
		int index=0;
		for(int j=0;j<types.length;j++ ){
			for(int i=0;i<values.length;i++){
				this.cardlist[index]=new Card1111(types[j],values[i],i);
				index++;				//匿名对象
				
			}
		}
		int num = 0;
		for(Card1111 c:this.cardlist){
			System.out.print(c.type+c.value+" ");
			num++;
			if(num%13==0) {
				System.out.println( );
			}
		}
		
		
	}
	public void sample() {
		Card1111[] cardlist = this.cardlist;
		int i = 0;
		while(true) {
			if(samplelist[2]!=null)
				break;
		    int index = r.nextInt(cardlist.length);
		    if(cardlist[index]==null)
		    	continue;
		    samplelist[i]=cardlist[index];
		    cardlist[index]=null;
		    i++;
		}
	}
	public void getResult() {
		Card1111[] samplelist=new Card1111[3];
		Arrays.sort(samplelist);
		System.out.println(Arrays.toString(samplelist));
		Card1111 c1=samplelist[0];
		Card1111 c2=samplelist[1];
		Card1111 c3=samplelist[2];
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

	public Card1111[] getCardlist() {
		return cardlist;
	}
	

	

	
}

public class Que4 {
   public static void main(String[] args) {
	  Cards1 cs=new Cards1();
	  
	  Card1111[] cardlist=cs.getCardlist();
	  Random r=new Random();
	  
	  int index=r.nextInt(cardlist.length);
	
	  
   }
}
