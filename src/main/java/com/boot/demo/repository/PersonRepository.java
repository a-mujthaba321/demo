/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.demo.repository;

import com.boot.demo.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Ali Mujthaba
 */
@RepositoryRestResource(collectionResourceRel = "persons", path = "persons", itemResourceRel = "persons")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>{
    
}
