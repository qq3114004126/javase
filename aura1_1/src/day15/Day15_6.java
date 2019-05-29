package day15;

import java.util.Arrays;
import java.util.Comparator;

public class Day15_6 {

	public static void main(String[] args) {
	
		MemberGroup mm = new MemberGroup();
		mm.add();
	}

}
//尝试使用comparable接口和Comparator比较器实现比较。
//如“VIP类”中有name和age、积分，将多个人放入到数组中后，
//可以调用Arrays中的sort方法。定义一个会员类，会员有编号，
//名字，积分。编写外部比较器，实现按积分降序排序。


class MemberId{
	
	String name;
	int age;
	int score;
	
	
	
	public MemberId() {};
	public MemberId(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String getName() {
		return name;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "["+" name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
}
class MemberGroup{
	
	MemberId[] member = new MemberId[5];
	public MemberGroup() {
		
	}
	public void add() {
		int[] ageGroup={21,22,12,16,17};
		String[] nameGroup= {"张三","李四","王五","刘六","赵四"};
		int[] scoresGroup={120,122,105,32,35};
		for(int i = 0;i<member.length;i++) {
			member[i]=new MemberId(nameGroup[i],ageGroup[i],scoresGroup[i]);
		}
		Arrays.sort(member,new Comparator<MemberId>(){

			@Override
			public int compare(MemberId o1, MemberId o2) {
				
				return o2.age-o1.age;
			}
			
		});
		System.out.println(Arrays.toString(member));
	}
}