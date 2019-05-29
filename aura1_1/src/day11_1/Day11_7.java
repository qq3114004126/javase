package day11_1;

import java.util.Arrays;

public class Day11_7 {

	public static void main(String[] args) {
		Cardss cc = new Cardss();

	}

}
class Cardss{
	
	String[] types = new types[]{"♠","♥","♣","♦"};
	String[] values = new String[13];
	
	public String[] getTypes() {
		return types;
	}
	public void setTypes(String[] types) {
		this.types = types;
	}
	public String[] getValues() {
		return values;
	}
	public void setValues(String[] values) {
		this.values = values;
	}
	
}
class Cardlists{
	Cardss []cc = new Cardss[52];
	Cardss c;
	public Cardlists() {
		for(int i = 0;i<9;i++) {
			c.values[i] = String.valueOf(i+2);
		}
		c.values[10]="J";
		c.values[11]="Q";
		c.values[12]="K";
		c.values[13]="A";
		int index = 0;
		System.out.println(Arrays.toString(c.values));
		for(int i = 0;i<4;i++) {
			for(int j = 0;j<13;j++) {
				this.cc[index]=
				index++;
			}
		}
	}
	
	
}