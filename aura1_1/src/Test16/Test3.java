package Test16;

public class Test3 {
	public 
	public static void main(String[] args) {
		ProcessArray11  pp = new ProcessArray11();
		int [] group = {12,32,23,35,37,38,54,53};
		//Commonder commonder = new Commonder();
		pp.process(group);
	}

}
class ProcessArray11 implements  Commonder{

	public void process(int[] target) {
		int sum = 0;
		for(int i:target) {
			sum+=i;
		}
		System.out.println(sum);
		
	}
	
}
interface Commonder{
	void process(int[] target);
}