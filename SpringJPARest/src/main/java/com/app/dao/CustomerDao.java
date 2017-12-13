package com.app.dao;

import java.util.List;

import com.app.entity.Customer;

public interface CustomerDao {

	List<Customer> findAllCustomer();

	Customer findById(Integer id);

	void addCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void deleteCustomer(Integer id);

}
