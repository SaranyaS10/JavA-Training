package Spring1;

import org.springframework.beans.factory.annotation.Value;

public class BookStore1 {
	

private int bookID;
String bookName;
public int getBookID() {
	return bookID;
}
public void setBookID(int bookID) {
	this.bookID = bookID;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
@Override
public String toString() {
	return "BookStore1 [bookID=" + bookID + ", bookName=" + bookName + "]";
}


}
