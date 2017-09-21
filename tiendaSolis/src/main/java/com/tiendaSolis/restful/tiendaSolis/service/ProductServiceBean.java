/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaSolis.restful.tiendaSolis.service;

import com.tiendaSolis.restful.tiendaSolis.model.Product;
import com.tiendaSolis.restful.tiendaSolis.repository.ProductRepository;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author julio
 */
@Service
public class ProductServiceBean implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    @Override
    public Product getProducts(BigInteger id) {
        Product products = productRepository.findOne(id);
        //List<Product> productsFind = products.stream().filter(p -> p.getId().compareTo(id) == 0).collect(Collectors.toList());
        return products;
    }

    @Override
    public Product updateProducts(Product productModify) {
        Product product = productRepository.findOne(productModify.getId());
        //Product productsFind = products.stream().filter(p -> p.equals(productModify)).collect(Collectors.toList());
        if (product == null) {
            return null;
        } else {
            Product updateProduct = productRepository.save(product);
            return updateProduct;
        }
    }
    
}
