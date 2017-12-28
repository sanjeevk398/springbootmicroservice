package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 10)
	private Integer productId;
	@Column(length = 20)
	private String name;
	@Column(length = 50)
	private String description;

	public Set<Order> getOrder() {
		return order;
	}

	public void setOrder(Set<Order> order) {
		this.order = order;
	}

	@ManyToMany(mappedBy = "product")
	private Set<Order> order = new HashSet<>();

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
