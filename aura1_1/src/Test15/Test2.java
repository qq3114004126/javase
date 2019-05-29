package Test15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.CompletableFuture;

public class Test2 {
	public void dealwith(Person[] persons,Rule r) {
		for(Person i:persons){
			if(r.check(i)) {
			System.out.println(i.getName());
		}
	}
}
	public static void main(String[] args) {
		Person p1 = new Person("张三",21,165,60);
		Person p2 = new Person("李四",21,165,60);
		Person p3 = new Person("王五",32,165,60);
		Person p4 = new Person("赵六",21,165,60);
		MovieStar mm = new MovieStar();
		String []name = {"周杰伦","郭富城","张学友","黎明","刘德华","周润发","周星驰"};
		int []age = {38,54,55,56,53,62,57};
		int []height = {178,165,173,178,167,173,174};
		int []weight = {75,65,66,60,70,80,56};
		Person [] persons = new Person[7];
		for(int i = 0;i<name.length;i++) {
			if(persons[i]==null) {
				System.out.println("人数已满");
				break;
			}else {
			 persons[i] = new Person(name[i],age[i],height[i], weight[i]);
			}
		}
		Test2 tt = new Test2();
		Myrule myrule = new Myrule();
		Myrule myrule1 = new Myrule();
		tt.dealwith(persons, myrule1);
		//tt.dealwith(persons, myrule);
	}

}
class Person{
	private String name;
	private int age;
	private int height;
	private int weight;
	public Person(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}


	 
}
interface Rule{
	boolean check(Person p);
	
}
class Myrule implements Rule{

	@Override
	public boolean check(Person p) {
		return p.getAge()>50;
	}

}
class Myrule1 implements Rule{
	
	@Override
	public boolean check(Person p) {
		
		return p.getHeight()>160;
	}
	
}
class MovieStar{
	String name;
	int age;
	int height;
	
	
	public MovieStar() {
		super();
	}
	public MovieStar(String name, int age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
//	@Override
//	public String toString() {
//		return "MovieStar [name=" + name + ", age=" + age + ", height=" + height + "]";
//	}
	
}