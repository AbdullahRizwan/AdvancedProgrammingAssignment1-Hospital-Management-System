/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APAssignment1;

/**
 *
 * @author eiman
 */
public class OrthopedicWard extends Ward{

    @Override
    public void RecievePatient(Patient p){
         for(int i = 0; i < super.medStaff.size(); i++){
            if(medStaff.get(i) instanceof Doctor){
               if(medStaff.get(i).checkAvail()){
                   Doctor d=(Doctor) medStaff.get(i);
                   d.record.add(p);
                   p.setVisit(false);         
                   System.out.println(p.getName()+" with "+ p.getPatId() + " allowed");
               }
            }
        }
        
    }
    
    
}
