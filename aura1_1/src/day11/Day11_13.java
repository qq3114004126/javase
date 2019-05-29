package day11;

public class Day11_13 {

	public static void main(String[] args) {
		Pagelog p = new Pagelog(20,5,1);
		p.show(6,24);
	}

}
class Pagelog{
	int page;
	int record;
	int pageSize;
	
	public Pagelog(int page, int record, int pageSize) {
		super();
		this.page = page;
		this.record = record;
		this.pageSize = pageSize;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRecord() {
		return record;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		if(pageSize>page/record ||pageSize<1) {
			System.out.println("输入错误，请重新输入");
		}
		this.pageSize = pageSize;
	}
	void show(int record,int page) {
		
		System.out.println("当前页是："+pageSize+",每页共有"+record+"个记录");
		int start=(pageSize-1)*record+1;
		int end =pageSize*record ;
		if(page%record!=0) {
			 end = page;
			 pageSize++;
		}else {
		     end=pageSize*record;
		     
		}
		for(int i=start;i<=end;i++ ) {
			System.out.println("这是第"+i+"条记录");
		}
		
	}
	
	
}