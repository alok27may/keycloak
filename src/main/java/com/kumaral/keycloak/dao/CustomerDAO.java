package com.kumaral.keycloak.dao;


import com.kumaral.keycloak.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
