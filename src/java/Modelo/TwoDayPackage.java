/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Maico
 */
public class TwoDayPackage {
    
    private double fixedFee;

    /**
     * @return the fixedFee
     */
    public double getFixedFee() {
        return fixedFee;
    }

    /**
     * @param fixedFee the fixedFee to set
     */
    public void setFixedFee(double fixedFee) {
        this.fixedFee = fixedFee;
    }

    public TwoDayPackage() 
    {
        this.fixedFee = 0.0;
    }

    public TwoDayPackage(double fixedFee) {
        this.fixedFee = fixedFee;
    }
   

    @Override
    public String toString() {
        return "TwoDayPackage{" + "fixedFee=" + getFixedFee() + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.fixedFee) ^ (Double.doubleToLongBits(this.fixedFee) >>> 32));
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
        final TwoDayPackage other = (TwoDayPackage) obj;
        if (Double.doubleToLongBits(this.fixedFee) != Double.doubleToLongBits(other.fixedFee)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
