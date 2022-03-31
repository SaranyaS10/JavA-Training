package Spring1;

public class BookStore2 {

	int bookid;
	String bookname;
	String authorname;
	int	bookcount;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getBookcount() {
		return bookcount;
	}
	public void setBookcount(int bookcount) {
		this.bookcount = bookcount;
	}
	@Override
	public String toString() {
		return "BookStore2 [bookid=" + bookid + ", bookname=" + bookname + ", authorname=" + authorname + ", bookcount="
				+ bookcount + "]";
	}
	
	
	
}
