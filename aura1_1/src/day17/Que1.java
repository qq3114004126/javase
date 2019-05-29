package day17;

import java.util.Arrays;

//1.插入排序，按照从大到小实现。冒泡、选择、插入、希尔排序；顺序查找、二分查找。
public class Que1 {
//  将插入排序写成冒泡类似的样子
//	这样写可以，但是效率行来说insert方法效率高。
	public static void insert3(int []t){
		for(int  i=1;i<t.length;i++){
    		int temp=t[i];//正在对第i个元素进行排序
        	for(int j=i-1;j>=0;j--){
        		if(temp>t[j]){
	        		int te=t[j+1];
	        		t[j+1]=t[j];
	        		t[j]=te;
        		}
        	}
    	}
	}
	
//	容易犯错的写法
	public static void insert2(int []t){
//		int []t={3,4,5,-6,73,-55,22,66,21};
//		int []t={4,3,5,-6,73,-55,22,66,21};
//		int []t={4,5,3,-6,73,-55,22,66,21};  t[i]   temp 不相等的。
		for(int  i=1;i<t.length;i++){
    		int temp=t[i];//正在对第i个元素进行排序  
        	int j=i-1;//
//        	while(j>=0&&t[i]>t[j]){//容易犯错的内容
        	while(j>=0&&temp>t[j]){
//        		int te=t[i];  将j+1写成i   经过上一次交换之后，t[i]和temp中的值不相等
//        		t[i]=t[j];
//        		t[j]=te;
//        		System.out.println(Arrays.toString(t));
        		j--;
        	}
    	}
	}
	//只要遇见符合条件的元素，则交换位置
	public static void insert1(int []t){
		for(int  i=1;i<t.length;i++){
    		int temp=t[i];//正在对第i个元素进行排序
        	int j=i-1;
        	while(j>=0&&temp>t[j]){
        		int te=t[j+1];
        		t[j+1]=t[j];
        		t[j]=te;
//        		System.out.println(Arrays.toString(t));
        		j--;
        	}
    	}
	}
    public static void insert(int []t){
    	for(int  i=1;i<t.length;i++){
    		int temp=t[i];//正在对第i个元素进行排序
        	int j=i-1;
        	while(j>=0&&temp>t[j]){
        		t[j+1]=t[j];
        		j--;
        	}
        	t[j+1]=temp;
        	
    	}
    }
    
	public static void main(String[] args) {
		int []t={3,4,5,-6,73,-55,22,66,21};
//		insert(t);
//		insert1(t);
//		insert2(t);
		insert3(t);
		System.out.println(Arrays.toString(t));
	}
}
