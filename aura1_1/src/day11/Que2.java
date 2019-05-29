package day11;


//2.	编写一个分页显示类，初始化传入记录总数。希望可以通过设置每页记录数和页码，可以显示当前页的信息。
//其中每页记录数与页码使用成员的私有化。注意，如果页码设置不正确（如<1或者>最大页码），
//提示错误信息。设计方法能够返回当前页显示的记录区间。
//p=new Page(20);
//p 属性每页记录数  5
//p.属性当前页  3
//p.show()
//这是第11 12 13 14  15 
class Page{
	private int total;
	private int pageSize;
	private int currentPage=1;
	private int maxPage;
	public void show(){
		System.out.println("当前是第"+this.getCurrentPage()+"页");
		
//		23  每页5条记录   当前页是2 ： start  pageSize*(currentpage-1)+1   1  6   11  16
//		                     end    pageSize*currentpage          5  10  15 
//		                                尾页5       ：start   pageSize*(currentpage-1)+1    5*4+1=21
//		                     end    total 23
//		取的到底是不是尾页：条件：current 不是maxpage：不是尾页，否则是尾页
		
		
		int start=this.getPageSize()*(this.getCurrentPage()-1)+1;
		int end;
		if(this.getCurrentPage()==this.getMaxPage()){
			end=this.getTotal();
		}else{
			end=this.getPageSize()*this.getCurrentPage();
		}
		for(int i=start;i<=end;i++){
			System.out.println("这是第"+i+"条记录");
		}
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		int maxPage=this.total/this.pageSize;
		if(this.total%this.pageSize!=0){
			maxPage+=1;
		}
		this.maxPage=maxPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	
	public void setCurrentPage(int currentPage) {
		//完善set方法。
//		20  每页5条记录   最大页数  20/5=4
//		23 每页5条记录   最大页数   20/5+1=4+1=5
		
		
		if (currentPage<1 || currentPage>maxPage){
			System.out.println("页码设置有误");
		}else{
			this.currentPage=currentPage;
		}
	}
	public Page(int total) {
		super();
		this.total = total;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
}

public class Que2 {
	public static void main(String[] args) {
		Page p=new Page(23);
		p.setPageSize(5);
		p.setCurrentPage(6);
		p.show();
	}
}
