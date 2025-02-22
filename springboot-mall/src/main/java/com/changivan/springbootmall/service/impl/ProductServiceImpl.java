package com.changivan.springbootmall.service.impl;

import com.changivan.springbootmall.dao.ProductDao;
import com.changivan.springbootmall.dto.ProductRequest;
import com.changivan.springbootmall.model.Product;
import com.changivan.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
