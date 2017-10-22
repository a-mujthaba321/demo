/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.demo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.hateoas.Identifiable;

/**
 *
 * @author Ali Mujthaba
 */
@Data
@MappedSuperclass
public abstract class Person implements Serializable, Identifiable<Long> {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

}
