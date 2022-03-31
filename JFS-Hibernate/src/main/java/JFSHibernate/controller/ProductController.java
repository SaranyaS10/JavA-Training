package JFSHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JFSHibernate.entity.Product;
import JFSHibernate.service.ProductService;

@RestController
@RequestMapping("/Product")
public class ProductController {

	@Autowired
	private ProductService productService;
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		return productService.saveProduct(product);
		
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> product)
	{
		return productService.saveProducts(product);
		
	}
	@GetMapping("/getProduct")
    public List<Product> findallProducts() {
    	return productService.getProduct();
    }
	@GetMapping("/findProductByName/{name}")
    public Product findProductByName(@PathVariable String name) {
    	return productService.getProductByName(name);
	}
	
	@GetMapping("/findProductById/{product_ID}")
  public Product findProductById(@PathVariable int product_ID) {
  	return productService.getProductById(product_ID);
	}
	
	@GetMapping("/findProductByprice/{price}")
    public Product findProductByPrice(@PathVariable double price) {
  	return productService.getProductByPrice(price);
	}
	@GetMapping("/findProductByQuantity/{quantity}")
    public Product findProductByQuantity(@PathVariable int quantity) {
  	return productService.getProductByQuantity(quantity);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
		
	}
	
	@DeleteMapping("/delete/{product_ID}")
	public String deleteProduct(@PathVariable int product_ID) {
		return productService.deleteProduct(product_ID);
		
	}
	
	@PutMapping("/updateall")
	public List<Product> updateProducts(@RequestBody List<Product> product) {
		return productService.updateProducts(product);

}
}
