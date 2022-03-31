package MySpring;

public class Books {
String bookID;	
int rate;
String bookname;
String authorname;
float version;


public String getBookID() {
	return bookID;
}


public void setBookID(String bookID) {
	this.bookID = bookID;
}


public int getRate() {
	return rate;
}


public void setRate(int rate) {
	this.rate = rate;
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


public float getVersion() {
	return version;
}


public void setVersion(float version) {
	this.version = version;
}


public void bookRate()
{
	System.out.println("Book ID: "+getBookID()+"\nBook Name: "+getBookname()+"\nRate: "+getRate()+"\nAuthorName: "+getAuthorname()+"\nVersion: "+getVersion());
}


@Override
public String toString() {
	return "Books [bookID=" + bookID + ", rate=" + rate + ", bookname=" + bookname + ", authorname=" + authorname
			+ ", version=" + version + "]";
}

}
