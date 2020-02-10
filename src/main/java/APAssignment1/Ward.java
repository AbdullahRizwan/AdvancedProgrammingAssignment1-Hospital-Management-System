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
public abstract class Ward {
    List<TechnicalStaff> techStaff;
    List<MedicalStaff> medStaff;
    
    public abstract void RecievePatient(Patient p);
 
    
    
}
