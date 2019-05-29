package day8;

public enum Align implements Introduce{
   LEFT{
	   public void show(){
		   System.out.println("LEFT常量的show");
	   }
//	   public void x(){
//		   
//	   }
   },
   CENTER{
	   public void show(){
		   System.out.println("CENTER常量的show");
	   } 
   },
   RIGHT{
	   public void show(){
		   System.out.println("RIGHT常量的show");
	   }
   };
	public static void main(String[] args) {
		for(Align  a:Align.values()){
			a.show();
		}
	}

}
interface Introduce{
	void show();
}

