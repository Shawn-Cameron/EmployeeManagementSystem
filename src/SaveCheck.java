
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shawn Cameron
 */
public class SaveCheck extends javax.swing.JFrame {
    
    private boolean shouldExit; 
    private boolean shouldOpen;
    /**
     * sCreates new form SaveCheck
     */
    public SaveCheck(boolean exit, boolean open) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        // class needs to know what to do after it checks if the 
        // user wants to save or not
        this.shouldExit = exit;
        this.shouldOpen = open;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jLabel2 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Would you like to save your changes?");

        saveButton.setText("Save and Exit");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit Without Saving");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(exitButton)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(exitButton)
                    .addComponent(cancelButton))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        if(MainMenu.theHash.checkIfSaveAsNeeded()){
                
            fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
            fileChooser.setFileFilter(new FileNameExtensionFilter("Serialized Files only","ser"));
            fileChooser.setAcceptAllFileFilterUsed(false);
            if(fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
                String path = fileChooser.getSelectedFile().getAbsolutePath();
                String fileName = fileChooser.getSelectedFile().getName();
                if(!fileName.endsWith(".ser")){
                    path += ".ser";
                }
                MainMenu.theHash.saveAs(path);
                MainMenu.displayEmployees();
                
            }
        }else{
            MainMenu.theHash.saveEmployeeInfo();
            MainMenu.theHash.deleteTable();
            MainMenu.displayEmployees();
        }
        
        if(shouldExit){
            System.exit(0);
        }else if(shouldOpen){
            loadTheInfo();
            this.dispose();
        }else{
            this.dispose();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        if(shouldExit){
            System.exit(0);
        }else if(shouldOpen){
            loadTheInfo();
            this.dispose();
        }else{
            MainMenu.theHash.deleteTable();
            MainMenu.theHash.setLoadedFileDirectory("");
            MainMenu.theHash.setSaveAsNeeded(true);
            MainMenu.displayEmployees();
            this.dispose();
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void loadTheInfo(){
        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Serialized File","ser"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String theFileChooser = fileChooser.getSelectedFile().getAbsolutePath();
            MainMenu.theHash.setLoadedFileDirectory(theFileChooser);
            MainMenu.theHash.deleteTable();
            MainMenu.theHash.loadEmployeeInfo(); 
            MainMenu.displayEmployees();
        } else {
            System.out.println("File access cancelled by user.");
        }
        this.dispose();
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
            java.util.logging.Logger.getLogger(SaveCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaveCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaveCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaveCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaveCheck(false,false).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}