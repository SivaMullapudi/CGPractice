package org.cap.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.cap.model.Manufacturer;
import org.cap.model.Product;
import org.springframework.stereotype.Repository;

@Repository("productDao")
public class ProductDaoImpl implements IProductDao {
	
	
	private static AtomicInteger productId=new AtomicInteger(1234);
	private static AtomicInteger manufacturerId=new AtomicInteger(1);
	private static List<Product> db=getDummyDB(); 
	private static List<Product> products;
	private static Manufacturer manufatcturer;
	private static List<Product> getDummyDB(){
			products=new ArrayList<Product>();
			manufatcturer=new Manufacturer(manufacturerId.getAndIncrement(), "Tom", "Jerry", "tom@gmail.com");
			products.add(new Product(productId.getAndIncrement(), "Laptop", 34, 45000.0, manufatcturer));
			products.add(new Product(productId.getAndIncrement(), "Mobile",12, 23000.0, manufatcturer));
			
			Manufacturer manufatcturer1=new Manufacturer(manufacturerId.getAndIncrement(), "Jack", "Thomson", "jack@gmail.com");
			products.add(new Product(productId.getAndIncrement(), "HeadSet", 23, 300.0, manufatcturer1));
			products.add(new Product(productId.getAndIncrement(), "Printer", 11, 67000.0, manufatcturer1));
			
			
		
		return products;
	}
	

	@Override
	public List<Product> getAllProducts() {
		
		return db;
	}


	@Override
	public Product findProduct(Integer productId) {
		for(Product product:db) {
			if(product.getProductId()==productId)
				return product;
		}
		return null;
	}


	@Override
	public List<Product> deleteProduct(Integer productId) {
		boolean flag=false;
		Iterator<Product> iterator = db.iterator();
		while(iterator.hasNext()) {
			Product product= iterator.next();
			if(product.getProductId()==productId) {
				flag=true;
				iterator.remove();
				break;
			}
		}
		if(flag)
			return db;
		else
			return null;
	}


	@Override
	public List<Product> addProduct(Product product) {
		products.add(product);
		return products;
	}


	@Override
	public List<Product> addProducts(List<Product> productsList) {
		products.addAll(productsList);
		return products;
	}


	@Override
	public List<Product> updateProduct(Integer productId,Product product) {
		System.out.println("In update Product");
		for(Product p:products)
		{
			if(p.getProductId()==productId)
			{
				p.setProductName(product.getProductName());
				p.setPrice(product.getPrice());;
			}
		}
		return products;
	}
	
	
}
