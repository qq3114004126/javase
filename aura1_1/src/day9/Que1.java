package day9;
//1.	每一个岗位的工资组成不同，创建一个工资类，包括计算工资的方法。
//可以根据传入的参数不同，计算不同的工资。
//项目经理计算工资：基本工资+奖金+提成
//程序员：基本工资+奖金
//兼职：基本工资
// 类中，方法的重载（实例的方法，对象的方法，成员方法，非静态方法）
class Salary{
	int baseSalary;
	int awary;
	int t;
	int sumSalary(int baseSalary,int awary  ,int t){
		return baseSalary+awary+t;
	}
	int sumSalary(int baseSalary,int awary){
		return baseSalary+awary;
	}
	int sumSalary(int baseSalary){
		return baseSalary;
	}
}
public class Que1 {
	public static void main(String[] args) {
		Salary s=new Salary();
		s.sumSalary(1000);
		s.sumSalary(1000,2000);
		s.sumSalary(1000,2000,3000);
	}

}
