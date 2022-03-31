package MySpring;

import java.util.List;

public class BookCollection {

	List booklist;

	public List getBooklist() {
		return booklist;
	}

	public void setBooklist(List booklist) {
		this.booklist = booklist;
	}

	@Override
	public String toString() {
		return "BookCollection [booklist=" + booklist + "]";
	}
	
}
