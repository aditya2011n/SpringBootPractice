package com.springBoot.jsp.StudentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.jsp.entity.Category;
import com.springBoot.jsp.entity.Product;

public interface ProductRepo extends JpaRepository<Product, String>{

}
