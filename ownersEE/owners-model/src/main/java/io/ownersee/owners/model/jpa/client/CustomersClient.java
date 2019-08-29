/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.ownersee.owners.model.jpa.client;

import io.ownersee.owners.model.dto.CustomersDto;
import io.ownersee.owners.model.jpa.controller.CustomersJpaController;
import io.ownersee.owners.model.jpa.entities.Customers;
import io.ownersee.owners.model.mapper.BasicModelMapper;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.modelmapper.ModelMapper;

/**
 *
 * @author abdelmoity
 */
public class CustomersClient extends BasicClient {

    private CustomersJpaController getJpaController() {
        return new CustomersJpaController(getEmf());
    }

    public void postCustomer(CustomersDto dto) {
        try {
            //Customers entity= (Customers) BasicModelMapper.convertTo(dto, Customers.class);
            ModelMapper mapper = new ModelMapper();
            Customers entity = mapper.map(dto, Customers.class);
            getJpaController().create(entity);
        } catch (Exception ex) {
            Logger.getLogger(CustomersClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<CustomersDto> getAll() {
        try {
            ModelMapper mapper = new ModelMapper();
            List<Customers> entityList = getJpaController().findCustomersEntities();
            List<CustomersDto> customersDtoList = new ArrayList();
            entityList.forEach(customer -> {
                customersDtoList.add(mapper.map(customer, CustomersDto.class));
            });

            return customersDtoList;

        } catch (Exception ex) {
            Logger.getLogger(CustomersClient.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
