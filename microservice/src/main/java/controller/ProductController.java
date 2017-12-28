package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Product;
import repository.ProductRepositroy;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductRepositroy productRepositroy;

	@GetMapping("/get/{pid}")
	public Product getproduct(@PathVariable Integer pid) {
		return productRepositroy.findOne(pid);
	}

	@GetMapping("/retrieve")
	public List<Product> getAllproduct() {
		return productRepositroy.findAll();
	}

}
