package MySpring;

public class BookDetails {

	Books books;

	public BookDetails( Books books) {
		super();
		this.books = books;
	}
	

	public Books getBooks() {
		return books;
	}


	public void setBooks(Books books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "BookDetails [  books=" + books + "]";
	}

}
