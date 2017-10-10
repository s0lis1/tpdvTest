/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaSolis.restful.tiendaSolis.web;

import com.tiendaSolis.restful.tiendaSolis.model.Employee;
import com.tiendaSolis.restful.tiendaSolis.model.Product;
import com.tiendaSolis.restful.tiendaSolis.service.EmployeeService;
import com.tiendaSolis.restful.tiendaSolis.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author julio
 */
@RestController
public class EmployeeController {
        
    @Autowired
    private EmployeeService employeeService;
    public static final String URL = "http://localhost:4200";
    
    @RequestMapping(
            value = "api/employees",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = URL)
    public ResponseEntity<List<Employee>> getProducts() {

        return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);
    }

    @RequestMapping(
            value = "api/employee/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = URL)
    public ResponseEntity<Employee> getProducts(@PathVariable("id") Integer id) {
        Employee employeeFind = employeeService.getEmployee(id);
        if (employeeFind == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(employeeFind, HttpStatus.OK);
        }

    }

    @RequestMapping(
            value = "api/employee/",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = URL)
    public ResponseEntity<Employee> getProducts(@RequestBody Employee employeeModify) {
        
        Employee employeeFind = employeeService.updateEmployees(employeeModify);
        if (employeeFind==null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(employeeFind, HttpStatus.CREATED);
        }

    }
      @RequestMapping(
            value = "api/employeesSave",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = URL)
    public ResponseEntity<Employee> saveEmployees() {

        return new ResponseEntity<>(employeeService.saveEmployees(), HttpStatus.OK);
    }
}
    



