package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
//import javax.validation.constraints.Size;

@Table(name = "CUSTOMER")
@Entity
@XmlRootElement
public class Customer implements Serializable, Comparable<Customer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	// @Size(max = 5)
	private Long ID;
	@Column
	@NotNull
	private String name;
	@Column
	@NotNull
	// @Size(max = 3)
	private Integer age;
	@Column
	@NotNull
	private String address;

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(Customer o) {
		return 0;
	}

	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
