package day11;

public class Day11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 interface A{
	 //接口中的内容  抽象方法成员变量
	 //public static final 常量名=初始化值;
	 //
	 int x = 1;
	void test();
	//1.8的新特性 非抽象方法    //接口无构造器
	//非静态
	default void fun1() {
		
	}
	//静态
 static void fun2() {
		
	}
 //实现接口
 
		 
 }