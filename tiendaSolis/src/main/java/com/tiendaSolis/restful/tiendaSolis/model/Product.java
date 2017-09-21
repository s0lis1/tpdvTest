/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaSolis.restful.tiendaSolis.model;

import java.math.BigInteger;

/**
 *
 * @author julio
 */


public class Product {
    
    private BigInteger id;
    private String description;

    public Product(BigInteger id, String description) {
        this.id = id;
        this.description = description;
    }

    public Product() {
    }

    /**
     * @return the id
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(BigInteger id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
