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
public abstract class Staff extends Person{
    private Date joinDate;
    private String education;

    public Staff(Date joinDate, String education, String n, Date d, char g) {
        super(n, d, g);
        this.joinDate = joinDate;
        this.education = education;
    }
    
    
    
}
