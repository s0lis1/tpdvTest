/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaSolis.restful.tiendaSolis.web;

import com.tiendaSolis.restful.tiendaSolis.model.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.tiendaSolis.restful.tiendaSolis.service.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author julio
 */
@RestController
public class ProductController {
    
    @Autowired
    private ProductService productService;
    public static final String URL = "http://localhost:4200";
    
    @RequestMapping(
            value = "api/products",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = URL)
    public ResponseEntity<List<Product>> getProducts() {

        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }

    @RequestMapping(
            value = "api/products/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = URL)
    public ResponseEntity<Product> getProducts(@PathVariable("id") Integer id) {
        Product productsFind = productService.getProducts(id);
        if (productsFind == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(productsFind, HttpStatus.OK);
        }

    }

    @RequestMapping(
            value = "api/products/",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = URL)
    public ResponseEntity<Product> getProducts(@RequestBody Product productModify) {
        
        Product productsFind = productService.updateProducts(productModify);
        if (productsFind==null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(productsFind, HttpStatus.CREATED);
        }

    }
}
