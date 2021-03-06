package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import customexception.CustomerNotFoundException;
import entity.Customer;
import repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerRepository repository;

	@RequestMapping("/all")
	public List<Customer> retrieveAll() {
		return (List<Customer>) repository.findAll();
	}

	@RequestMapping("/retrieve/{customerid}")
	public Customer retrieve(@PathVariable Long customerid) {
		if (repository.exists(customerid))
			return repository.findOne(customerid);
		return null;
	}

	@RequestMapping("/remove/{customerid}")
	public String remove(@PathVariable Long customerid) {
		try {
			repository.delete(customerid);
		} catch (Exception e) {
			throw new CustomerNotFoundException("supplied customer is not available", e);
		}
		return "Customer haveing id : " + customerid + " deleted successfully";
	}

	@RequestMapping("/save")
	public String save(@RequestBody Customer customer) {
		repository.save(customer);
		return "record saved or updated";
	}

	@RequestMapping("/findbyname/{name}")
	public Customer getCustomerByName(@PathVariable String name) {
		return repository.findByName(name);
	}

	@RequestMapping("/update/{id}")
	public String update(@RequestBody Customer customer, @PathVariable Long id) {
		Customer cust = repository.findOne(id);
		if (cust != null) {
			cust.setAddress(customer.getAddress());
			cust.setAge(customer.getAge());
			cust.setName(customer.getName());
			repository.save(cust);
			return "record updated";
		} else {
			repository.save(customer);
			return "new record added";
		}
	}
	/*
	 * @Autowired CustomerService customerService;
	 * 
	 * @RequestMapping("/save") public String save() { Customer customer = new
	 * Customer(); // customer.setID(50); customer.setName("sanjeev");
	 * customer.setAddress("pune"); customer.setAge(25);
	 * customerService.save(customer); return "record saved"; }
	 * 
	 * @RequestMapping("/retrieveall") public List<Customer> retrieveAll() {
	 * return customerService.retrieveAll(); }
	 * 
	 * @RequestMapping("/retrievesingle") public Customer retrieveById() {
	 * return customerService.retrieve(2); }
	 * 
	 * @RequestMapping("/delete") public String delete() {
	 * customerService.delete(1); return "record delete having id : " + 1; }
	 * 
	 * @RequestMapping("/page") public String dispaly() { return "hello"; }
	 */

}