/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaSolis.restful.tiendaSolis.service;

import com.tiendaSolis.restful.tiendaSolis.model.Product;
import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author julio
 */
public interface ProductService {
    
    List<Product> getProducts();
    
    Product getProducts(Integer id);
    
    Product updateProducts(Product productModify);
    
    
}
