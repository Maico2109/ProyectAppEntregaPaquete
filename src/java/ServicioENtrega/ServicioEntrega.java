/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioENtrega;

import Datos.BillsRepositories;
import Datos.CustomersRepositories;
import Modelo.Bills;
import Modelo.Customers;
import Modelo.OvernightPackage;
import Modelo.TwoDayPackage;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author SIM-12
 */

        
@WebService(serviceName = "ServicioEntrega")
public class ServicioEntrega {

 BillsRepositories data = new BillsRepositories();


    /**
     * Web service operation
     */
    @WebMethod(operationName = "Customers")
    public String Customers(
            @WebParam(name = "id") String id, 
            @WebParam(name = "name") String name, 
            @WebParam(name = "address") String address, 
            @WebParam(name = "states") String states, 
            @WebParam(name = "box") String box, 
            @WebParam(name = "parameter1") String parameter1) {
        Customers b = new Customers (id,name,address,states,box);
        data.AddBills(b);
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Package")
    public String Package(
            @WebParam(name = "code") String code, 
            @WebParam(name = "sender") int sender, 
            @WebParam(name = "recipients")  int recipients, 
            @WebParam(name = "weigth") String weigth,
            @WebParam(name = "cost") double cost) {
        
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "OvernightPackage")
    public String OvernightPackage(@WebParam(name = "additionalcharge") double additionalcharge) {
        
        OvernightPackage b = new OvernightPackage(additionalcharge);
        data.AddBills(b);
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "TwoDayPackage")
    public String TwoDayPackage(@WebParam(name = "fixedFee") double fixedFee) {
       
        TwoDayPackage b = new TwoDayPackage(fixedFee);
        data.AddBills(b);
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Bills")
    public String Bills(@WebParam(name = "id") 
            long id, @WebParam(name = "customers") 
            long customers, @WebParam(name = "val") 
            long val, @WebParam(name = "Id") long Id) {
        
        Bills b = new Bills(id,customers,val,Id);
        data.AddBills(b);
        return null;
    }
    
     
    
}
