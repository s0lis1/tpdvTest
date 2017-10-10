/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaSolis.restful.tiendaSolis.service;

import com.tiendaSolis.restful.tiendaSolis.model.Employee;
import com.tiendaSolis.restful.tiendaSolis.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author julio
 */
@Service
public class EmployeeServiceBean implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
     
    @Override
    public List<Employee> getEmployees() {
        List<Employee> employee = employeeRepository.findAll();
        return employee;
    }

    @Override
    public Employee getEmployee(Integer id) {
        Employee employee = employeeRepository.findOne(id);
        //List<Product> productsFind = products.stream().filter(p -> p.getId().compareTo(id) == 0).collect(Collectors.toList());
        return employee;
    }

    @Override
    public Employee updateEmployees(Employee employeeModify) {
                Employee employee = employeeRepository.findOne(employeeModify.getId());
        //Product productsFind = products.stream().filter(p -> p.equals(productModify)).collect(Collectors.toList());
        if (employee == null) {
            return null;
        } else {
            employee.setId(employeeModify.getId());
            employee.setName(employeeModify.getName());
            Employee updateProduct = employeeRepository.save(employee);
            return updateProduct;
        }
    }
    @Override
    public Employee saveEmployees() {
            Employee employee = new Employee();
            employee.setName("Surimy");
            Employee updateProduct = employeeRepository.save(employee);
            return updateProduct;
    }
    
}
