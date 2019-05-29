package day13;

interface Commonds {
	int process(int[] t);
}

class ProcessArrays {
	public int process(int[] t, Commonds c) {
		return c.process(t);
		// System.out.println(c.process(t));

	}
}

public class Day13_3 {
	public static void main(String[] args) {
		ProcessArrays pa = new ProcessArrays();
		int[] target = { 1, 2, 3, 4, 5 };
		// pa.process(target, new Commond(){
		// public i process(int [] t){
		// int temp=0;
		// for(int i:t){
		// temp+=i;
		// }
		// System.out.println(temp);
		// }
		// });
		// 返回值，不是直接输出
		int result = pa.process(target, new Commonds() {
			public int process(int[] t) {
				int temp = 0;
				for (int i : t) {
					temp += i;
				}
				return temp;
			}
		});
		System.out.println(result);
	}
}