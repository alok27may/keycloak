package com.kumaral.keycloak.controller;

import com.kumaral.keycloak.model.Customer;
import com.kumaral.keycloak.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {

    @Autowired private CustomerDAO customerDAO;

    @GetMapping(path = "/")
    public String index() {
        return "Welcome Alok to Keycloak App";
    }

    @GetMapping(path = "/customers")
    public Iterable<Customer> customers(Principal principal) {
        addCustomers();
        System.out.println("User Principal : " + principal.getName());
        return customerDAO.findAll();
    }

    public void addCustomers() {

        Customer customer1 = new Customer();
        customer1.setAddress("1111 foo blvd");
        customer1.setName("Foo Industries");
        customer1.setServiceRendered("Important services");
        customerDAO.save(customer1);

        Customer customer2 = new Customer();
        customer2.setAddress("2222 bar street");
        customer2.setName("Bar LLP");
        customer2.setServiceRendered("Important services");
        customerDAO.save(customer2);

        Customer customer3 = new Customer();
        customer3.setAddress("33 main street");
        customer3.setName("Big LLC");
        customer3.setServiceRendered("Important services");
        customerDAO.save(customer3);
    }

}
