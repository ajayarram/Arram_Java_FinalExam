/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Objects;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class FootWearBrands {
     
    private int itemsSold;
    private String BrandName;

 

    public FootWearBrands(int ItemsSold, String BrandName) {
        this.itemsSold = ItemsSold;
        this.BrandName = BrandName;
    }

 

    
    public int getItemsSold() {
        return itemsSold;
    }

 

    public void setItemsSold(int ItemsSold) {
        this.itemsSold = ItemsSold;
    }

 

    public String getBrandName() {
        return BrandName;
    }

 

    public void setBrandName(String oilName) {
        this.BrandName = oilName;
    }

 

    @Override
    public String toString() {
        return "footWearBrand{" + "itemssold:- " + itemsSold + ", BrandName:- " + BrandName + '}';
    }

 

    /*
    *  For every object created in this class it returns hashcode.
    */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.BrandName);
        return hash;
    }
    
    /*
    * Takes object as parameter which is used for comparing this class objects
    * if two objects have same values for metioned attributes  then hash code is equal.
    */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FootWearBrands other = (FootWearBrands) obj;
        if (!Objects.equals(this.BrandName, other.BrandName)) {
            return false;
        }
        return true;
    }
    
    


}
 

