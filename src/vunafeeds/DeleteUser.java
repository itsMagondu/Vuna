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
public class DeleteUser extends javax.swing.JFrame {
private Vector<Vector> tableData;
String category = null;
String para = null;
public static String stat;
    /** Creates new form EmeployeeEdit */
    public DeleteUser() {
        initComponents();
        setLocationRelativeTo(null);
        tableData = new Vector<Vector>();
        getData();
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
        delete = new javax.swing.JButton();
        newEmployee1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete user");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        editTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "UserID", "Name", "Password", "Priority"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(newEmployee1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newEmployee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void newEmployee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEmployee1ActionPerformed
        try {
            editTable.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Creditors.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
}//GEN-LAST:event_newEmployee1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        delete();
}//GEN-LAST:event_deleteActionPerformed

    private void editTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editTableMousePressed
        int clicks = evt.getClickCount();
        
        if(clicks == 2) {
            delete();
        }
}//GEN-LAST:event_editTableMousePressed
public void delete()
{
    int row = editTable.getSelectedRow();
        String UserID = (String) editTable.getValueAt(row, 0);
        String name = (String) editTable.getValueAt(row, 1);
       // String password = (String) editTable.getValueAt(row, 2);
        
        
        int type = JOptionPane.YES_NO_OPTION;
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete user "+name+"","Confirmation",type);
        
        if (option == JOptionPane.YES_OPTION) {
            try {
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/VunaFeeds", "root", "");
               
                PreparedStatement pstmt = con.prepareStatement("Delete from user where userID = '"+UserID+"' " );
                pstmt.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "User deleted");
                this.dispose();
                DeleteUser win = new DeleteUser();
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
    private void getData()
    {
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/VunaFeeds", "root", "");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet srs = stmt.executeQuery(
                    "SELECT * FROM user " );
            tableData.clear();        
            while (srs.next()) {
                String userID = srs.getString("UserID");
                String name = srs.getString("name");
                String password = srs.getString("Password");
                String priority = srs.getString("Priority");                            
                tableData.add(toVector(userID,name, password,priority));
                
            }
            Vector columns = new Vector();
            columns.add("UserID");
            columns.add("Username");
            columns.add("Password");
            columns.add("Priority");
                                
            
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
    
    private Vector toVector(String driver,String sname, String contact, String priority)
{
        Vector vector = new Vector();
        vector.add(driver);
        vector.add(sname);
        vector.add(contact);
        vector.add(priority);        
        
        return vector;
      }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DeleteUser().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JTable editTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newEmployee1;
    // End of variables declaration//GEN-END:variables
}
