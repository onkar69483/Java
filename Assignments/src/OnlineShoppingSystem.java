public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Electronics phone = new Electronics("Smartphone", 69999.99, "OnePlus");
        Clothing shirt = new Clothing("Kurta", 1999.99, "XL", "Silk");
        Books book = new Books("Hari Potter and the sorcerers cha dagad", 1499.99, "JK Rowling", 300);

        System.out.println("Phone: " + phone.getName() + ", Price: " + phone.getPrice() + " INR, Brand: " + phone.getBrand());
        System.out.println("Shirt: " + shirt.getName() + ", Price: " + shirt.getPrice() + " INR, Size: " + shirt.getSize() + ", Material: " + shirt.getMaterial());
        System.out.println("Book: " + book.getName() + ", Price: " + book.getPrice() + " INR, Author: " + book.getAuthor() + ", Pages: " + book.getPages());
    }
}

class ProductClass {
    private String name;
    private double price;

    public ProductClass(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Electronics extends ProductClass {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class Clothing extends ProductClass {
    private String size;
    private String material;

    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }
}

class Books extends ProductClass {
    private String author;
    private int pages;

    public Books(String name, double price, String author, int pages) {
        super(name, price);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}
