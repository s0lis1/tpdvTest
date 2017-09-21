/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaSolis.restful.tiendaSolis.web;

import com.tiendaSolis.restful.tiendaSolis.model.Product;
import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author julio
 */
public interface ProductService2 {
    
    List<Product> getProducts();
    
    List<Product> getProducts(BigInteger id);
    
    List<Product> updateProducts(Product productModify);
    
    
}
