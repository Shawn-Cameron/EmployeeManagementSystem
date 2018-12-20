import java.util.ArrayList;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 *
 * @author Shawn Cameron
 */
public class TheHashTable{
    /**
     * Variable Declaration 
     */
    private ArrayList<EmployeeInfo>[] buckets;
    private String theFile = ".employeeInfo.ser";
    private boolean wasSaved = true;

    
    
    /**
     * Creates the table 
     * @param numOfBuckets - number of buckets that should be used 
     */
    public TheHashTable(int numOfBuckets) {
        //getLastDirector();
        buckets = new ArrayList[numOfBuckets];
        for (int i = 0; i < numOfBuckets; i++) {
            buckets[i] = new ArrayList<EmployeeInfo>();
        }
    }
    
    /**
     * Deletes all the Employees in the hash table
     * Then displays an empty JTable
     */
    public void deleteTable(){
        for(int i = 0; i < buckets.length; i++){
            for(int j = buckets[i].size()-1; j >= 0 ; j--){
                buckets[i].remove(j);
            }
        }
        MainMenu.displayEmployees();
    }
    
    /**
     * Determines the bucket the employee should go / is in by 
     * getting the return value when their number is divided by 
     * the number of buckets
     * 
     * @param eNumber - the employee's number
     * @return the bucket the employee is located in
     */
    private int calcBucket(int eNumber) {
        return eNumber % buckets.length;
    }
    
    /**
     * Finds the index location of the employee
     * @param eNumber - the employee's number
     * @return - the index in the bucket the employee is located in
     */
    private int findByEmployeeNumber(int eNumber) {
        int location = calcBucket(eNumber);
        for (int i = 0; i < buckets[location].size(); i++) {
            if (eNumber == buckets[location].get(i).getEmployeeNumber()) {
                return i;
            } else if (i + 1 == buckets[location].size() && eNumber != buckets[location].get(i).getEmployeeNumber()) {
                return -1;
            }
        }
        return 0;
    }
    
    /**
     * Adds the Employee's information to the table
     * throws an exception if the given employee number already exists
     * @param newEmployee
     * @throws UnsupportedOperationException 
     */
    public void addToTable(EmployeeInfo newEmployee) throws UnsupportedOperationException{
        int placement = calcBucket(newEmployee.getEmployeeNumber());
        for(int j = 0;j < buckets[placement].size();j++){
            if(buckets[placement].get(j).getEmployeeNumber() == newEmployee.getEmployeeNumber()){
                throw new UnsupportedOperationException();
            }
        }
        buckets[placement].add(newEmployee);         
    }

    /**
     * Collects the Employee's information 
     * based on their Employee number
     * @param eNumber
     * @return the Employee with that given number
     */
    public EmployeeInfo getEmployee(int eNumber) {
        try{
            int bucketLocation = calcBucket(eNumber);
            int arrayLocation = findByEmployeeNumber(eNumber);
            return buckets[bucketLocation].get(arrayLocation);
        }catch(IndexOutOfBoundsException a){
            return null;
        }
    }

    /**
     * Finds the employee by their number 
     * and removes them from the system
     * @param eNumber - the employee's number
     */
    public void removeEmployee(int eNumber) {
        int bucketLocation = calcBucket(eNumber);
        int arrayLocation = findByEmployeeNumber(eNumber);
        buckets[bucketLocation].remove(arrayLocation);
     
    }
       
    /**
     * Automatically sorts the Employees by their Number in ascended order
     * and returns them in a list
     * @returns ArrayList<EmployeeInfo> in ascending order
     */
    public ArrayList<EmployeeInfo> sortByENum(){
        ArrayList<EmployeeInfo> numAccOrder = new ArrayList<EmployeeInfo>();
        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                numAccOrder.add(buckets[i].get(j));
            }
        }
        EmployeeInfo temp;
        for(int i = 0; i < numAccOrder.size(); i++){
            for(int j=0 ; j< numAccOrder.size()-i-1;j++){
               if (numAccOrder.get(j).getEmployeeNumber() > numAccOrder.get(j+1).getEmployeeNumber()){
                   temp = numAccOrder.get(j);
                    numAccOrder.set(j,numAccOrder.get(j+1));
                   numAccOrder.set(j+1,temp);
               }
            }
        }
        return numAccOrder;
    }
    
    /**
     * Collects the string and returns the employees who's employee number,
     * first name or last name starts with string collected
     * @param searching - the name or number being searched for
     * @return ArrayList<EmployeeInfo> with the employees that had the information 
     */
    public ArrayList<EmployeeInfo> searched(String searching){
        searching = searching.replaceAll("\\s+","").toLowerCase();
        ArrayList<EmployeeInfo> theList = new ArrayList<EmployeeInfo>();
        for (int i = 0; i < buckets.length; i++){
            for(int j = 0; j< buckets[i].size();j++){
                
                String eNum = Integer.toString(buckets[i].get(j).getEmployeeNumber());
                String fN = buckets[i].get(j).getName().replaceAll("\\s+","").toLowerCase();
                String lN = buckets[i].get(j).getSurname().replaceAll("\\s+","").toLowerCase();
                String firstAndLastN = fN.concat(lN);
                
                int indexFN = fN.indexOf(searching);
                int indexLN = lN.indexOf(searching);
                int indexEN = eNum.indexOf(searching);
                int indexFullName = firstAndLastN.indexOf(searching);
                
                if(indexEN == 0 || indexFN == 0 || indexLN == 0 || indexFullName == 0){
                    theList.add(buckets[i].get(j));
                }
            }   
        }
        return theList;
    }
    
    /**
     * Creates an ArrayList with all the employees and saves them to a file
     */
    public void saveEmployeeInfo(){
        ArrayList<EmployeeInfo> saving = new ArrayList<EmployeeInfo>();
        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                saving.add(buckets[i].get(j));
            }
        } 
        try{
            Path theFilePath =  Paths.get(theFile);
            File checkIfExist = new File(theFile);
            if(checkIfExist.exists()){
                Files.setAttribute(theFilePath, "dos:hidden", false);
            }
            
            FileOutputStream file = new FileOutputStream(theFile);
            ObjectOutputStream out= new ObjectOutputStream(file);
            out.writeObject(saving);
            out.close();
            file.close();
            
            Files.setAttribute(theFilePath, "dos:hidden", true);
            
        }catch(IOException e){
            e.printStackTrace();
        }
        this.wasSaved = true;
        
    }

    /**
     * Loads the employee information from any file
     */    
    public void loadEmployeeInfo(){
        ArrayList<EmployeeInfo> loading = new ArrayList<EmployeeInfo>();
        try{
            FileInputStream file = new FileInputStream(theFile);
            ObjectInputStream objectsOut = new ObjectInputStream(file);
            loading = (ArrayList<EmployeeInfo>) objectsOut.readObject();
            file.close();
            objectsOut.close();
            for(int i = 0; i < loading.size();i++){
                if(loading.get(i) instanceof PTE){
                    PTE add = (PTE) loading.get(i);
                    addToTable(add);
                }else if (loading.get(i) instanceof FTE){
                    FTE add = (FTE) loading.get(i);
                    addToTable(add);
                }
            }
        }catch(IOException | NullPointerException e){
            System.out.println("No file exists");  
        }catch(Exception e){
            e.printStackTrace();
        }
    }  
    
    
    //getter and setter methods below 
    public void setWasSaved(boolean s){
        this.wasSaved = s;
    }
    
    public boolean checkIfSaved(){
        return wasSaved;
    }   
    
    public String getFileName(){
        return theFile; 
    }
}
