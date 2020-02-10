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
public abstract class Person {
   private String name;
   private Date birthdate;
   private char gender;
    
    Person(String n, Date d, char g){
        name=n;
        birthdate=d;
        gender=g;
        
    }
    
}
