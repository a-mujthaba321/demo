/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.demo.model.projection.processor;

import com.boot.demo.model.Employee;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ali Mujthaba
 */
 
//@Component
//@RequiredArgsConstructor
//public class EmployeeProjectionProcessor implements ResourceProcessor<Resource<Employee>>{
//    
//    private final @NonNull EntityLinks entityLinks;
//
//    @Override
//    public Resource<Employee> process(Resource<Employee> resource) {
//        
//        Employee employee = resource.getContent();
//        
//        resource.add(entityLinks.linkForSingleResource(employee).slash("something").withRel("something"));
//        
//        return resource;
//        
//    }
//    
//}
