/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaSolis.restful.tiendaSolis.service;

import com.tiendaSolis.restful.tiendaSolis.model.Employee;
import java.util.List;

/**
 *
 * @author julio
 */
public interface EmployeeService {
        
    List<Employee> getEmployees();
    
    Employee getEmployee(Integer id);
    
    Employee updateEmployees(Employee employeeModify);
    
    Employee saveEmployees();
}
