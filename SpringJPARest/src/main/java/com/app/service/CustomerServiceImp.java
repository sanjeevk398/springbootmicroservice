package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CustomerDao;
import com.app.entity.Customer;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public List<Customer> retrieveAll() {
		return customerDao.findAllCustomer();
	}

	@Override
	public Customer retriveCustomer(Integer id) {
		return customerDao.findById(id);
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(Integer id) {
		customerDao.deleteCustomer(id);
	}

}
