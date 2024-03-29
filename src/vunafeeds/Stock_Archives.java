/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Purchases.java
 *
 * Created on Sep 8, 2011, 8:04:17 PM
 */
package vunafeeds;

import java.awt.print.PrinterException;
import java.sql.*;
import java.util.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Magondu
 */
public class Stock_Archives extends javax.swing.JFrame {

    private Vector<Vector> tableData;
    java.util.Date sDate;
   // public static String stat;
   // public static String insert;
    public static String stockID;

    /** Creates new form Purchases */
    public Stock_Archives() {
        initComponents();
        Date();
        setLocationRelativeTo(null);
        tableData = new Vector<Vector>();
        data();
        // get_data();
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
        jLabel1 = new javax.swing.JLabel();
        DisplayDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        newEmployee = new javax.swing.JButton();
        editDriver = new javax.swing.JButton();
        newEmployee1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Stock");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(110, 189, 235));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Stock Records");
        jLabel1.setOpaque(true);

        DisplayDate.setBackground(new java.awt.Color(110, 189, 235));
        DisplayDate.setOpaque(true);

        editTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Stock ID", "Date", "Product 	", "Product ID", "Quantity Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        editTable.setGridColor(new java.awt.Color(0, 204, 204));
        editTable.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(editTable);

        jLabel3.setText("Total:");

        total.setEditable(false);

        edit.setBackground(new java.awt.Color(255, 255, 255));
        edit.setText("Go>>");
        edit.setEnabled(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(436, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(DisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edit))
                .addContainerGap())
        );

        newEmployee.setText("New");
        newEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEmployeeActionPerformed(evt);
            }
        });

        editDriver.setText("Edit");
        editDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDriverActionPerformed(evt);
            }
        });

        newEmployee1.setText("Print");
        newEmployee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEmployee1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(editDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299)
                .addComponent(newEmployee1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newEmployee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Date() {
        Calendar now = Calendar.getInstance();
        int y = now.get(Calendar.YEAR);
        int m = (now.get(Calendar.MONTH)) + 1;
        int d = now.get(Calendar.DATE);
        DisplayDate.setText("Today's date is " + d + " / " + m + " / " + y);
        DisplayDate.setVisible(true);

    }

    private void newEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEmployeeActionPerformed
        Stock_New win = new Stock_New();
        win.setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_newEmployeeActionPerformed

    private void editDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDriverActionPerformed
        edit();
}//GEN-LAST:event_editDriverActionPerformed
    public void edit() {

        int row = editTable.getSelectedRow();
        stockID = (String) editTable.getValueAt(row, 0);
        String product = (String) editTable.getValueAt(row, 2);
        int units = Integer.parseInt(editTable.getValueAt(row, 4).toString());
        Stock_New win = new Stock_New();

        //Stock_New.date.setDateFormatString();
        Stock_New.product.setSelectedItem(product);
        Stock_New.units.setText(Integer.toString(units));

        win.setVisible(true);
         HomePage.toEdit = "EditStock";

    }
    private void newEmployee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEmployee1ActionPerformed
        try {
            editTable.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Creditors.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
}//GEN-LAST:event_newEmployee1ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed

        tableData.clear();
        String search = "SELECT * FROM new_stock where Status = 'Current'";

        try {
            String productID = null;
            String stock = null;
            String prod_name = null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vunafeeds", "root", "");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            Statement stmt1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            ResultSet srs = stmt.executeQuery(search);
            while (srs.next()) {

                productID = srs.getString("ProductID");
                int quantity = Integer.parseInt(srs.getString("Current"));
                String date = srs.getString("Date");
                stock = srs.getString("StockID");
                ResultSet srs1 = stmt1.executeQuery("Select * from product where productId = " + productID + "");

                if (srs1.next()) {
                    prod_name = srs1.getString("productname");
                    //System.out.println(prod_name);
                }
                tableData.add(toVector(stock, date, prod_name, productID, quantity));

            }
            Vector columns = new Vector();
            columns.add("StockID");
            columns.add("Date");
            columns.add("Product");
            columns.add("ProductID");
            columns.add("Quantity");


            editTable.setModel(new DefaultTableModel(tableData, columns));
            if (tableData.isEmpty()) {
                JOptionPane.showMessageDialog(null, "NO records found. Please try again");
            } else {
                int row = editTable.getRowCount();
                int r = 0;
                int intTotal = 0;
                while (r < row) {
                    int temp = Integer.parseInt(String.valueOf(editTable.getValueAt(r, 4)));
                    System.out.println(temp);
                    intTotal = intTotal + temp;
                    //The above code selects a value from the table, converts it to a string then to and integerand finally
                    //adds it to the total/ Impresssive i know!!
                    r++;
                }

                total.setText(String.valueOf(intTotal));
            }
        } catch (SQLException e) {
            System.out.println("2 Error : " + e);
        } catch (Exception ex) {
            System.out.println("Error 1:" + ex);
        }           // TODO add your handling code here:
}//GEN-LAST:event_editActionPerformed
    private void data() {
        tableData.clear();

        String search;
        search = "SELECT * FROM new_stock where Status = 'Current'";


        try {
            String productID = null;
            String prod_name = null;
            String stock = null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vunafeeds", "root", "");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            Statement stmt1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            ResultSet srs = stmt.executeQuery(search);
            while (srs.next()) {

                productID = srs.getString("ProductID");
                int quantity = Integer.parseInt(srs.getString("Current"));
                //int rate = Integer.parseInt(srs.getString("Rate"));
                String date = srs.getString("Date");
                stock = srs.getString("StockID");
                //creditor = srs.getString("CreditorID");
                //int totalS = quantity * rate;
                ResultSet srs1 = stmt1.executeQuery("Select * from product where productId = " + productID + "");

                if (srs1.next()) {
                    prod_name = srs1.getString("productname");
                    //System.out.println(prod_name);
                }
                tableData.add(toVector(stock, date, prod_name, productID, quantity));

            }
            Vector columns = new Vector();
            columns.add("StockID");
            columns.add("Date");
            columns.add("Product");
            columns.add("ProductID");
            columns.add("Quantity");


            editTable.setModel(new DefaultTableModel(tableData, columns));
            if (tableData.isEmpty()) {
                JOptionPane.showMessageDialog(null, "NO records found. Please try again");
            } else {
                int row = editTable.getRowCount();
                int r = 0;
                int intTotal = 0;
                while (r < row) {
                    int temp = Integer.parseInt(String.valueOf(editTable.getValueAt(r, 4)));
                    System.out.println(temp);
                    intTotal = intTotal + temp;
                    //The above code selects a value from the table, converts it to a string then to and integerand finally
                    //adds it to the total/ Impresssive i know!!
                    r++;
                }

                total.setText(String.valueOf(intTotal));
            }
        } catch (SQLException e) {
            System.out.println("2 Error : " + e);
        } catch (Exception ex) {
            System.out.println("Error 1:" + ex);
        }           // TODO add your handling code here:

    }

    private Vector toVector(String stock, String date, String prodName, String productID, int quantity) {
        Vector vector = new Vector();
        vector.add(stock);
        vector.add(date);
        vector.add(prodName);
        vector.add(productID);
        vector.add(quantity);

        return vector;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Stock_Archives().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DisplayDate;
    private javax.swing.JButton edit;
    private javax.swing.JButton editDriver;
    private javax.swing.JTable editTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newEmployee;
    private javax.swing.JButton newEmployee1;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
