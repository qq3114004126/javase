package day19;
/*
 * 第四章  流程控制
 * 流程控制：就是程序执行的过程：顺序、选择、循环
 * 顺序：程序按部就班的执行
 * 选择：根据条件不同，执行不同的代码段
 * 循环：体现的重复执行一件事情
 */
public class Day2_4_Control_ifelse {
	public static void main(String[] args) {
//		一、选择
//		1.if 当条件成立时，则执行的代码段
		/*if可以单独使用
		 * if(条件表达式){
		 *   条件成立时执行的代码段（如果代码只有一句话，则可以不写{ }）
		 * }
		 * if外侧的语句无论条件是否成立都会正常执行
		 */
//		int score=70;
//		if(score>=60){
//			System.out.println("及格了");
//		    System.out.println("及格万岁");
//		}
//		System.out.println("无论if是否成立都会执行的代码段");
		
//		2.if ..else..
		/* 二选一
		 * if(条件表达式){
		 *   条件成立时执行的代码段（如果代码只有一句话，则可以不写{ }）
		 * }else{
		 *   不能单独使用
		 *   else后面没有条件
		 *   是if条件不满足时执行的代码
		 * }
		 * if外侧的语句无论条件是否成立都会正常执行
		 */
		int  score =50;
		if(score >=60){
			System.out.println("及格万岁");
			System.out.println("！！！！");
		}else{
			System.out.println("挂科了");
			System.out.println("哭了");
		}
		System.out.println("不受if和else的影响");
	
	/*小知识：debug
	 * 步骤：
	 * （1）设置断点，当程序执行到断点的位置，就会停止在这一行（这一行还没有执行）
	 * （2）程序下一步执行 F6
	 * （3）程序可以执行到下一个断点，如果没有断点执行完毕 F8
	 * （4）当鼠标悬停在变量的，可以看到变量的值
	 * （5）启动的时候要用debug
	 */
	
//	练习  判断一个数字value ，如果数字==8，输出“发发发”，
//	否则如果value<8 太小了，如果>8输出太大了
		//在if条件中，一定要避免并列的if条件中出现相同变量值判断。
//		int value=9;
//		if(value==8){
//			System.out.println("发发发");
//		}
//		if(value>8){
//			System.out.println("大了");
//		}
//		if(value <8){
//			System.out.println("小了");
//		}
		
//		使用if else
		int value=9;
		if(value==8){
			System.out.println("发发发");
		}else{
			if(value>8){
				System.out.println("大了");
			}else{
				System.out.println("小了");
			}
		}
		
//		3.if  多个else if  ... else
		/* 多选一，执行的时候，会从上到下依次跟if条件进行匹配，
		 * 只要遇见匹配的条件则进入代码块执行。之后，不会再继续进行向下匹配（只匹配依次）
		 * if(条件表达式){
		 *   条件成立时执行的代码段（如果代码只有一句话，则可以不写{ }）
		 * }else  if(条件表达式)
		 *    条件成立时执行的代码段（如果代码只有一句话，则可以不写{ }）
		 * }else  if(条件
		 * 表达式)
		 *    条件成立时执行的代码段（如果代码只有一句话，则可以不写{ }）
		 * }else{
		 *   不能单独使用
		 *   else后面没有条件
		 *   是if条件不满足时执行的代码
		 * }
		 * if外侧的语句无论条件是否成立都会正常执行
		 */
		int w=121;
		if(w<=100){
			System.out.println("我很瘦");
		}else if(w<=120){
			System.out.println("需要去健身房");
		}else if(w<=110){
			System.out.println("我不能继续再吃了");
		}else{
			System.out.println("不能出门了");
		}
	}
//	【在if else if  else中要注意的问题】
	/* 1.if  和else if后面有条件， else后面没有条件
	 * 2.if可以单独使用，else if 和else 都不能单独使用
	 * 3.if 和多个else if会从上到下进行匹配，只要遇到匹配项，就不再继续向下匹配
	 * 4.注意if 和else if的顺序（不要有交集）
	 * 5.将发生概率大的条件放在前面
	 */
}
