package day5;

public class Day5_1 {

	public static void main(String[] args) {
		Boy boy = new Boy("小明",23);
		Girl girl = new Girl("小花");
		
		//只调用girl
//		girl.merry(boy);
		boy.merry(girl);

	}

}
class Girl{
	private String name;

	public Girl() {
		super();
	}

	public Girl(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void merry(Boy boy) {
		System.out.println("我要嫁"+boy.getName());
//		boy.merry(this);
	}
}
class Boy{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public Boy() {
		super();
	}
	public Boy(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void merry(Girl girl) {
		System.out.println("我要娶"+girl.getName());
		girl.merry(this);
	}
}