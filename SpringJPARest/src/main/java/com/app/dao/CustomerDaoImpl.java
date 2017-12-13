package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.app.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Customer> findAllCustomer() {
		return entityManager.createQuery(entityManager.getCriteriaBuilder().createQuery(Customer.class))
				.getResultList();
	}

	@Override
	public Customer findById(Integer id) {
		return entityManager.find(Customer.class, id);
	}

	@Override
	public void addCustomer(Customer customer) {
		entityManager.persist(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		entityManager.merge(customer);
	}

	@Override
	public void deleteCustomer(Integer id) {
		entityManager.remove(id);
	}

}
