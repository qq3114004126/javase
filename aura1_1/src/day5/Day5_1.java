package day5;

public class Day5_1 {

	public static void main(String[] args) {
		Boy boy = new Boy("С��",23);
		Girl girl = new Girl("С��");
		
		//ֻ����girl
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
		System.out.println("��Ҫ��"+boy.getName());
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
		System.out.println("��ҪȢ"+girl.getName());
		girl.merry(this);
	}
}