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
public class Hospital {
    List<Patient> allPatients;
    List<Person> allVisited;
    List<Staff> allStaff;
    List<Ward> allWards;
    
    public Hospital(){
        OrthopedicWard oward= new OrthopedicWard();
        ChildrensWard cward= new ChildrensWard();
        SurgicalWard sward = new SurgicalWard();
        allWards.add(sward);
        allWards.add(oward);
        allWards.add(cward);
    }
    
   public void visitDoctor(){
       int id;
       Patient patient=null;
       Scanner scan=new Scanner(System.in);
       int op;
       System.out.println("Are you an old patient or a new one:\nPress '1' for old and '2' for new:\t");
       op = (int) scan.nextInt();
       if(op == 2){
          // int patId, boolean visit, String n, Date d, char g
          System.out.println("please enter your name:\t");
          String name= scan.nextLine();
          System.out.println("Enter Gender\nPlease 1 for Male and 2 for female:\t");
          int g= scan.nextInt();
          char gender;
          if( g==1)
              gender = 'M';
          else
              gender = 'F';
          
          patient= new Patient(allPatients.size(),false,name,new Date(),gender);
          allPatients.add(patient);
          id=patient.getPatId();
       }
       else{
          System.out.println("please enter your name:\t");
          id= scan.nextInt();          
          for(int i=0; i< this.allPatients.size(); i++){
                if(id == this.allPatients.get(i).getPatId()){
                     patient = this.allPatients.get(i);
                     break;
                }
          }
       }
       if(patient.getVisit()){
           System.out.println(patient.getName()+" with "+patient.getPatId()+" already visited today");
           return;
       }
       
       System.out.println("\nWhich ward would you like to visit?\n1-Children's Ward\n2-Oethopedic Ward\n3-"
               + "Surgical Ward\n: ");
       
       int option= scan.nextInt();
       this.allWards.get(option-1).RecievePatient(patient);
       
       
       
   }
    
    
}
