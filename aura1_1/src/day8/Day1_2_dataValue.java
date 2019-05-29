package day8;

import java.math.BigDecimal;

/*
 * 第二章 数据类型
 * 两种数据类型：
 * 基本数据类型：java中的内置类型。可以拿过来直接使用的类型。
 * 引用类型：需要使用class定义声明之后，才可以使用的类型。
 * 
 * 第二章中涉及到的数据类型：
 * 基本类型（8种）
 * 引用类型（String）
 * 
 *一、基本数据类型
 *boolean：true  false 占位（不同的厂商决定，占位少） 
 *byte： 字节 8个数据位  有符号
 *char：字符16个数据位  无符号
 *short：16  有符号
 *int ：32
 *long：64
 *float：32
 *double:64
 *
 *1. 原码、反码、补码
 *正数：原码、反码、补码相同，二进制码
 *负数：原码：正数的二进制码，符号位取1  最高位（4  8  16  32  64）
 *    反码：符号位不变，其余取反
 *    补码：反码+1
 * 计算机所有的数据都是以补码形式存储。
 * 
 * -1+2在计算机中是怎么运算？
 * 步骤：（1）估计结果 ，操作数和结果都在-7和7之间的时候  可以用4位机模拟
 *     （2） 将所有的操作数都转换成补码形式
 *  -1 ：1001---1111补码   
 *  2  ：                   0010
 *              0001  1 
 *  -2+1 
 *  -2   1010---1101+1 ---1110补码
 *   1                    0001
 *                        1111补码---1110---1001---原码  -1
 *   从原码变成补码：取反码，反码+1
 *   从补码变成原码：取反码，反码+1（先-1，取反码） 1000+1---1001
 *   
 *            
 *
 *
 *  */
public class Day1_2_dataValue {
	public static void main(String[] args) {
/*2. java中八种基本数据类型
 * （1）short int long
 * 统称为整数类型：短整型、整型、长整型（范围不同）
 * short: 16位
 * int：32
 * long：64
 * 定义：变量类型   变量名=数值
*/
//		short s=1;//0/1  15个1  
//		System.out.println(Short.MAX_VALUE);
//		System.out.println(Short.MIN_VALUE);
//		int i=123;
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		long l=123;
		
		//整数类型的四个进制
	  //二进制（使用0b或者0B作为前缀）
		int i2=0b11;
		System.out.println(i2);
//		八进制（使用0做前缀）
		int i8=011;
		System.out.println(i8);
//		十进制（不使用前缀）
		int i10=11;
		System.out.println(i10);
//		十六进制(使用0x或0X做前缀)（0-9 10-15(a-f  或者A-F)） 1A2C  FFFF
		int i16=0x11;
		System.out.println(i16);
		
		//四个进制之间的转换
		//(1)其他进制转换成十进制：乘幂法
		//1234=1*10^3+2*10*^2+...
		//底数：原来的其他进制
		//幂：  从右向左，找到当前位的索引，索引从0开始
		int i22=0b10101;
		//1*2^4+1*2^2+1=21
		System.out.println(i22);
		
		//(2)十进制转换成其他进制:下除取余法
		//被除数：十进制的数
		//除数：要转换成的进制
		//结果：取余数：从下往上
		
		
		//(3)其他进制之间
		//二进制每3位，对应八进制的1位
		//二进制每4位，对应十六进制的1位
//		int i22=0b010101;
		//           25 八进制    2*8^1+5*8^0=21
		System.out.println(i22);
//		int i22=0b00010101;
		//            15 十六进制  1*16^1+5=21
		
//		使用java内部方法进行进制之间的转换，使用包装器类（之后还会涉及）
		System.out.println(Integer.toBinaryString(21));
		System.out.println(Integer.toOctalString(21));
		System.out.println(Integer.toHexString(21));
		
//	(2)	布尔类型
//		占用空间大小不确定
//		定义  类型boolean  变量名=值
//		值只有两个true  false（大小写）
		boolean b=true;
//		【应用场景】（1） 二选一    （2）条件
//		System.out.println(3<5); 
//		java中布尔类型不是整数类型的子类型
//		java中不能将任何一个类型通过任何方式转换成布尔类型。
		
//	(3) float double
//		float: 占用32
//		double: 占用64
//		定义：小数  
//		注意，默认的小数是double类型
		double d=1.0;
		float f=1.0f;//float类型需要加f作为后缀
//		取值范围
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
//		浮点数支持科学计数法
//		float f1=2.1e10f;
		
//		浮点类型都是不精确的,只能做近似存储
//		System.out.println(10.0/3.0);
//		小数类型的二进制：
/*      规则：小数部分*2=结果    取整数部分
 *      0.1*2=0.2    0
 *      0.2*2=0.4    0
 *      0.4*2=0.8    0
 *      0.8*2=1.6    1
 *      0.6*2=1.2    1
 *      0.2*2=0.4    0
 *      ....
 *      
 *      浮点类型在使用的时候要注意：
 *      第一：注意避免数量级相差很大的浮点值之间进行计算
 *      第二：要注意使用浮点数进行等值比较
 */
		float f1=3e20f;
		float f2=1.0f;
		System.out.println(f1+f2);
		
		double d1=0.1;
		double d2=0.2;
		System.out.println(d1+d2==0.3);//==判断值是否相等（对于基本类型类型）
		
		System.out.println(d1+d2);
		
//		[解决浮点不精确性]（了解）
//		《Effective Java》书中，float和double类型适合做科学计算或者工程计算不用十分精确的适合
//	     如果需要非常精确的数据需要使用java.math.BigDecimal
//		BigDecimal用法
//		显示浮点类型的 原型
		BigDecimal bd1=new BigDecimal(0.1);
		BigDecimal bd2=new BigDecimal(0.2);
		System.out.println(bd1);
		System.out.println(bd2);
		//解决，不使用浮点数，使用字符串"0.1"
		BigDecimal bd11=new BigDecimal("0.1");
		BigDecimal bd22=new BigDecimal("0.2");
		BigDecimal bd33=new BigDecimal("0.3");
		System.out.println(bd11.add(bd22));
		System.out.println(bd11.add(bd22).equals(bd33));
		
//	(4)字节和字符
//	字节 byte 类型 支持8个数据位（有符号）-128到127
		byte by=127;
//		[应用场合]：从网络传输文件的时候，数据流，二进制的文件  比如存储照片 byte[]
//		         字符集出问题需要转换的时候
//	字符char 表示单个字符 无符号16位 0-2^16   65536
//	unicode字符集：UCS-2(char)   UCS-4
//		abc  ascii  gb2312 gbk
//		定义 变量使用单引号。
		char c='A';
		char c1=65;
		char c2='\u5927';//使用unicod字符集的编码
		System.out.println(c1);
		System.out.println(c2);
		
		//转义序列：需要表示一些特殊的字符
//		\n换行
//		\t制表符 上下内容对齐
	    System.out.println("hello\\world");

		
		
		
	}

}
