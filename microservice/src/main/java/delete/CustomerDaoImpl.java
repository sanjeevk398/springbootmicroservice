package delete;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import entity.Customer;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDAO {

	@PersistenceContext
	public EntityManager entityManager;

	@Override
	public Customer getCustomerById(int id) {
		return entityManager.find(Customer.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> retrieveAll() {
		return entityManager.createQuery("FROM Customer").getResultList();
	}

	@Override
	public String update(Customer customer) {
		return null;
	}

	@Override
	public void delete(int id) {
		entityManager.remove(entityManager.find(Customer.class, id));

	}

	@Override
	public void persist(Customer customer) {
		entityManager.persist(customer);
	}

}
