package day13;

import java.util.Arrays;

public class Day13_14 {

	public static void main(String[] args) {
		Persones c1 = new Persones("张三",21);
		Persones c2 = new Persones("李四",23);
		Persones c3 = new Persones("王五",22);
		Persones[] person = new Persones[]{c1,c2,c3};
		Arrays.sort(person,new Comparable<Persones>() {
			@Override
			public int compareTo(Persones o1,Persones o2) {
				
				return o1.getAge()-o2.getAge();
			}
			
			
		
			
		};)
//				(Persones o1,Persones o2)
//			->{return o1.getAge()-o2.getAge();});
		System.out.println(Arrays.toString(person));
	}
	
	
	
}
class Persones{
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "Persones [name=" + name + ", age=" + age + "]";
	}
	public Persones(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
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
	

	
}