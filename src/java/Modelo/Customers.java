/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author Maico
 */
public class Customers {
    
    private long id;
    private String name;
    private String address;
    private String state;
    private long box;

    public Customers(String id, String name, String address, String states, String box) {
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the box
     */
    public long getBox() {
        return box;
    }

    /**
     * @param box the box to set
     */
    public void setBox(long box) {
        this.box = box;
    }

    public Customers() {
        this.id = 12345;
        this.name = "nombre y apellido";
        this.address = "Mi direccion";
        this.state = "Mi ciudad";
        this.box = 12001;
    }
    
        public Customers(long id, String name, String address, String state, long box) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.state = state;
        this.box = box;
    }

    @Override
    public String toString() {
        return "Customers{" + "id=" + id + ", name=" + name + ", address=" + address + ", state=" + state + ", box=" + box + '}';
    }

    @Override
    public int hashCode() {
        return this.toString() .hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customers other = (Customers) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (this.box != other.box) {
            return false;
        }
        return true;
    }
        
        
    
}
