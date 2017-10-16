/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author Ali Mujthaba
 */
@Data
@Entity
public abstract class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

}
