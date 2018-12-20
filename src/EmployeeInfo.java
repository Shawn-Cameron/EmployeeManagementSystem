
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Shawn Cameron
 */
public class EmployeeInfo implements Serializable{ 
    public static final long serialVersionUID =- 2722978263608119832L;
    protected int employeeNumber;
    protected String name;
    protected String surname;
    protected int sex;
    protected int workLocation;
    
    protected float deductionRate;
    //classes FTE and PTE sets the value for variable payment
    protected float payment;
   
    
    protected EmployeeInfo(int employeeNum, String name, String surname, int sex, int workLocation, float income, float dRate){
        this.employeeNumber = employeeNum;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.workLocation = workLocation;
        this.deductionRate = dRate/100;
    }
    
    //getter and setter methods
    protected void setSurname(String newSurname){
        this.surname = newSurname;
    }
    
    protected void setSex(int newSex){
        this.sex = newSex;
    }
    
    protected void setWorkLocation(int wL){
        this.workLocation = wL;
    }
    
    protected void setDeductionRate(float dRate){
        this.deductionRate = dRate/100;
    }
    
    protected int getEmployeeNumber(){
        return employeeNumber;
    }
    
    protected String getName(){
        return name;
    }
    
    protected String getSurname(){
        return surname;
    }
   
    protected String getSex(){
        if(sex == 0){
           return"Male";
        }else if (sex == 1){
            return "Female";
        }else if (sex == 2){
            return "Other";
        }
        return "";
    }

    protected String getWorkLocation(){
        if(workLocation == 1){
            return "Toronto";    
        }else if(workLocation == 2){
            return "Mississauga";
        }else{
            return "Ottawa";
        }
    }
    
    protected float getDeductionRate(){
        return deductionRate*100;
    }
    
    protected float getPayment(){
        return payment;
    }
}      

