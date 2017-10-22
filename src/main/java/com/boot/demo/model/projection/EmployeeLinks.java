/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.demo.model.projection;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.EntityLinks;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ali Mujthaba
 */
@Component
@RequiredArgsConstructor
public class EmployeeLinks {
    
    private final @NonNull EntityLinks entityLinks;
    
    
    
}
