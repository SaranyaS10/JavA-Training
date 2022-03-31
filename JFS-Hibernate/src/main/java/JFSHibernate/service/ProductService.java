package JFSHibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JFSHibernate.entity.Product;
import JFSHibernate.repository.ProductRepository;

@Service
public class ProductService {
	
    @Autowired
	private ProductRepository productRepository;
    
    public Product saveProduct(Product product)
    {
    	return productRepository.save(product);
    }
    
    public List<Product> saveProducts(List<Product> products)
    {
    	return productRepository.saveAll(products);
    }
    
    public List<Product> getProduct() {
    	return productRepository.findAll();
    }
    
    public Product getProductByName(String name)
    {
		return productRepository.findByName(name);
    	
    }
    
    public Product getProductById(int product_ID)
    {
    	return productRepository.findById(product_ID).orElse(null);
    }
    
    public Product getProductByPrice(double price)
    {
    	return productRepository.findByPrice(price);
    }
    public Product getProductByQuantity(int quantity)
    {
    	return productRepository.findByQuantity(quantity);
    }

	public Product updateProduct(Product product) {
		
		Product availableProduct=productRepository.findById(product.getProduct_ID()).orElse(null);
		availableProduct.setQuantity(10);
		availableProduct.setPrice(1000);
		return productRepository.save(availableProduct);

	}
	


	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		return "Product Deleted is " +id;
	}

	public List<Product> updateProducts(List<Product> product) {
		List<Product> availableProduct=productRepository.findAll();
		( (Product) availableProduct).setQuantity(10);
		((Product) availableProduct).setPrice(1000);
		return productRepository.saveAll(availableProduct);
	}
}

