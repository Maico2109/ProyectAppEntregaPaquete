/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maico
 */
public class Bills {

    /**
     * @return the val
     */
    public static long getVal() {
        return val;
    }

    /**
     * @param aVal the val to set
     */
    public static void setVal(long aVal) {
        val = aVal;
    }
    
    private long id;
    private long customers;    
    private static long val = 0;
    private static List<Package> items = new ArrayList<Package>();
    private long Id;

    public Bills() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Bills(long id, long customers, long val, long Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the customers
     */
    public long getCustomers() {
        return customers;
    }

    /**
     * @param customers the customers to set
     */
    public void setCustomers(long customers) {
        this.customers = customers;
    }

    public Bills(long id, long customers, long Id) {
        this.id = id;
        this.customers = customers;
        this.Id = Id;
    }

     
    
}
