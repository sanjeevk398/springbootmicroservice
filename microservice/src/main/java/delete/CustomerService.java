package delete;

import java.util.List;

import entity.Customer;

public interface CustomerService {

	public void save(Customer customer);

	public Customer retrieve(int id);

	public String update(Customer customer);

	public void delete(int id);

	public List<Customer> retrieveAll();

}
