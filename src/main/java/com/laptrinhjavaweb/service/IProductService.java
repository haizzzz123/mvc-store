package com.laptrinhjavaweb.service;

import java.util.List;

import org.springframework.data.domain.Pageable;


import com.laptrinhjavaweb.dto.ProductDTO;



public interface IProductService {
	List<ProductDTO> findAll(Pageable pageable);
	int getTotalItem();
	ProductDTO findById(long id);
	ProductDTO save(ProductDTO dto);
	void delete(long[] ids);
}
