package day13;
/*
 * 
2.	需求中Python教师和Java教师，他们都有讲课teach的方法，定义教师接口，
将上述两类教师通过接口的实现。在测试端有work()方法，能够调取讲师讲课的那内容。
使用lambda表达式实现。
 */
interface Teacher{
	void teach();
}
//class PythonTeacher implements Teacher{
//	@Override
//	public void teach() {
//		System.out.println("python讲课");
//	}
//}
public class Que2 {
	public static void work(Teacher t){
		t.teach();
	}
  public static void main(String[] args) {
//	lambda表达式是可以创建实现类的对象。
	  Teacher t1=()->System.out.println("python讲课");
	  Teacher t2=()->System.out.println("java讲课");
	  
	 // work(t1);
	  work(t2);
}
}
