package day12;

public class Day12_9 {
	public static void test(Teacherss tt) {
		tt.teach();
	}

	public static void main(String[] args) {
//		Outter oo = new Outter();
		//JavaTeacher st = new JavaTeacher();
//		oo.javafun();
//		oo.pyfun();
//		Teacherss ss = oo.getTeacher1();
//		Teacherss ss1 = oo.getTeacher();
//		ss.teach();
//		ss1.teach();
//		test(ss);
//		test(ss1);
	   Teacherss ss11 =()->{
			System.out.println("Java老师在123上课");
		};
		test(ss11);
	}

}
@FunctionalInterface
interface Teacherss{
	void teach();
}
//class Outter{
	//public Teacherss getTeacher1() {
//		class JavaTeacher implements Teacherss{
//			public void teach() {
//				System.out.println("java老师在上课");
//			}
//		}
		                       
//		st.teach();
//		return ()->{
//			System.out.println("java老师在上课");
//		};
//}
//	public Teacherss getTeacher() {
//		class PyTeacher implements Teacherss{
//			public void teach() {
//				System.out.println("pythonteacher老师在上课");
//			}
//		}
//		return()->{
//			System.out.println("pythonteacher老师在上课");
//		};
//	}
	
//}