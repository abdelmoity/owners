/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.ownersee.owners.model.jpa.utility;

import io.ownersee.owners.model.jpa.controller.BasicJpaController;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author abdelmoity
 */
public class JpaUtility {
    
    private static EntityManagerFactory emf;
    
    public static EntityManagerFactory getEmf(){
        if(emf==null){
             emf = Persistence.createEntityManagerFactory("owners-modelPU");
        }
        return emf;
    }
    
    
}
