package day8;

public class Day8_7 {

	public static void main(String[] args) {
		Card card1 = new Card("黑桃",'A');
		Card card2 = new Card("红桃",'A');
		Card card3 = new Card("方块",'A');
		Card card4 = new Card("花色",'A');
		card1.display();
		card2.display();
		card3.display();
		card4.display();
		Cards cards = new Cards();
		cards.display();
	}

}
class Card{
	String color;
	char id;
	
	
	public Card(String color,char id) {
		this.color = color;
		this.id = id;
	}
	void display() {
		
		System.out.println("牌花色："+color+",牌面："+id);
		
		
	}
}
class Cards{
	int number;
	char id;	
	String []arr = {"黑桃","红桃","梅花","方块"};
	String []arr1 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	void display() {
		int n = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j = 0;j<arr1.length;j++) {
				System.out.print(arr[i].concat(arr1[j])+"\t");
				n++;
				if(n%4==0) {
					System.out.println();
				}
			}
		}
		System.out.println("共输出"+n+"张");
	}
}