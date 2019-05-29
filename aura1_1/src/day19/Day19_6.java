package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Day19_6 {

	public static void main(String[] args) {
		Cards cc = new Cards();
		
		 Person1_ p1 = new Person1_("张三");
		 Person1_ p2 = new Person1_("李四");
		 Person1_ p3 = new Person1_("王五");
		 Game g = new Game();
		 List<Card> p1_ = new ArrayList<>();
		 List<Card> p2_ = new ArrayList<>();
		 List<Card> p3_ = new ArrayList<>();
		 p1.getPole(p1_);
  	     p2.getPole(p2_);
		 p3.getPole(p3_);
		 g.compare(p1_,p2_,p3_);
		
	}

}
class Card implements Comparable<Card>{
	private String type;
	private Integer value;
	int reavalue;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public int getReavalue() {
		return reavalue;
	}
	public void setReavalue(int reavalue) {
		this.reavalue = reavalue;
	}
	public Card(String type, Integer value, int reavalue) {
		super();
		this.type = type;
		this.value = value;
		this.reavalue = reavalue;
	}
	@Override
	public String toString() {
		return "Card [type=" + type + ", value=" + value + ", reavalue=" + reavalue + "]";
	}
	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return this.value-o.value;
	}
	
	
}
class Cards{
	List<Card> cs = new ArrayList<>();
	public Cards(){
		List<String>types= new ArrayList<>();
		types.add("♠");
		types.add("♥");
		types.add("♣");
		types.add("♦");
		List<Integer>values= new ArrayList<>();
		for(int i = 0;i<13;i++) {
			values.add(Integer.valueOf(i+2));
		}
		int index = 0;
		for(String n:types) {
			for(int j = 0;j<values.size();j++) {
				this.cs.add(new Card(n,values.get(j),index+1));
				index++;
			}
			
		}
		//cs.forEach(System.out::println);
	}
}
class Person1_ extends Cards{
	static Random r = new Random();
	Card c;
	Cards cc;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person1_(String name) {
		super();
		this.name = name;
	}
	public void getPole(List<Card> l) {
		for(int i = 0;i<3;i++) {
			int num = r.nextInt(cs.size());
			l.add(cs.get(num));
			cs.remove(num);
			
		}
		//l.forEach(System.out::println);
	}
	
}
class Game{
	Card c ;
	Person1_ p;
	public void compare(List<Card> x,List<Card> y,List<Card> z) {
		Card [] zs = {x.get(0),x.get(1),x.get(2)};
		Card [] ls = {y.get(0),y.get(1),y.get(2)};
		Card [] ww = {z.get(0),z.get(1),z.get(2)};
		
		Arrays.sort(zs,(m,q)->m.getValue()-q.getValue());
		Arrays.sort(ls,(m,q)->m.getValue()-q.getValue());

		Arrays.sort(ww,(m,q)->m.getValue()-q.getValue());
		
		System.out.println(Arrays.toString(zs));
		String st1;
		if(zs[0].getValue()==zs[1].getValue() && zs[1].getValue()==zs[3].getValue()){
			 st1 = "三条";
			System.out.println("张三的牌是：三条");
		}else if(zs[0].getValue()==zs[1].getValue() || zs[1].getValue()==zs[2].getValue()){
			 st1 = "一对";
			System.out.println("张三的牌是：一对");
		}else if(zs[0].getValue()+1==zs[1].getValue() && zs[1].getValue()+1==zs[2].getValue()
				&&zs[0].getType().equals(zs[1].getType())&&zs[1].getType().equals(zs[1].getType())){
			 st1 = "同花顺";
			System.out.println("张三的牌是:同花顺");
		}else if(zs[0].getValue()+1==zs[1].getValue() &&zs[1].getValue()+1==zs[2].getValue()){
			 st1 = "顺子";
			System.out.println("张三的牌是:顺子");
		}else if(zs[0].getType().equals(zs[1].getType())&&zs[1].getType().equals(zs[2].getType())){
			 st1 = "同花";
			System.out.println("张三的牌是:同花");
		}else{
			 st1 = "散牌";
			System.out.println("张三的牌是:散牌");
		}
		System.out.println(Arrays.toString(ls));
		String st2;
		if(ls[0].getValue()==ls[1].getValue() && ls[1].getValue()==ls[3].getValue()){
			 st2 = "三条";
			System.out.println("李四的牌是：三条");
		}else if(ls[0].getValue()==ls[1].getValue() || ls[1].getValue()==ls[2].getValue()){
			 st2 = "一对";
			System.out.println("李四的牌是：一对");
		}else if(ls[0].getValue()+1==ls[1].getValue() && ls[1].getValue()+1==ls[2].getValue()
				&&ls[0].getType().equals(ls[1].getValue())&&ls[1].getValue().equals(ls[1].getValue())){
			 st2 = "同花顺";
			System.out.println("李四的牌是:同花顺");
		}else if(ls[0].getValue()+1==ls[1].getValue() &&ls[1].getValue()+1==ls[2].getValue()){
			 st2 = "顺子";
			System.out.println("李四的牌是:顺子");
		}else if(ls[0].getType().equals(ls[1].getType())&&ls[1].getType().equals(ls[2].getType())){
			
			 st2 = "同花";
			System.out.println("李四的牌是:同花");
		}else{
			 st2 = "散牌";
			System.out.println("李四的牌是:散牌");
		}
		System.out.println(Arrays.toString(ww));
		String st3;
		if(ww[0].getValue()==ww[1].getValue() && ww[1].getValue()==ww[3].getValue()){
			 st3 = "三条";
			System.out.println("王五的牌是：三条");
		}else if(ww[0].getValue()==ww[1].getValue() || ww[1].getValue()==ww[2].getValue()){
			 st3 = "一对";
			System.out.println("王五的牌是：一对");
		}else if(ww[0].getValue()+1==ls[1].getValue() && ww[1].getValue()+1==ww[2].getValue()
				&&ww[0].getType().equals(ww[1].getType())&&ww[1].getType().equals(ww[1].getType())){
			 st3 = "同花顺";
			System.out.println("王五的牌是:同花顺");
		}else if(ww[0].getValue()+1==ww[1].getValue() &&ww[1].getValue()+1==ww[2].getValue()){
			 st3 = "顺子";
			System.out.println("王五的牌是:顺子");
		}else if(ww[0].getType().equals(ww[1].getType())&&ww[1].getType().equals(ww[2].getType())){
			 st3 = "同花";
			System.out.println("王五的牌是:同花");
		}else{
			 st3 = "散牌";
			System.out.println("王五的牌是:散牌");
		}
		if(st1.equals("散牌")&st2.equals("散牌")&st3.equals("散牌")) {
			int max = zs[2].getValue();
			if(ls[2].getValue()>max) {
				if(ls[2].getValue()> ww[2].getValue()) {
					max = ls[2].getValue();
					System.out.println("获胜者是李四");
				}else {
					System.out.println("获胜者是王五");
				}
				
			}else {
				if(ww[2].getValue()>max) {
					max = ww[2].getValue();
					System.out.println("获胜者是王五");	
				}else {
					System.out.println("获胜者是张三");
				}
			}
			
			//System.out.println("");
		}else if(st1.equals("一对")||st2.equals("一对")||st3.equals("一对")) {
			if(st1.equals(st2)&&st2.equals(st3)) {
				int max = zs[2].getValue();
				if(ls[2].getValue()>max) {
					if(ls[2].getValue()> ww[2].getValue()) {
						max = ls[2].getValue();
						System.out.println("获胜者是李四");
					}else {
						System.out.println("获胜者是王五");
					}
					
				}else {
					if(ww[2].getValue()>max) {
						max = ww[2].getValue();
						System.out.println("获胜者是王五");	
					}else {
						System.out.println("获胜者是张三");
					}
				}
			}else if(st1.equals("一对")) {
				System.out.println("获胜者是张三");
			}else if(st2.equals("一对")) {
				System.out.println("获胜者是李四");
			}else if(st3.equals("一对")) {
				System.out.println("获胜者是王五");
			}else if(st1.equals(st2)) {
				if(zs[2].getValue()>ls[2].getValue()) {
					System.out.println("获胜者是张三");
				}else {
					System.out.println("获胜者李四");
					
				}
			}else if(st1.equals(st3)) {
				if(zs[2].getValue()>ww[2].getValue()) {
					System.out.println("获胜者是张三");
				}else {
					System.out.println("获胜者王五");
					
				}
			}else if(st2.equals(st3)) {
				if(ls[2].getValue()>ww[2].getValue()) {
					System.out.println("获胜者是李四");
				}else {
					System.out.println("获胜者王五");
					
				}
			}
		}else if(st1.equals("顺子")||st2.equals("顺子")||st3.equals("顺子")) {
			if(st1.equals(st2)&&st2.equals(st3)) {
				with(zs,ls,ww);
			}else if(st1.equals(st2)) {
				if(zs[2].getValue()>ls[2].getValue()) {
					System.out.println("获胜者是张三");
				}else {
					System.out.println("获胜者李四");
					
				}
			}else if(st1.equals(st3)) {
				if(zs[2].getValue()>ww[2].getValue()) {
					System.out.println("获胜者是张三");
				}else {
					System.out.println("获胜者王五");
					
				}
			}else if(st2.equals(st3)) {
				if(ls[2].getValue()>ww[2].getValue()) {
					System.out.println("获胜者是李四");
				}else {
					System.out.println("获胜者王五");
					
				}
			}else if(st1.equals("顺子")) {
				System.out.println("张三获胜");
			}else if(st2.equals("顺子")) {
				System.out.println("李四获胜");
			}else {
				System.out.println("王五获胜");
			}
		}else if(st1.equals("同花")||st2.equals("同花")||st3.equals("同花")) {
			if(st1.equals(st2)&&st2.equals(st3)) {
				with(zs,ls,ww);
			}else if(st1.equals(st2)) {
				if(zs[2].getValue()>ls[2].getValue()) {
					System.out.println("获胜者是张三");
				}else {
					System.out.println("获胜者李四");
					
				}
			}else if(st1.equals(st3)) {
				if(zs[2].getValue()>ww[2].getValue()) {
					System.out.println("获胜者是张三");
				}else {
					System.out.println("获胜者王五");
					
				}
			}else if(st2.equals(st3)) {
				if(ls[2].getValue()>ww[2].getValue()) {
					System.out.println("获胜者是李四");
				}else {
					System.out.println("获胜者王五");
					
				}
			}else if(st1.equals("顺子")) {
				System.out.println("张三获胜");
			}else if(st2.equals("顺子")) {
				System.out.println("李四获胜");
			}else {
				System.out.println("王五获胜");
			}
		}else if(st1.equals("同花顺")||st2.equals("同花顺")||st3.equals("同花顺")) {
			if(st1.equals(st2)&&st2.equals(st3)) {
				with(zs,ls,ww);
			}else if(st1.equals(st2)) {
				if(zs[2].getValue()>ls[2].getValue()) {
					System.out.println("获胜者是张三");
				}else {
					System.out.println("获胜者李四");
					
				}
			}else if(st1.equals(st3)) {
				if(zs[2].getValue()>ww[2].getValue()) {
					System.out.println("获胜者是张三");
				}else {
					System.out.println("获胜者王五");
					
				}
			}else if(st2.equals(st3)) {
				if(ls[2].getValue()>ww[2].getValue()) {
					System.out.println("获胜者是李四");
				}else {
					System.out.println("获胜者王五");
					
				}
			}else if(st1.equals("顺子")) {
				System.out.println("张三获胜");
			}else if(st2.equals("顺子")) {
				System.out.println("李四获胜");
			}else {
				System.out.println("王五获胜");
			}
		}else {
			start(st1,st2,st3,zs,ls,ww);
		}
//		if((!(zs[0].getType()==zs[1].getType()&&zs[0].getType()==zs[2].getType()))&&(!(ls[0].getType()==ls[1].getType()&&ls[0].getType()==ls[2].getType()))&&(!(ww[0].getType()==ww[1].getType()&&ww[0].getType()==ww[2].getType()))) {
//			if(((zs[0].getValue()==zs[1].getValue()&&zs[1].getValue()==zs[2].getValue()))&&((ls[0].getValue()==ls[1].getValue()&&ls[1].getValue()==ls[2].getValue()))&&((ww[0].getValue()==zs[1].getValue()&&ww[1].getValue()==ww[2].getValue()))) {
				
//			int min = zs[2].getValue();
//				if()
//			}
//		}else {
			
//		}
		
			
		}
	public void with(Card[] zs,Card[] ls,Card []ww) {
		int max = zs[2].getValue();
		if(ls[2].getValue()>max) {
			if(ls[2].getValue()> ww[2].getValue()) {
				max = ls[2].getValue();
				System.out.println("获胜者是李四");
			}else {
				System.out.println("获胜者是王五");
			}
			
		}else {
			if(ww[2].getValue()>max) {
				max = ww[2].getValue();
				System.out.println("获胜者是王五");	
			}else {
				System.out.println("获胜者是张三");
			}
	   }
	   
	}
	public void start(String st1,String st2,String st3,	Card[] zs,Card[] ls,Card []ww) {
		if(st1.equals(st2)&&st2.equals(st3)) {
			with(zs,ls,ww);
		}else if(st1.equals(st2)) {
			if(zs[2].getValue()>ls[2].getValue()) {
				System.out.println("获胜者是张三");
			}else {
				System.out.println("获胜者李四");
				
			}
		}else if(st1.equals(st3)) {
			if(zs[2].getValue()>ww[2].getValue()) {
				System.out.println("获胜者是张三");
			}else {
				System.out.println("获胜者王五");
				
			}
		}else if(st2.equals(st3)) {
			if(ls[2].getValue()>ww[2].getValue()) {
				System.out.println("获胜者是李四");
			}else {
				System.out.println("获胜者王五");
				
			}
		}else if(st1.equals("顺子")) {
			System.out.println("张三获胜");
		}else if(st2.equals("顺子")) {
			System.out.println("李四获胜");
		}else {
			System.out.println("王五获胜");
		}
	}
	
	
	
}