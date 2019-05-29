package day13;

import java.util.function.Predicate;

//import day12.Day9_1_InnerClass;
//import day12.MyRule1;
//import day12.Person;
//import day12.Rule;

public class Day13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Person{
	private String name;
	private int age;
	private int height;
	private int weight;
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
	public Person(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}
//实现单一规则可以 测试类
interface Rule{
	boolean check(Person p);//方法
}
class MyRule1 implements Rule{
	@Override
	public boolean check(Person p) {
		return p.getAge()>=18&&p.getAge()<=52;
	}
}
class Day9_1_InnerClass{
//	public void dealwith(Person [] persons,int min,int max){
	public void dealwith(Person [] persons,Rule r){
//		比如，筛选>=18的人
		for (Person p:persons){
//			if(p.getAge()>=min&&p.getAge()<=max){
		    if(r.check(p)){
				System.out.println(p.getName());
			}
		}
	}
	
//	直接使用java已提供的API Predicate接口，是函数式接口  test方法
	public void dealwith1(Person [] persons,Predicate<Person> r){
//		比如，筛选>=18的人
		for (Person p:persons){
//			if(p.getAge()>=min&&p.getAge()<=max){
		    if(r.test(p)){
				System.out.println(p.getName());
			}
		}
	}
	public static void main(String[] args) {
		Day9_1_InnerClass c=new Day9_1_InnerClass();
		Person[] persons=new Person[3];
		persons[0]=new Person("张三",18,150,130);
		persons[1]=new Person("李四",20,180,130);
		persons[2]=new Person("王五",52,150,130);
		c.dealwith(persons, new MyRule1());//有实现类,有了规则，按照实现类删选Person的规则
		
		c.dealwith(persons, new Rule(){//匿名实现类
			public boolean check(Person p2){
				return p2.getAge()>=18&&p2.getAge()<=52;
			}
		});
//		c.dealwith(persons,(Person p2)->{return p2.getAge()>=18&&p2.getAge()<=52;});//lambda表达
		c.dealwith(persons,p2->p2.getAge()>=18&&p2.getAge()<=52);//lambda表达
		c.dealwith(persons,p2->p2.getHeight()>170);//lambda表达
		return ()->{
			
		};
		c.dealwith1(persons,p2->p2.getHeight()>170);//lambda表达
		
	}
}