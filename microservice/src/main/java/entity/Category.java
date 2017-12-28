package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Category {
	@Id
	@Column(length = 3)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer categoryId;
	@Column(length = 20)
	private String categpryName;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategpryName() {
		return categpryName;
	}

	public void setCategpryName(String categpryName) {
		this.categpryName = categpryName;
	}

}
