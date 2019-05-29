package day17;

import java.util.HashSet;
import java.util.Set;

public class Day17_4 {

	public static void main(String[] args) {
		Set<Mouse>mouse = new HashSet<Mouse>();
		mouse.add(new Mouse("小黑"));
		mouse.add(new Mouse("小黑"));
		mouse.add(new Mouse("小黄"));
		mouse.add(new Mouse("小黄"));
		mouse.add(new Mouse("小白"));
		mouse.add(new Mouse("小白"));
		mouse.forEach(System.out::println);
	}

}
class Mouse{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mouse(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mouse other = (Mouse) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mouse [name=" + name + "]";
	}
	
}
