package com.springBoot.jsp.StudentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.jsp.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, String>{

}
