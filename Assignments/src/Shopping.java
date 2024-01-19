import java.util.Random;

class Product {
	private String product_name;
	private int price;
	public Product(String product_name, int price) {
		this.product_name = product_name;
		this.price = price;
	}
	public String getProduct_name() {
		return product_name;
	}
	public int getPrice() {
		return price;
	}
}

class Customer {
	private String customer_name;
	private Order order;
	public Customer(String customer_name) {
		this.customer_name = customer_name;
		this.order = new Order();
	}
	public void add_item(String product_name, int price) {
		order.add_Product(product_name, price);
	}
	public void place_order() {
		System.out.println("Customer Name: "+this.customer_name);
		order.getDetails();
		System.out.println("Order Placed!");
	}
}

class Order {
	private int order_id;
	private int total_price;
	private Product products[];
	private int product_number;
	public Order(){
		Random random = new Random();
		this.product_number = 0;
		this.order_id = random.nextInt(999)+100;
		this.products = new Product[5];
	}
	public void add_Product(String product_name, int price) {
		if(product_number<5) {
			this.products[this.product_number] = new Product(product_name, price);
			this.total_price += price;
			this.product_number++;
		}
		else {
			System.out.println("Max products should be 5");
		}
	}
	public void getDetails() {
		System.out.println("OrderID: "+this.order_id);
		for(int i=0; i<this.product_number; i++) {
			System.out.println("Product_Name: "+products[i].getProduct_name());
			System.out.println("Product_Price: "+products[i].getPrice());
			System.out.println();
		}
		System.out.println("Total: "+total_price);
	}
}

public class Shopping {
	public static void main(String[] args) {
		Customer customer = new Customer("Onkar");
		customer.add_item("milk", 72);
		customer.add_item("bread", 52);
		customer.add_item("rice", 63);
		customer.place_order();
	}
}
