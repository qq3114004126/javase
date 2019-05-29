package day10;

public class Day10_12 {

	public static void main(String[] args) {
		 CurrentPage c = new  CurrentPage(5,1);
		 c.print(3);
		 
		 
	}

}
class Page {
	int SumPage = 20;
	private int record=5;
	public Page() {
		super();
		
	}
	public int getRecord() {
		return record;
	}
	public void setRecord(int record) {
		this.record = record;
	}
//	void print() {
//		for(int i = 0;i<=4;i++) {
//			System.out.println("当前页的信息："+this.record+"当前页码"+this.s);
//		}
//	}
	
}
class CurrentPage extends Page{
	private int num=1;
	public CurrentPage() {
		super();
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public CurrentPage(int record, int num) {
		super();
		
	}
	void print(int number) {
		for(int i = 0;i<number;i++) {
			System.out.println("当前页的信息："+this.num+super.getRecord()+super.SumPage);
			this.num++;
			
		}
		System.out.println();
	}
	
}
