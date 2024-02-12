package library.app;

import library.Library;

public class LibraryApp {
	public static void main(String[] args) {
		Library library = new Library();
		library.setBook("Sachin Mhetre",132,"Show me the Code!");
		library.getBook();
	}
}
