package library;

import library.model.Book;

public class Library {
	private Book book;
	
	

	public Library() {
		this.book = new Book();
	}

	public void getBook() {
		System.out.println(book.getTitle());
		System.out.println(book.getISBN());
		System.out.println(book.getAuthor());
	}

	public void setBook(String author, int ISBN, String title) {
		this.book.setAuthor(author);
		this.book.setISBN(ISBN);
		this.book.setTitle(title);
	}
	
}
