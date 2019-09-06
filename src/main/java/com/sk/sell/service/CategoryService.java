package com.sk.sell.service;

import com.sk.sell.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {
   ProductCategory findOne(Integer categoryId);

   List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryId);

    ProductCategory save(ProductCategory productCategory);
}
