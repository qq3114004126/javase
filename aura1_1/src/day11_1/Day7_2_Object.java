package day11_1;
/*第十章  Object
 * 位置：在java.lang包
 * 所有的类都会直接或者间接的继承Object父类
 * 当创建所有对象的时候，都会创建一个object对象
 */
//使用父类引用指向子类的对象的原理，创建一个方法，方法中形式参数Object，
//则该方法可以传入除了基本数据类型以外的所有类型的数据当做实际参数
//class Person{
//	public void test(Object o){
//		System.out.println("test执行");
//	}
//	public void test1(Object[] o ){
//		
//	}
//}
//class Dog{
//}
//public class Day7_2_Object {
//	public static void main(String[] args) {
//		Person p=new Person();
//		int[] i=new int[5];
//		p.test(p);
//		p.test(new Dog());
//		p.test(i);
////		p.test1(new Dog());
//	}
//}
// Object下的重要方法
//（1）toString()
//（2）equals()
//（3）hashcode()

//1.toString()
//功能：将对象转换成字符串
//可以在自己的类下重写toString方法
//class Person{
//	public String name;
//	public int age;
//	
////	eclipse直接生成
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	}
//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//}
//public class Day7_2_Object {
//	public static void main(String[] args) {
//		Person p=new Person("张三",20);
////		System.out.println(p.toString());
//		System.out.println(p);//默认调用toString方法
//	}
//}


//2.equals方法
//功能：Object下的equals等价于==
//面试题：equals等价于==有什么区别？在Object下是一样。
//      所有的类都可以重写equals方法，一般来说，都将它重写成比较内容是否一致。
//class Person{
//	public String name;
//	public int age;
//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//	public boolean equals(Object anObject){
////		anObject(父类类型) 转换成子类类型：向下造型
//		Person anthorPerson=(Person)anObject;
//		if(this.name.equals(anthorPerson.name)&&this.age==anthorPerson.age)
//			return true;
//		return false;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
//	
//	
//}
//public class Day7_2_Object {
//	public static void main(String[] args) {
////		对于字符串类型来说，重写equals方法，字符序列相同，则判定两个字符串相同
////		String s="abc";
////		String s1="abc";
////		System.out.println(s==s1);
////		System.out.println(s.equals(s1));
//		
////		
//		Person p1=new Person("张三",20);
//		Person p2=new Person("张三",20);
//		System.out.println(p1==p2);
//		System.out.println(p1.equals(p2));
//	}
//}

//3.hashcode()
//功能：在Object中返回对象 hash码值（针对一个地址会产生一个唯一标识）
// 在应用的时候，很多的API 都将hashcode给重写了，认为两个对象如果一致，则让两个对象的hashcode返回同一个值
// hashcode()返回值跟equals方法保持一致     
// 如果两个对象equals方法比较，返回true，则让hashcode()的返回值相等
//                       返回false，则让hashcode()的返回值不相等
//【注意】System.identityHashCode(Object o) 的真正的hashcode  
//跟Object中hashcode()方法的返回值是一个。

//hashcode（）方法的返回值不一定是hashcode
//System.identityHashCode(Object o)才是真正hashcode

public class Day7_2_Object {
	public static void main(String[] args) {
		Object object=new Obejct();
		object.hashCode()
		System.identityHashCode(x)
	}
}








