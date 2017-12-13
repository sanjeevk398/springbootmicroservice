package com.example.test;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import repository.CustomerRepository;
import root.RootApplication;

@DataJpaTest
@RunWith(SpringRunner.class)
@SpringBootTest(classes=RootApplication.class)
public class RepositoryTest {
	@Autowired
	CustomerRepository repository;
	@PersistenceContext
	EntityManager entityManager;

	@Test
	public void totalCustomer() {
		assertEquals(9, repository.count());

	}

}
