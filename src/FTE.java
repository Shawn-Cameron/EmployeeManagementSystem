/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shawn Cameron
 */
public class FTE extends EmployeeInfo {
    private float salary;
    
    //EmployeeInfo(int employeeNum, String name, String surname, String sex, int workLocation, double income, int hours, int weeks)
    public FTE(int employeeNumber, String name, String surname, int sex, int workLocation, float income, float dRate){
        super(employeeNumber, name, surname,sex,workLocation,income,dRate);
        calAnnual(income);
        this.salary = income;
    }
    // calculates the pay with the deduction rate
    private void calAnnual(float income){
        this.payment = income*(1 - deductionRate);
    }
    
    //getter and setter method for salary
    public void setSalary(float sal){
        this.salary = sal;
    }
    
    public float getSalary(){
        return salary;
    }
    
}
