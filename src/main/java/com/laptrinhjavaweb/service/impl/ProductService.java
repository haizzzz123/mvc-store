package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.laptrinhjavaweb.converter.ProductConverter;

import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.entity.CategoryEntity;
import com.laptrinhjavaweb.entity.ProductsEntity;
import com.laptrinhjavaweb.repository.CategoryRepository;
import com.laptrinhjavaweb.repository.ProductRepository;
import com.laptrinhjavaweb.service.IProductService;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductConverter productConverter;

	@Override
	public List<ProductDTO> findAll(Pageable pageable) {
		List<ProductDTO> models = new ArrayList<>();
		List<ProductsEntity> entities = productRepository.findAll(pageable).getContent();
		for (ProductsEntity item: entities) {
			ProductDTO newDTO = productConverter.toDto(item);
			models.add(newDTO);
		}
		return models;
	}

	@Override
	public int getTotalItem() {
		return (int) productRepository.count();
	}

	@Override
	public ProductDTO findById(long id) {
		ProductsEntity entity = productRepository.findOne(id);
		return productConverter.toDto(entity);
	}

	@Override
	public ProductDTO save(ProductDTO dto) {
		//tìm the loai tu code trong dto yeu cau
		CategoryEntity category = categoryRepository.findOneByCode(dto.getCategoryCode());
		ProductsEntity newProduct = new ProductsEntity();
		if (dto.getId() != null) {
			//tim  product cu cua yeu cau
			ProductsEntity oldProduct = productRepository.findOne(dto.getId());
			
			oldProduct.setCategory(category);
			newProduct = productConverter.toEntity(oldProduct, dto);
		} else {
			newProduct = productConverter.toEntity(dto);
			newProduct.setCategory(category);
		}
		return productConverter.toDto(productRepository.save(newProduct));
	}

	@Override
	public void delete(long[] ids) {
		for (long id: ids) {
			productRepository.delete(id);
		}
		
	}

}
