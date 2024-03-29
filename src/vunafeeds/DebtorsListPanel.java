/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DebtorsListPanel.java
 *
 * Created on Dec 20, 2011, 6:38:27 AM
 */
package vunafeeds;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Magondu
 */
public class DebtorsListPanel extends javax.swing.JPanel {
private Vector<Vector> tableData;
String category = null;
String para = null;
public static String stat;
public static String payStat;

    /** Creates new form DebtorsListPanel */
    public DebtorsListPanel() {
        initComponents();
        tableData = new Vector<Vector>();
        category = "Status";
        para = "Active";
        getData(category, para);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        categ = new javax.swing.JComboBox();
        searchBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edit = new javax.swing.JButton();
        editDriver = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        newEmployee = new javax.swing.JButton();
        newEmployee1 = new javax.swing.JButton();
        statement = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 189, 235)), "Customer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 18), new java.awt.Color(110, 189, 235))); // NOI18N

        editTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CreditorID", "Name", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        editTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(editTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setText("Select Category you wish to search by:");

        categ.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Customer_ID","name", "contact"}));

        jLabel4.setText("N/B: Click on the table to select a record");

        edit.setText("Go>>");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        editDriver.setText("Edit");
        editDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDriverActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        newEmployee.setText("New");
        newEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEmployeeActionPerformed(evt);
            }
        });

        newEmployee1.setText("Print");
        newEmployee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEmployee1ActionPerformed(evt);
            }
        });

        statement.setText("Statement");
        statement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(categ, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(newEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(editDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(statement, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(newEmployee1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit)
                    .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newEmployee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newEmployee))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editTableMousePressed
        int clicks = evt.getClickCount();
        
        if(clicks == 2) {
            edit();
        }
}//GEN-LAST:event_editTableMousePressed
public void edit()
{
    try{
    int row = editTable.getSelectedRow();
            String Driverid = (String) editTable.getValueAt(row, 0);
            String name = (String) editTable.getValueAt(row, 1);
            String contact = (String) editTable.getValueAt(row, 2);
            HomePage.toEdit = "Edit";//so as to alert change in the SQL statement for editing   
            
            Debtor win = new Debtor();
            //EmployeeNew.DriverID.setText(Driverid);
            Debtor.debtor.setText(Driverid);
            Debtor.debtorName.setText(name);
            Debtor.contact.setText(contact);
            Debtor.GenerateAdminNo.setEnabled(false);
            Debtor.admit.setEnabled(true);
            Debtor.debtor.setEditable(false);
                        
            win.setVisible(true);
           
            } 
    catch (Exception e)
    {
    JOptionPane.showMessageDialog(null, "Please select a Customer from the table");
    }
            
   
}
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        
        category = (String) categ.getSelectedItem();
        para = searchBox.getText();
        
        getData(category, para);
}//GEN-LAST:event_editActionPerformed

    private void editDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDriverActionPerformed
        edit();
        
}//GEN-LAST:event_editDriverActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        try{ 
        int row = editTable.getSelectedRow();
        String Driverid = (String) editTable.getValueAt(row, 0);
        String surname = (String) editTable.getValueAt(row, 1);
        String othername = (String) editTable.getValueAt(row, 2);
        
        
        int type = JOptionPane.YES_NO_OPTION;
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete Debtor "+surname+" Phone number "+othername+"","Confirmation",type);
        
        if (option == JOptionPane.YES_OPTION) {
            try {
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/VunaFeeds", "root", "");
                
                PreparedStatement pstmt = con.prepareStatement("UPDATE debtor SET Status = 'Inactive' where Status = 'Active' and Customer_ID = "+Driverid+"" );
                pstmt.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Customer details deleted");
                
                DebtorsList win = new DebtorsList();
                win.setVisible(true);
            } catch(SQLException e) {
                System.out.println("2 Error : "+e);
                JOptionPane.showMessageDialog(null, "Oops!! An error occured. \n "+e);
            } catch(Exception ex) {
                System.out.println("Error 1:"+ex);
                JOptionPane.showMessageDialog(null, "Oops!! An error occured. \n "+ex);
            }
        }
        } 
    catch (Exception e)
    {
    JOptionPane.showMessageDialog(null, "Please select a Customer from the table");
    }
            
}//GEN-LAST:event_deleteActionPerformed

    private void newEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEmployeeActionPerformed
        Debtor  win = new Debtor();
        win.setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_newEmployeeActionPerformed

    private void newEmployee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEmployee1ActionPerformed
        try {
            editTable.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Creditors.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
}//GEN-LAST:event_newEmployee1ActionPerformed

    private void statementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statementActionPerformed
       try{ 
        int row = editTable.getSelectedRow();
        String CustomerID = (String) editTable.getValueAt(row, 0);
        stat = "Select * from sales where Status = 'Active'  and Customer_ID = "+CustomerID+"";//pass on the search string to another frame
        //saleString = "SELECT * FROM sales where Customer_ID = '" + id + "'";
        payStat = "Select * from payment_recieved where Customer_ID = " + CustomerID + "";
        Statement_ForTest win = new Statement_ForTest();
        win.setVisible(true);
        } 
    catch (Exception e)
    {
    JOptionPane.showMessageDialog(null, "Please select a Customer from the table");
    }
            
}//GEN-LAST:event_statementActionPerformed

     private void getData(String category, String para)
    {
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/VunaFeeds", "root", "");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet srs = stmt.executeQuery(
                    "SELECT * FROM debtor where Status = 'Active' and "+category+" = \""+para+"\"" );
            tableData.clear();        
            while (srs.next()) {
                String driver = srs.getString("Customer_ID");
                String sname = srs.getString("name");
                String contact = srs.getString("contact");
                
                
                            
                tableData.add(toVector(driver,sname, contact));
                
            }
            Vector columns = new Vector();
            columns.add("CustomerID");
            columns.add("Name");
            columns.add("Contact");
                                
            
            editTable.setModel(new DefaultTableModel(tableData, columns));
        }
        
        
        
        catch(SQLException e) {
            System.out.println("2 Error : "+e);
             JOptionPane.showMessageDialog(null, "Oops!! An error occured. \n "+e);
        } catch(Exception ex) {
            System.out.println("Error 1:"+ex);
             JOptionPane.showMessageDialog(null, "Oops!! An error occured. \n "+ex);
        }
}
    
    private Vector toVector(String driver,String sname, String contact)
{
        Vector vector = new Vector();
        vector.add(driver);
        vector.add(sname);
        vector.add(contact);
        
        
        return vector;
      }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox categ;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton editDriver;
    public static javax.swing.JTable editTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newEmployee;
    private javax.swing.JButton newEmployee1;
    private javax.swing.JTextField searchBox;
    private javax.swing.JButton statement;
    // End of variables declaration//GEN-END:variables
}
