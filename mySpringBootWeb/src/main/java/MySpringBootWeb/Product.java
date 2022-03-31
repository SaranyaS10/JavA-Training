package MySpringBootWeb;

public class Product {
private int product_ID;
private String product_Name;
private String brand_Name;
private int price;
private int stock_available;



public Product() {
	super();
	// TODO Auto-generated constructor stub
}



public Product(int product_ID, String product_Name, String brand_Name, int price, int stock_available) {
	super();
	this.product_ID = product_ID;
	this.product_Name = product_Name;
	this.brand_Name = brand_Name;
	this.price = price;
	this.stock_available = stock_available;
}



public int getProduct_ID() {
	return product_ID;
}
public void setProduct_ID(int product_ID) {
	this.product_ID = product_ID;
}
public String getProduct_Name() {
	return product_Name;
}
public void setProduct_Name(String product_Name) {
	this.product_Name = product_Name;
}

public String getBrand_Name() {
	return brand_Name;
}

public void setBrand_Name(String brand_Name) {
	this.brand_Name = brand_Name;
}

public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getStock_available() {
	return stock_available;
}
public void setStock_available(int stock_available) {
	this.stock_available = stock_available;
}



@Override
public String toString() {
	return "Product [product_ID=" + product_ID + ", product_Name=" + product_Name + ", brand_Name=" + brand_Name
			+ ", price=" + price + ", stock_available=" + stock_available + "]";
}


}
