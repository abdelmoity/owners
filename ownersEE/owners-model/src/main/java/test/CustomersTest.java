/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import io.ownersee.owners.model.dto.CustomersDto;
import io.ownersee.owners.model.jpa.client.CustomersClient;
import java.util.List;

/**
 *
 * @author abdelmoity
 */
public class CustomersTest {
    
    public static void main(String[]args){
        CustomersTest c=new CustomersTest();
        c.test();
    }

    private void test() {
        CustomersClient c=new CustomersClient();
        CustomersDto dto= new CustomersDto();
        dto.setName("mostafa");
        c.postCustomer(dto);
        List<CustomersDto> list= c.getAll();
        System.out.println("list.."+list);       
    }
    
}
