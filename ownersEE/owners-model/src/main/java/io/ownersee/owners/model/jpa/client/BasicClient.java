/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.ownersee.owners.model.jpa.client;

import io.ownersee.owners.model.jpa.utility.JpaUtility;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author abdelmoity
 */
public class BasicClient {
     EntityManagerFactory getEmf(){
       return  JpaUtility.getEmf();
    }
     
     
     
     
     
}
