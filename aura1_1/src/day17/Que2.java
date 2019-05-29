package day15.day14homework;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

//（二）	创建一个Mouse老鼠类，向Hashset中装入老鼠 ，要求放入的老鼠不能重名
class Mouse implements Comparable<Mouse>{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Mouse(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Mouse [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mouse other = (Mouse) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Mouse o) {
//		return this.getAge()-o.getAge();
		return this.getName().compareTo(o.getName());
	}
	
	
}
public class Que2 {
	public static void main(String[] args) {
		Set<Mouse> mset=new HashSet<>();
//		TreeSet必须让放入的元素，可比较（实现comparable，实现comparator）
		SortedSet<Mouse> mset2=new TreeSet<()->{}>();
		SortedSet<Mouse> mset3=new TreeSet<>();
		Mouse m1=new Mouse("jerry", 2);
		Mouse m2=new Mouse("tom", 4);
//		Mouse m3=new Mouse("tom", 4);
		
		mset.add(m1);
		mset.add(m2);
//		mset.add(m3);
		
		
		mset2.add(m2);
		mset2.add(m1);
		mset.forEach(System.out::println);
		mset2.forEach(System.out::println);
		
//		介绍 :直接将hashset的对象，装入到treeset中。
//		（1）addAll   （2）构造器（间接的调用了addAll）
//		mset3.addAll(mset);
		SortedSet<Mouse> mset4=new TreeSet<>(mset);
		mset4.forEach(System.out::println);
	}
}
