package day4.day3homework;
//输出9 * 9乘法表。（for   while）
public class Que7 {
  public static void main(String[] args) {
	  //1*3=3  2*3=6  3*3=9
	  for(int i=1;i<10;i++){
		  for(int j=1;j<i+1;j++){
			  int result=i* j;
			  System.out.print(j+"*"+i+"="+result+"\t");
		  }
		  System.out.println();
	  }
  }
}
