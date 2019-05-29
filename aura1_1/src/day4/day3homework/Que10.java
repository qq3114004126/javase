package day4.day3homework;

//假设�?年期定期利率�?3.25%，计算一下需要过多少年，�?万元的一年定期存款连本带息能翻番�?
public class Que10 {
	public static void main(String[] args) {
		float c = 10000.0f;
		int year = 0;
		while (c < 20000.0f) {
			c = c * (1 + 0.0325f);
			year++;
		}
		System.out.println(year);
	}
}
