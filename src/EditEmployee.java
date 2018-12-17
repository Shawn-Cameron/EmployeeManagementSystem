/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shawn Cameron
 */
public class EditEmployee extends javax.swing.JFrame {

    /**
     * Creates new form EditEmployee
     */
    private static EmployeeInfo theEmployee;
    private static FTE theFullTimeE;
    private static PTE thePartTimeE;
    
    public EditEmployee(EmployeeInfo employee) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.theEmployee = employee;
        if (theEmployee instanceof FTE){
            hoursPerWeekText.setVisible(false);
            partTHours.setVisible(false);
            weeksPerYearText.setVisible(false);
            partTWeeks.setVisible(false);
            eNameType.setText("Full Time Employee Editor");
            this.theFullTimeE = (FTE) theEmployee;
            showCurrentInfo();
        }else if(theEmployee instanceof PTE){
            this.thePartTimeE = (PTE) theEmployee;
            salOrIncome.setText("Income/Hour");
            eNameType.setText("Part Time Employee Editor");
            toPartOrFullButton.setText("Change to Full Time");
            showCurrentInfo();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        salOrIncome = new javax.swing.JLabel();
        partTHours = new javax.swing.JLabel();
        eNameType = new javax.swing.JLabel();
        partTWeeks = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        deductionRateText = new javax.swing.JTextField();
        weeksPerYearText = new javax.swing.JTextField();
        hoursPerWeekText = new javax.swing.JTextField();
        salOrIncomeText = new javax.swing.JTextField();
        employeeNumberText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        maleBox = new javax.swing.JCheckBox();
        femaleBox = new javax.swing.JCheckBox();
        otherBox = new javax.swing.JCheckBox();
        saveInfoButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        toPartOrFullButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        workLocationCBox = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel10.setText("Work Location");

        salOrIncome.setText("Salary");

        partTHours.setText("Hours/Week");

        eNameType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        partTWeeks.setText("Weeks/year");

        jLabel2.setText("First Name");

        jLabel4.setText("Last Name");

        jLabel6.setText("Employee Number");

        jLabel15.setText("Deduction Rate(%)");

        jLabel8.setText("Sex");

        maleBox.setText("Male");
        maleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleBoxActionPerformed(evt);
            }
        });

        femaleBox.setText("Female");
        femaleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleBoxActionPerformed(evt);
            }
        });

        otherBox.setText("Other");
        otherBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherBoxActionPerformed(evt);
            }
        });

        saveInfoButton.setText("Save");
        saveInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInfoButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        toPartOrFullButton.setText("Change to Part Time");
        toPartOrFullButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toPartOrFullButtonActionPerformed(evt);
            }
        });

        errorLabel.setText(" ");

        workLocationCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Toronto", "Mississauga", "Ottawa" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eNameType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(weeksPerYearText)
                                    .addComponent(hoursPerWeekText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salOrIncomeText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(employeeNumberText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(maleBox)
                                            .addGap(4, 4, 4)
                                            .addComponent(femaleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(otherBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(toPartOrFullButton))
                                    .addComponent(deductionRateText)
                                    .addComponent(workLocationCBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(saveInfoButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cancelButton))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(salOrIncome)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel10)))
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(partTWeeks))
                                    .addComponent(partTHours))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eNameType, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maleBox)
                    .addComponent(femaleBox)
                    .addComponent(otherBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(workLocationCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salOrIncomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salOrIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursPerWeekText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(partTHours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weeksPerYearText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(partTWeeks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deductionRateText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(errorLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveInfoButton)
                    .addComponent(cancelButton)
                    .addComponent(toPartOrFullButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleBoxActionPerformed
        femaleBox.setSelected(false);
        otherBox.setSelected(false);
    }//GEN-LAST:event_maleBoxActionPerformed

    private void femaleBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleBoxActionPerformed
        maleBox.setSelected(false);
        otherBox.setSelected(false);
    }//GEN-LAST:event_femaleBoxActionPerformed

    private void otherBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherBoxActionPerformed
        maleBox.setSelected(false);
        femaleBox.setSelected(false);
    }//GEN-LAST:event_otherBoxActionPerformed

    private void saveInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInfoButtonActionPerformed
        saveChanges();
    }//GEN-LAST:event_saveInfoButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void toPartOrFullButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toPartOrFullButtonActionPerformed
        changeEType();
    }//GEN-LAST:event_toPartOrFullButtonActionPerformed
   
    private void showCurrentInfo(){
        if(theEmployee instanceof FTE){
            firstNameText.setText(theFullTimeE.getName());
            lastNameText.setText(theFullTimeE.getSurname());
            employeeNumberText.setText(Integer.toString(theFullTimeE.getEmployeeNumber()));
            displaySex(theFullTimeE);
            workLocationCBox.setSelectedItem(theFullTimeE.getWorkLocation());
            salOrIncomeText.setText(Float.toString(theFullTimeE.getSalary()));
            deductionRateText.setText(Float.toString(Math.round(theFullTimeE.getDeductionRate()* 100.0)/100.0f));
        } else {
            firstNameText.setText(thePartTimeE.getName());
            lastNameText.setText(thePartTimeE.getSurname());
            employeeNumberText.setText(Integer.toString(thePartTimeE.getEmployeeNumber()));
            displaySex(thePartTimeE);
            workLocationCBox.setSelectedItem(thePartTimeE.getWorkLocation());
            salOrIncomeText.setText(Float.toString(thePartTimeE.getIncomePerHour()));
            hoursPerWeekText.setText(Float.toString(thePartTimeE.getHoursPerWeek()));
            weeksPerYearText.setText(Integer.toString(thePartTimeE.getWeeksPerYear()));
            deductionRateText.setText(Float.toString(Math.round(thePartTimeE.getDeductionRate()* 100.0)/100.0f));
        }
    }
    
    private void saveChanges(){
        try{
            if (toPartOrFullButton.getText() == "Change to Part Time"){
                String fN = firstNameText.getText();
                String lN = lastNameText.getText();
                int eNum = Integer.parseInt(employeeNumberText.getText());
                int wL = getTheWorkLocation();
                float sal = Float.parseFloat(salOrIncomeText.getText());
                float dRate = Float.parseFloat(deductionRateText.getText());
                checkDRate(dRate);
                if (fN.isEmpty() || lN.isEmpty()){
                    throw new Exception();
                }
                
                FTE changedEmployee = new FTE(eNum,fN,lN,getTheSex(),wL,sal,dRate);
                MainMenu.theHash.removeEmployee(theEmployee.getEmployeeNumber());
                MainMenu.theHash.addToTable(changedEmployee);
                MainMenu.theHash.setWasSaved(false);
                MainMenu.displayEmployees();
                this.dispose();
            } else if(toPartOrFullButton.getText() == "Change to Full Time"){
                String fN = firstNameText.getText();
                String lN = lastNameText.getText();
                int eNum = Integer.parseInt(employeeNumberText.getText());
                int wL = getTheWorkLocation();
                float income = Float.parseFloat(salOrIncomeText.getText());
                float hours = Float.parseFloat(hoursPerWeekText.getText());
                int weeks = Integer.parseInt(weeksPerYearText.getText());
                float dRate = Float.parseFloat(deductionRateText.getText());
                checkWeeksYears(hours,weeks);
                checkDRate(dRate);
                
                if (fN.isEmpty() || lN.isEmpty()){
                    throw new Exception();
                }
                PTE changedEmployee = new PTE(eNum,fN,lN,getTheSex(),wL,income,hours,weeks,dRate);
                MainMenu.theHash.removeEmployee(theEmployee.getEmployeeNumber());
                MainMenu.theHash.addToTable(changedEmployee);
                MainMenu.theHash.setWasSaved(false);
                MainMenu.displayEmployees();
                this.dispose();
            }
        }catch(UnsupportedOperationException e){
            errorLabel.setText("The Employee Number you entered already exists");
            MainMenu.theHash.addToTable(theEmployee);
        }catch(Exception e){ 
            errorLabel.setText("Error creating the employee please check the information provided");
            
        }
    }
    
    private int getTheWorkLocation() throws Exception{
        int itemIndex;
        itemIndex = workLocationCBox.getSelectedIndex();
        if (itemIndex == 0){
            throw new Exception();
        }else{
            return itemIndex;
        }
    }
    
    private void checkDRate(float dRate) throws Exception{
        if(dRate<0.0 || dRate>100.0){
            throw new Exception();
        }
    }
    
    private void checkWeeksYears(float hours, int weeks)throws Exception{
        if(weeks < 1 || weeks > 52 || hours <= 0 || hours > 168){
            throw new Exception();
        }
    }
    
    private void displaySex(EmployeeInfo e){
        String sex = e.getSex();
        if(sex == "Male"){
            maleBox.setSelected(true);
        }else if(sex == "Female"){
            femaleBox.setSelected(true);
        }else{
            otherBox.setSelected(true);
        }
    }
    
    private int getTheSex()throws Exception{
        if(maleBox.isSelected()){
            return 0;
        }else if(femaleBox.isSelected()){
            return 1;
        }else if(otherBox.isSelected()){
            return 2;
        }else{
            throw new Exception();
        }
    }
    
    private void changeEType(){
        if(toPartOrFullButton.getText() == "Change to Full Time"){
            hoursPerWeekText.setVisible(false);
            partTHours.setVisible(false);
            weeksPerYearText.setVisible(false);
            partTWeeks.setVisible(false);
            salOrIncome.setText("Salary");
            salOrIncomeText.setText("");
            eNameType.setText("Full Time Employee Editor");
            toPartOrFullButton.setText("Change to Part Time");
        } else if(toPartOrFullButton.getText() == "Change to Part Time"){
            hoursPerWeekText.setVisible(true);
            hoursPerWeekText.setText("");
            partTHours.setVisible(true);
            
            weeksPerYearText.setVisible(true);
            weeksPerYearText.setText("");
            partTWeeks.setVisible(true);
            
            salOrIncome.setText("Income/Hour");
            salOrIncomeText.setText("");
            eNameType.setText("Part Time Employee Editor");
            toPartOrFullButton.setText("Change to Full Time");
        }
        
    }
    /**;
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmployee(theEmployee).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField deductionRateText;
    private javax.swing.JLabel eNameType;
    private javax.swing.JTextField employeeNumberText;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JCheckBox femaleBox;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JTextField hoursPerWeekText;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JCheckBox maleBox;
    private javax.swing.JCheckBox otherBox;
    private javax.swing.JLabel partTHours;
    private javax.swing.JLabel partTWeeks;
    private javax.swing.JLabel salOrIncome;
    private javax.swing.JTextField salOrIncomeText;
    private javax.swing.JButton saveInfoButton;
    private javax.swing.JButton toPartOrFullButton;
    private javax.swing.JTextField weeksPerYearText;
    private javax.swing.JComboBox<String> workLocationCBox;
    // End of variables declaration//GEN-END:variables
}
