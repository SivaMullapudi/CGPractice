package org.cap.dao;

import java.util.List;

import org.cap.model.Product;

public interface IProductDao {
	
	public List<Product> getAllProducts();

	public Product findProduct(Integer productId);

	public List<Product> deleteProduct(Integer productId);

	public List<Product> addProduct(Product product);

	public List<Product> addProducts(List<Product> products);

	public List<Product> updateProduct(Integer productId, Product product);

}
