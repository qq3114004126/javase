package day9;

public class Day9_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Student
    private int age;
	private String studentName;
	Grade grade;

	// Student(intage,StringstudentName,Grade grade){
	// this.age = age;
	// this.studentName = studentName;
	// this.grade = grade;
	// }
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade (Grade grade) {
		this.grade = grade; 
	}
	
}
class Grade{
     String gradeName;
     private int n;
     private int num;
     Student[] students;

Grade(){	
	n=100;
	students = new Student[100];
}
public String getGradeName() {
return gradeName;
}
public void setGradeName(String gradeName) {
this.gradeName = gradeName;
}
public int getN() {
return n;
}
public void setN(int n) {
this.n= n;
}
public void add(Student s) {
for(int i=0;i<students.length;i++) {
	if(students[i] == null) {
		students[i] = s;
		num++;
		break;
	}
}
}
public int getNum() {
return num;
}

}
public class Que01 {
public static void main(String[] args) {
Grade grade = new Grade();
grade.setGradeName("计算机");

Student s = new Student();
s.setAge(20);
s.setStudentName("小明");
s.setGrade(grade);//设置一个学生的班级
grade.add(s);//添加一个学生
System.out.println("输出学生信息：");
System.out.println("该学生的年龄为："+s.getAge());
System.out.println("该学生的名字为:"+s.getStudentName());
System.out.println("该学生所属的班级为:"+s.getGrade().gradeName);

System.out.println("输出该学生所属班级信息：");
System.out.println("该学生所属班级名字为："+s.getGrade().gradeName);
System.out.println("该学生所属班级有"+s.getGrade().getNum()+"个学生");
}
}

