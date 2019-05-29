package day12;

public class Day12_8 {

	public static void main(String[] args) {
		Test tt = new Test();
		JavaTeacher j = new JavaTeacher();
		tt.print(j);

	}

}

class Test{
	void print(Teachers t) {
		t.teach();
	}
}
interface Teachers{
	void teach();
}
class JavaTeacher implements Teachers{
	
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		
	}
	
}
class PythonTeacher implements Teachers{

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		
	}
	
}