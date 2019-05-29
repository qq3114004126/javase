package day13;

public class Day13_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a =444;
		int b =444;
		Integer c =444;
		System.out.println(a==b);
		//如果是比较运算符 ，如果两侧不是同种类型，则都转换成拆箱之后的基本数据类型来进行比较，因为b经过拆箱后变成
		//基本数据类型,所以相等。
		System.out.println(c==b);
		//如果是比较运算符 ，如果两侧不是同种类型，则都转换成拆箱之后的基本数据类型来进行比较，因为b经过拆箱后变成
		//基本数据类型,所以相等。
		System.out.println(a.equals(b));
		//"=="比较的是变量(栈)内存中存放的对象的(堆)内存地址，用来判断两个对象的地址是否相同，即是否是指相同一个对象。
		//equals用来比较的是两个对象的内容是否相等
		//a拆箱后自动转换为基本数据类型,a和b是对象内容相等。
		System.out.println(c.equals(b));
		//equals用来比较的是两个对象的内容是否相等
		//c拆箱后自动转换为基本数据类型,c和b是对象内容相等。
		Boolean b1 =false;
		
		Boolean b2 =false;
		Boolean b3 =true;
		Boolean b4 =true;
		System.out.println(b1==b2);
		//Boolean是基本数据类型的包装器类,不是基本数据类型,b1,b2都为同一类型，且引用值相等。
		System.out.println(b3==b4);
		//Boolean是基本数据类型的包装器类,不是基本数据类型,b1,b2都为同一类型，且引用值相等。
		int i1 =1000;
		Integer i2 =1000;
		Integer i3 =2000;
		System.out.println(i1+i2==i3);
		//当进行运算时都会自动，包装器类型会自动转换为基本数据类型参与运算,得出的结果依然是包装器类型。
	}

}
