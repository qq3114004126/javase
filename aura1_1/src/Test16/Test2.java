package Test16;

import day13.Commond;
import day13.ProcessArray;

/*
 * lambda表达式的应用
 * 【作用】实现接口中 一个方法（甚至连实现类都不需要）
 * 【匿名类】：
 * 内部类：（1）静态成员类、（2）实例成员类  （3）局部类   （4）匿名类（可以是内部类、甚至可以对于普通的类也可以定义匿名类（要求：只使用一次））
// *     匿名类设计的初衷来源于内部类
 * lambda表达式也可以只代表一个普通的实现类
 * deawith（Persons [] person , Rule  r）
 * 
 * 当我们去设计一个接口的实现的时候，有几种方式：
 * （1）在外部创建新的实现类，实现接口。 MyRule  implements  Rule
 * 一个MyRule实现类 就是一个规则，看规则本身是否通用，可以设计成新的实现类。
 * 目的在于其他的业务逻辑中也可以调用到通用模块
 * 
 * （2）使用当前类来实现接口。  Test implements Rule
 * 当前测试的类跟接口，联系过于紧密，当业务逻辑越来越复杂的是，代码的可读性， 可扩展性
 * Test假如选课中一个模块。主要实现的功能：根本不是为了验证Rule，只不过选课的过程中需要通过rule进行校验而已
 * if()
 * 
 * （3）在测试类的，方法中定义局部类，在局部类中实现接口。
 * 第一：解决（2）中出现的问题
 * 第二：实现类在方法中实现，如果返回值返回接口类型的对象，相当于扩大了实现类对象的作用域
 * 类中---方法中---实现类：类和接口实现完全符合的时候，其他的模块根部不 会用到实现。
 */
//解决筛选人的问题
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

//方式一使用外部实现类实现规则Rule接口
//interface Rule{
//	boolean check(Person p);
//}
//class MyRule1 implements Rule{
//	@Override
//	public boolean check(Person p) {
//		return p.getAge()>18;
//	}
//}
//class MyRule2 implements Rule{
//	@Override
//	public boolean check(Person p) {
//		return p.getAge()<52;
//	}
//}
//public class Que4 {weeeeeeeeeeeeeeeeee
////	每次通过传入参数的形式，设置条件，不适用于众多的规则实现
////	所以条件设置成接口，只要去讲接口做对应实现即可（不同规则） 
////   public void  dealwith(Person []persons,int min,int max){
////	   for(Person p:persons){
//////		   筛选大于18岁
////		   if (p.getAge()>min){
////			   System.out.println(p.getName());
////		   }
////	   }
////   }
//	
//	
//	  public void  dealwith(Person []persons,Rule r){
//		   for(Person p:persons){
//			   if (r.check(p)){
//				   System.out.println(p.getName());
//			   }
//		   }
//	   }
//     public static void main(String[] args) {
//    	Que4 q=new Que4();
//	    Person[] persons=new Person[3];
//		persons[0]=new Person("张三",18,150,130);
//		persons[1]=new Person("李四",20,180,130);
//		persons[2]=new Person("王五",52,150,130);
////		筛选符合条件的人
////		创建实现类的对象
//		MyRule1 myrule1=new MyRule1();
//		MyRule2 myrule2=new MyRule2();
//		q.dealwith(persons, myrule1);
//		q.dealwith(persons, myrule2);
//}
//}


//方式二：使用局部类实现接口
//interface Rule{
//	boolean check(Person p);
//}
//public class Que4 {
//	匿名类的定义方式   new 接口(){};
//	public Rule getRule(){
//		class MyRule1 implements Rule{
//			public boolean check(Person p){
//				return p.getAge()>18;
//			}
//		}
//		MyRule1 m1=new MyRule1();
//		return m1;
//	}
//	匿名类
//	public Rule getRule(){
//		class MyRule1 implements Rule{
//			public boolean check(Person p){
//				return p.getAge()>18;
//			}
//		}
		
//		
//		Rule m1=new Rule(){
//			public boolean check(Person p){
//				return p.getAge()>18;
//			}
//		};
//		return m1;
		
//		简化匿名类
//		return new Rule(){
//			public boolean check(Person p){
//				return p.getAge()>18;
//			}
//		};
		
//	}
//	public void  dealwith(Person []persons,Rule r){
//	   for(Person p:persons){
//		   if (r.check(p)){
//			   System.out.println(p.getName());
//		   }
//	   }
//}
//	public static void main(String[] args) {
//		Que4 q=new Que4();
//		Person[] persons=new Person[3];
//		persons[0]=new Person("张三",18,150,130);
//		persons[1]=new Person("李四",20,180,130);
//		persons[2]=new Person("王五",52,150,130);
//		//筛选符合条件的人
//		//创建实现类的对象
////		Rule myrule1=q.getRule();
////		q.dealwith(persons, myrule1);
//		
////		将匿名类直接放到调用端
////		上面的内容哪些可以省略:public Rule getRule()省略
////		q.dealwith(persons, new Rule(){
////			public boolean check(Person p){
////			return p.getAge()>18;
////			}
////		}); 
//		
////		将匿名类简化成lambda表达  ()->{}
//		q.dealwith(persons, (Person p)->{return p.getAge()>18;});
//		q.dealwith(persons,  p-> p.getAge()>18);
//		
//	}
//}



/*
 * 
4.	定义一个ProcessArray（数组处理）类，里面有一个process
 (int[] target,Commond commond)方法（处理方法），
 其中Commond是个接口，里面有一个抽象方法process(int[] target)。
 现创建一个数组处理的processArray对象，传入指定的一个数组，
 通过process方法就可以处理这个指定数组。处理的规则在Commond的实现中实现，（如实现方法中计算数组的总和），分别使用匿名类和lambda表达式来进行测试。——按某种规则处理数组。
 */
@FunctionalInterface
//interface Commond{
//	void process(int []t);
//}
interface Commond{
	int process(int []t);
}
class ProcessArray{
	public int process (int [] t,Commond c){
		return c.process(t);
//		System.out.println(c.process(t));
		
	}
}

public class Que4 {
  public static void main(String[] args) {
	  ProcessArray pa=new ProcessArray();
	  int[] target={1,2,3,4,5};
//	  pa.process(target, new Commond(){
//		  public i process(int [] t){
//			  int temp=0;
//			  for(int i:t){
//				  temp+=i;
//			  }
//			  System.out.println(temp);
//		  }
//	  });
//	  返回值，不是直接输出
	  int result=pa.process(target, new Commond(){
		  public int process(int [] t){
			  int temp=0;
			  for(int i:t){
				  temp+=i;
			  }
			  return temp;
		  }
	  });
	  System.out.println(result);
	  
  }
}