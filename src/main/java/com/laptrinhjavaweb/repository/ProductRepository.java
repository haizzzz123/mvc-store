package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.ProductsEntity;

public interface ProductRepository extends JpaRepository<ProductsEntity, Long>{

}
