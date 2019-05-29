package day20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

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
//3.   砸金花程序完成。面向对象的思维。Card  Cards  Person  Game  
//级别比较：三条> 同花顺> 同花 > 顺子 > 一对 >散牌
//花色比较：红桃>黑桃>方片>草花
//同级别比较：
//三条：比较值大小即可[级别，最大值realvalue]  2
//同花顺：比较最大的值，如果最大值相同，比较最大值花色  【级别，最大值，最大值的花色】3
//同花： 最大值，如果最大值相同，比较第二个最大值，比较第三个值，比较花色
//顺子：比较最大值，比较最大值花色
//一对：比较一对的值 ，比较第三张牌的大小，第三张牌的花色
//散牌：比较最大一张牌的值，如果一样，比较第二大的牌的值，如果一样，比较第三张牌的值，如果一样，比较最大牌的花色
//
//提示，可以将抽取的三张牌，数据存储到一个数组中，包括以上的信息如{级别,最大牌的值，第二大牌的值，第三大牌的值，最大牌的花色}  数组的长度，是以上最复杂的一个比较的个数(如同花，5个元素)，
//然后创建比较器，比较，多个数组的大小。
//
//String   Integer
// 1                             14
//{级别,最大牌的值，第二大牌的值，第三大牌的值，最大牌的花色4红桃  2方片} 
//
//2                              9
//{级别,最大牌的值，第二大牌的值，第三大牌的值，最大牌的花色} 
//
//3
//{级别,最大牌的值，第二大牌的值，第三大牌的值，最大牌的花色} 
class Card {
	private String type;
	private String value;
	private int realvalue;

	public Card(String type, String value, int realvalue) {
		this.type = type;
		this.value = value;
		this.realvalue = realvalue;
	}

	@Override
	public String toString() {
		return "【" + type.substring(1) + value + "】";
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

}

class Player {
	private String name;
	private String resultStr;// 存储抽取的三张牌显示结果（【♠5】【♠6】【♠7】三条）
	// 将每个人最终的结果存储到Integer[]中，{级别 ，同级别的规则}
	private List<Card> samplelist = new ArrayList();

	// 抽取三张牌sample
	public void sample(Cards cards) {
		List<Card> li = new ArrayList<Card>();
		Random r = new Random();
		List<Card> cardlist = cards.getCardlist();
		for (int i = 0; i < 3; i++) {
			int index = r.nextInt(cardlist.size());
			li.add(cardlist.get(index));
			cardlist.remove(index);
		}
		this.samplelist = li;
	}

