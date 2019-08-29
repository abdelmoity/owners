/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.ownersee.owners.web.beans;


import io.ownersee.owners.model.dto.CustomersDto;
import io.ownersee.owners.model.jpa.client.CustomersClient;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author abdelmoity
 */
@ManagedBean(name = "customersBean")
@SessionScoped
public class Customers implements Serializable {
    private String name="Ali";
    private List<CustomersDto> customersList;

    public List<CustomersDto> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(List<CustomersDto> customersList) {
        this.customersList = customersList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Creates a new instance of Customers
     */
    public Customers() {
        
    }
    
    @PostConstruct
    public void init(){
        CustomersClient c =new CustomersClient();
        this.customersList=c.getAll();
    }
    
}
