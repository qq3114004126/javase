package day9.day8homework;
//1.设计多层抽象的继承。老师抽象类（有teach方法）、
//数学老师抽象类（有teach和add方法）、大学数学老师类继承数学老师抽象类。
//继承的概念，严格要求继承：父类声明成abstact， 抽象类也是可以有多层（单继承）
abstract class Teacher{
	//抽象类下可以有任何的方法和属性  严格在，抽象方法必须重写。
	abstract void teach();//没有方法体，{}都没有
} 
abstract class MathTeacher extends Teacher{
	abstract void add(int a ,int b);
}

class GreatTeachere extends MathTeacher{
	@Override
	void add(int a, int b) {
		System.out.println(a+b);
	}

	@Override
	void teach() {
		System.out.println("大学数学教师上上课");
	}
}

public class Que1 {
	public static void main(String[] args) {
		GreatTeachere gt=new GreatTeachere();
		gt.add(2,3);
		gt.teach();
	}

}
