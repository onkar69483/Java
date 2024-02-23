// Base class LibraryItem
class LibraryItem {
    private String title;
    private String id;
    private boolean checkedOut;

    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
        System.out.println("Checked out: " + checkedOut);
    }
}

// Subclass BookClass
class BookClass extends LibraryItem {
    private String author;
    private int pageCount;

    public BookClass(String title, String id, String author, int pageCount) {
        super(title, id);
        this.author = author;
        this.pageCount = pageCount;
    }

    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
    }
}

// Subclass DVD
class DVD extends LibraryItem {
    private String director;
    private int duration; // in minutes

    public DVD(String title, String id, String director, int duration) {
        super(title, id);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration + " minutes");
    }
}

// Subclass Magazine
class Magazine extends LibraryItem {
    private String publisher;
    private int issueNumber;

    public Magazine(String title, String id, String publisher, int issueNumber) {
        super(title, id);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Publisher: " + publisher);
        System.out.println("Issue Number: " + issueNumber);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        BookClass book = new BookClass("Hari Potter ani sorcerer cha dagad", "B001", "JK Rowling", 300);
        book.displayInfo();
        System.out.println();
        
        DVD indianDVD = new DVD("3 Idiots", "D002", "Rajkumar Hirani", 170);
        indianDVD.displayInfo();
        System.out.println();
        
        DVD cartoonDVD = new DVD("Chhota Bheem", "D003", "Green Gold Animation", 120);
        cartoonDVD.displayInfo();
        System.out.println();
        
        Magazine magazine = new Magazine("National Geographic", "M001", "National Geographic Society", 256);
        magazine.displayInfo();
    }
}