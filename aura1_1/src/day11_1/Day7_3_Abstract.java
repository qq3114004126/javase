package day7;
/* 第十一章  抽象
 * 【注意】：面向对象的三大特种中没有抽象。
 * 【原因】：抽象的本质是为了完善继承
 * 【抽象的背景】：
 * 发现代码有冗余的时候，可以将类设计成，父类，子类。
 * 有的时候，会出现希望能够描述一个抽象的类，这个类不是为了生成对象，只是单纯的为了子类继承。
 * 
 * 产生的原因：为了让其他类继承，不是创建对象【抽象类】
 * 
 * 一、抽象类
 * 【概念】如果将一个类设计成抽象，则其他类可以继承，但是这个类不生成对象。
 *       对于代码的规范。
 * 【定义】使用abstract关键字，修饰符
 * 【规则】
 * （1） 抽象类不能够被实例化，但是有构造器。（原因：创建子类对象的时候，一定会调用父类的构造器）
 * （2） 抽象类中可以有属性和方法，方法可以是非抽象方法，也可以是抽象方法 。
 * （3）含有抽象方法的类一定抽象类（普通非抽象类中不能含有抽象方法）
 * （4）抽象类作为基类，表示被继承的类，所有继承了抽象类的子类（非抽象类）必须要实现（重写）抽象方法
 * 【目的】：继承，利用多态参数，实现调用子类下的方法。
 */
abstract class Teacher{
	abstract void teach();
}
class PythonTeacher extends Teacher{
	void teach(){
		
	}
}
public class Day7_3_Abstract {
   public static void main(String[] args) {
	   //Teacher t=new Teacher();
}
}

//二、抽象方法
// 抽象方法必须存在于抽象类中
// 【笔试陷阱】
// 抽象类中，必须只能有抽象方法 错误
// 抽象类中，可以有非抽象的方法，对。
// 抽象类中，可以全部都是非抽象方法。对
// 抽象类中，可以没有抽象方法。对
//【实际应用中】：一个抽象类中如果全部都是非抽象方法，则类的设计有问题，但是代码不出错。

//【抽象方法定义】
// 使用abstract关键字声明方法。要求：没有方法体，连{}都没有 
//(原因：在抽象类的抽象方法中实现方法，没有意义，因为子类无法调用到)

abstract class Teacher{
	public abstract void teach();
//	public abstract void a();
}
class PythonTeacher extends Teacher{
	public  void teach(){
		System.out.println("python授课");
	}
}
class JavaTeacher extends Teacher{
	public  void teach(){
		System.out.println("java授课");
	}
}
public class Day7_3_Abstract {
	public void test(Teacher t){
		t.teach();
	}
	public static void main(String[] args) {
		Day7_3_Abstract t=new Day7_3_Abstract();
		JavaTeacher jt=new JavaTeacher();
		PythonTeacher pt=new PythonTeacher();
		t.test(jt);
		t.test(pt);
	}
	
}

//【思考】
// final     声明的类不能继承
// abstract  声明类就为了让继承
// private 和  abstract：不行 方法对子类隐藏
// static  final 和abstract  ：不可以





