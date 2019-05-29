package bookstoresystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class pole {

	public static void main(String[] args) {
		Cards cs = new Cards();

	}

}
class Card{
	private String type;
	private String value;
	private Integer reavalue;
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
	public Integer getReavalue() {
		return reavalue;
	}
	public void setReavalue(Integer reavalue) {
		this.reavalue = reavalue;
	}
	public Card(String type, String value, Integer reavalue) {
		super();
		this.type = type;
		this.value = value;
		this.reavalue = reavalue;
	}
	public Card() {
		super();
	}
	@Override
	public String toString() {
		return "Card [type=" + type + ", value=" + value + ", reavalue=" + reavalue + "]";
	}
}
class Cards{
	List<Card>list = new ArrayList<Card>();
	
	public Cards() {
		String[] types = {"4♠","3♥","2♦","1♣"};
		String[] values = new String[13];
		for(int i = 0;i<9;i++) {
			values[i]=String.valueOf(i+2);
		}
		values[9]="J";
		values[10]="Q";
		values[11]="K";
		values[12]="A";
		int index = 0;
		for(String i:types) {
			for(String j:values) {
				this.list.add(new Card(i,j,index+1));
				index++;
			}
		}
		
		//list.forEach(System.out::println);
	}

	public List<Card> getList() {
		return list;
	}

	public void setList(List<Card> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Cards [list=" + list + "]";
	}
	
}
class Player{
	String str="";
	static Random r = new Random();
	String name;
	List<Card>sample = new ArrayList<>();
	
	public List<Card> getSample() {
		return sample;
	}

	public void setSample(List<Card> sample) {
		this.sample = sample;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player(String name) {
		super();
		this.name = name;
	}
	
	public String str(Player p) {
		for(Card i:p.getSample()) {
			str+=i.toString();
		}
		return str;
		
	}
	        //抽取三张牌
	public void getSamples(Cards cs) {
		for(int i = 0;i<3;i++) {
		this.sample.add(cs.getList().get(r.nextInt(cs.getList().size())));
		this.sample.remove(r.nextInt(cs.getList().size()));
		}
		sample.sort((c1,c2)->c1.getReavalue()-c2.getReavalue());
	}
	Card c1 = sample.get(0);
	Card c2 = sample.get(1);
	Card c3 = sample.get(2);
	public Integer[] getResult(){
		Integer[] result;
	if(c1.getReavalue()==c2.getReavalue() && c1.getReavalue()==c3.getReavalue()){
		this.str+="三条";
		result=new Integer[]{6,c1.getReavalue(),0,0,0};
	}else if(c1.getReavalue()==c2.getReavalue()){
		this.str+="一对";//334   
		result=new Integer[]{2,c2.getReavalue(),c3.getReavalue(),Integer.parseInt(c3.getType().substring(0, 1)),0};
	}else if( c2.getReavalue()==c3.getReavalue()){
		this.str+="一对";//566
		result=new Integer[]{2,c2.getReavalue(),c1.getReavalue(),Integer.parseInt(c1.getType().substring(0, 1)),0};
	}else if(c1.getReavalue()+1==c2.getReavalue() && c2.getReavalue()+1==c3.getReavalue()
			&&c1.getType().equals(c2.getType())&&c2.getType().equals(c3.getType())){
		this.str+="同花顺";
		result=new Integer[]{5,c3.getReavalue(),Integer.parseInt(c3.getType().substring(0, 1)),0,0};
	}else if(c1.getReavalue()+1==c2.getReavalue() && c2.getReavalue()+1==c3.getReavalue()){
		this.str+="顺子";
		result=new Integer[]{3,c3.getReavalue(),Integer.parseInt(c3.getType().substring(0, 1)),0,0};
	}else if(c1.getType().equals(c2.getType())&&c2.getType().equals(c3.getType())){
		this.str+="同花";
		result=new Integer[]{4,c3.getReavalue(),c2.getReavalue(),c1.getReavalue(),Integer.parseInt(c3.getType().substring(0, 1))};
	}else{
		this.str+="散牌";
		result=new Integer[]{1,c3.getReavalue(),c2.getReavalue(),c1.getReavalue(),Integer.parseInt(c3.getType().substring(0, 1))};
	}
//	System.out.println(this.resultStr);
	return result;
	
}
	
	
	
	
}
class Game{
	List<Player> player;
	public List<Player> getPlayer() {
		return player;
	}
	public void setPlayer(List<Player> player) {
		this.player = player;
	}
	public void play() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输出共有多少选手比赛");
		int num = sc.nextInt();
		for(int i = 0;i<num;i++) {
			new Player("选手"+(i+1));
		}
	}
	public void playersample(Cards cs) {
		for(Player player:this.player) {
			player.getSamples(cs);
		}
	}
	class MyComparator implements Comparator<Integer[]>{

		@Override
		public int compare(Integer[] o1, Integer[] o2) {
			int v = 0;
			
			return v;
		}
		
	}
	public void comare() {
//		需要选择一个集合类型容器装入所有的结果
//		SortedSet和SortedMap
//		结果中，不仅要比较大小，还需要知道哪一个是最大的  所以选择map
//		map中可以使用（比较的 结果key）  把人当value
		SortedMap<Integer[],Player>map = new TreeMap<Integer[],Player>(new MyComparator());
		for(Player player:this.player) {
			map.put(player.getResult(), player);
			System.out.println(player.getName()+" ,"+player.getResult());
		}
		//显示最终赢家
		System.out.println("赢家,"+map.get(map.lastKey()).getName());
	}
	public static void main(String[] args) {
		Cards cs = new Cards();
		Game gg = new Game();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("请输入有多少个玩家：");
		 int num = sc.nextInt();
		 gg.play();
		 
		 gg.playersample(cs);
		 gg.comare();
	}
	
	
		
		
	
}