package day10;
//1.	需求：一个班级中学生的人数固定为n个，一个学生属于一个班级。
// 可以向班级中添加1个学生，可以设置一个学生的班级，这样在获得学生信息的时候也可以同时获得班级信息，
//也可以在获得班级信息后，调取出这个班下有多少个学生。利用类和类之间的关系完成。
//关联关系
class Student1_1{
	private String name;
	private Pubclass1_1 pubclass;

	public Pubclass1_1 getPubclass() {
		return pubclass;
	}

	public void setPubclass(Pubclass1_1 pubclass) {
		this.pubclass = pubclass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student1_1(String name) {
		super();
		this.name = name;
	}
	
}
class Pubclass1_1{
	private String name;
	private Student1_1[] students=new Student1_1[10];

	public void addStudent(Student1_1 s){
		boolean tag=true;
		for(int i=0;i<10;i++){
			if(this.students[i]==null){
				this.students[i]=s;
				tag=false;
				break;
			}
		}
		if(tag){
			System.out.println("学生已满，无法加入");
		}
	}
	
	public Student1_1[] getStudents() {
		return students;
	}

	public void setStudents(Student1_1[] students) {
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pubclass1_1(String name) {
		super();
		this.name = name;
	}
	
}


public class Que1 {
	public static void main(String[] args) {
		Student1_1 s=new Student1_1("张三");
		Pubclass1_1 c=new Pubclass1_1("java1班");
//		通过学生设置了学生的班级
		s.setPubclass(c);
		System.out.println(s.getPubclass().getName());
		
		
//		建立班级和学生的关系
		c.addStudent(s);
		
//		继续加入学生
//		双向关联
		Student1_1 s1=new Student1_1("李四");
		c.addStudent(s1);
		s1.setPubclass(c);
		
		
//		查看班级下的学生
		Student1_1[] students_s=c.getStudents();
		for (Student1_1 stu:students_s) {
			if (stu!=null)
				System.out.println(stu.getName());
		}
		
	}

}
