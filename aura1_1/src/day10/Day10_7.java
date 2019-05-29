package day10;

public class Day10_7 {
	

	public static void main(String[] args) {
		Record re = new Record();
		JavaTeacher111 jc = new JavaTeacher111();
		 PythonTeacher111 py = new PythonTeacher111();
		re.record(py);
		re.record(jc);

	}

}
class Teacher111{
		void teach(){
		System.out.println();
	}
}
class JavaTeacher111 extends Teacher111{
	void teach() {
		System.out.println("Java教师");
	}
}
class PythonTeacher111 extends Teacher111{
	void teach() {
		System.out.println("Python教师");
	}
}
class Record{
	
	void record( Teacher111 t) {
		 t.teach();
	}
}