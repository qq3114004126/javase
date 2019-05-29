package polesystem;

import java.util.ArrayList;
import java.util.List;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class card{
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
	public card(String type, String value, Integer reavalue) {
		super();
		this.type = type;
		this.value = value;
		this.reavalue = reavalue;
	}
	public card() {
		super();
	}
	@Override
	public String toString() {
		return "card [type=" + type + ", value=" + value + ", reavalue=" + reavalue + "]";
	}
	
	
}

class cards{
	List<card>list = new ArrayList<>();
	
	public List<card> getList() {
		return list;
	}

	public void setList(List<card> list) {
		this.list = list;
	}

	public cards() {
		List<String>type =new ArrayList();
		type.add("4♠");
		type.add("3♥");
		type.add("2♦");//"4♠", "3♥", "2♦", "1♣"
		type.add("1♣");
		List<String>values =new ArrayList();
		for(int i = 0;i<9;i++) {
			values.add(String.valueOf(i+2));
		}
		values.add("J");
		values.add("Q");
		values.add("K");
		values.add("A");
	}

	public cards(List<card> list) {
		super();
		this.list = list;
	}

	@Override
	public String toString() {
		return "cards [list=" + list + "]";
	}
	
	
}