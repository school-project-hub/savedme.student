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
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static login.myprofile.address;
import static login.myprofile.birth;
import static login.myprofile.email;
import static login.myprofile.fullname;
import static login.myprofile.gender;
import static login.myprofile.phone;
import static login.myprofile.role;
import static login.n_datas.m_profit;
import static login.n_datas.m_recievable;
import static login.n_datas.n_datas_table;
import static login.n_datas.n_fullname;
import static login.n_datas.n_id;
import static login.n_datas.n_ref;
import static login.n_datas.n_total;
import net.proteanit.sql.DbUtils;
import java.text.ParseException;

/**
 *
 * @author lenovo
 */
public class adminpanel extends javax.swing.JFrame {
Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    String sql = null;
    PreparedStatement pst = null;
  
    String filename = null;
    byte[] person_image = null;
    float assets;
    /**
     * Creates new form adminpanel
     */
    public adminpanel() {
        initComponents();
        conn = connector.connectiondb();
        this.setLocationRelativeTo(null);
        invoice_table();
        datas();

        
     ImageIcon myimage62 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("savedme-logo.JPG")));     
     Image img11 = myimage62.getImage();
     Image img12 = img11.getScaledInstance(jLabel7.getWidth(),jLabel7.getHeight(), Image.SCALE_SMOOTH);
     ImageIcon e = new ImageIcon(img12);
    jLabel7.setIcon(e);
    ImageIcon myimage62a = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("setting.png")));     
     Image img11a = myimage62a.getImage();
    Image img12a = img11a.getScaledInstance(setting.getWidth(),setting.getHeight(), Image.SCALE_SMOOTH);
     ImageIcon ex = new ImageIcon(img12a);
    setting.setIcon(ex);
    

   
    try{
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");

            String sq = "select sum(cash) as total  from invoice ";
            pst = conn.prepareStatement(sq);           
            rs = pst.executeQuery();
            
            if(rs.next()){   
                
              String add2=rs.getString("total");
              float a = Float.parseFloat(add2);
              NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
              String val = nf.format(a);
              total.setText(val);   
            }
            
        }catch (ClassNotFoundException | SQLException n)
        {
        } 
    
    
    }
    private void invoice_table(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");
        String sql = "Select invoice.date as DATE, invoice.invoice_no AS INVOICE,  concat(shop.shopname,' - ', invoice.shopid) AS SHOP, invoice.refno AS REFERENCE, invoice.signed AS SIGNED, invoice.cash AS CASH from invoice INNER JOIN shop where invoice.shipto = 'USTP Accounting Office' AND invoice.shopid = shop.shopid GROUP BY invoice.invoice_no ORDER BY invoice.invoice_no desc ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        invoice_table.setModel(DbUtils.resultSetToTableModel(rs));
    
    }catch (ClassNotFoundException | SQLException v){
        JOptionPane.showMessageDialog(null, v);}}
    
    //bydate
    private void invoice_table2(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");
        String sql = "Select invoice.date as DATE, invoice.invoice_no AS INVOICE,  concat(shop.shopname,' - ', invoice.shopid) AS SHOP, invoice.refno AS REFERENCE, invoice.signed AS SIGNED, invoice.cash AS CASH from invoice INNER JOIN shop where invoice.shipto = 'USTP Accounting Office' AND invoice.shopid = shop.shopid AND invoice.date = ? GROUP BY invoice.invoice_no ORDER BY invoice.invoice_no desc ";
        
        pst = con.prepareStatement(sql);
        pst.setString(1,((JTextField)bydate.getDateEditor().getUiComponent()).getText());

          rs = pst.executeQuery();             
          invoice_table.setModel(DbUtils.resultSetToTableModel(rs));

          
    
    }catch (ClassNotFoundException | SQLException v){
        JOptionPane.showMessageDialog(null, v);}}

    //datas
    private void datas(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");
        String sql = "select distinct id AS ID, concat(fname,' ',mname,' ',lname) as NAME, sum(cash_in.amount) AS ASSETS, shares as SHARES from people inner join cash_in where people.id = cash_in.student group by cash_in.student ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        datas.setModel(DbUtils.resultSetToTableModel(rs));
    
    }catch (ClassNotFoundException | SQLException v){
        JOptionPane.showMessageDialog(null, v);}}
   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bydate = new com.toedter.calendar.JDateChooser();
        go = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        profit = new javax.swing.JLabel();
        asset = new javax.swing.JLabel();
        gross = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        setting = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myid.setFont(new java.awt.Font("Tempus Sans ITC", 0, 10)); // NOI18N
        myid.setText("ID");
        jPanel1.add(myid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, -1));

        profilepic.setText("profile");
        profilepic.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 51)));
        jPanel1.add(profilepic, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 120));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("My Profile");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Logout");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 50, -1));

        jButton2.setBackground(new java.awt.Color(0, 204, 51));
        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButton2.setText("+ Student");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, 40));

        jButton3.setBackground(new java.awt.Color(204, 204, 0));
        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButton3.setText("+ Employee");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, 40));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("STUDENTS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 90, 20));

        datas.setAutoCreateRowSorter(true);
        datas.setBackground(new java.awt.Color(153, 255, 153));
        datas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "ID", "Asset", "%", "Earned"
            }
        ));
        datas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(datas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 550, 220));

        invoice_table.setBackground(new java.awt.Color(255, 255, 153));
        invoice_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Shop", "Invoice"
            }
        ));
        jScrollPane3.setViewportView(invoice_table);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 1070, 280));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("SYSTEM MINING");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 20, 210, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Invoice REPORT");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 170, -1));

        jButton4.setBackground(new java.awt.Color(0, 51, 255));
        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("+ Shop");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 130, 40));

        jButton5.setBackground(new java.awt.Color(102, 102, 255));
        jButton5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("+ Invoice");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 130, 30));

        jButton7.setBackground(new java.awt.Color(102, 102, 255));
        jButton7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("+ Cash");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 130, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/savedme-logo.JPG"))); // NOI18N
        jLabel7.setText("logo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 614, 130, 50));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        jLabel8.setText("REFRESH PAGE");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 90, -1));

        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.setText("0.00");
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 650, 70, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Total :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1114, 650, 50, -1));

        bydate.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(bydate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 140, 30));

        go.setBackground(new java.awt.Color(255, 255, 255));
        go.setText("Go");
        go.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        jPanel1.add(go, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 40, 30));

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        jLabel9.setText("MINIMIZE");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1184, 10, 60, -1));

        profit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        profit.setForeground(new java.awt.Color(0, 153, 51));
        profit.setText("0000");
        jPanel1.add(profit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 120, 30));

        asset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        asset.setText("0000");
        jPanel1.add(asset, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 120, 30));

        gross.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gross.setForeground(new java.awt.Color(0, 0, 204));
        gross.setText("0000");
        jPanel1.add(gross, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 120, 30));

        jLabel16.setText("PROFIT  :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 60, 30));

        jLabel17.setText("ASSET    :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 60, 30));

        jLabel18.setText("GROSS   :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 60, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("AC");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 80, -1));

        jButton8.setBackground(new java.awt.Color(51, 51, 51));
        jButton8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Withdraw");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 130, 30));

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel10.setText("Settings");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel10MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, 20));

        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/setting.png"))); // NOI18N
        setting.setText("icon");
        jPanel1.add(setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 20, 20));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1250, 680));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        cash_in b = new cash_in();
        b.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
