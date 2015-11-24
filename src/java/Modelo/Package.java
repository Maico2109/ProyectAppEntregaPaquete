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
public class Package {
    
    private String code;
    private int sender;
    private int recipients;
    private double weigth;
    private double cost;
    
      
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the sender
     */
    public int getSender() {
        return sender;
    }

    /**
     * @param sender the sender to set
     */
    public void setSender(int sender) {
        this.sender = sender;
    }

    /**
     * @return the recipients
     */
    public int getRecipients() {
        return recipients;
    }

    /**
     * @param recipients the recipients to set
     */
    public void setRecipients(int recipients) {
        this.recipients = recipients;
    }

    /**
     * @return the weigth
     */
    public double getWeigth() {
        return weigth;
    }

    /**
     * @param weigth the weigth to set
     */
    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    public Package() {
        this.code = "xxx";
        this.sender = 213;
        this.recipients = 4;
        this.weigth = 0.0;
        this.cost = 0.0;
    }
    
    
    public Package(String code, int sender, int recipients, double weigth, double cost) {
        this.code = code;
        this.sender = sender;
        this.recipients = recipients;
        this.weigth = weigth;
        this.cost = cost;
    }
    
    @Override
    public String toString() {
        return "Package{" + "code=" + getCode() + ", sender=" + getSender() + ", recipients=" + getRecipients() + ", weigth=" + getWeigth() + ", cost=" + getCost() + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.getCode());
        hash = 59 * hash + this.getSender();
        hash = 59 * hash + this.getRecipients();
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.getWeigth()) ^ (Double.doubleToLongBits(this.getWeigth()) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.getCost()) ^ (Double.doubleToLongBits(this.getCost()) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Package other = (Package) obj;
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        if (this.getSender() != other.getSender()) {
            return false;
        }
        if (this.getRecipients() != other.getRecipients()) {
            return false;
        }
        if (Double.doubleToLongBits(this.getWeigth()) != Double.doubleToLongBits(other.getWeigth())) {
            return false;
        }
        if (Double.doubleToLongBits(this.getCost()) != Double.doubleToLongBits(other.getCost())) {
            return false;
        }
        return true;
    }

    
    
}
