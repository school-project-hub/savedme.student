/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author lenovo
 */
public class employee_page extends javax.swing.JFrame {

  Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    String sql = null;
    PreparedStatement pst = null;
    String filename = null;
    byte[] person_image = null;
    public employee_page() {
        super("savedme_db");
        initComponents();
        
        conn = connector.connectiondb();
        this.setLocationRelativeTo(null);
        transaction_phase.setVisible(false);
        shop_phase1.setVisible(false);
        loginhistory.setVisible(false);
        //itemsJTable();

        
      ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("shop.png")));     
      Image img = myimage.getImage();
      Image img1 = img.getScaledInstance(ephoto.getWidth(),ephoto.getHeight(), Image.SCALE_SMOOTH);
      ImageIcon e = new ImageIcon(img1);
    ephoto.setIcon(e);
    
    ImageIcon myimage62 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("savedme-logo.JPG")));     
      Image img11 = myimage62.getImage();
      Image img12 = img11.getScaledInstance(jLabel11.getWidth(),jLabel11.getHeight(), Image.SCALE_SMOOTH);
      ImageIcon de = new ImageIcon(img12);
    jLabel11.setIcon(de);

    Image img124 = img11.getScaledInstance(jLabel8.getWidth(),jLabel8.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon de1 = new ImageIcon(img124);
    jLabel8.setIcon(de1);
    Image img1245 = img11.getScaledInstance(jLabel7.getWidth(),jLabel7.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon de1a = new ImageIcon(img1245);
    jLabel7.setIcon(de1a);
    
    }
    
public final void itemsJTable(){
        MyQuerybuy mq = new MyQuerybuy();
        ArrayList<Product2> list = mq.BindTable();
        String[] columnName = {"IMAGE","RF", "ITEM", "PRICE"};
        Object[][] rows = new Object[list.size()][6];
        for(int i = 0; i < list.size(); i++){
            
            rows[i][1] = list.get(i).getStockN();
            rows[i][2] = list.get(i).getItem();
            rows[i][3] = list.get(i).getPrice();
            
            if(list.get(i).getMyImage() != null){
                
             ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMyImage()).getImage()
             .getScaledInstance(100, 80, Image.SCALE_SMOOTH) );   
                
            rows[i][0] = image;
            }
            
        }
        
        TheModel model = new TheModel(rows, columnName);
        tbl_items.setModel(model);
        tbl_items.setRowHeight(40);
        tbl_items.getColumnModel().getColumn(3).setPreferredWidth(150);
    }
