package day13;

public class Day13_2 {
	public static void test1(Friends f){
		Persons p1 = new Persons("张三");
		Persons p2 = new Persons("李四");
		f.makefriend(p1, p2);
		
	}
	public static void main(String[] args) {
		//Friends f1=Tool::makefriend;
		Tool tt = new Tool();
		//Friends f2=(p1,p2)->tt.makefriend(p1, p2);
		//Friends f2=tt::makefriend;
		Friends pp=Persons::makefriend;
		test1(f2);	
		
	}

}
interface Friends{
	void makefriend(Persons p1,Persons p2);
}
class Persons{
	String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Persons(String name) {
		super();
		this.name = name;
	}
	public void makefriend(Persons p1,Persons p2) {
		System.out.println(p1.name+"和"+p2.name+"交朋友");
	}
	
}
class Tool{
	public void makefriend(Persons p1,Persons p2) {
		System.out.println(p1.name+"和"+p2.name+"交朋友");
		
	}
}