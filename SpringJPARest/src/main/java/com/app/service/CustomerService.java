package com.app.service;

import java.util.List;

import com.app.entity.Customer;

public interface CustomerService {

	List<Customer> retrieveAll();

	Customer retriveCustomer(Integer id);

	void addCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void deleteCustomer(Integer id);

}
