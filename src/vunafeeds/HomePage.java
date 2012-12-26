/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HomePage.java
 *
 * Created on Oct 31, 2011, 3:30:19 PM
 */
package vunafeeds;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

/**
 *
 * @author Magondu
 */
public class HomePage extends javax.swing.JFrame {
public static String toEdit; 
    /** Creates new form HomePage */
    public HomePage() {
        initComponents();
        setLocationRelativeTo(null);
        toEdit = "Null";
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
        jPanel2 = new javax.swing.JPanel();
        sales = new javax.swing.JButton();
        creditors = new javax.swing.JButton();
        Customers = new javax.swing.JButton();
        purchases = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        forSwapping = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        NewSale = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        inCash = new javax.swing.JButton();
        outCash = new javax.swing.JButton();
        NewPurchase = new javax.swing.JButton();
        Stock = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        salesMenu = new javax.swing.JMenu();
        NewSaleMenu = new javax.swing.JMenuItem();
        ViewPrevMenu = new javax.swing.JMenuItem();
        purchasesMenu = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        productMenu = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        productReports = new javax.swing.JMenuItem();
        debtorMenu = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        CustomerPayStat = new javax.swing.JMenuItem();
        incStatement = new javax.swing.JMenuItem();
        creditorMenu = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        feedsStatSupp = new javax.swing.JMenuItem();
        SuppliersPayStat = new javax.swing.JMenuItem();
        incStatementSupplier = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        cashIn = new javax.swing.JMenuItem();
        cashIn_Reports = new javax.swing.JMenuItem();
        jmenu = new javax.swing.JMenu();
        cashOut = new javax.swing.JMenuItem();
        CashOut_Report = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        stockNew = new javax.swing.JMenuItem();
        stockReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Vuna Feeds POS");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(110, 189, 235), null));

        sales.setText("Sales");
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });

        creditors.setText("Suppliers");
        creditors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditorsActionPerformed(evt);
            }
        });

        Customers.setText("Customers");
        Customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomersActionPerformed(evt);
            }
        });

        purchases.setText("Purchases");
        purchases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchasesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18));
        jLabel1.setForeground(new java.awt.Color(110, 189, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Main Menu");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sales, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(creditors, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchases, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Customers, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sales)
                .addGap(18, 18, 18)
                .addComponent(purchases)
                .addGap(18, 18, 18)
                .addComponent(creditors)
                .addGap(18, 18, 18)
                .addComponent(Customers)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        forSwapping.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(110, 189, 235), null));

        javax.swing.GroupLayout forSwappingLayout = new javax.swing.GroupLayout(forSwapping);
        forSwapping.setLayout(forSwappingLayout);
        forSwappingLayout.setHorizontalGroup(
            forSwappingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        forSwappingLayout.setVerticalGroup(
            forSwappingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(110, 189, 235), null));

        NewSale.setText("New Sale");
        NewSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSaleActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18));
        jLabel3.setForeground(new java.awt.Color(110, 189, 235));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quick links");
        jLabel3.setOpaque(true);

        inCash.setText("Cash In");
        inCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inCashActionPerformed(evt);
            }
        });

        outCash.setText("Cash Out");
        outCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outCashActionPerformed(evt);
            }
        });

        NewPurchase.setText("New Purchase");
        NewPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPurchaseActionPerformed(evt);
            }
        });

        Stock.setText("New Stock");
        Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(outCash, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(inCash, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(NewPurchase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(NewSale, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Stock, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NewSale)
                .addGap(18, 18, 18)
                .addComponent(NewPurchase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Stock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(inCash)
                .addGap(18, 18, 18)
                .addComponent(outCash)
                .addContainerGap())
        );

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Developed by Magondu Njenga 2012 @Copyright");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(forSwapping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(forSwapping, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(110, 189, 235));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vuna Feeds");
        jLabel2.setOpaque(true);

        salesMenu.setText("Sales");

        NewSaleMenu.setText("New");
        NewSaleMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSaleMenuActionPerformed(evt);
            }
        });
        salesMenu.add(NewSaleMenu);

        ViewPrevMenu.setText("View Previous");
        ViewPrevMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPrevMenuActionPerformed(evt);
            }
        });
        salesMenu.add(ViewPrevMenu);

        menu.add(salesMenu);

        purchasesMenu.setText("Purchases");

        jMenuItem3.setText("New");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        purchasesMenu.add(jMenuItem3);

        jMenuItem4.setText("View Previous");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        purchasesMenu.add(jMenuItem4);

        menu.add(purchasesMenu);

        productMenu.setText("Products");
        productMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productMenuActionPerformed(evt);
            }
        });

        jMenuItem5.setText("New");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        productMenu.add(jMenuItem5);

        productReports.setText("Open previous");
        productReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productReportsActionPerformed(evt);
            }
        });
        productMenu.add(productReports);

        menu.add(productMenu);

        debtorMenu.setText("Customers");

        jMenuItem6.setText("New");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        debtorMenu.add(jMenuItem6);

        jMenuItem7.setText("View current");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        debtorMenu.add(jMenuItem7);

        jMenuItem8.setText("Feeds Statement");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        debtorMenu.add(jMenuItem8);

        CustomerPayStat.setText("Payment Statement");
        CustomerPayStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerPayStatActionPerformed(evt);
            }
        });
        debtorMenu.add(CustomerPayStat);

        incStatement.setText("Inclusive Statement");
        incStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incStatementActionPerformed(evt);
            }
        });
        debtorMenu.add(incStatement);

        menu.add(debtorMenu);

        creditorMenu.setText("Suppliers");

        jMenuItem9.setText("New");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        creditorMenu.add(jMenuItem9);

        jMenuItem10.setText("View existing");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        creditorMenu.add(jMenuItem10);

        feedsStatSupp.setText("Feeds Statement");
        feedsStatSupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedsStatSuppActionPerformed(evt);
            }
        });
        creditorMenu.add(feedsStatSupp);

        SuppliersPayStat.setText("Payment Statement");
        SuppliersPayStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuppliersPayStatActionPerformed(evt);
            }
        });
        creditorMenu.add(SuppliersPayStat);

        incStatementSupplier.setText("Inclusive Statement");
        incStatementSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incStatementSupplierActionPerformed(evt);
            }
        });
        creditorMenu.add(incStatementSupplier);

        menu.add(creditorMenu);

        jMenu1.setText("Cash In");

        cashIn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, 0));
        cashIn.setText("Open");
        cashIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashInActionPerformed(evt);
            }
        });
        jMenu1.add(cashIn);

        cashIn_Reports.setText("Reports");
        cashIn_Reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashIn_ReportsActionPerformed(evt);
            }
        });
        jMenu1.add(cashIn_Reports);

        menu.add(jMenu1);

        jmenu.setText("Cash Out");
        jmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuActionPerformed(evt);
            }
        });

        cashOut.setText("Open");
        cashOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashOutActionPerformed(evt);
            }
        });
        jmenu.add(cashOut);

        CashOut_Report.setText("Reports");
        CashOut_Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashOut_ReportActionPerformed(evt);
            }
        });
        jmenu.add(CashOut_Report);

        menu.add(jmenu);

        jMenu3.setText("Stock");

        stockNew.setText("New Entry");
        stockNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockNewActionPerformed(evt);
            }
        });
        jMenu3.add(stockNew);

        stockReport.setText("Report");
        stockReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockReportActionPerformed(evt);
            }
        });
        jMenu3.add(stockReport);

        menu.add(jMenu3);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesActionPerformed
        forSwapping.removeAll();
        forSwapping.validate();
        SaleRecordsPanel win = new SaleRecordsPanel();
        forSwapping.setLayout(new GridLayout());
        forSwapping.setBackground(Color.WHITE);
        forSwapping.add(win,BorderLayout.CENTER);
        forSwapping.validate();
        
}//GEN-LAST:event_salesActionPerformed

    private void creditorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditorsActionPerformed
       forSwapping.removeAll();
       forSwapping.validate();
       SuppliersPanel win = new SuppliersPanel();        
       forSwapping.setLayout(new GridLayout());
       forSwapping.setBackground(Color.WHITE);
       forSwapping.add(win,BorderLayout.CENTER);
       forSwapping.validate();
}//GEN-LAST:event_creditorsActionPerformed

    private void CustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomersActionPerformed
       forSwapping.removeAll();
       forSwapping.validate();
       DebtorsListPanel win = new DebtorsListPanel();        
       forSwapping.setLayout(new GridLayout());
       forSwapping.setBackground(Color.WHITE);
       forSwapping.add(win,BorderLayout.CENTER);
       forSwapping.validate();
      
       
}//GEN-LAST:event_CustomersActionPerformed

    private void purchasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchasesActionPerformed
        forSwapping.removeAll();
       forSwapping.validate();
       PurchaseRecordsPanel win = new PurchaseRecordsPanel();        
       forSwapping.setLayout(new GridLayout());
       forSwapping.setBackground(Color.WHITE);
       forSwapping.add(win,BorderLayout.NORTH);
       forSwapping.validate();
      
}//GEN-LAST:event_purchasesActionPerformed

    private void NewSaleMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSaleMenuActionPerformed
        Sale_Table win = new Sale_Table();
        win.setVisible(true);       // TODO add your handling code here:
}//GEN-LAST:event_NewSaleMenuActionPerformed

    private void ViewPrevMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPrevMenuActionPerformed
        SaleRecords win = new SaleRecords();
        win.setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_ViewPrevMenuActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Purchases win = new Purchases();
        win.setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        PurchaseRecords win = new PurchaseRecords();
        win.setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Product win = new Product();
        win.setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_jMenuItem5ActionPerformed

    private void productMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productMenuActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_productMenuActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Debtor win = new Debtor();
        win.setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        DebtorsList win = new DebtorsList();
        win.setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Statement_Debtor win = new Statement_Debtor();
        win.setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Creditors win = new Creditors();
        win.setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        CreditorsList win = new CreditorsList();
        win.setVisible(true); // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem10ActionPerformed

    private void feedsStatSuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedsStatSuppActionPerformed
        Statement_Creditor win = new Statement_Creditor();
        win.setVisible(true);
}//GEN-LAST:event_feedsStatSuppActionPerformed

    private void inCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inCashActionPerformed
      CustomerPayment win = new CustomerPayment();
      win.setVisible(true);
    }//GEN-LAST:event_inCashActionPerformed

    private void outCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outCashActionPerformed
        SupplierPayment win = new SupplierPayment();
        win.setVisible(true);
        
    }//GEN-LAST:event_outCashActionPerformed

    private void NewSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSaleActionPerformed
    Sale_Table win = new Sale_Table();
    win.setVisible(true);
    }//GEN-LAST:event_NewSaleActionPerformed

    private void NewPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPurchaseActionPerformed
       Purchases win = new Purchases();
       win.setVisible(true);
    }//GEN-LAST:event_NewPurchaseActionPerformed

    private void cashInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashInActionPerformed
    CustomerPayment win = new CustomerPayment();
    win.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_cashInActionPerformed

    private void cashOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashOutActionPerformed
        SupplierPayment win = new SupplierPayment();
        win.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_cashOutActionPerformed

    private void SuppliersPayStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuppliersPayStatActionPerformed
        PaymentOut_statement win = new PaymentOut_statement();
        win.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_SuppliersPayStatActionPerformed

    private void CustomerPayStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerPayStatActionPerformed
        PaymentIn_Statement win = new PaymentIn_Statement();
        win.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerPayStatActionPerformed

    private void StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockActionPerformed
        Stock_New win = new Stock_New();
        win.setVisible(true);
    }//GEN-LAST:event_StockActionPerformed

    private void productReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productReportsActionPerformed
        Product_ReportNew win = new Product_ReportNew();
        win.setVisible(true);
    }//GEN-LAST:event_productReportsActionPerformed

    private void cashIn_ReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashIn_ReportsActionPerformed
        CashIn_Report win = new CashIn_Report();
        win.setVisible(true);
    }//GEN-LAST:event_cashIn_ReportsActionPerformed

    private void jmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuActionPerformed
        
    }//GEN-LAST:event_jmenuActionPerformed

    private void CashOut_ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashOut_ReportActionPerformed
         CashOut_Report win = new CashOut_Report();
        win.setVisible(true);
    }//GEN-LAST:event_CashOut_ReportActionPerformed

    private void stockReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockReportActionPerformed
        Stock_Archives win = new Stock_Archives();
        win.setVisible(true);
    }//GEN-LAST:event_stockReportActionPerformed

    private void stockNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockNewActionPerformed
       Stock_New win = new Stock_New();
        win.setVisible(true);
    }//GEN-LAST:event_stockNewActionPerformed

    private void incStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incStatementActionPerformed
        Statement_ForTest win = new Statement_ForTest();
        win.setVisible(true);
    }//GEN-LAST:event_incStatementActionPerformed

    private void incStatementSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incStatementSupplierActionPerformed
        Statement_InclusivePurchases win = new Statement_InclusivePurchases();
        win.setVisible(true);
    }//GEN-LAST:event_incStatementSupplierActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CashOut_Report;
    private javax.swing.JMenuItem CustomerPayStat;
    private javax.swing.JButton Customers;
    private javax.swing.JButton NewPurchase;
    private javax.swing.JButton NewSale;
    private javax.swing.JMenuItem NewSaleMenu;
    private javax.swing.JButton Stock;
    private javax.swing.JMenuItem SuppliersPayStat;
    private javax.swing.JMenuItem ViewPrevMenu;
    private javax.swing.JMenuItem cashIn;
    private javax.swing.JMenuItem cashIn_Reports;
    private javax.swing.JMenuItem cashOut;
    private javax.swing.JMenu creditorMenu;
    private javax.swing.JButton creditors;
    private javax.swing.JMenu debtorMenu;
    private javax.swing.JMenuItem feedsStatSupp;
    private javax.swing.JPanel forSwapping;
    private javax.swing.JButton inCash;
    private javax.swing.JMenuItem incStatement;
    private javax.swing.JMenuItem incStatementSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenu jmenu;
    private javax.swing.JMenuBar menu;
    private javax.swing.JButton outCash;
    private javax.swing.JMenu productMenu;
    private javax.swing.JMenuItem productReports;
    private javax.swing.JButton purchases;
    private javax.swing.JMenu purchasesMenu;
    private javax.swing.JButton sales;
    private javax.swing.JMenu salesMenu;
    private javax.swing.JMenuItem stockNew;
    private javax.swing.JMenuItem stockReport;
    // End of variables declaration//GEN-END:variables
}