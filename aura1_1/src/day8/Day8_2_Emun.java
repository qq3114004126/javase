package day8;
/*
 * 第十四章  枚举类型
 * 背景：1.5之后产生一种类型 本质也是class 跟interface一样
 * 需求：需要使用到很多的常量
 * 状态  班级：正常、停用
 *     院系：正常、停用
 *     正常：0   停用：1
 *     
 *     已注册0  未注册 1  注册未通过 2
 * 规范常量的代码    
 */
//class Alignment{
//	public static final int LEFT=1;
//	public static final int RIGHT=2;
//	public static final int CENTER=0;
//}
//public class Day8_2_Emun {
//	public static void main(String[] args) {
//		int value=1;//通过某个参数传递过来
//		if(value==Alignment.LEFT){
//			System.out.println("居左");
//		}else if(value==Alignment.CENTER){
//			System.out.println("居中");
//		}
//		
//		if (value==3){
//			System.out.println();
//		}
//	}
//}
//1. 枚举类型的定义
//【语法】使用enum关键字声明一个枚举类型的java文件。
//内部直接声明常量名
//public enum Align{
     //LEFT,CENTER,RIGHT
//}
//public class Day8_2_Emun{
//	public void test(Align v){
//		if(v==Align.CENTER){
//		if(v==0){ 调用出错，类型不匹配，严格规范了代码
//			System.out.println();
//		}
//	}
//	public static void main(String[] args) {
//		
//	}
//}

//2.  switch对于枚举类型的支持
// 原因：case后面必须放常量。
//public class Day8_2_Emun{
//	public void test(){
//		Align align=Align.CENTER;
//		switch(align){
//		case LEFT:
//			System.out.println("左对齐");
//			break;
//		case CENTER:
//			System.out.println("中间对齐");
//			break;
//		}
//	}
//}

//3. 枚举的规则
//【枚举类型的优势】通过枚举类型，我们实现了对于常量类型控制，调用端只能使用指定的常量。
//  枚举类型是安全的类型，调用者无法自己篡改类型。
//【规则】
//（1）枚举默认类型的构造器是私有的构造器
//（2）枚举类型不可以再继承其他的类，本质上单继承了Enum，隐式继承。
//（3）枚举类型可以实现接口

//  反编译枚举类型产生class：
// 反编译的命令 javap 枚举类型（.class没有扩展名）
//  如果希望显示私有构造器  javap -private 枚举类型

// 枚举类型可以实现接口
//只做了解
//作用，对于每个枚举类型的的常量都可以实现接口，通过调用枚举类型，就可以调用到每个枚举下的方法
//（跟每个子类调用自己的方法原理是一样的。）




interface A{
  default void test(){}
}










