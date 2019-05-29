package day2;
/*
 * 第三章 操作符
 * 算术运算符
 * 关系运算符
 * 逻辑运算符
 * 赋值运算符
 * 位运算符
 */
public class Day2_3_Operator {
	public static void main(String[] args) {
//		一、算术运算符
//		三种类型：单目、双目、三目（元）
//		操作数  运算符 放在一起被称作表达式，有几个操作数就是几元运算符。
//		1. 双目运算 ： + - *  /  %
//		 +- * /
		System.out.println(10+3);
		System.out.println(10*3);
		System.out.println(10/3);//向0取整
		
//		% 取余操作
//		% mod 取余和取模，针对余数进行的操作。
//		被除数 = 除数* 商+余数
//		java中% 是取余，商向0取整
//		余数=被除数-除数*商  
		System.out.println(10%3);//10-3*(3)=1
		System.out.println(-10%3);//-10-3*(-3)=-1
//		取余操作，其实就是取余数，符号跟被除数相同。
		
//		mod（了解） 取模
//		余数=被除数-除数*商   商向下取整
//		Math.floorMod(10, 3); 
//		10-3*(3)=1
		System.out.println(Math.floorMod(10, 3));
		System.out.println(Math.floorMod(-10, 3));
//		-10-3*(-4)=2   -3.333   -4
		
//		2.三目运算符（三元表达式）
//		表达式? 表达式1:表达式2
//		含义：如果表达式返回true，则结果为表达式1，否则为表达式2.
		System.out.println(3<0?1:2);
		int gender=0;
		System.out.println(gender==0?"女":"男");
//		可以代替简单的if ---else的功能
		
//		3.单目运算符
//		（1） 取 正+ 、取负-
//		System.out.println(+100);
//		System.out.println(-100);
		
//		(2)++ --
//		分为两种操作：前置操作 ，后置操作

//		规则：无论是前++（--）还是后置++（--），总会对变量的本身进行+1或者-1
//		     不同的是，表达式结果不同。
//		前置：++exp：会对exp进行+1，表达式值是+1之后的值。
//		后置：exp++：会对exp进行+1，表达式值是+1之前的值。
//		int x=5;
//		int y=5;
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(x++);
//		System.out.println(++y);
//		System.out.println(x);
//		System.out.println(y);

//		二、关系运算符（布尔运算符）
//		返回结果是布尔 类型（true ，false）
//		==  !=  >  <  >= <=
		System.out.println(3<5);
//		System.out.println(5<=5);
		
//		==等于   !=不等于
//		如果是基本数据类型，比较的是值是否相等
//		如果是引用类型，比较的是内存地址是否是同一个。
		
//		int x=5;
//		int y=5;
//		System.out.println(x==y);
//		String s1="abc";//使用=创建的字符串，会直接创建到常量池中。
//		String s2="abc"; //s1和s2都指向字符串常量池中的同一个地址
//		System.out.println(s1==s2);
//		
//		String s3=new String("abc");
//		System.out.println(s1==s3);
//		System.out.println(System.identityHashCode(s1));
//		System.out.println(System.identityHashCode(s2));
//		System.out.println(System.identityHashCode(s3));
//		
////		System.identityHashCode(Object o) 参数是引用类型 int--Integer
////		Integer有缓存机制。
//		System.out.println(System.identityHashCode(x));
//		System.out.println(System.identityHashCode(y));
//		
//		int k1=1000;
//		int k2=1000;
//		System.out.println(System.identityHashCode(k1));
//		System.out.println(System.identityHashCode(k2));
		
//		三、逻辑运算符
//		与 && ：两个表达式中间&&, 如果两个表达式同时返回true，结果才为true，否则为false
//		或||：两个表达式中间||，如果两个表达式中有一个为true则结果为true，否则为false
//		           如果两个表达式同时为false，则结果为false，否则为true
//		非!：原来为true则返回false，否则返回true
		
		System.out.println(true&&true);
		System.out.println(false&&true);
		System.out.println(false||true);
		System.out.println(false||false);
		System.out.println(3<0 && 5>8);
		
//		java中不支持链式比较   0<2<5
		int x=2;
//		System.out.println(0<x<5);
		System.out.println(0<x && x<5);
		
		//逻辑运算符中&&  ||的短路现象。
//		&&：如果第一个表达式的值为false，则第二个表达式根本不执行
//		||：如果第一个表达式的值为true，则第二个表达式根本不执行
//		int i=1/0;
//		System.out.println(false&&(1/0)<0);
//		System.out.println(true||(1/0)<0);
		
//		！非
		System.out.println(!(3<0));
		
//		! > && > ||
		
//		四、赋值运算符
//		=  +=  -=...  >>=  <<=
		int i=1;
//		i=i+1;
		i+=1;
		System.out.println(i);
		
//		自运算解决部分强制转换的问题
		byte x1=100;
//		x1=(byte)(x1+1);
		x1+=1;
		System.out.println(x1);
		
//		特殊的应用
//		=赋值运算符本身跟操作结合，也是表达式，表达式的 结果就是赋值之后的变量的值。
		int a=1;
		System.out.println(a=2);
//		流
//		while ((a=b.readline())!=-1){
//			b.readline()
//		}
		
//		五、位运算符
//		都是运算的补码，得到的结果也是补码形式。
//		& 与   ：对位操作，两个位都是1的时候，则为1，否则为0
//		| 或   ：对位操作，两个位都是0的时候，则为0，否则为1
//		^ 异或：对位操作，相同为0，不同为1
//		<< 左位移
//		>>右位移
//		~取反：包括符号位在内所有的都取反
//		1.&
//		int a1=0b100100;
//		int b1=0b001001;
//		         000000
//		System.out.println(a1&b1);
//		int a1=-10;
//		int b1=-2;
/*      -10  10001010原码   11110110补码
 *      -2   10000010    11111110补码
 *                       11110110结果：10001010-----  -10
 */
//		2.|
//		int a1=0b100100;
//		int b1=0b001001;
////		         101101  32+8+4+1=45
//		System.out.println(a1|b1);
		
//		int a1=-10;
//		int b1=-2;
///*      -10  10001010原码   11110110补码
// *      -2   10000010    11111110补码*/
////		                 11111110  10000010  - 2 
//		System.out.println(a1|b1);
		
//		3.^
//		int a1=0b100100;
//		int b1=0b001001;
////		         101101
//		System.out.println(a1^b1);
		
//		int a1=-10;
//		int b1=-2;
///*      -10  10001010原码   11110110补码
// *      -2   10000010    11111110补码    */
//		                   00001000补码 8
//		System.out.println(a1^b1);
		
//		4.取反~
//		int a1=0b01001001;
//		         10110110： 11001010原码  -74
//		System.out.println(~a1);
		
//		5. 位移
//		（1）左位移<<n 代表向左移动n位  ，右侧以0填充，左侧按照计算机支持的位数，超过溢出
//		int a1=0b01001001;
//		        01001001
		int a1=-15;
//		-15原码： 10001111  11110001补码
//		                  11100010补码  10011110 ---  -16-8-4-2=-30
//		                  11000100补码  10111100 ---  -32-16-8-4=-60
		System.out.println(a1<<1);
		System.out.println(a1<<2);
//		每移动一位，相当于*2  移动三位相当于*8  效率比真正的乘法快
		
		
//		(2)右位移： 右侧溢出，左侧以符号填充
//		-15原码： 10001111  11110001补码
//		右移一位                               11111000补码--- 10001000----  -8
		System.out.println(-15>>1);
//		每移动一位，相当于除以2，如果不能够整除，则向下取整。
		
//		运算符的优先级
//		整体看来    算术运算符>位运算中位移>比较运算符>位运算符>逻辑运算符>三目运算符>赋值运算符
//		可以使用()调整优先级
		
		boolean a2=3>5||5>3 && 5>9;
		System.out.println(a2);
		
		
		System.out.println(3<5&&8>6);
		System.out.println((3<5)&(8>1/0));
	}

}
