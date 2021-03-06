package day10;

public class Book {

	private int bid;
	private String bname;
	private int status;
	private int count;

	public Book(int bid, String bname, int status, int count) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.status = status;
		this.count = count;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", status=" + status + ", count=" + count + "]";
	}

}
