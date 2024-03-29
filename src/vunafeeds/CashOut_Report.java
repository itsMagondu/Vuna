/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EditStudents.java
 *
 * Created on Aug 3, 2011, 11:36:25 AM
 */
package vunafeeds;

import java.awt.print.PrinterException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Magondu
 */
public class CashOut_Report extends javax.swing.JFrame {
private Vector<Vector> tableData;
JFrame frame;
String statement;
java.util.Date from;
java.util.Date till;

    /** Creates new form EditStudents */
    public CashOut_Report() {
        initComponents();
        tableData = new Vector<Vector>();
        setLocationRelativeTo(null);
        populate();
        statement = DebtorsListPanel.stat;//get the search string from the credtorList frame
        get_data(statement);
        
        
       // editTable.getModel().addTableModelListener(editTable);
    }

    public static String now(String from) 
{
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat(from);
    return sdf.format(cal.getTime());
}
 
    public static String till(String till) 
{
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat(till);
    return sdf.format(cal.getTime());
}
    /** This method is called from within the constructor to
     * initialize the form
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dates = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        searchRange = new javax.swing.JPanel();
        today = new javax.swing.JRadioButton();
        date = new javax.swing.JRadioButton();
        singleDate = new com.toedter.calendar.JDateChooser();
        month = new javax.swing.JRadioButton();
        monthSelected = new com.toedter.calendar.JMonthChooser();
        From = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        Till = new com.toedter.calendar.JDateChooser();
        dateRange = new javax.swing.JRadioButton();
        print = new javax.swing.JButton();
        edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cash Out Reports");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        editTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Invoice No", "Amount", "Date", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        editTable.setGridColor(new java.awt.Color(0, 204, 204));
        editTable.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(editTable);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cash Out reports. Chose one category:");

        jLabel2.setBackground(new java.awt.Color(110, 189, 235));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cash Out");
        jLabel2.setOpaque(true);

        jLabel5.setText("Total Sales: ");

        total.setEditable(false);

        dates.add(today);
        today.setText("Today");
        today.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todayActionPerformed(evt);
            }
        });

        dates.add(date);
        date.setText("This Day");
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        dates.add(month);
        month.setText("The Month of");
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        jLabel4.setText("Till");

        dates.add(dateRange);
        dateRange.setText("From Dates");
        dateRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateRangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchRangeLayout = new javax.swing.GroupLayout(searchRange);
        searchRange.setLayout(searchRangeLayout);
        searchRangeLayout.setHorizontalGroup(
            searchRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchRangeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(today)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(date)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(singleDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(month)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateRange)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Till, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        searchRangeLayout.setVerticalGroup(
            searchRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchRangeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(singleDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateRange)
                    .addComponent(From, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(Till, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, searchRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(today)
                        .addComponent(date)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                    .addComponent(searchRange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(searchRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        print.setBackground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(255, 255, 255));
        edit.setText("Go>>");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 580, Short.MAX_VALUE)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
Calendar now = Calendar.getInstance();
 String selectedDate;
 String dateToday;
 String searchString = null;
 
 java.util.Date selectDate ;
 //= singleDate.getDate();
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
 if(today.isSelected())
 {
     selectDate = now.getTime();
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        dateToday = sdf.format(selectDate);
       searchString = "SELECT * FROM payments_made where Date like '%"+dateToday+"%' ";       
 }
 else if(date.isSelected())
 {
       selectDate = singleDate.getDate();
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        selectedDate = sdf.format(selectDate);
         searchString = "SELECT * FROM payments_made where Date like '%"+selectedDate+"%' ";
 }
 else if(month.isSelected())
 {
         int mont = monthSelected.getMonth();
         int selectedMonth = mont+1;
        System.out.println(selectedMonth);
                
        //now.getint();
        int y = now.get(Calendar.YEAR);
        String newMonth;
        String searchDate;
       if (String.valueOf(selectedMonth).length() == 1)
       {
          newMonth = "0".concat(String.valueOf(selectedMonth));
       }
        else
       {
       newMonth = String.valueOf(y);
       }
       searchDate = String.valueOf(y).concat("-").concat(String.valueOf(newMonth));
       searchString = "SELECT * FROM payments_made where date like '%"+searchDate+"%'";
        
 }
 else if(dateRange.isSelected())
 {
    from = From.getDate();
    till = Till.getDate();
    
    String f = sdf.format(from);
    String t = sdf.format(till);

    searchString = "SELECT * FROM payments_made where Date > '"+f+"' and Date < '"+t+"' ";
 }
 else
 {
 JOptionPane.showMessageDialog(null, "Please select a  time parameter");
 }


//String dateF = from.toString();

//till = Till.getDate();

//String getCreditor = "SELECT * FROM debtor where "+levalS+" = '"+param+"' ";
// String searchString = null;
//try{
//    Class.forName("com.mysql.jdbc.Driver");
//       
//            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/vunafeeds", "root", "");
//            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
//                    ResultSet.CONCUR_READ_ONLY);
//            ResultSet srs = stmt.executeQuery(getCreditor);
//            while(srs.next())
//            {
//            id = srs.getString("Customer_ID");
//            }
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:mm:ss");
//            
//            if(till == null || from == null)
//            {
//            searchString = "SELECT * FROM payment_recieved where Customer_ID = '"+id+"'";
//            }
//            else
//            {
//            String f = sdf.format(from);
//            String t = sdf.format(till);
//            System.out.println(f);
//            searchString = "SELECT * FROM payment_recieved where Customer_ID = '"+id+"'and Date > '"+f+"' and Date < '"+t+"' ";
//            }
           tableData.clear();
            get_data(searchString);
    
//catch (SQLException e) {
//            System.out.println("2 Error : "+e);
//        } catch(Exception ex)
//        {
//            System.out.println("Error 1:"+ex);
//        }
//            tableData.clear();
//            get_data(searchString);
             // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

    private void get_data(String searchString)
    {
      try{
          String productID = null;
          String creditor = null;
          String prod_name = null;
          String creditor_name = null;
          int totalS = 0;
             Class.forName("com.mysql.jdbc.Driver");       
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/vunafeeds", "root", "");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet srs = stmt.executeQuery(searchString);
           
            Statement stmt1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
                      
            Statement stmt2 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
           
            
            while (srs.next()) {
                String invoiceNo = srs.getString("InvoiceNo");
               // productID = srs.getString("Amount");
                int amount = Integer.parseInt(srs.getString("Amount"));
                //int rate = Integer.parseInt(srs.getString("Rate"));
                String date = srs.getString("Date");
                //creditor = srs.getString("DebtorID");
                totalS = totalS + amount;         
               // System.out.println(creditor);
             
             // ResultSet srs1 = stmt1.executeQuery("Select * from product where productId = "+productID+"");
//              ResultSet srs2 = stmt2.executeQuery("Select * from debtor where debtorId = "+creditor+"");
//             while (srs1.next())
//             {
//                 prod_name = srs1.getString("productname");
//                 //System.out.println(prod_name);
//             }
//             
//             while (srs2.next())
//             {
//                creditor_name = srs2.getString("Name");
//                //System.out.println(creditor_name);
//             }                  
               //System.out.println("finally"); 
             tableData.add(toVector(invoiceNo , amount , date, totalS));
                
            }
             Vector columns = new Vector();
            columns.add("InvoiceNo");
            columns.add("Amount");
            columns.add("Date");
//            columns.add("Rate");
            columns.add("Total");
//            columns.add("Date");
//            columns.add("Debtor Name");     

            editTable.setModel(new DefaultTableModel(tableData,columns));
            if(tableData.isEmpty())
            {
            JOptionPane.showMessageDialog(null, "NO records found. Please try again");
            }
            else{
            int row = editTable.getRowCount();
            int r = 0;
            int intTotal = 0;
            while(r<row)
            {
                int temp = Integer.parseInt(String.valueOf(editTable.getValueAt(r, 1)));
              //  System.out.println(temp);
            intTotal = intTotal + temp;
            //The above code selects a value from the table, converts it to a string then to and integerand finally 
            //adds it to the total/ Impresssive i know!! 
            r++;
            }
            
            total.setText(String.valueOf(intTotal));
        }}
                
                
        
        
        
        catch(SQLException e) {
            System.out.println("2 Error : "+e);
        } catch(Exception ex) {
            System.out.println("Error 1:"+ex);
        }    
    }
    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try {
            editTable.print();
        } catch (PrinterException ex) {
            Logger.getLogger(CashOut_Report.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_printActionPerformed

    private void todayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todayActionPerformed
        if (today.isSelected())
                {
                singleDate.setEnabled(false);
                monthSelected.setEnabled(false);
                From.setEnabled(false);
                Till.setEnabled(false);
                        
                }
      
    }//GEN-LAST:event_todayActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        if (date.isSelected())
                {
                singleDate.setEnabled(true);
                monthSelected.setEnabled(false);
                From.setEnabled(false);
                Till.setEnabled(false);
                        
                }
//        else 
//            singleDate.setEnabled(true);
//                monthSelected.setEnabled(true);
//                From.setEnabled(true);
//                Till.setEnabled(true);
    }//GEN-LAST:event_dateActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
       if (month.isSelected())
                {
                singleDate.setEnabled(false);
                monthSelected.setEnabled(true);
                From.setEnabled(false);
                Till.setEnabled(false);
                        
                }
       
    }//GEN-LAST:event_monthActionPerformed

    private void dateRangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateRangeActionPerformed
        if (dateRange.isSelected())
                {
                singleDate.setEnabled(false);
                monthSelected.setEnabled(false);
                From.setEnabled(true);
                Till.setEnabled(true);
                        
                }
       
    }//GEN-LAST:event_dateRangeActionPerformed

    private Vector toVector(String saleID,int productID,  String rate, int quantity){
        Vector vector = new Vector();
        vector.add(saleID);
        vector.add(productID);
        vector.add(rate);
        vector.add(quantity);
        
       
        return vector;
      }
private void populate()
{
try{
        Class.forName("com.mysql.jdbc.Driver");       
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/vunafeeds", "root", "");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet srs = stmt.executeQuery("SELECT * FROM debtor");
            ResultSetMetaData md = srs.getMetaData();
            
           // while (srs.next()) 
           // {
            int colCount = md.getColumnCount();
            int c = 1;
            System.out.println(colCount);
            while(c <= colCount-1)//The minus 1 is so that it cannot display the status collumn form the database
            {
          String colName = md.getColumnName(c);         
       //   leval.addItem(colName);
          c++;
            }
            }
       // }
         catch(SQLException e) {
            System.out.println("2 Error : "+e);
        } catch(Exception ex) {
            System.out.println("Error 1:"+ex);
        }          
}   
//public void tableEdited(TableModelEvent e)
//{
//        int row = e.getFirstRow();
//        int column = e.getColumn();
//        TableModel model = (TableModel)e.getSource();
//        String columnName = model.getColumnName(column);
//        Object data = model.getValueAt(row, column);
//        JOptionPane.showMessageDialog(null, "kuiva");
//
//} 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new CashOut_Report().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser From;
    private com.toedter.calendar.JDateChooser Till;
    private javax.swing.JRadioButton date;
    private javax.swing.JRadioButton dateRange;
    private javax.swing.ButtonGroup dates;
    private javax.swing.JButton edit;
    private javax.swing.JTable editTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton month;
    private com.toedter.calendar.JMonthChooser monthSelected;
    private javax.swing.JButton print;
    private javax.swing.JPanel searchRange;
    private com.toedter.calendar.JDateChooser singleDate;
    private javax.swing.JRadioButton today;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
