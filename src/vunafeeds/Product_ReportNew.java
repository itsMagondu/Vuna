/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EmeployeeEdit.java
 *
 * Created on Aug 11, 2011, 4:20:24 PM
 */
package vunafeeds;

import java.awt.print.PrinterException;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Magondu
 */
public class Product_ReportNew extends javax.swing.JFrame {

    private Vector<Vector> tableData;
    String category = null;
    String para = null;
    String statement;
    public static String stat;
    public static String insert;

    /** Creates new form EmeployeeEdit */
    public Product_ReportNew() {
        initComponents();
        setLocationRelativeTo(null);
        tableData = new Vector<Vector>();
        statement = null;
        getData(category, para);
        this.setIconImage(new ImageIcon("icons\\Bubble.png").getImage());
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
        jLabel4 = new javax.swing.JLabel();
        editDriver = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        newEmployee = new javax.swing.JButton();
        newEmployee1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Product List");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 189, 235)), "Products", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 18), new java.awt.Color(110, 189, 235))); // NOI18N

        editTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ProductID", "Name", "Description"
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(editTable);

        jLabel4.setText("N/B: Click on the table to select a record");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(newEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(editDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(newEmployee1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(452, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newEmployee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editTableMousePressed
        int clicks = evt.getClickCount();

        if (clicks == 2) {
            edit();
        } else if (clicks == 1) {
            int row = editTable.getSelectedRow();
            String status = (String) editTable.getValueAt(row, 3);
            if (status.equals("Inacitve")) {
                delete.setText("Restore");
            } else {
                delete.setText("Delete");
            }
        }
}//GEN-LAST:event_editTableMousePressed
    public void edit() {
        try {
            int row = editTable.getSelectedRow();
            String Driverid = (String) editTable.getValueAt(row, 0);
            String name = (String) editTable.getValueAt(row, 1);
            String contact = (String) editTable.getValueAt(row, 2);

            HomePage.toEdit = "EditProduct";
            Product win = new Product();
            //EmployeeNew.DriverID.setText(Driverid);
            Product.productName.setText(name);
            Product.ProductID.setText(Driverid);
            Product.descript.setText(contact);
            Product.GenerateAdminNo.setEnabled(false);
            Product.admit.setEnabled(true);
            Product.ProductID.setEnabled(false);


            win.setVisible(true);
            insert = "For updating";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select a record on the table");
        }
    }

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        try {
            int row = editTable.getSelectedRow();

            String prodID = (String) editTable.getValueAt(row, 0);
            String surname = (String) editTable.getValueAt(row, 1);
            String othername = (String) editTable.getValueAt(row, 2);
            String status = (String) editTable.getValueAt(row, 3);

            int type = JOptionPane.YES_NO_OPTION;
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to alter product " + surname, "Confirmation", type);

            if (option == JOptionPane.YES_OPTION) {
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VunaFeeds", "root", "");

                    if (status.equals("Active")) {

                        PreparedStatement pstmt = con.prepareStatement("Update product SET Status = 'Inactive' where productID = " + prodID + "");
                        pstmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Product details deleted");
                    } else {
                        PreparedStatement pstmt = con.prepareStatement("Update product SET Status = 'Active' where productID = " + prodID + "");
                        pstmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Product details restored");
                    }

                    this.dispose();


                    Product_ReportNew win = new Product_ReportNew();
                    win.setVisible(true);
                } catch (SQLException e) {
                    System.out.println("2 Error : " + e);
                    JOptionPane.showMessageDialog(null, "Oops!! An error occured. \n " + e);
                } catch (Exception ex) {
                    System.out.println("Error 1:" + ex);
                    JOptionPane.showMessageDialog(null, "Oops!! An error occured. \n " + ex);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select a record on the table");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void editDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDriverActionPerformed
        edit();
    }//GEN-LAST:event_editDriverActionPerformed

    private void newEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEmployeeActionPerformed
        Product win = new Product();
        win.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_newEmployeeActionPerformed

    private void newEmployee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEmployee1ActionPerformed
        try {
            editTable.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Creditors.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_newEmployee1ActionPerformed

    private void editTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editTableMouseClicked

        int row = editTable.getSelectedRow();
        String status = (String) editTable.getValueAt(row, 3);
        if (status.equals("Inactive")) {
            delete.setText("Restore");
        } else {
            delete.setText("Delete");
        }
    }//GEN-LAST:event_editTableMouseClicked

    private void getData(String category, String para) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VunaFeeds", "root", "");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

//            if (category.isEmpty()|| para.isEmpty())
//            {
            statement = "SELECT * FROM product";
//            }
//            else 
//            {
//             statement = "SELECT * FROM product where "+category+" = \""+para+"\"";
//            }
            ResultSet srs = stmt.executeQuery(statement);
            tableData.clear();
            while (srs.next()) {
                String driver = srs.getString("ProductID");
                String sname = srs.getString("productName");
                String contact = srs.getString("description");
                String status = srs.getString("Status");

                tableData.add(toVector(driver, sname, contact, status));

            }
            Vector columns = new Vector();
            columns.add("Product_ID");
            columns.add("Name");
            columns.add("Description");
            columns.add("Status");


            editTable.setModel(new DefaultTableModel(tableData, columns));
        } catch (SQLException e) {
            System.out.println("2 Error : " + e);
            JOptionPane.showMessageDialog(null, "Oops!! An error occured. \n " + e);
        } catch (Exception ex) {
            System.out.println("Error 1:" + ex);
            JOptionPane.showMessageDialog(null, "Oops!! An error occured. \n " + ex);
        }
    }

    private Vector toVector(String driver, String sname, String contact, String status) {
        Vector vector = new Vector();
        vector.add(driver);
        vector.add(sname);
        vector.add(contact);
        vector.add(status);

        return vector;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Product_ReportNew().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton editDriver;
    public static javax.swing.JTable editTable;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newEmployee;
    private javax.swing.JButton newEmployee1;
    // End of variables declaration//GEN-END:variables
}
