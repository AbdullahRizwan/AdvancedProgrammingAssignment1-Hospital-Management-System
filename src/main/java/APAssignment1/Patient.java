/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APAssignment1;

import java.util.Date;

/**
 *
 * @author eiman
 */
public class Patient extends Person {
    private int patId;
    private boolean visit;

    public Patient(int patId, boolean visit, String n, Date d, char g) {
        super(n, d, g);
        this.patId = patId;
        this.visit = visit;
    }

    public int getPatId() {
        return patId;
    }
  
    public boolean getVisit(){
        return visit;
    }
     public void setVisit(boolean v){
         visit=v;
     }
}
