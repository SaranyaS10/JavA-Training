package JFSRestVersioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllerr {
	
	//@GetMapping("v1/product")
	@GetMapping(value="/product/param", params="version=1")
	public Product createProduct() {
		return new Product("Ensure 100 grams");
	}
	
	//@GetMapping("v2/product")
	@GetMapping(value="/product/param", params="version=2")
	public ProductV2 createProductv2() {
		ProductDetailss productdetail=new ProductDetailss("Ensure 100 grams", "Ensure");
		ProductV2 productv2=new ProductV2(productdetail);
		return productv2;
	}
	
	

}
