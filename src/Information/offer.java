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
public class offer {
     private String codee;
     private String valuee;
      private String exdatee;
      private String usee;

    public offer(String codee, String valuee, String exdatee, String usee) {
        this.codee = codee;
        this.valuee = valuee;
        this.exdatee = exdatee;
        this.usee = usee;
    }

    public String getCodee() {
        return codee;
    }

    public void setCodee(String codee) {
        this.codee = codee;
    }

    public String getValuee() {
        return valuee;
    }

    public void setValuee(String valuee) {
        this.valuee = valuee;
    }

    public String getExdatee() {
        return exdatee;
    }

    public void setExdatee(String exdatee) {
        this.exdatee = exdatee;
    }

    public String getUsee() {
        return usee;
    }

    public void setUsee(String usee) {
        this.usee = usee;
    }

    @Override
    public String toString() {
        return "offer{" + "codee=" + codee + ", valuee=" + valuee + ", exdatee=" + exdatee + ", usee=" + usee + '}';
    }
      
}
