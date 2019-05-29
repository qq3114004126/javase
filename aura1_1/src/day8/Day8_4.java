package day8;

public class Day8_4 {

	public static void main(String[] args) {
		MoneyPay p1 = new MoneyPay();
		MoneyPay p2 = new MoneyPay();
		MoneyPay p3 = new MoneyPay();
		p1.manager(10000,5000,5000);
		p2.programer(8000,4000);
		p3.worker(8000 );
	}

}
class MoneyPay{
	
	
		public void manager(double basicSalary,double reward,double earnMoney) {
			double sum = basicSalary+reward+earnMoney;
			System.out.println("项目经理的工资为"+sum);
		}
		public void programer(double basicSalary,double reward) {
			double sum = basicSalary+reward;
			System.out.println("程序员的工资为:"+sum);
		}
		public void worker(double basicSalary) {
			double sum = basicSalary;
			System.out.println("兼职工人的工资为"+sum);
		}
	
	}
