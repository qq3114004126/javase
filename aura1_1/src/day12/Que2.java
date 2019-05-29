package day9.day8homework;
//2.	设计一个建筑标准接口（建筑需要有开门关门功能）、银行标准接口（银行可以取钱）、
//金融机构类（货币可以流通），创建一个“工商银行”实现如上的接口并继承相关的类。
//当对于抽象关系来来说，不考虑继承，只考虑方法的重写——————接口和实现类之间的关系。
//要求实现类一定要实现接口下的抽象方法。
//进行一个接口，使用多个实现类实现，
//一个实现类，实现多个接口。
//接口----规范。
interface Build{
	void open();
	void close();
	default void m(){
	}
}

interface Bank{
	void deposit();
	void withdraw();
}

abstract class Financial{
	abstract void money();
}

// 继承关系：关注的不仅仅是方法，更加关注的成员（属性、方法），至于是否要重写，取决于业务。
class ICBC extends  Financial implements Build,Bank{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void money() {
		// TODO Auto-generated method stub
		
	}
	
}


public class Que2 {
	public  void test(Bank i){
		i.deposit();
	}
  public static void main(String[] args) {
	 ICBC i=new ICBC();
//	 i.
//	 父类引用中指向子类对象
	 Que2 q=new Que2();
	 q.test(i);
}
}
