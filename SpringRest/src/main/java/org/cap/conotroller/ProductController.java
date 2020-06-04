package org.cap.conotroller;

import java.util.List;

import org.cap.dao.ICustomerDao;
import org.cap.dao.IProductDao;
import org.cap.model.Customer;
import org.cap.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

	
	@Autowired
	private IProductDao productDao;
	
	
	@PostMapping("/product")
	public ResponseEntity<List<Product>> addProduct(@RequestBody Product product){
		List<Product> products=productDao.addProduct(product);
		
		if(products==null || products.isEmpty() ) {
			return new ResponseEntity("Sorry! No Items Available!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
	@PostMapping("/products")
	public ResponseEntity<List<Product>> addProducts(@RequestBody List<Product> productsList){
		List<Product> prod=productDao.addProducts(productsList);
		
		if(prod==null || prod.isEmpty() ) {
			return new ResponseEntity("Sorry! No Items Available!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Product>>(prod, HttpStatus.OK);
	}
	
	@PutMapping("/product/{productId}")
	public ResponseEntity<List<Product>> updateProduct(
			@PathVariable("productId") Integer productId, @RequestBody Product product){
		List<Product> products=productDao.updateProduct(productId,product);
		
		if(products==null) {
			return new ResponseEntity("Sorry! Product Id not exists! Deletion Error!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
	//@PatchMapping("/product")
	
	
	@DeleteMapping("/products/{productId}")
	public ResponseEntity<List<Product>> deleteProduct(
			@PathVariable("productId") Integer productId){
		List<Product> products=productDao.deleteProduct(productId);
		
		if(products==null) {
			return new ResponseEntity("Sorry! Product Id not exists! Deletion Error!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> products=productDao.getAllProducts();
		
		if(products==null || products.isEmpty() ) {
			return new ResponseEntity("Sorry! No Items Available!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
	@GetMapping("/products/{productId}")
	public ResponseEntity<Product> findProducts(
			@PathVariable("productId") Integer productId ){
		Product product=productDao.findProduct(productId);
		
		if(product==null ) {
			return new ResponseEntity("Sorry!Product Id Not Found!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
}
