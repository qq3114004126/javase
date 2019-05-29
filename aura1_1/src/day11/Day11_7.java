package day11;

public class Day11_7 {
	public static void main(String[] args) {
		Zipml zz = new Zipml();
		System.out.println(zz.b);
		zz.run();//调的非静态的非抽象的方法
		zz.fly();
		
		Card001 cc = new Card001("张三",23,10000);
		zz.play();
		//cc.withdraw(100);
	//	zz.play(cc);
	    //A1_.print();
		//cc.query();
	
}
}
interface A1_{
	int a = 1;
	void run();
	default void fly() {
		System.out.println("汽车能飞");
	}
	static void print() {
		System.out.println("静态方法");
	}
	
}
interface B1_1 extends A1_{
	int b = 2;
	void display();
}
//interface Z extends A1_,B1_1{
//	int c = a+b;
//}
class Zipml implements A1_,B1_1{
	Card001 c;
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("接口外");
	}
	public void play() {
		System.out.println("我是play方法");
		//System.out.println("当前余额："+c.balance+c.name);
		//c.query();
		//c.withdraw(100000);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
class Card001{
	Zipml zz;
	String name;
	int age;
	int size;
	double balance;
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Card001(String name, int age, double balance) {
		super();
		this.name = name;
		this.age = age;
		this.balance = balance;
	}
	
	void withdraw(double money) {
		if(this.balance<money) {
			System.out.println("余额不足");
		}else {
			this.balance-=money;
			this.query();
			
		}
	}
	void query() {
		System.out.println(this.name+"当前余额："+this.getBalance());
	}
	
}