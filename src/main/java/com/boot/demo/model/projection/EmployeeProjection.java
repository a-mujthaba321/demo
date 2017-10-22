/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.demo.model.projection;

import com.boot.demo.model.Employee;
import org.springframework.data.rest.core.config.Projection;

/**
 *
 * @author Ali Mujthaba
 */
@Projection(name = "emp",types = Employee.class)
public interface EmployeeProjection {
    
    public String getEmployeeNumber();
    
}
