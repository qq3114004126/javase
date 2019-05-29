package Test15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;



public class Test1 {

	public static void main(String[] args) {
		Cards cs = new Cards();
		Card c = new Card();
		cs.getResult();
		
	}

}
class Card{
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
	
	
}
class Cards{
	static Random r = new Random();
	Card[] cardlist = new Card[52];
	Card[] samplelist = new Card[3];
	public Cards(){
		String[] type = {"♠","♥","♣","♦"};
		String[] value = new String[13];
		
		for(int i = 0;i<value.length-4;i++) {
			value[i]=String.valueOf(i+2);
			
		}
			value[9]="J";
			value[10]="Q";
			value[11]="K";
			value[12]="A";

		int index = 0;
		for(int i = 0;i<type.length;i++) {
			for(int j = 0;j<value.length;j++) {
				this.cardlist[index]=new Card(value[j],type[i],index+1);
				index++;
			}
		}
		int num = 0;
		for(Card c:this.cardlist) {
			//System.out.print(c.type+c.value+" ");
			if(num%13==0) {
				//System.out.println();
			}
			num++;
		}
	}
	public void getResult() {
		int index = 0;
		for(int i =0;i<3;i++) {
			if(this.samplelist[2]!=null) {
				break;
			}
			int num = r.nextInt(this.cardlist.length);
			if(this.cardlist[num]==null) {
				continue;
			}
			this.samplelist[index]=cardlist[num];
			index++;
		}
		Arrays.sort(this.samplelist,new Comparator<Card>() {

			@Override
			public int compare(Card o1, Card o2) {
				// TODO Auto-generated method stub
				return o1.reavalue-o2.reavalue;
			}
			
			
		}); 
		Card c1 = this.samplelist[0];
		Card c2 = this.samplelist[1];
		Card c3 = this.samplelist[2];
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