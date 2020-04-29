package akshita.cg.product.service;

import java.util.List;

import akshita.cg.product.entity.Product;


public interface ProductServiceInterface {
	
	public Product save(Product product);

	public List<Product> reterive();

}
