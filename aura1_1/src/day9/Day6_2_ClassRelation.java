package day6;
/*第七章 类和类之间的关系
 * 背景 ：Person来说，人和人交朋友的方法？
 * Person 行为makefriend()
 * public void makefriend(Person otherp)
 *    this.name  othername
 * }
 * 
 * 在java中类和类之间有几种关系？
 * 关联关系
 * 依赖关系
 * 继承关系（后续）
 * 实现关系（后续）
 * 
 * 
 * 一、依赖关系
 * 一个类充当另外一个类的形式参数。可以形容成一个类使用到 另外一个类    use，临时性，关系非常弱。
 * 称为Person类依赖于Bus 和Place
 */
//class Bus{
//	String no;
//}
//class Place{
//	
//}
//class Person{
//	void sleep(){
//		
//	}
//	void travel(Bus bus){
//		System.out.println();
//	}
//	void run(Place p){
//		
//	}
//}
//public class Day6_2_ClassRelation {
//    
//}

//二、关联关系
// 背景：源于依赖关系，因为依赖关系类和类之间的关系十分松散，有的时候，需要经常性使用到一个类 
//     可以使用关联关系解决
// 1. 【关联关系】一个类作为另外一个类的属性类型    has 的关系  比较紧密
//
//class Card{
//	void a(){
//		
//	}
//}
//class ATM{
//	Card c;
//	void test(){
//		
//	}
//	
//	void withdraw(double money){
//		this.c.a();
//	}
//	void deposit(double money){
//		
//	}
//}
//2. 关联关系的方向
//分为两种情况：单向关联，双向关联
//单向关联：A关联B   A中有B作为属性，但是B中没有A作为属性
//双向关联：A关联B  B关联A
//关联的好处：可以通过关联类 ，来调用关联类下的方法。
//class Person{
//	Phone phone;
//	void a(){
//		this.phone.call();
//	}
//	void b(){
//		
//	}
//}
//
//class Phone{
//	Person person;
//	void call(){
//		
//	}
//	void c(){
//		this.person.b();
//	}
//}


//3.关联关系的多重性
//一对一
//一对多
//class PubClass{//一对多
//	Person[]  persons;
//}
//class Person{//一对一
//	PubClass pubclass;//成员变量
//	String name;
//	int age;
//}


//4.关联关系的特殊情况
//【组合】对于关联关系的类声明：可以在声明的同时进行初始化（new 对象）
//      Person类创建对象的时候，一定会创建一个Pubclass的对象。
//【聚合】不是在声明的同时进行初始化，而是在使用之前初始化。
//      Person类在创建对象的时候，Pubclass不一定创建对象。
class PubClass{//一对多
}
class Person{//一对一
//	PubClass pubclass=new PubClass();//成员变量  组合
	PubClass pubclass;
	String name;
	int age;
	
}

//三、关联关系和依赖关系的区别
// 关联关系：属性的角色，比较紧密，has，长久
// 依赖关系：形式参数的角色，比较松散，use，临时性，瞬时

//Log类和 Card类



