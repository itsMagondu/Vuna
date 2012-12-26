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

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Magondu
 */
public class Purchases extends javax.swing.JFrame {

    ArrayList<String> cName = new ArrayList<String>();
    ArrayList<String> cNumber = new ArrayList<String>();
    ArrayList<String> pName = new ArrayList<String>();
    ArrayList<String> pNumber = new ArrayList<String>();

    /** Creates new form Purchases */
    public Purchases() {
        initComponents();
        Date();
        setLocationRelativeTo(null);
        populate();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quantity = new javax.swing.JFormattedTextField();
        product = new javax.swing.JComboBox();
        purchase = new javax.swing.JTextField();
        admit = new javax.swing.JButton();
        DisplayDate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        creditors = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        rate = new javax.swing.JFormattedTextField();
        date = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Purchases");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(110, 189, 235));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Purchases");
        jLabel1.setOpaque(true);

        jLabel2.setText("Purchase ID:");

        jLabel3.setText("Product ID:");

        jLabel4.setText("Quantity:");

        jLabel5.setText("Rate:");

        quantity.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        product.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });

        purchase.setEditable(false);

        admit.setBackground(new java.awt.Color(255, 255, 255));
        admit.setText("Save");
        admit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admitActionPerformed(evt);
            }
        });

        DisplayDate.setBackground(new java.awt.Color(110, 189, 235));
        DisplayDate.setOpaque(true);

        jLabel6.setText("Creditors:");

        creditors.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Total Amount");

        total.setEditable(false);

        rate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        rate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rateKeyReleased(evt);
            }
        });

        jLabel9.setText("Date:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addGap(43, 43, 43))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(62, 62, 62)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                    .addComponent(rate, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(creditors, 0, 213, Short.MAX_VALUE)
                    .addComponent(quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(product, 0, 213, Short.MAX_VALUE)
                    .addComponent(purchase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(admit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(purchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creditors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(admit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productActionPerformed
    private void Date() {
        Calendar now = Calendar.getInstance();
        int y = now.get(Calendar.YEAR);
        int m = (now.get(Calendar.MONTH)) + 1;
        int d = now.get(Calendar.DATE);
        DisplayDate.setText("Today's date is " + d + " / " + m + " / " + y);
        DisplayDate.setVisible(true);

    }

    private void admitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admitActionPerformed

        //String  = purchase.getText();
        String rateS = rate.getText();
        String quantityS = quantity.getText();
        String productS = (String) product.getSelectedItem();
        String debtorS = (String) creditors.getSelectedItem();
        java.util.Date dat = date.getDate();
        String purID = purchase.getText();

        String Pnum = null;
        String Cnum = null;

        if (rateS.length() == 0 || quantityS.length() == 0 || dat == null) {
            JOptionPane.showMessageDialog(null, "Please fill all fields");
        } else {
            if (debtorS.equalsIgnoreCase("Cash")) {
                Cnum = "Cash";
            } else {
                int indexC = cName.indexOf(debtorS);
                System.out.print(indexC);
                Cnum = cNumber.get(indexC);

            }
            int indexP = pName.indexOf(productS);
            Pnum = pNumber.get(indexP);


            try {

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:mm:ss");
                String purDate = sdf.format(dat);

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VunaFeeds", "root", "");

                if (HomePage.toEdit.equals("EditPurchases")) {
                    PreparedStatement psmt0 = con.prepareStatement("UPDATE Purchases set STATUS = 'Inactive' where STATUS = 'Active' and PurchaseID = '" + purID + "'");
                    psmt0.executeUpdate();
                }

                PreparedStatement psmt = con.prepareStatement("INSERT into purchases(productID,quantity,rate,Supplier_ID,date) values (?,?,?,?,?)");
                psmt.setString(1, Pnum);
                psmt.setString(2, quantityS);
                psmt.setString(3, rateS);
                psmt.setString(4, Cnum);
                psmt.setString(5, purDate);

                psmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Item Purchased");
//                int previosQuan = 0;
//                int newQuantity = 0;
//                String newQuan = null;
//                
//                Statement stmt1 = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
//                        ResultSet.CONCUR_READ_ONLY);
//                ResultSet rs1 = stmt1.executeQuery("Select * from stock where productID = '" + Pnum + "'"); // to insert the new product into the stick table
//                String purchaseID = purchase.getText();
//                if (rs1.last()) {
//                    String prevQ = rs1.getString("quantity");
//                    previosQuan = Integer.parseInt(prevQ);
//                    System.out.println(previosQuan);
//                    newQuantity = Integer.parseInt(quantityS);
//                    newQuantity = previosQuan + newQuantity;
//                    newQuan = String.valueOf(newQuantity);
//                    System.out.println(newQuan);
//
//
//                    // String status = "Active";
//                    PreparedStatement psmt1 = con.prepareStatement("INSERT into stock(productID,purchaseID,quantity) values (?,?,?)");
//                    psmt1.setString(1, Pnum);
//                    psmt1.setString(2, purchaseID);
//                    psmt1.setString(3, newQuan);
//                    psmt1.executeUpdate();
//                } else {
//                    newQuan = quantityS;
//                    PreparedStatement psmt1 = con.prepareStatement("INSERT into stock(productID,purchaseID,quantity) values (?,?,?)");
//                    psmt1.setString(1, Pnum);
//                    psmt1.setString(2, purchaseID);
//                    psmt1.setString(3, newQuan);
//                    psmt1.executeUpdate();
//                }
                HomePage.toEdit = " ";
                this.dispose();
                Purchases win = new Purchases();
                win.setVisible(true);


            } catch (SQLException e) {

                System.out.println("2 Error : " + e);
                JOptionPane.showMessageDialog(null, "Oops!! An error occured. \n " + e);
            } catch (Exception ex) {
                System.out.println("Error 1:" + ex);
                JOptionPane.showMessageDialog(null, "Oops!! An error occured. \n" + ex);
            }
        }
        // TODO add your handling code here:
}//GEN-LAST:event_admitActionPerformed

    private void rateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rateKeyReleased

        double quan = Double.parseDouble(quantity.getText());
        double rateS = Double.parseDouble(rate.getText());
        //double totalS
        total.setText(Double.toString(quan * rateS));

    }//GEN-LAST:event_rateKeyReleased
    private void populate() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vunafeeds", "root", "");
            Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_READ_ONLY);
            
            ResultSet rs;
            if(HomePage.toEdit.equals("EditPurchases"))
             {
            rs = stmt.executeQuery("Select * from product");
             }
             else
             {
                rs = stmt.executeQuery("Select * from product where Status = 'Active'");  
             }
            
           // ResultSet rs = stmt.executeQuery("Select * from product Where status = 'Active'");
            product.removeAllItems();

            Statement stmt1 = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet rs1 = stmt1.executeQuery("Select * from creditors where status = 'Active'");


            Statement stmt2 = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet rs2 = stmt2.executeQuery("Select * from purchases");

            product.removeAllItems();
            creditors.removeAllItems();
            creditors.addItem("Cash");
            // creditors.addItem("Inhouse");
            int Dindex = 0;
            int Pindex = 0;
            while (rs.next()) {
                String productS = rs.getString("productID");
                String productName = rs.getString("productName");
                pName.add(Pindex, productName);
                pNumber.add(Pindex, productS);

                Pindex++;
                product.addItem(productName);
            }
            while (rs1.next()) {
                String debtorS = rs1.getString("Supplier_ID");//creditorID
                String debtorName = rs1.getString("Name");
                cName.add(Dindex, debtorName);
                cNumber.add(Dindex, debtorS);
                Dindex++;

                creditors.addItem(debtorName);
            }

            if (rs2.last()) {
                String id = rs2.getString("purchaseID");
                int intID = Integer.parseInt(id);
                intID++;
                purchase.setText(String.valueOf(intID));
                // purchase.setText(id);
            } else {
                purchase.setText("1");
            }
        } catch (SQLException e) {

            System.out.println("2 Error : " + e);
            JOptionPane.showMessageDialog(null, "Oops!! An error occured. \n " + e);
        } catch (Exception ex) {
            System.out.println("Error 1:" + ex);
            JOptionPane.showMessageDialog(null, "Oops!! An error occured. \n" + ex);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Purchases().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DisplayDate;
    public static javax.swing.JButton admit;
    public static javax.swing.JComboBox creditors;
    public static com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JComboBox product;
    public static javax.swing.JTextField purchase;
    public static javax.swing.JFormattedTextField quantity;
    public static javax.swing.JFormattedTextField rate;
    public static javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
