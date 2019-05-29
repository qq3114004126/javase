package day11;

public class Day11_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface A1{
	int x= 1;
	void abstractfun();
	default void unabstractfun() {
		
	}
	
}
class B implements A1{

	@Override
	public void abstractfun() {
		// TODO Auto-generated method stub
		
	}

	
	public void unabstractfun() {
		// TODO Auto-generated method stub
		
	}
	
}