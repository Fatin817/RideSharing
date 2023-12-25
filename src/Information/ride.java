/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Information;

import java.io.Serializable;
import javafx.collections.ObservableList;

/**
 *
 * @author Tamim
 */
public class ride  {

  
  private String startt;
     private String drop;
      private String carr;

    public ride(String startt, String drop, String carr) {
        this.startt = startt;
        this.drop = drop;
        this.carr = carr;
    }

    public String getStartt() {
        return startt;
    }

    public void setStartt(String startt) {
        this.startt = startt;
    }

    public String getDrop() {
        return drop;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }

    public String getCarr() {
        return carr;
    }

    public void setCarr(String carr) {
        this.carr = carr;
    }

    @Override
    public String toString() {
        return "ride{" + "startt=" + startt + ", drop=" + drop + ", carr=" + carr + '}';
    }
      

   
      
}
