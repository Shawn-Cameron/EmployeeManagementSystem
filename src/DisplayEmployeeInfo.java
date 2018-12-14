/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shawn Cameron
 */
public class DisplayEmployeeInfo extends javax.swing.JFrame {
    /**
     * Creates new form DisplayEmployeeInfo
     */
    private static EmployeeInfo theEmployee;
    //created variables the allow the calling of the information
    private static PTE theEmployeeP;
    private static FTE theEmployeeF;
    
    public DisplayEmployeeInfo(EmployeeInfo employee) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.theEmployee = employee;
        //determines the type of employee and allows the information
        //associated with that type to be shown
        if(employee instanceof FTE){
            partTHours.setVisible(false);
            hoursLabel.setVisible(false);
            partTWeeks.setVisible(false);
            weeksLabel.setVisible(false);
            incomeLabel.setVisible(false);
            partTIncome.setVisible(false);
            this.theEmployeeF = (FTE)theEmployee;
            displayInfoFull();
        }else if(employee instanceof PTE){
            salOrWage.setText("Wage");
            this.theEmployeeP = (PTE)theEmployee;
            displayInfoPart();
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

        firstNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empNumLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sexLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        workLocationLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        salaryOrWageLabel = new javax.swing.JLabel();
        salOrWage = new javax.swing.JLabel();
        partTHours = new javax.swing.JLabel();
        hoursLabel = new javax.swing.JLabel();
        partTWeeks = new javax.swing.JLabel();
        weeksLabel = new javax.swing.JLabel();
        deductionRateLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        incomeLabel = new javax.swing.JLabel();
        partTIncome = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteEmployeeButton = new javax.swing.JButton();
        eNameType = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 12));

        firstNameLabel.setText(" water");

        jLabel2.setText("First Name");

        lastNameLabel.setText(" water");

        jLabel4.setText("Last Name");

        empNumLabel.setText(" water");

        jLabel6.setText("Employee Number");

        sexLabel.setText(" water");
        sexLabel.setToolTipText("");

        jLabel8.setText("Sex");

        workLocationLabel.setText(" water");

        jLabel10.setText("Work Location");

        salaryOrWageLabel.setText(" water");

        salOrWage.setText("Salary");

        partTHours.setText("Hours/Week");

        hoursLabel.setText(" water");

        partTWeeks.setText("Weeks/year");

        weeksLabel.setText(" water");

        deductionRateLabel.setText(" water");

        jLabel15.setText("Deduction Rate (%)");

        incomeLabel.setText(" water");

        partTIncome.setText("Income/Hour");

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteEmployeeButton.setText("Delete Employee");
        deleteEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeButtonActionPerformed(evt);
            }
        });

        eNameType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(empNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(workLocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salaryOrWageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salOrWage))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(partTHours))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(weeksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(partTWeeks))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(incomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(partTIncome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deductionRateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editButton)
                                    .addComponent(jLabel15))))
                        .addContainerGap(89, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eNameType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteEmployeeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeButton)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(eNameType, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workLocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryOrWageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salOrWage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(incomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(partTIncome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(partTHours))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weeksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(partTWeeks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deductionRateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(editButton)
                    .addComponent(deleteEmployeeButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void deleteEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeButtonActionPerformed
        MainMenu.theHash.removeEmployee(theEmployee.getEmployeeNumber());
        MainMenu.theHash.setWasSaved(false);
        MainMenu.displayEmployees();
        this.dispose();
    }//GEN-LAST:event_deleteEmployeeButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        new EditEmployee(theEmployee).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editButtonActionPerformed

    private void displayInfoFull(){
        firstNameLabel.setText(theEmployeeF.getName());
        lastNameLabel.setText(theEmployeeF.getSurname());
        empNumLabel.setText(Integer.toString(theEmployeeF.getEmployeeNumber()));
        sexLabel.setText(theEmployeeF.getSex());
        workLocationLabel.setText(theEmployeeF.getWorkLocation());
        salaryOrWageLabel.setText(Float.toString(Math.round(theEmployeeF.getPayment()*100.0)/100.0f));
        deductionRateLabel.setText(Float.toString(Math.round(theEmployeeF.getDeductionRate()* 100.0)/100.0f));
        eNameType.setText(theEmployeeF.getName()+" "+theEmployeeF.getSurname()+" (Full Time Employee)");
    }
    
    private void displayInfoPart(){
        firstNameLabel.setText(theEmployeeP.getName());
        lastNameLabel.setText(theEmployeeP.getSurname());
        empNumLabel.setText(Integer.toString(theEmployeeP.getEmployeeNumber()));
        sexLabel.setText(theEmployeeP.getSex());
        workLocationLabel.setText(theEmployeeP.getWorkLocation());
        salaryOrWageLabel.setText(Float.toString(theEmployeeP.getPayment()));
        incomeLabel.setText(Float.toString(theEmployeeP.getIncomePerHour()));
        hoursLabel.setText(Integer.toString(theEmployeeP.getHoursPerWeek()));
        weeksLabel.setText(Integer.toString(theEmployeeP.getWeeksPerYear()));
        deductionRateLabel.setText(Float.toString(Math.round(theEmployeeP.getDeductionRate()* 100.0)/100.0f));
        eNameType.setText(theEmployeeP.getName()+" "+theEmployeeP.getSurname()+" (Part Time Employee)");
    }
    

    /**
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
            java.util.logging.Logger.getLogger(DisplayEmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayEmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayEmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayEmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayEmployeeInfo(theEmployee).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel deductionRateLabel;
    private javax.swing.JButton deleteEmployeeButton;
    private javax.swing.JLabel eNameType;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel empNumLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel hoursLabel;
    private javax.swing.JLabel incomeLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel partTHours;
    private javax.swing.JLabel partTIncome;
    private javax.swing.JLabel partTWeeks;
    private javax.swing.JLabel salOrWage;
    private javax.swing.JLabel salaryOrWageLabel;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JLabel weeksLabel;
    private javax.swing.JLabel workLocationLabel;
    // End of variables declaration//GEN-END:variables
}