invoice_table();  
 datas();


try{
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");

            String sq = "select sum(cash) as total  from invoice ";
            pst = conn.prepareStatement(sq);           
            rs = pst.executeQuery();
            
            if(rs.next()){   
                
              String add2=rs.getString("total");
              total.setText(add2);   
            }
            
        }catch (ClassNotFoundException | SQLException n)
        {
        } 
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
if(JOptionPane.showConfirmDialog(null,"Are you sure?","LOGOUT",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);}
        else
        {}        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       
        myprofile p = new myprofile();
            p.setVisible(true);
            
    try{

              byte[] imageBytes;
              Image image;
      
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");

            String sq = "select role, concat(fname,' ',mname,' ',lname) as fullname, gender, birth, phone, email, concat(address.zipcode,' - ',address.city,', ',address.province) as address from people inner join address where  id= ? and address.zipcode = people.zipcode ";
            pst = conn.prepareStatement(sq);
            pst.setString(1, myid.getText());

            rs = pst.executeQuery();

            if(rs.next()){

                String add1=rs.getString("fullname");
                fullname.setText(add1);

                String add2=rs.getString("gender");
                gender.setText(add2);

                String add3=rs.getString("birth");
                birth.setText(add3);

                String add4=rs.getString("phone");
                phone.setText(add4);

                String add=rs.getString("email");
                email.setText(add);

                String add6=rs.getString("address");
                address.setText(add6);
                
                String add7=rs.getString("role");
                role.setText(add7);

          
            }

        }catch (ClassNotFoundException | SQLException eo)
        {
            JOptionPane.showMessageDialog(null ,eo);
        }       
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
addstudent a = new addstudent();
a.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        employee a = new employee();
a.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        addshop a = new addshop();
a.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
invoice a = new invoice();
a.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
      invoice_table2();
      
      
  
 try{
      Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");
            String sql = " Select sum(invoice.cash) as totalp, invoice.date as DATE, invoice.invoice_no AS INVOICE,  concat(shop.shopname,' - ', invoice.shopid) AS SHOP, invoice.refno AS REFERENCE, invoice.signed AS SIGNED, invoice.cash AS CASH from invoice INNER JOIN shop where invoice.shipto = 'USTP Accounting Office' AND invoice.shopid = shop.shopid AND invoice.date = ?  ";
             pst = con.prepareStatement(sql);
        pst.setString(1,((JTextField)bydate.getDateEditor().getUiComponent()).getText());

          rs = pst.executeQuery(); 
            
            if(rs.next()){   
                
               String add2=rs.getString("totalp");
              // float a = 0;
             //  a = Float.parseFloat(add2);
             // NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
//              String val = nf.format(add2);
              total.setText(add2); 
            }
            
        }catch (ClassNotFoundException | SQLException n)
        {
        } 
    
    }//GEN-LAST:event_goActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
