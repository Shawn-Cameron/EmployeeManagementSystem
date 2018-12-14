import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Shawn Cameron
 */
public class MainMenu extends javax.swing.JFrame{
    public static TheHashTable theHash = new TheHashTable(3);
   
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        theHash.loadEmployeeInfo();
        displayEmployees();
        employeeTable.setAutoCreateRowSorter(true);
        this.getRootPane().setDefaultButton(searchButton);
        setTheFileInTitle();
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
        jLabel1 = new javax.swing.JLabel();
        addEmployeeButton = new javax.swing.JButton();
        searchEmployeeText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        resetTable = new javax.swing.JButton();
        displayPTButton = new javax.swing.JToggleButton();
        displayFTButton = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        saveAsMenu = new javax.swing.JMenuItem();
        loadMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        deleteAll = new javax.swing.JMenuItem();
        pProtect = new javax.swing.JMenuItem();
        pRemove = new javax.swing.JMenuItem();

        fileChooser.setDialogTitle("Choose File");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 510));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to your employee management system");

        addEmployeeButton.setText("Add Employee");
        addEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee Number", "First Name", "Last Name", "Type of Employee"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        resetTable.setText("Reset Table");
        resetTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetTableActionPerformed(evt);
            }
        });

        displayPTButton.setText("Display Part-Time Employees");
        displayPTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayPTButtonActionPerformed(evt);
            }
        });

        displayFTButton.setText("Display Full-Time Employees");
        displayFTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayFTButtonActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        newMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newMenu.setText("New");
        newMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuActionPerformed(evt);
            }
        });
        fileMenu.add(newMenu);

        saveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenu.setText("Save");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenu);

        saveAsMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAsMenu.setText("Save As");
        saveAsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenu);

        loadMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        loadMenu.setText("Open");
        loadMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuActionPerformed(evt);
            }
        });
        fileMenu.add(loadMenu);

        jMenuBar1.add(fileMenu);

        jMenu2.setText("Edit");

        deleteAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        deleteAll.setText("Delete All Employees ");
        deleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllActionPerformed(evt);
            }
        });
        jMenu2.add(deleteAll);

        pProtect.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        pProtect.setText("Add/Edit Password");
        pProtect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pProtectActionPerformed(evt);
            }
        });
        jMenu2.add(pProtect);

        pRemove.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        pRemove.setText("Remove Password Protection");
        pRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pRemoveActionPerformed(evt);
            }
        });
        jMenu2.add(pRemove);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 547, Short.MAX_VALUE)
                        .addComponent(displayPTButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displayFTButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetTable))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addEmployeeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchEmployeeText, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addEmployeeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchEmployeeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton)))
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetTable)
                    .addComponent(displayPTButton)
                    .addComponent(displayFTButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * opens the adding function to add the employee
     * @param evt 
     */
    private void addEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeButtonActionPerformed
        new AddNewEmployee().setVisible(true);
    }//GEN-LAST:event_addEmployeeButtonActionPerformed
    /**
     * uses the users entry to get a filtered list to display in jTable
     * @param evt 
     */
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try{
            String lookUp = searchEmployeeText.getText();
            ArrayList<EmployeeInfo> list = theHash.searched(lookUp);
            displaySearched(list);
            searchEmployeeText.setText("");
        }catch(Exception e){
          
        }
    }//GEN-LAST:event_searchButtonActionPerformed
    /**
     * Check if the file exist and runs
     * either saves or opens jFile Chooser to save as
     * @param evt 
     */
    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
        if(theHash.checkIfSaveAsNeeded()){
            saveWithSaveAs();
        }else{
            theHash.saveEmployeeInfo();
        }
    }//GEN-LAST:event_saveMenuActionPerformed
    /**
     * Checks if the user needs to save
     * then opens jFile chooser
     * @param evt 
     */
    private void loadMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMenuActionPerformed
        boolean checker = theHash.checkIfSaved();
        if(!checker){
            new SaveCheck(false,true).setVisible(true);
        }else{
            openFunction();
            setTheFileInTitle();
        }
    }//GEN-LAST:event_loadMenuActionPerformed
    /**
     * displays all the employees on the table
     * @param evt 
     */
    private void resetTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetTableActionPerformed
        displayFTButton.setSelected(false);
        displayPTButton.setSelected(false);
        displayEmployees();
        
    }//GEN-LAST:event_resetTableActionPerformed
    /**
     * opens all of an employee's information 
     * @param evt - when double clicked
     */
    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        if(evt.getClickCount() == 2){
           int getENum = (int) employeeTable.getValueAt(employeeTable.getSelectedRow(), 0);
           EmployeeInfo e = theHash.getEmployee(getENum);
           new DisplayEmployeeInfo(e).setVisible(true);
        }
    }//GEN-LAST:event_employeeTableMouseClicked
    /**
     * checks if the changes has been saved
     * @param evt 
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        boolean checker = theHash.checkIfSaved();
        theHash.saveLastDirectory();
        if(!checker){
            new SaveCheck(true,false).setVisible(true);
        }else{
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing
    /**
     * for deleting all the employees in the table
     * @param evt 
     */
    private void deleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllActionPerformed
        new ConfirmDelete().setVisible(true);
    }//GEN-LAST:event_deleteAllActionPerformed
    /**
     * displays only part time employees
     * @param evt 
     */
    private void displayPTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayPTButtonActionPerformed
        if(displayPTButton.isSelected()){
            displayFTButton.setSelected(false);
        }
        displayEmployees();
    }//GEN-LAST:event_displayPTButtonActionPerformed
    /**
     * displays only full time employees
     * @param evt 
     */
    private void displayFTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayFTButtonActionPerformed
        if(displayFTButton.isSelected()){
            displayPTButton.setSelected(false);
        }
        displayEmployees();
    }//GEN-LAST:event_displayFTButtonActionPerformed
    /**
     * opens the jDialog to allow password and phone number change 
     * @param evt 
     */
    private void pProtectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pProtectActionPerformed
        new PasswordOptions(this,true).setVisible(true);
    }//GEN-LAST:event_pProtectActionPerformed
    /**
     * deletes the password file and the phone number 
     * that is associated with it
     * @param evt - button click
     */
    private void pRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pRemoveActionPerformed
        String passwordFile = PasswordOptions.getPassFile();
        String phoneFile = PasswordOptions.getPNFile();
        File file = new File(passwordFile);
        File pFile = new File(phoneFile);
        if(!file.delete()){
            JOptionPane.showMessageDialog(this,"No Password exist");
        }else{
            pFile.delete();
            JOptionPane.showMessageDialog(this,"Password removed");
        }
    }//GEN-LAST:event_pRemoveActionPerformed

    private void saveAsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuActionPerformed
        saveWithSaveAs();
    }//GEN-LAST:event_saveAsMenuActionPerformed

    private void newMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuActionPerformed
        boolean checker = theHash.checkIfSaved();
        if(!checker){
            new SaveCheck(false,false).setVisible(true);
            this.setTitle("Employee Management System  [New File]");
            
        }else{
            theHash.setLoadedFileDirectory("");
            theHash.setSaveAsNeeded(true);
            theHash.deleteTable();
            setTheFileInTitle();
        }
    }//GEN-LAST:event_newMenuActionPerformed
    //takes the filtered list and displays the employees
    private void displaySearched(ArrayList<EmployeeInfo> list){
        DefaultTableModel model = (DefaultTableModel)employeeTable.getModel();
        model.setRowCount(0);
        for(int i = 0; i < list.size(); i++){
            EmployeeInfo currentE = list.get(i);
                if(currentE instanceof FTE){
                    FTE e = (FTE) currentE;
                    model.addRow(new Object[]{e.getEmployeeNumber(),e.getName(),e.getSurname(),"Full Time"});
                }else if(currentE instanceof PTE){
                    PTE e = (PTE) currentE;
                    model.addRow(new Object[]{e.getEmployeeNumber(),e.getName(),e.getSurname(),"Part Time"});
                    
                }
            } 
    }
    //displays the employees based on what types the user wants to see
    public static void displayEmployees(){
        DefaultTableModel model = (DefaultTableModel)employeeTable.getModel();
        model.setRowCount(0);
        ArrayList<EmployeeInfo> inOrder = new ArrayList<EmployeeInfo>();
        inOrder = theHash.sortByENum();
        
        if(displayFTButton.isSelected()){
            for(int i = 0; i < inOrder.size(); i++){
            EmployeeInfo currentE = inOrder.get(i);
                if(currentE instanceof FTE){
                    FTE e = (FTE) currentE;
                    model.addRow(new Object[]{e.getEmployeeNumber(),e.getName(),e.getSurname(),"Full Time"});
                }
            }
        }else if(displayPTButton.isSelected()){
            for(int i = 0; i < inOrder.size(); i++){
                EmployeeInfo currentE = inOrder.get(i);  
                if(currentE instanceof PTE){
                    PTE e = (PTE) currentE;
                    model.addRow(new Object[]{e.getEmployeeNumber(),e.getName(),e.getSurname(),"Part Time"});
                }
            }
        }else{
            for(int i = 0; i < inOrder.size(); i++){
                EmployeeInfo currentE = inOrder.get(i);
                if(currentE instanceof FTE){
                    FTE e = (FTE) currentE;
                    model.addRow(new Object[]{e.getEmployeeNumber(),e.getName(),e.getSurname(),"Full Time"});
                }else if(currentE instanceof PTE){
                    PTE e = (PTE) currentE;
                    model.addRow(new Object[]{e.getEmployeeNumber(),e.getName(),e.getSurname(),"Part Time"});
                }
            }
        }
        
    }
    //opens the jFileChooser to allow the user to save the file
    private void saveWithSaveAs(){
        fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Serialized File","ser"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        if(fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            String fileName = fileChooser.getSelectedFile().getName();
            if(!fileName.endsWith(".ser")){
                path += ".ser";
                theHash.saveAs(path);
           }
        }
        setTheFileInTitle();
    }
    //loads the employee information from the chosen file
    private void openFunction(){
        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Serialized File","ser"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String theFileChooser = fileChooser.getSelectedFile().getAbsolutePath();
            theHash.setLoadedFileDirectory(theFileChooser);
            theHash.deleteTable();
            theHash.loadEmployeeInfo();
            displayEmployees();
        } else {
            System.out.println("File access cancelled by user.");
        }
        theHash.setSaveAsNeeded(false);
        setTheFileInTitle();
    }
    //changes the title to show the path of the file the user has opened
    private void setTheFileInTitle(){
        try{
            this.setTitle("Employee Management System  [New File]");
            theHash.setSaveAsNeeded(true);
            File theFile = new File(theHash.getFileName());
            if(theFile.exists()){
                this.setTitle("Employee Management System  ["+theHash.getFileName()+"]");
                theHash.setSaveAsNeeded(false);
            }
        }catch(Exception e){
            
        }
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    PasswordOptions.collectComparePassword("water");
                    new LoginPage().setVisible(true);
                }catch(FileNotFoundException e){
                    new MainMenu().setVisible(true);
                }
                
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeButton;
    private javax.swing.JMenuItem deleteAll;
    private static javax.swing.JToggleButton displayFTButton;
    private static javax.swing.JToggleButton displayPTButton;
    private static javax.swing.JTable employeeTable;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem loadMenu;
    private javax.swing.JMenuItem newMenu;
    private javax.swing.JMenuItem pProtect;
    private javax.swing.JMenuItem pRemove;
    private javax.swing.JButton resetTable;
    private javax.swing.JMenuItem saveAsMenu;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchEmployeeText;
    // End of variables declaration//GEN-END:variables

}
