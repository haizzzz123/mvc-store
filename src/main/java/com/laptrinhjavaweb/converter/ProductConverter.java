package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.entity.ProductsEntity;

@Component
public class ProductConverter {

	public ProductDTO toDto(ProductsEntity entity) {
		ProductDTO result = new ProductDTO();
		result.setId(entity.getId());
		result.setProductName(entity.getProductName());
		result.setPrice(entity.getPrice());
		result.setCategoryCode(entity.getCategory().getCode());
		return result;
	}
	
	public ProductsEntity toEntity(ProductDTO dto) {
		ProductsEntity result = new ProductsEntity();
		result.setProductName(dto.getProductName());
		result.setPrice(dto.getPrice());
		return result;
	}
	
	public ProductsEntity toEntity(ProductsEntity result, ProductDTO dto) {
		result.setProductName(dto.getProductName());
		result.setPrice(dto.getPrice());
		return result;
	}
}