//catgory
public final void itemsJTable2(){
        MyQuerybuy mq = new MyQuerybuy();
        ArrayList<Product1> list = mq.BindTable1();
        String[] columnName = {"IMAGE","RF", "ITEM", "PRICE"};
        Object[][] rows = new Object[list.size()][6];
        for(int i = 0; i < list.size(); i++){
            
            rows[i][1] = list.get(i).getStockN();
            rows[i][2] = list.get(i).getItem();
            rows[i][3] = list.get(i).getPrice();
            
            if(list.get(i).getMyImage() != null){
                
             ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMyImage()).getImage()
             .getScaledInstance(100, 80, Image.SCALE_SMOOTH) );   
                
            rows[i][0] = image;
            }
            
        }
        
        TheModel model = new TheModel(rows, columnName);
        tbl_items.setModel(model);
        tbl_items.setRowHeight(40);
        tbl_items.getColumnModel().getColumn(3).setPreferredWidth(150);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shop_phase1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        loginhistory = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel15 = new javax.swing.JLabel();
        transaction_phase = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        e_total = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ephoto = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shop_phase1.setBackground(new java.awt.Color(204, 255, 255));
        shop_phase1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        shop_phase1.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/savedme-logo.JPG"))); // NOI18N
        jLabel8.setText("logo");
        shop_phase1.add(jLabel8);
        jLabel8.setBounds(180, 470, 160, 40);

        tbl_items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_itemsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_items);

        shop_phase1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 110, 330, 350);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel4.setText("SHOP");
        shop_phase1.add(jLabel4);
        jLabel4.setBounds(10, 10, 90, 14);

        jComboBoxCateg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxCateg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Viand", "Drinks", "Water", "Snacks", "Bread", "School Supplies", "LOAD" }));
        jComboBoxCateg.setToolTipText("");
        jComboBoxCateg.setName(""); // NOI18N
        jComboBoxCateg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCategItemStateChanged(evt);
            }
        });
        jComboBoxCateg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxCategMouseClicked(evt);
            }
        });
        jComboBoxCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategActionPerformed(evt);
            }
        });
        shop_phase1.add(jComboBoxCateg);
        jComboBoxCateg.setBounds(110, 70, 230, 30);

        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jButton4.setText("ADD ITEM");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        shop_phase1.add(jButton4);
        jButton4.setBounds(10, 30, 90, 30);

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Manage Item");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        shop_phase1.add(jButton5);
        jButton5.setBounds(110, 30, 110, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Category: ");
        shop_phase1.add(jLabel22);
        jLabel22.setBounds(20, 70, 80, 30);

        getContentPane().add(shop_phase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 350, 520));

        loginhistory.setBackground(new java.awt.Color(204, 204, 204));
        loginhistory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_loginhistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbl_loginhistory);

        loginhistory.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 330, 470));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel15.setText("LOGIN HISTORY");
        loginhistory.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(loginhistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 350, 520));

        transaction_phase.setBackground(new java.awt.Color(255, 255, 255));
        transaction_phase.setLayout(null);

        jLabel7.setText("logo");
        transaction_phase.add(jLabel7);
        jLabel7.setBounds(180, 470, 160, 40);

        tbl_transaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_transaction);

        transaction_phase.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 330, 400);

        e_total.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        e_total.setText("0.00");
        transaction_phase.add(e_total);
        e_total.setBounds(250, 440, 90, 14);

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel17.setText("TOTAL: ");
        transaction_phase.add(jLabel17);
        jLabel17.setBounds(190, 440, 50, 14);

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel18.setText("MY TRANSACTIONS");
        transaction_phase.add(jLabel18);
        jLabel18.setBounds(10, 10, 140, 14);

        getContentPane().add(transaction_phase, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 350, 520));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButton1.setText("Transaction");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 100, 40));

        shopname.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        shopname.setForeground(new java.awt.Color(255, 255, 255));
        shopname.setText("No Record");
        jPanel1.add(shopname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 220, 20));

        shopid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        shopid.setForeground(new java.awt.Color(255, 255, 255));
        shopid.setText("No Record");
        jPanel1.add(shopid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 110, 20));

        myid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        myid.setForeground(new java.awt.Color(255, 255, 255));
        myid.setText("ID");
        jPanel1.add(myid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 110, 20));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButton2.setText("My Account");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButton3.setText("shop");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        jButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jButton3ItemStateChanged(evt);
            }
        });
        jButton3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton3StateChanged(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 100, 40));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("LOGOUT");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 60, 20));

        jLabel11.setText("logo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 160, 40));

        jLabel1.setText("First Name ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        fname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setText("Name");
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 290, 30));

        mname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mname.setForeground(new java.awt.Color(255, 255, 255));
        mname.setText("Name");
        jPanel1.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 290, 30));

        jLabel5.setText("Middle Name ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel6.setText("Last Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        lname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setText("Name");
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 290, 30));

        birth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        birth.setForeground(new java.awt.Color(255, 255, 255));
        birth.setText("Name");
        jPanel1.add(birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 290, 30));

        jLabel13.setText("Birth Date");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jLabel14.setText("Sex");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setText("Name");
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 290, 30));

        jLabel16.setText("Phone Number");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.setText("Name");
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 290, 30));

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Name");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 290, 30));

        jLabel19.setText("Email Address");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("                          Change Password");
        jLabel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 330, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("LOGIN HISTORY");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 255, 204));
        jLabel12.setText("MY ACCOUNT");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("EMPLOYEE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        ephoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/shop.png"))); // NOI18N
        ephoto.setText("photo");
        jPanel1.add(ephoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 130));

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 330, 390));

        jLabel21.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        jLabel21.setText("MINIMIZE");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 523));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
          config p = new config();
       p.setVisible(true);
       
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  transaction_phase.setVisible(true);
        shop_phase1.setVisible(false);
        loginhistory.setVisible(false);
  
    try{
      Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");
        String sql = " select invoice.invoice_no ,shop.shopname, invoice.cash, invoice.date from shop inner join invoice where invoice.shopid = ? and invoice.shopid = shop.shopid order by invoice.date desc ";
        pst = con.prepareStatement(sql);
        pst.setString(1,shopid.getText());
        rs = pst.executeQuery();      
        tbl_transaction.setModel(DbUtils.resultSetToTableModel(rs));
                      
        }catch (ClassNotFoundException | SQLException n)
        {
        } 
       
      //calculate
       try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");
        String sqlx = "select  sum(invoice.cash) as n_sum  from invoice inner join shop where invoice.shopid = ? and shop.shopid = invoice.shopid ";
        pst = con.prepareStatement(sqlx);
        pst.setString(1,shopid.getText());
        rs = pst.executeQuery();   
            if(rs.next())
            {                             
              String add2=rs.getString("n_sum");
              float a = Float.parseFloat(add2);
              NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
              String val = nf.format(a);
              e_total.setText(val);             

            }

        }catch(SQLException e){JOptionPane.showMessageDialog(null, e);} catch (ClassNotFoundException ex) {
        Logger.getLogger(studentpage.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       transaction_phase.setVisible(false);
        shop_phase1.setVisible(false);
        loginhistory.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       if(JOptionPane.showConfirmDialog(null,"Are you sure?","LOGOUT",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);}
        else
        {}  
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
transaction_phase.setVisible(false);
        shop_phase1.setVisible(false);
        loginhistory.setVisible(true);
          try{
      Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");
            String sql = " select concat(status,' - ',id) as STATUS, date as DATE from loginhistory where id = ? and status = 'EMPLOYEE' order by date desc ";
             pst = con.prepareStatement(sql);
        pst.setString(1,myid.getText());

          rs = pst.executeQuery(); 
            
            
                
              tbl_loginhistory.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch (ClassNotFoundException | SQLException n)
        {
        } 
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  add_item p = new add_item();
  p.setVisible(true);
               itemsJTable();
  
 try{          
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");

            String sqf = "select stock_no from items order by stock_no desc limit 1 ";
            pst = conn.prepareStatement(sqf);            
            rs = pst.executeQuery();
            
            if(rs.next()){           
            String add12=rs.getString("stock_no");
            int x = Integer.parseInt(add12);
            int y = x+1;
            add_item.stock_no.setText(Integer.toString(y));
                                          
            pst.execute();                        
            }
            
        }catch (ClassNotFoundException | NumberFormatException | SQLException efx)
        {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
transaction_phase.setVisible(false);
        shop_phase1.setVisible(true);
        loginhistory.setVisible(false);     
                     itemsJTable();
   

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jButton3ItemStateChanged
     
    }//GEN-LAST:event_jButton3ItemStateChanged

    private void jComboBoxCategItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCategItemStateChanged
 itemsJTable2(); 
        
    }//GEN-LAST:event_jComboBoxCategItemStateChanged

    private void jComboBoxCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategActionPerformed

    
   
    }//GEN-LAST:event_jComboBoxCategActionPerformed

    private void tbl_itemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_itemsMouseClicked

    }//GEN-LAST:event_tbl_itemsMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  manageitems bc = new manageitems();
  bc.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
     this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jButton3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton3StateChanged

 

    }//GEN-LAST:event_jButton3StateChanged

    private void jComboBoxCategMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxCategMouseClicked
   
    }//GEN-LAST:event_jComboBoxCategMouseClicked

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
            java.util.logging.Logger.getLogger(employee_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JLabel birth = new javax.swing.JLabel();
    private javax.swing.JLabel e_total;
    public static final javax.swing.JLabel email = new javax.swing.JLabel();
    private javax.swing.JLabel ephoto;
    public static final javax.swing.JLabel fname = new javax.swing.JLabel();
    public static final javax.swing.JLabel gender = new javax.swing.JLabel();
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public static final javax.swing.JComboBox<String> jComboBoxCateg = new javax.swing.JComboBox<>();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static final javax.swing.JLabel lname = new javax.swing.JLabel();
    private javax.swing.JPanel loginhistory;
    public static final javax.swing.JLabel mname = new javax.swing.JLabel();
    public static final javax.swing.JLabel myid = new javax.swing.JLabel();
    public static final javax.swing.JLabel phone = new javax.swing.JLabel();
    private javax.swing.JPanel shop_phase1;
    public static final javax.swing.JLabel shopid = new javax.swing.JLabel();
    public static final javax.swing.JLabel shopname = new javax.swing.JLabel();
    public static final javax.swing.JTable tbl_items = new javax.swing.JTable();
    public static final javax.swing.JTable tbl_loginhistory = new javax.swing.JTable();
    public static final javax.swing.JTable tbl_transaction = new javax.swing.JTable();
    private javax.swing.JPanel transaction_phase;
    // End of variables declaration//GEN-END:variables
}
