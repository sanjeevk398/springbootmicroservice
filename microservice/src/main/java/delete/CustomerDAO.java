package delete;

import java.util.List;

import entity.Customer;

public interface CustomerDAO {
	
	public void persist(Customer customer);

	public Customer getCustomerById(int id);

	public List<Customer> retrieveAll();

	public String update(Customer customer);

	public void delete(int id);

}
