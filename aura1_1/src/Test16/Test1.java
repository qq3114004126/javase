package Test16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import cn.aura.Card;



public class Test1 {

	public static void main(String[] args) {
		Cards cs = new Cards();
		Card c = new Card();
		cs.getResult();
		
	}

}
class Card implements Comparable<Card>{
	String value;
	String type;
	int reavalue;
	
	
	public Card() {
		super();
	}
	public Card(String value, String type, int reavalue) {
		super();
		this.value = value;
		this.type = type;
		this.reavalue = reavalue;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getReavalue() {
		return reavalue;
	}
	public void setReavalue(int reavalue) {
		this.reavalue = reavalue;
	}
	@Override
	public String toString() {
		
		return "Card [value=" + value + ", type=" + type + ", reavalue=" + reavalue + "]";
		
	}
	
	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return this.reavalue-o.getReavalue();
	}
	
	
}
class Cards{
	static Random r = new Random();
	List<Card> cardlist = new ArrayList<Card>();
	List<Card> samplelist = new ArrayList<Card>();
	public Cards(){
		List<String>type = new ArrayList<>();
		type.add("♠");
		type.add("♥");
		type.add("♣");
		type.add("♦");
		List<String>value = new ArrayList<String>();
		for(int i = 0;i<9;i++) {
			value.add(String.valueOf(i+2));
		}
			value.add("J");
			value.add("Q");
			value.add("K");
			value.add("A");
			

		int index = 0;
		for(String s:type) {
			for(String ss:value) {
				this.cardlist.add(new Card(ss,s,index+1));
				index++;
			}
		}
		int num = 0;
		for(Card c:this.cardlist) {
			//System.out.print(c.type+c.value+" ");
			if(num%13==0) {
				System.out.println();
			}
			num++;
		}
	}
	public void getResult() {
		int index = 0;
		for(int i =0;i<3;i++) {
			if(this.samplelist.size()>3) {
				break;
			}
			int num = r.nextInt(this.cardlist.size());
			if(this.cardlist.get(num)==null) {
				continue;
			}
			this.samplelist.add(this.cardlist.get(num));
			index++;
		}
		
		Card c1 = this.samplelist.get(0);
		Card c2 = this.samplelist.get(1);
		Card c3 = this.samplelist.get(2);
		for(Card s1:this.samplelist) {
			System.out.print(s1.type+s1.value+" ");
		}
		if(c1.reavalue==c2.reavalue && c1.reavalue==c3.reavalue){
			System.out.println("三条");
		}else if(c1.reavalue==c2.reavalue || c2.reavalue==c3.reavalue){
			System.out.println("一对");
		}else if(c1.reavalue+1==c2.reavalue && c2.reavalue+1==c3.reavalue
				&&c1.type.equals(c2.type)&&c2.type.equals(c3.type)){
			System.out.println("同花顺");
		}else if(c1.reavalue+1==c2.reavalue && c2.reavalue+1==c3.reavalue){
			System.out.println("顺子");
		}else if(c1.type.equals(c2.type)&&c2.type.equals(c3.type)){
			System.out.println("同花");
		}else{
			System.out.println("散牌");
		}
		//System.out.println(Arrays.toString(samplelist));
	}
}