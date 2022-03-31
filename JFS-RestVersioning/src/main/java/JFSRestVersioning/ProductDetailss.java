package JFSRestVersioning;

public class ProductDetailss {
	
	private String productname;
	private String brandname;
	
	public ProductDetailss(String productname, String brandname) {
		super();
		this.productname = productname;
		this.brandname = brandname;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	
	

}
