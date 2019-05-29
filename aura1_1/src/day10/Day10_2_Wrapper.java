package day10;
/* 
 * 第十五章 包装器类
 * 基本数据类型，对于每个基本数据类型都对应一个包装器类。
 * int ---Integer
 * long----Long
 * short--Short
 * 一、【背景】
 * （1）所有类一定会直接或者间接继承Object,Object下的方法远比基本数据类型要丰富。
 * （2）java中有一些情况（集合中），只能放入对象型数据（引用类型）
 * list.add(1)  1  int ----Integer   list集合----类似于数组  容器类
 * 
 * 二、分类
 * int ---Integer
 * long----Long
 * short--Short
 * byte---Byte
 * char---Character
 * float--Float
 * double--Double
 * boolean--Boolean
 * 
 * 以int 基本数据类型 Integer包装器为例
 * 
 * 
 * 三、基本类型和包装器类型之间的转换
 * 1. jdk1.5之前需要手动转换
 * （1） 基本数据类型--->包装器类型
 *     new Integer()---int类型对应的包装器类（可以看成是int数据当存储成对象型数据）
 *     两种方法：
 *     Integer i1=new Integer(1);
 *     Integer i2=Integer.valueOf(1);
 */
//public class Day10_2_Wrapper {
//	public static void main(String[] args) {
//		Integer i1=new Integer(1);
//		System.out.println(i1);  // 名字@地址  Integer  toString   对象---字符串
//		Integer i2=Integer.valueOf(2);
//		int i3=i2.intValue();//从包装器类型转换成基本数据类型
//	}
//}

//仿造Integer下的源码
//class Integer{
//	private int value;
//	public int intValue(){
//		return this.value;
//	}
//	public Integer(int value) {
//		super();
//		this.value = value;
//	}
//}
 /* 
 * （2）包装器类型----->基本数据类型 
 *    包装器类型对象.intValue();  返回值就是基本数据类型。
 */
/*2. jdk1.5之后 实现了自动的拆箱、封箱
 * 封箱（基本--包装）：当需要包装器类型的时候，如果我们提供的是基本数据类型，编译器可以自动将其转换成对应的包装器类型。
 * 拆箱（包装--基本）：当需要基本数据类型的时候，如果我们提供的是包装器类型，编译器可以自动的将其转换成对应的基本数据类型。
 */
//public class Day10_2_Wrapper {
//	public static void main(String[] args) {
//		Integer i1=10;//自动封箱  反编译之后的代码  Integer i1=Integer.valueOf(10);
//		int i2=i1;//自动拆箱  反编译指定的代码  int i2=i1.intValue();
//	}
//}
//3. 包装器类型参与运算
/*(1)如果是算术运算符：
 *   操作数（无论是哪一个操作数，甚至两个操作数）都是包装器类型 ，则会自动转换成基本数据类型进行操作。
 *(2) 如果是比较运算符 ==  !=
 *   ==：如果左右两侧都是基本数据类型，则比较的是数值
 *      如果左右两侧都是引用类型，则比较的是地址
 *   包装器类：
 *   如果两侧是同种类型，则按照基本数据类型和引用类型来运算。（引用类型注意缓存机制）
 *   如果两侧不是同种类型，则都转换成拆箱之后的基本数据类型来进行比较。
 *      包装器类型的缓存机制
 */
//public class Day10_2_Wrapper {
//	public static void main(String[] args) {
////		Integer i1=10;
////		Integer i2=20;
////		System.out.println((i1+i2).); 两个操作数的+运算，结果是基本数据类型，.后面并不能调用方法
//		
////		int i1=1;
////		int i2=1;
////		System.out.println(i1==i2);//比较的是按照基本数据类型的规则，比较值
//		
////		Integer ii1=1000;
////		Integer ii2=1000;
////		System.out.println(ii1==ii2);//false
////		
////		比较基本数据类型i1和包装器类型ii1==：会将包装器类型转换成基本数据类型之后比较。比较值是否相等。
//		int i1=1000;
//		Integer ii1=1000;
//		System.out.println(i1==ii1);
////		上面的代码，一定会先将ii1转换成基本数据类型，然后再比较
//	}
//}
//4.System.identityHashCode(Object o):
//public class Day10_2_Wrapper {
//	public static void main(String[] args) {
////		Person p=new Person();
//		String s="abc";
//		int i=1;
//		System.out.println(System.identityHashCode(i));//只能输出下面的ii的地址
////		identityHashCode 的形式参数是Object
////		在用函数的时候 将实际参数给形式参数赋值
////		把1基本数据类型，给Object进行赋值，去找Integer包装器类型
////		Integer ii=1;
//		
//	}
//}

//四、包装器类的缓存机制
//【不可变数据类型】：包装器类属于不可变数据类型，String也是不可变数据
//  String a="hello"  a="world" --只是引用的的改变
// 包装器类型也实现了缓存的机制：
// 6个包装器类型都实现了（除了Float和Double以外）
// Integer  默认范围  -128到127  超过这个返回，就不会缓存数据，就会新创建（可以通过jvm调优修改）
//public class Day10_2_Wrapper {
//	public static void main(String[] args) {
////		Integer x=100;
//////		x=101;
////		Integer y=100;
////		System.out.println(System.identityHashCode(x));
////		System.out.println(System.identityHashCode(y));
////		System.out.println(x==y);
//		
//		Integer x=128;
////		x=101;
//		Integer y=128;
//		System.out.println(System.identityHashCode(x));
//		System.out.println(System.identityHashCode(y));
//		System.out.println(x==y);
//		
////		【不可变类型和缓存机制（字符串常量池）有什么联系？】
////		如果不缓存 Integer i1=1;  Integer i2=1;就会创建两份同样的数据，同样的数据又不想
////		可变类型的数据一样，可以对数据的本身进行修改，所以存储两份数据没有什么意义。
////		        int [] i=new int[]{1,2,3}  int i2[]=new int[]{1,2,3}
//		
//		Float f1=1.0f;
//		Float f2=1.0f;
//		System.out.println(System.identityHashCode(f1));
//		System.out.println(System.identityHashCode(f2));
//	}
//}

//五、包装器类下的方法
//1. valueOf  :包装器类下的静态方法，功能，将其他类型转换成包装器类型的对象，返回包装器类型
//2. parseXX  :包装器类下的静态方法，功能，将String转换成基本数据类型，返回的是基本数据类型
public class Day10_2_Wrapper {
	public static void main(String[] args) {
		int i=1;
		String s="1";
		int x=Integer.valueOf(i);//返回值是包装器类型，但是结果可以直接使用基本数据类型来接（进行了拆箱操作）
		Integer.valueOf(s);
		
//		int x=Integer.parseInt(s);
		Integer y=Integer.parseInt(s);//返回值是基本数据类型，但是结果可以是使用包装器类型来接（进行了自动封箱）
	 String ss=Integer.toBinaryString(100);
	 System.out.println(Integer.toHexString(11));
	 System.out.println(ss);
	}
}

















