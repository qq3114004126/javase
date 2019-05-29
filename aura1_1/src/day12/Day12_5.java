package day12;

public class Day12_5 {
	public static void test( Teach tt) {
		tt.teach();
	}
	public static void main(String[] args) {
		Outer112 o = new Outer112();
		 Teach ja = o.javafun();
		 test(ja);

	}

}
class Outer112{
	public Teach javafun() {
		class Javarteacher implements Teach{
			public void teach() {
				System.out.println("我是老师");
			}
		}
		Teach t = new Javarteacher();
		return t;
		
	}
	public void pyfun() {
		class Javarteacher implements Teach{
			public void teach() {
				System.out.println();
			}
		}
	}
}

interface Teach{
	void teach();
}


