package com.changivan.springbootmall.service;

import com.changivan.springbootmall.dto.ProductRequest;
import com.changivan.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
