package org.cap.conotroller;

import java.util.List;

import org.cap.dao.CustomerDaoImpl;
import org.cap.entity.CustomerEntityList;
import org.cap.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ap")
public class CustomerController {

	@Autowired
	private CustomerDaoImpl customerDao;
	
	@GetMapping(value="/customers")
	public ResponseEntity<CustomerEntityList> getCustomers(){
		CustomerEntityList Customers=customerDao.getCustomers();
		
		if(Customers==null) {
			return new ResponseEntity("Sorry!Product Id Not Found!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<CustomerEntityList>(Customers, HttpStatus.OK);
	}
}
