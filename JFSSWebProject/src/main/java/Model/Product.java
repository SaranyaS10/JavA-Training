package Model;

public class Product {
	
	private String item_ID;
	private String item_Name;
	private int product_price;
	private int quantity;
	public Product() {
		super();
		
	}
	public Product(String item_ID, String item_Name, int product_price, int quantity) {
		super();
		this.item_ID = item_ID;
		this.item_Name = item_Name;
		this.product_price = product_price;
		this.quantity = quantity;
	}
	public String getItem_ID() {
		return item_ID;
	}
	public void setItem_ID(String item_ID) {
		this.item_ID = item_ID;
	}
	public String getItem_Name() {
		return item_Name;
	}
	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [item_ID=" + item_ID + ", item_Name=" + item_Name + ", product_price=" + product_price
				+ ", quantity=" + quantity + "]";
	}
	

}
