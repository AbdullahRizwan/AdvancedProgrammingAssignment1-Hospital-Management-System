/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APAssignment1;

import java.util.*;
/**
 *
 * @author eiman
 */
public abstract class MedicalStaff extends Staff{
  List<Patient>  record;

    public MedicalStaff(List<Patient> record, Date joinDate, String education, String n, Date d, char g) {
        super(joinDate, education, n, d, g);
        this.record = record;
    }
    public abstract boolean checkAvail();
  
}
