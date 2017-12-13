package com.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "CUSTOMER")
@Entity
public class Customer implements Serializable {

	/**
	 * @author sanjeev
	 */
	private static final long serialVersionUID = -9055529249190508208L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empID;
	@Column(name = "EMP_NAME")
	private String empName;
	@Column(name = "AGE")
	private Integer age;
	@Column(name = "SALARY")
	private int salary;
	@Column(name = "DEPARTMENT")
	private String department;

	public Customer() {
	}

	public Customer(String empName, Integer age, int salary, String department) {
		super();
		this.empName = empName;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getEmpID() {
		return empID;
	}

	public void setEmpID(Integer empID) {
		this.empID = empID;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", age=" + age + ", salary=" + salary
				+ ", department=" + department + "]";
	}

}
