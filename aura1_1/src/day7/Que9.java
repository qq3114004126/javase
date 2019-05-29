package day4.day3homework;

//输出100以内的素数
public class Que9 {
	public static void main(String[] args) {
//      int num=123;
      for (int num=2;num<100;num++){
    	  boolean tag=true;
          for (int i=2;i<(int)Math.sqrt(num)+1;i++){
        	  if(num%i==0){
        		  tag=false;
        		  break;
        	  }
          }
          if(tag){
        	  System.out.println(num);
          }
      }
      
	}
}
