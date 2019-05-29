package day14;

public class Day14_7 {

	public static void main(String[] args) {
		gradeTable g1 = new gradeTable(95, "张三");
		gradeTable g2 = new gradeTable(-10,"李四");
		try {
			g1.setScore(-1);
		} catch (Exception e) {
			System.out.println("分数不合理");
		}
	}

}
class gradeTable{
	int score;
	String name;
	int []num = new int[10];

	public gradeTable(int score, String name) {
		super();
		this.score = score;
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public int getScore() {
		
		return score;
	}

	public void setScore(int score) throws Exception {
		for(int i = 0;i<this.num.length;i++) {
			if(score>0&&score<100) {
				num[i] = score;
			}else {
				System.out.println("出错了");
				throw new Exception("出错了");
			}
		
		}
		this.score = score;
	}
	
}