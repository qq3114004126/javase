package day16;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Day16_12 {

	public static void main(String[] args) {
		UpdateStu stu1 = new UpdateStu ("张三",20);
		UpdateStu stu2 = new UpdateStu ("李四",22);
		UpdateStu stu3 = new UpdateStu ("王五",223);
		UpdateStu stu4 = new UpdateStu ("赵六",215);
		List <UpdateStu> tree = new ArrayList<UpdateStu>();
		tree.add(stu1);
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		Iterator<UpdateStu>it = tree.iterator();
		while(it.hasNext()) {
			UpdateStu stu = it.next(); 
			System.out.println(stu.getId()+" "+stu.getName());
		}
		
			//System.out.println(i.getName()+":"+i.id);
		}
	
	}



class UpdateStu  {
	String name;
	long id;
	
	public UpdateStu(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	

	

	
}
