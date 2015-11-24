/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Bills;
import Modelo.Customers;
import Modelo.OvernightPackage;
import Modelo.TwoDayPackage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Maico
 */
public class BillsRepositories {
    
    private static List<Bills> data = new ArrayList<Bills>();
       
    public void AddBills(Bills b)
    
    {
        data.add(b);
    }
    
    public Iterable<Bills> getBillsItems (){
        
        return data;
    }

    public void AddBills(Customers cta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void AddBills(TwoDayPackage b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void AddBills(OvernightPackage b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


