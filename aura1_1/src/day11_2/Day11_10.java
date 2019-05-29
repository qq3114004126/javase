package day11_2;


public enum Day11_10 {
	LEFT,RIGHT,CENTER;
	public static void test(Day11_10 c) {
		if(c==Day11_10.CENTER) {
			System.out.println("居中");
		}else if(c==Day11_10.LEFT) {
			System.out.println("靠左");
		}
	}
	public static void main(String[] args) {
		test(CENTER);
		test(LEFT);
	}
}
