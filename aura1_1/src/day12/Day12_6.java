package day12;

public class Day12_6 {
	public static void test(Mobiles m) {
		m.calls();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Out o = new Out();
		Mobiles mm = o.getMobiles();
		test(mm);
	}

}
class Out{
	public Mobiles getMobiles() {
//		return new Mobiles() {
//
//			@Override
//			public void calls() {
//				// TODO Auto-generated method stub
//				System.out.println("打电话");
//			}
//			
//		};
		return ()->{
			System.out.println("打电话");
		};
		
		
	}
}
interface Mobiles{
	void calls();
}