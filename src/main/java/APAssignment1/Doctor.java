/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APAssignment1;

import java.util.Date;
import java.util.List;

/**
 *
 * @author eiman
 */
public class Doctor extends MedicalStaff{
    private int docID;
    private String speciality;
    boolean avail;

    public Doctor(int docID, String speciality, List<Patient> record, Date joinDate, String education, String n, Date d, char g) {
        super(record, joinDate, education, n, d, g);
        this.docID = docID;
        this.avail=true;
        this.speciality = speciality;
    }

 
  

    public void setAvail(boolean avail) {
        this.avail = avail;
    }

    @Override
    public boolean checkAvail() {
        return avail;
    }
}