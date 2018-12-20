/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shawn Cameron
 */
public class PTE extends EmployeeInfo {
    private float hoursPerWeek;
    private int weeksPerYear;
    private float incomePerHour;
    
    public PTE(int employeeNumber, String name, String surname, int sex, int workLocation, float income, float hours, int weeks, float dRate){
        super(employeeNumber, name, surname,sex,workLocation,income,dRate);
        this.hoursPerWeek = hours;
        this.weeksPerYear = weeks;
        this.incomePerHour = income;
        calIncome();
   
    }
    //calculates the pay with the deduction rate
    private void calIncome(){
        this.payment = incomePerHour*hoursPerWeek*weeksPerYear*(1 - deductionRate);
    } 
    
    //getter and setter methods
    public void setHoursPerWeek(int newHours){
        this.hoursPerWeek = newHours;
        calIncome();
    }
    
    public void setWeeksPerYear(int newWeeks){
        this.weeksPerYear = newWeeks;
        calIncome();
    }
    
    public void setIncomePerHour(float newIncome){
        this.incomePerHour = newIncome;
        calIncome();
    }
    
    public float getHoursPerWeek(){
        return hoursPerWeek;
    }
    
    public int getWeeksPerYear(){
        return weeksPerYear;
    }
    
    public float getIncomePerHour(){
        return incomePerHour;
    }  
}

