class Book{
	private String book_name;
	private int price;
	private Author author;
	public Book() {
		
	}
	public Book(String book_name, int price, Author author) {
		this.book_name = book_name;
		this.price = price;
		this.author = author;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void getDetails() {
		System.out.println("Book Name: "+book_name);
		System.out.println("Book Price: "+price);
		author.getDetails();
	}
}

class Author{
	private String author_name;
	private int age;
	public Author(String author_name, int age) {
		this.author_name = author_name;
		this.age = age;
	}
	public void getDetails() {
		System.out.println("Author Name: "+author_name);
		System.out.println("Author Age: "+age);
	}
}

public class Library {
	private int book_number;
	private Book book[];
	public Library() {
		this.book_number = 0;
		this.book = new Book[5];
	}
	public void add_book(String book_name, int price, String author_name, int author_age) {
		if(book_number<5) {
			Author author = new Author(author_name, author_age);
			this.book[this.book_number] = new Book(book_name, price, author);
			this.book_number++;
		}
		else {
			System.out.println("Library Full!");
		}
	}
	
	public void get_Books() {
		for(int i=0; i<book_number; i++) {
			book[i].getDetails();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Library library = new Library();
	    library.add_book("The Catcher in the Rye", 15, "J.D. Salinger", 35);
	    library.add_book("To Kill a Mockingbird", 20, "Harper Lee", 34);
	    library.add_book("1984", 18, "George Orwell", 46);
	    library.add_book("The Great Gatsby", 25, "F. Scott Fitzgerald", 44);
	    library.add_book("The Hobbit", 30, "J.R.R. Tolkien", 62);
		library.get_Books();
	}
	
}
