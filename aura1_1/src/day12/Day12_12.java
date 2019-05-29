package day12;

public class Day12_12 {
	public static void test() {
		
	}
	public static void main(String[] args) {
		Array aa = new Array();
		Commond cc = aa.getCommand();
		int []arr = {1,2,3,4,5};
		cc.process(arr);
	}

}
interface Commond{
	void process(int[] target);
}
class Array{
	public Commond getCommand() {
//		class ProcessArray implements Commond{
//			
//			@Override
//			
//			
//		}
		
		
		return new Commond() {public void process(int[] target) {
			int sum = 0;
			for(int i = 0;i<target.length;i++) {
				sum+=target[i];
			}
			System.out.println(sum);
		}
			
		};
		
	}
}