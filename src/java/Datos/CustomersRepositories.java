/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


import Modelo.Customers;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SIM-12
 */
public class CustomersRepositories {
    
    private static List<Customers> data = new ArrayList<Customers>();
    
    public void addCustomers(Customers p){
      data.add(p);
    }
    public Iterable<Customers> getBills(){
        return data;
    }
    
}
