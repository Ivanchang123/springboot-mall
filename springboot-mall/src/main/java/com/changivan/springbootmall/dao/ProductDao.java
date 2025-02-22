package com.changivan.springbootmall.dao;

import com.changivan.springbootmall.dto.ProductRequest;
import com.changivan.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer id);

    Integer createProduct(ProductRequest productRequest);
}
