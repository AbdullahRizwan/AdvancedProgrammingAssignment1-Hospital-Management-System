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
public class Nurses extends MedicalStaff{

    boolean avail;
    public Nurses(List<Patient> record, Date joinDate, String education, String n, Date d, char g) {
        super(record, joinDate, education, n, d, g);
        avail=true;
    }

    @Override
    public boolean checkAvail() {
        return avail;
    }
    
    
}
