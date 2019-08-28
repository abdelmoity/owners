/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.ownersee.owners.model.mapper;

import org.modelmapper.ModelMapper;

/**
 *
 * @author abdelmoity
 */
public class BasicModelMapper {
    
  public static Object convertTo(Object from ,Object to){
        ModelMapper mapper=new ModelMapper();
       Object destination= mapper.map(from, to.getClass());
       return destination;
    }
    
}
