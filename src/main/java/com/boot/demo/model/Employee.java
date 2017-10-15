/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.demo.model;

import javax.persistence.Entity;
import lombok.Data;

/**
 *
 * @author Ali Mujthaba
 */
@Data
@Entity
public class Employee extends Person {

    private String employeeNumber;

}
