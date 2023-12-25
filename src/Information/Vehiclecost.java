/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Information;

/**
 *
 * @author Tamim
 */
public class Vehiclecost {
    private String UserName;
     private String DriverName;
      private String cartype;
       private String CostPerMeter;
       private String status;

    public Vehiclecost(String UserName, String DriverName, String cartype, String CostPerMeter, String status) {
        this.UserName = UserName;
        this.DriverName = DriverName;
        this.cartype = cartype;
        this.CostPerMeter = CostPerMeter;
        this.status = status;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String DriverName) {
        this.DriverName = DriverName;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getCostPerMeter() {
        return CostPerMeter;
    }

    public void setCostPerMeter(String CostPerMeter) {
        this.CostPerMeter = CostPerMeter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Vehiclecost{" + "UserName=" + UserName + ", DriverName=" + DriverName + ", cartype=" + cartype + ", CostPerMeter=" + CostPerMeter + ", status=" + status + '}';
    }

  
        
    
}
