package com.sk.sell.service.impl;

import com.sk.sell.dataobject.ProductCategory;
import com.sk.sell.repository.ProductCategoryRepository;
import com.sk.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        Optional<ProductCategory> byId = repository.findById(categoryId);
        return byId.get();
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryId) {
        return repository.findByCategoryTypeIn(categoryId);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
