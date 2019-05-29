package day12;

import day11_2.Mobile;

class Outer1{

	public Mobile1234 getMobile(){
//		class Phone implements Mobile12{//Phone 是Inner类
//			public void call(){
//				System.out.println("使用Phone打电话");
//			}
//		}
//
//		Mobile12 p = new Phone(); //父类引用指向子类对象
		return new Mobile1234(){
			public void call(){
				System.out.println("使用Phone打电话");
			}
		};
	}
}
//	public void other(){
//		Mobile12 pp = this.getMobile();
//		pp.call();
//		
//	}
	

//class Phone2{
//	有的时候，只是希望Phone2下的某一个方法，去实现Mobile
//   相当于不想让Phone2类 本身实现的接口越来越多的
//   只希望通过某个方法来实现Mobile，如果不希望Phone2实现Mobile，主需要注释掉该方法就可以
//}
interface Mobile1234{
	void call();
}
public class Day12_4{
	public static void test(Mobile1234 m){
		m.call();
	}
	public static void main(String[] args) {
		Outer1 o=new Outer1();
		//o.a();
	    Mobile1234 phone=o.getMobile();
	    test(phone);
//	    phone.call();
//	    o.other();
	}
}
//练习：让ipad打电话，创建新的Outer2   
