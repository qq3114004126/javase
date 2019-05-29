package day10;

public class Day10_9 {

	public static void main(String[] args) {
		Test5 tt = new Test5();

	}

}
 abstract class Teacher1111{
	 abstract void teach();
 }
 class PythonTeacher1111 extends Teacher{
	 public void teach() {
		 
	 }
 }
 class JavaTeacher1111 extends Teacher{
	 
 }
 class Test5{
	 void test1(Teacher t) {
		 t.teach();
	 }
 }