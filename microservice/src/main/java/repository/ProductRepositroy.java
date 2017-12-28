package repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Product;

public interface ProductRepositroy extends JpaRepository<Product, Serializable> {

}