	// 抽取三张牌获得结果
	// 将结果存储到getResult的返回值中，形式Integer[]
	public Integer[] getResult() {
		Integer[] result;
		this.resultStr = "";
		for (Card card : this.samplelist) {
			this.resultStr += card.toString();
		}
		samplelist.sort((c1, c2) -> c1.getRealvalue() - c2.getRealvalue());
	    samplelist.forEach(System.out::println);
		Card c1 = this.samplelist.get(0);
		Card c2 = this.samplelist.get(1);
		Card c3 = this.samplelist.get(2);
		// 三条：三张牌value一样
		// 一对：两张value一样
		// 顺子：三张牌挨着 realvalue 3 5 4 3 4 5
		// 同花：三张牌type一样
		// 同花顺：挨着，类型一样
		// 其余都是散牌
		if (c1.getRealvalue() == c2.getRealvalue() && c1.getRealvalue() == c3.getRealvalue()) {
			this.resultStr += "三条";
			result = new Integer[] { 6, c1.getRealvalue(), 0, 0, 0 };
		} else if (c1.getRealvalue() == c2.getRealvalue()) {
			this.resultStr += "一对";// 334
			result = new Integer[] { 2, c2.getRealvalue(), c3.getRealvalue(),
					Integer.parseInt(c3.getType().substring(0, 1)), 0 };
		} else if (c2.getRealvalue() == c3.getRealvalue()) {
			this.resultStr += "一对";// 566
			result = new Integer[] { 2, c2.getRealvalue(), c1.getRealvalue(),
					Integer.parseInt(c1.getType().substring(0, 1)), 0 };
		} else if (c1.getRealvalue() + 1 == c2.getRealvalue() && c2.getRealvalue() + 1 == c3.getRealvalue()
				&& c1.getType().equals(c2.getType()) && c2.getType().equals(c3.getType())) {
			this.resultStr += "同花顺";
			result = new Integer[] { 5, c3.getRealvalue(), Integer.parseInt(c3.getType().substring(0, 1)), 0, 0 };
		} else if (c1.getRealvalue() + 1 == c2.getRealvalue() && c2.getRealvalue() + 1 == c3.getRealvalue()) {
			this.resultStr += "顺子";
			result = new Integer[] { 3, c3.getRealvalue(), Integer.parseInt(c3.getType().substring(0, 1)), 0, 0 };
		} else if (c1.getType().equals(c2.getType()) && c2.getType().equals(c3.getType())) {
			this.resultStr += "同花";
			result = new Integer[] { 4, c3.getRealvalue(), c2.getRealvalue(), c1.getRealvalue(),
					Integer.parseInt(c3.getType().substring(0, 1)) };
		} else {
			this.resultStr += "散牌";
			result = new Integer[] { 1, c3.getRealvalue(), c2.getRealvalue(), c1.getRealvalue(),
					Integer.parseInt(c3.getType().substring(0, 1)) };
		}
		// System.out.println(this.resultStr);
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getSamplelist() {
		return samplelist;
	}

	public void setSamplelist(List<Card> samplelist) {
		this.samplelist = samplelist;
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getResultStr() {
		return resultStr;
	}

	public void setResultStr(String resultStr) {
		this.resultStr = resultStr;
	}

}

class Cards {
	private static Random r = new Random();
	// 52张牌，52个Card类型的对象
	private List<Card> cardlist = new ArrayList();

	public Cards() {
		// {card1,card2,card3 }
		// 拼凑52张牌
		String[] types = new String[] { "4♠", "3♥", "2♦", "1♣" };
		String[] values = new String[13];
		for (int i = 0; i < 9; i++) {
			values[i] = String.valueOf(i + 2);
		}
		// 2 3 4 5 6 7....10 J Q K A
		// 2 3 11 12 13 14

		values[9] = "J";//
		values[10] = "Q";
		values[11] = "K";
		values[12] = "A"; // 14
		// int index=0;
		for (String t : types) {
			for (int i = 0; i < values.length; i++) {
				this.cardlist.add(new Card(t, values[i], i + 2));
				// index++;
			}
		}
	}

	public List<Card> getCardlist() {
		return cardlist;
	}

	public void setCardlist(List<Card> cardlist) {
		this.cardlist = cardlist;
	}
}

// [1,2,3]
// [1,5,3]
class MyCompartor implements Comparator<Integer[]> {
	@Override
	public int compare(Integer[] o1, Integer[] o2) {
		int v = 0;
		for (int i = 0; i < o1.length; i++) {
			v = o1[i] - o2[i];
			if (v != 0)
				break;
		}
		return v;// 一定是正数或者是负数，不可能是0
	}
}

public class CardGame {
	private List<Player> players;

	public void playerSample(Cards cs) {
		for (Player player : players) {
			player.sample(cs);
		}
	}

	public void compare() {
		// 需要选择一个集合类型容器装入所有的结果
		// SortedSet和SortedMap
		// 结果中，不仅要比较大小，还需要知道哪一个是最大的 所以选择map
		// map中可以使用（比较的 结果key） 把人当value
		SortedMap<Integer[], Player> map = new TreeMap<Integer[], Player>(new MyCompartor());
		for (Player player : this.players) {
			map.put(player.getResult(), player);
			System.out.println(player.getName() + "," + player.getResultStr());
		}
		// 显示最终的赢家
		System.out.println("赢家：" + map.get(map.lastKey()).getName());
	}

	public List<Player> creatPlayer(int count) {
		List<Player> list = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			list.add(new Player("玩家" + (i + 1)));
		}
		return list;
		//返回的list数组被装入到成员变量players中
	}

	public static void main(String[] args) {
		// 组成52张牌
		Cards cs = new Cards();
		CardGame g = new CardGame();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入有多少个玩家：");
		g.setPlayers(g.creatPlayer(sc.nextInt()));
							//list数组
		g.playerSample(cs); // 等于count
		// 调用每个选手的结果

		g.compare();
		// 使用SortedMap进行比较
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player>players) {
		this.players = players;
	}
}
