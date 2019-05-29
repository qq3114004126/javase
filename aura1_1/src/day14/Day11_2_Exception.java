package day14;
/*
 * 第十八章 异常
 * 一、背景
 * 一个系统处理异常的能力代表该系统的健壮。
 * 在编程的过程中，可能遇见的“问题”可能包含三类：
 * （1）受检异常：在编译期间就可以预见的异常，这种异常必须进行异常的捕获。
 * （2）运行期异常：可以称为是bug，可以处理，也不可以。也可以是异常的捕获。
 * （3）错误：出现在编译期，不是因为没有处理异常，是因为本身的语法或者是规则使用有问题。
 * 
 * 【问题】如果遇见受检异常，需要进行处理，或者是遇见了运行期异常，又不希望程序执行中断，只能使用异常捕获机制
 * 
 * 二、常见的异常类型
 * 1.异常类型层次结构
 * 所有的异常类型最根基的类也是Object
 * 所有的“问题” 都继承了Throwable类。
 * 具有两个子类，一个是Error（错误），一个是Exception（包含了受检异常和运行期异常）
 * Exception下分为很多的受检异常子类，还包括RuntimeException(运行期异常的父类)
 * 
 * 熟悉了多个异常类型，才能知道如何处理异常。
 * 2. 常见的异常
 * （1）ArithmeticException  数学运异常  运行期异常
 * （2）IllegalArgumentException  方法接收参数的时候，非法参数异常  运行期异常
 * （3）ArrayIndexOutOfBoundsException数组越界异常  运行期异常
 * （4）NullPointerException  空指针异常，运行期异常  当调用空引用下的属性、方法，出现异常
 * （5）ClassNotFoundException  类没有找到，不能加载所需要的类
 * （6）NumberFormatException 格式化异常，使用parse的时候，无法将参数转换成（格式化成）指定的对象
 * （7）FileNotFoundException :文件不存在异常
 *  习惯以Exception结尾。
 */
//class Phone{
//	public void test(){
//	}
//}
//class Person{
//	private Phone phone;
//	
//	public Phone getPhone() {
//		return phone;
//	}
//
//	public void setPhone(Phone phone) {
//		this.phone = phone;
//	}
//    public void buyPhone(Phone p){
//    	this.phone=p;
//    }
//	public Person() {
//	}
//}
//public class Day11_2_Exception {
//	public static void main(String[] args) {
////		Phone ph=new Phone();
////		Person p=new Person();
////		p.buyPhone(ph);
////		p.getPhone().test();
////		int i=1/0;
////		int []ii =new int[2];
////		System.out.println(ii[2]);
//		
////		String s=null;
////		System.out.println(s.charAt(1));
//		
//		String [] ss=new String[2];//[null,null]
//		
//		Integer.parseInt("abc");

//	}
//}
//三、异常的处理
// 可以有两种方式：捕获异常、抛出异常
// 当异常产生的时候，程序会在异常产生的位置，创建一个关于异常类型的对象，对象中包含了异常的信息，异常的堆栈
// 程序会不会就直接终止？不会，从上下文寻找处理异常的程序。
//如果成功的捕获了异常，可以继续运行其他程序
//如果没有成功捕获，异常会继续向上传播。
//【向上传播】 程序中方法A调用了方法B，A称为是上，B称为是下，调用者看成是上，被调用者看成是下。
//宗旨：让调用者处理
//public class Day11_2_Exception {
//	public  void A(){
//		this.B();
//	}
//	public void B(){
//		this.C();
//	}
//	public void C(){
//		this.D();
//	}
//	public void D(){
//		this.E();
//	}
//	public void E(){//下
//		int i=1/0;//出现了异常，在自己的上下文中寻找是否有异常处理的程序？
////		没有异常处理，所以继续将抛出给调用者。
//	}
//	public static void main(String[] args) {
//		Day11_2_Exception d= new Day11_2_Exception();
//		d.A(); //A出现了异常
//	}
//}

//1.捕获异常
/*try {
 *    可能会产生异常的代码段
 * }catch (异常类型  异常对象的引用){
 *    处理
 * }catch (异常类型  异常对象的引用){
 *    处理
 * }....
 * 
 * 当使用try  catch处理了异常的时候，会遇见的三种情况
 * （1）try中代码正常执行，没有出现异常，不会走任何catch语句，try catch之外的代码也会正常执行
 * （2）try中产生了异常，异常之后的代码不会执行，某一个catch捕获了异常，try catch之外的代码也会正常执行
        （3）try中产生了异常，异常之后的代码不会执行，没catch成功捕获到异常，try catch之外的代码不会正常执行
        将异常继续向上抛出。
 */
//（1）try中代码正常执行，没有出现异常，不会走任何catch语句，try catch之外的代码也会正常执行
//public class Day11_2_Exception {
//	public static void main(String[] args) {
//		int a=10;
//		int b=2;
//		try{
//			System.out.println(a/b);
//			System.out.println("try中异常之后的代码段");
//		}catch(ArithmeticException e){
//			System.out.println("除数为 0的异常！！！");
//		}
//		System.out.println("其他代码段");
//	}
//}

//（2）try中产生了异常，异常之后的代码不会执行，某一个catch捕获了异常，try catch之外的代码也会正常执行
//catch可以有多个，会将异常信息跟catch中的异常类型进行匹配，匹配的顺序从上到下依次匹配，
//只要遇见一次匹配的类型 ，则不再继续向下匹配。
//合并异常：当认为多个异常类型可以做统一处理的时候，可以合并异常。
//如果多个继承之间有父子继承关系:一定要让子类异常在上，父类异常在下。
//【最后一个异常Exception】 如果try中出现了意外代码，需要必须要解决的情况，就会 被最后一个异常捕获，相当于掩盖异常
//public class Day11_2_Exception {
//	public static void main(String[] args) {
//		int a=10;
//		int b=5;
//		int []z=new int[]{1,2,3};
//		try{
//			System.out.println(a/b);
//			System.out.println(z[3]);
//			System.out.println("try中异常之后的代码段");
////		}catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
////			System.out.println("出现了错误");
////		}
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("数组越界");
//		}catch(ArithmeticException e){
//			System.out.println("除数为 0的异常！！！");
//		}catch(Exception e){
//			System.out.println("Exception");
//		}
//		System.out.println("其他代码段");
//	}
//}


//（3）try中产生了异常，异常之后的代码不会执行，没catch成功捕获到异常，try catch之外的代码不会正常执行
//将异常继续向上抛出。
//【思考】处理异常的程序，是在调用端处理？还是方法中处理？
//将异常处理放在调用端，不同的调用者处理异常的程序可能不同。
//如果只放在方法中，就变成了一种方式。
public class Day11_2_Exception {
	public static int test(int a,int b){
		return a/b;
	}
	public static int test2(int a,int b){
		int result=0;
		try{
			result=a/b;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组越界");
		}catch(ArithmeticException e){
			System.out.println("除数为 0的异常！！！");
		}
		return result;
	}
	public static void first(){
		
		try{
			test(10,1);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组越界");
		}catch(ArithmeticException e){
			System.out.println("除数为 0的异常！！！");
		}
		System.out.println("其他代码段");
	}
	public static void main(String[] args) {
		
		try{
			test(2,0);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组越界");
		}catch(ArithmeticException e){
			System.out.println("除数为 0的异常！！！");
		}
		System.out.println("其他代码段");
		
		
	}
}

//练习：捕获的异常 运行期的异常，捕获 



