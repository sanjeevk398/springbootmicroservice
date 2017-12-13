package delete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	public CustomerDAO customerDao;

	public void save() {

	}

	@Override
	public void save(Customer customer) {
		customerDao.persist(customer);
	}

	@Override
	public Customer retrieve(int id) {
		return customerDao.getCustomerById(id);
	}

	@Override
	public List<Customer> retrieveAll() {
		return customerDao.retrieveAll();
	}

	@Override
	public String update(Customer customer) {
		customerDao.update(customer);
		return "record updated successfully";
	}

	@Override
	public void delete(int id) {
		customerDao.delete(id);
	}

}
