package com.cap.SpringBootPractise;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cap.SpringBootPractise.bean.Customer;

@Controller
public class LoginController {

	@RequestMapping(value = "/login")
	public String loginCheck(@RequestParam("user") String user, @RequestParam("password") String password) {
		if ("admin".equalsIgnoreCase(password) && "admin".equalsIgnoreCase(user)) {
			return "success";
		} else {
			return "redirect:/";
		}
	}

	@RequestMapping(value = "/register")
	public String register() {
		return "register";
	}

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String register(@ModelAttribute("customer") Customer customer,BindingResult bindingResult) {
		System.out.println(" First Name :" + customer.getFirstName() + " Last Name :" + customer.getLastName());
		if (null != customer.getFirstName() && null != customer.getLastName())
			return "registerSuccess";
		return "redirect:/";
	}
}
