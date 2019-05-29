package day11;
/*
 * 
1.	java 语句 Integer i = 1; i += 1; 做了哪些事情？
（1） Integer i = 1;  自动封箱（装箱），本质上跟调用了Integer.ValueOf(1)
（2）i+=1;   i=i+1; 在计算机执行的时候，首先执行i+1  将结果赋予给i（引用类型）
    先将i包装器对象，拆箱成基本数据类型，然后跟1相加，获得基本数据类型
 (3) 将结果进行自动封箱，给i

2.	运行结果，解释原因。
Integer a = 444;  //封箱操作    缓存机制128  超过了128
int b  = 444;//基本数据类型 ，跟上面的a不是一个对象
Integer c=444;// 封箱操作，同时新创建对象
System.out.println(a == b);   先将a转换成基本数据类型，==判断是值是否相等。 true
System.out.println(c == b);   true 先将c转换成基本数据类型，==判断是值是否相等
System.out.println(a.equals(b)); true
System.out.println(c.equals(b)); true


Boolean b1 = false; 封箱
Boolean b2 = false; 封箱
Boolean b3 = true;
Boolean b4 = true;
System.out.println(b1 == b2); 引用类型b1==引用类型b2  比较的是地址  true
System.out.println(b3 == b4); 引用类型b1==引用类型b2  比较的是地址  true

Integer i1=1000; 封箱  i1  i2 i3不同对象
Integer i2=1000;
Integer i3=2000;
System.out.println(i1+i2==i3) 
i1+i2 转换成基本数据类型来执行，所以结果是基本数据类型  ==左边是基本数类型
i3是引用类型
基本数据类型== 引用类型  ：引用类型转换成基本数据类型，比较值是否相等  true




3.	获取一个字符串在另一个字符串中出现的次数。判断str2在str1中出现的次数
String  str2="abc"
String  str1="abcdfdiikabcdf;diabcke;krl"


4.	将一个字符串进行反转。将字符串中指定部分进行反转。
hello
 */
public class Day10homework {
	public static void main(String[] args) {
		Integer  i=1;
		i+=1;
//		
//		3.	获取一个字符串在另一个字符串中出现的次数。判断str2在str1中出现的次数
		String s1="djklddjdfjdjk";
		String s2="dj";
		int count =getTimes(s1,s2);
		System.out.println(count);
		
		
//		4.	将一个字符串进行反转。将字符串中指定部分进行反转。
//		hello
		String s="hello";
		String s_new=reverse(s);
//		System.out.println(s_new);
		System.out.println(reverse(s, 1, 3));
		
//		方式二
		System.out.println(reverse2(s));
		System.out.println(reverse2(s,1,3));
		
	}
//	方式二
	public static String reverse2(String s){
		String s_new="";
		char[] c=s.toCharArray();//{‘h’,‘e’,'l','l','o'}
		for (int i = 0,j=c.length-1;i < j; i++,j--) {
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
		}
		
		return String.valueOf(c);
	}
	public static String reverse2(String s,int start,int end){
		String s_new="";
		char[] c=s.toCharArray();//{‘h’,‘e’,'l','l','o'}
		for (int i = start,j=end;i < j; i++,j--) {
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
		}
		return String.valueOf(c);
	}
	public static String reverse(String s){
		String s_new="";
		for (int j = s.length()-1; j >=0; j--) {
			s_new+=s.charAt(j);
//			s_new=s_new+s.charAt(j);
//			s_new.concat(""+s.charAt(j));
		}
		return s_new;
	}
	public static String reverse(String s,int start,int end){
//	    s="hello"
		String s_new=s.substring(0,start);
		for (int j = end; j >=start; j--) {
			s_new+=s.charAt(j);
//			s_new=s_new+s.charAt(j);
//			s_new.concat(""+s.charAt(j));
		}
		s_new+=s.substring(end+1);
		return s_new;
	}
	
	public static  int getTimes(String s1,String s2){
//		s1.indexOf(s2)  从s1中查找s2第一次出现的位置
//		int index=s1.indexOf(s2);
		int count=0;
		int s2length=s2.length();
		int index;
		while ((index=s1.indexOf(s2))!=-1){
			count++;
			s1=s1.substring(index+s2length);
//			index=s1.indexOf(s2);
		}
		return count;
	}
}
