/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaSolis.restful.tiendaSolis.repository;

import com.tiendaSolis.restful.tiendaSolis.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author julio
 */
@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{
    
}
