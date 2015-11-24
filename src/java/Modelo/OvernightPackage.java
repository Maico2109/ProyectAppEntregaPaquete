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
public class OvernightPackage extends Package {
    
    private double additionalCharge;

    public OvernightPackage(double additionalcharge) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the additionalCharge
     */
    public double getAdditionalCharge() {
        return additionalCharge;
    }

    /**
     * @param additionalCharge the additionalCharge to set
     */
    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OvernightPackage() {
        this.additionalCharge = 0.0;
    }

    public OvernightPackage(double additionalCharge, String code, int sender, int recipients, double weigth, double cost) {
        super(code, sender, recipients, weigth, cost);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public String toString() {
        return "OvernightPackage{" + "additionalCharge=" + additionalCharge + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.additionalCharge) ^ (Double.doubleToLongBits(this.additionalCharge) >>> 32));
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
        final OvernightPackage other = (OvernightPackage) obj;
        if (Double.doubleToLongBits(this.additionalCharge) != Double.doubleToLongBits(other.additionalCharge)) {
            return false;
        }
        return true;
    }
    
    
    
}
