package akshita.cg.product.dao;

import java.util.List;

import akshita.cg.product.entity.Product;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterive();
	

}
