/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaSolis.restful.tiendaSolis.web;

import com.tiendaSolis.restful.tiendaSolis.model.Product;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 *
 * @author julio
 */
@Service
public class ProductServiceBean implements ProductService{

    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        Product product = new Product();
        product.setId(BigInteger.ONE);
        product.setDescription("television");
        products.add(product);
        return products;
    }

    @Override
    public List<Product> getProducts(BigInteger id) {
        List<Product> products = new ArrayList<>();
        Product product = new Product();
        product.setId(BigInteger.ONE);
        product.setDescription("television");
        products.add(product);
        List<Product> productsFind = products.stream().filter(p -> p.getId().compareTo(id) == 0).collect(Collectors.toList());
        if (productsFind.isEmpty()) {
            return new ArrayList<>();
        } else {
            return productsFind;
        }
    }

    @Override
    public List<Product> updateProducts(Product productModify) {
        List<Product> products = new ArrayList<>();
        Product product = new Product();
        product.setId(BigInteger.ONE);
        product.setDescription("television");
        products.add(product);
        List<Product> productsFind = products.stream().filter(p -> p.equals(productModify)).collect(Collectors.toList());
        if (productsFind.isEmpty()) {
            return new ArrayList<>();
        } else {
            productsFind.get(0).setDescription("casa");
            return productsFind;
        }
    }
    
}
