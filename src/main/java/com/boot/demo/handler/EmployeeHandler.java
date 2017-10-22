/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.demo.handler;

import com.boot.demo.model.Employee;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ali Mujthaba
 */
@Component
@RepositoryEventHandler
public class EmployeeHandler {
    
    @HandleBeforeCreate
    public void handleBeforeCreate(Employee employee)
    {
        employee.setEmployeeNumber("Some number");
    }
    
}
