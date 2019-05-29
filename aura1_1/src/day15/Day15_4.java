package day15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
public class Day15_4 {

	public static void main(String[] args) {
		List list = new ArrayList();
		List<String> l1 = new ArrayList<String>();
		l1.add("♠");l1.add("♥");l1.add("♣");l1.add("♦");
		
		List<String> l2 = new ArrayList<String>();
		l2.add("2");l2.add("3");l2.add("4");l2.add("5");l2.add("6");
		l2.add("7");l2.add("8");l2.add("9");l2.add("10");l2.add("J");
		l2.add("Q");l2.add("K");l2.add("A");
		
		List<String>l3 = new ArrayList();
		l3.addAll(l2);
		l3.addAll(l1);
		int num = 0;
		for(int i = 0;i<l1.size();i++) {
			for(int j = 0;j<l2.size();j++) {
				System.out.print(l1.get(i)+l2.get(j)+" ");
				num++;
				if(num%13==0) {
					System.out.println();
				}

	}

}
}
}