this.setState(JFrame.ICONIFIED);          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void datasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datasMouseClicked
        try{
            int row = datas.getSelectedRow();
            String click = (datas.getModel().getValueAt(row, 0).toString());
            String sql = "select cash_in.date as Date,  cash_in.amount as Amount from cash_in inner join people where people.id = '"+click+"' and cash_in.reference = people.reference order by date desc ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            n_datas a = new n_datas();
            a.setVisible(true);
            n_datas_table.setModel(DbUtils.resultSetToTableModel(rs)); 

        }catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
        
        try{
            int row = datas.getSelectedRow();
            String click = (datas.getModel().getValueAt(row, 0).toString());
            String sql = "select cash_in.student as ids, concat(people.fname,' ',people.mname,' ',people.lname) as fullname, cash_in.reference as ref  from cash_in inner join people where people.id = '"+click+"' and cash_in.reference = people.reference ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                
                String add3=rs.getString("ids");
                n_id.setText(add3);

                String add4=rs.getString("fullname");
                n_fullname.setText(add4);

                String add5=rs.getString("ref");
                n_ref.setText(add5);

      


            }

        }catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
        try{
            int row = datas.getSelectedRow();
            String click = (datas.getModel().getValueAt(row, 0).toString());
            String sql = "select  sum(cash_in.amount) as n_sum  from cash_in inner join people where people.id = '"+click+"' and cash_in.reference = people.reference ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {                             
              String add2=rs.getString("n_sum");
              float a = Float.parseFloat(add2);
              NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
              String val = nf.format(a);
              n_total.setText(val); 
              
              
              float ans = (float) (a * 0.2);
              NumberFormat nf2 = NumberFormat.getInstance(new Locale("en", "US"));
              String val2 = nf2.format(ans);
              m_profit.setText(val2);
           
              float ans2 = (float) (a + ans);
              NumberFormat nf3 = NumberFormat.getInstance(new Locale("en", "US"));
              String val3 = nf3.format(ans2);
              m_recievable.setText(val3);


      


            }

        }catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_datasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //mining asset
     try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");

            String sq = " select sum(amount) as asset from cash_in ";
            pst = conn.prepareStatement(sq);
           // pst.setString(1, yyyy.getText());
            //pst.setString(2, mm.getText());

            rs = pst.executeQuery();

            if(rs.next()){    
                
              String add2=rs.getString("asset");
              if(add2 == null){
                  
              }else{
              assets = Float.parseFloat(add2);
              NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
              String val = nf.format(assets);
              asset.setText(val);
            }}

        }catch (ClassNotFoundException | SQLException x)
        {
            JOptionPane.showMessageDialog(null ,x);
        }
     //gross
     try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");

            String sq = " select sum(cash) as gross from invoice ";
            pst = conn.prepareStatement(sq);

            rs = pst.executeQuery();

            if(rs.next()){ 

               String add2=rs.getString("gross");
               if(add2 == null){
                   
               }else{
              float a = Float.parseFloat(add2);
              NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
              String val = nf.format(a);
              gross.setText(val);
              
              float prof = a-assets;
              
              NumberFormat nf2 = NumberFormat.getInstance(new Locale("en", "US"));
              String val2 = nf2.format(prof);
              profit.setText(val2);
            }}

        }catch (ClassNotFoundException | SQLException xd)
        {
            JOptionPane.showMessageDialog(null ,xd);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
   
        cashout p = new cashout();
        p.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered

    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
 
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseReleased

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
      settings p = new settings();
        p.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asset;
    private com.toedter.calendar.JDateChooser bydate;
    public static final javax.swing.JTable datas = new javax.swing.JTable();
    private javax.swing.JButton go;
    private javax.swing.JLabel gross;
    public static final javax.swing.JTable invoice_table = new javax.swing.JTable();
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    public static final transient javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static final javax.swing.JLabel myid = new javax.swing.JLabel();
    public static final javax.swing.JLabel profilepic = new javax.swing.JLabel();
    private javax.swing.JLabel profit;
    private javax.swing.JLabel setting;
    public static final javax.swing.JLabel total = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
