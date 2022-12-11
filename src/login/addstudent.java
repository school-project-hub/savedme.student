/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class addstudent extends javax.swing.JFrame {
Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    String sql = null;
    PreparedStatement pst = null;
    /**
     * Creates new form addstudent
     */
    public addstudent() {
        initComponents();
        conn = connector.connectiondb();
        this.setLocationRelativeTo(null);
        
        update.setEnabled(false);
        delete.setEnabled(false);
              
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("student.png")));     
      Image img = myimage.getImage();
      Image img1 = img.getScaledInstance(sphoto.getWidth(),sphoto.getHeight(), Image.SCALE_SMOOTH);
      ImageIcon e = new ImageIcon(img1);
    sphoto.setIcon(e);
    
    
    try{
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");

            String sq = "select reference  from people order by reference desc limit 1 ";
            pst = conn.prepareStatement(sq);           
            rs = pst.executeQuery();
            
            if(rs.next()){   
                
              String add1=rs.getString("reference");
                             
                int sum=0;
                int a = Integer.parseInt(add1);
                sum=a+1;
                refno.setText(Integer.toString(sum)); 
            }
            
        }catch (ClassNotFoundException | SQLException b)
        {
        }        
    
    }

  int x,y;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sphoto = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        birth = new com.toedter.calendar.JDateChooser();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        spassword = new javax.swing.JPasswordField();
        show = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("| Go to List");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), null, null));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 90, 20));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 400, -1));

        jLabel3.setText(" ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 30, -1));

        sphoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/student.png"))); // NOI18N
        sphoto.setText("photo");
        jPanel1.add(sphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, 60));

        fname.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 380, 30));

        refno.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        refno.setForeground(new java.awt.Color(255, 255, 255));
        refno.setText("Ref. No.");
        refno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(refno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 250, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Middle Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        mname.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameActionPerformed(evt);
            }
        });
        jPanel1.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 380, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        lname.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 380, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Birth Date");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        phone.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 170, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("First Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Reference No.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("@mail");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, -1, -1));

        email.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 200, 30));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID No.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        idno.setBackground(new java.awt.Color(204, 204, 204));
        idno.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        idno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idnoActionPerformed(evt);
            }
        });
        idno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idnoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idnoKeyReleased(evt);
            }
        });
        jPanel1.add(idno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 380, 30));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jButton1.setText("Register");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 110, 30));

        jLabel14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("+ Student");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        jLabel15.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("X");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 20, -1));

        birth.setDateFormatString("yyyy-MM-dd");
        birth.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jPanel1.add(birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 180, 30));

        female.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 100, -1));

        male.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("N/A or Skip if none.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 110, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("N/A or Skip if none.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 110, 20));

        spassword.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        spassword.setText("Password");
        jPanel1.add(spassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 220, 30));

        show.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setText("show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 60, 30));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Phone");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        delete.setBackground(new java.awt.Color(255, 0, 0));
        delete.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        delete.setText("Delete");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, 110, 30));

        update.setBackground(new java.awt.Color(255, 102, 51));
        update.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        update.setText("Update");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 110, 30));

        jLabel18.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 0));
        jLabel18.setText(" GENERATE");
        jLabel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 0), new java.awt.Color(255, 204, 51), null, null));
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 70, 30));

        jLabel19.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 0));
        jLabel19.setText("| Manage");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(refno.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Reference No. Required.","Invalid",2);
        }
        else if(idno.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Student ID No. is Missing.","Invalid",2);
        }
        else if(fname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "First Name is Required","Invalid",2);
        }

        else if(lname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Last Name is Required","Invalid",2);
        }
        
       
        else if(phone.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Phone Number is Required","Invalid",2);
        }
        else if(spassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Password is Required","Invalid",2);
        }

        else{
            try{

                String Sql= "INSERT INTO `people`(`reference`, `id`, `fname`, `mname`, `lname`, `birth`, `gender`, `phone`, `email`,`role`,`pswrd`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                pst= conn.prepareStatement(Sql);

                String sex = null;
                if(male.isSelected())
                {sex = "MALE";}

                if(female.isSelected())
                {sex = "FEMALE";}
                
                String midname = null;
                if(mname.getText().equals("n/a") || mname.getText().equals("N/A"))
                {midname = " ";}
                else{
                    midname = mname.getText();
                }
                
                String mail = null;
                if(email.getText().equals("n/a") || email.getText().equals("N/A"))
                {mail = " ";}
                else{
                    mail = email.getText();
                }
                
                String role = "Student";

                pst.setString(1, refno.getText());
                pst.setString(2, idno.getText());
                pst.setString(3, fname.getText());
                pst.setString(4,midname);
                pst.setString(5,lname.getText());
                pst.setString(6,((JTextField)birth.getDateEditor().getUiComponent()).getText());
                pst.setString(7,sex);
                pst.setString(8,phone.getText());
                pst.setString(9,mail);
                pst.setString(10,role);
                pst.setString(11,spassword.getText());
                
                
                if(JOptionPane.showConfirmDialog(null,"Are you sure?","Register",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
       {
                pst.execute();

                JOptionPane.showMessageDialog(null,"Done.");

                refno.setText("");
                idno.setText("");
                fname.setText("");
                mname.setText("");
                lname.setText("");
                birth.setDate(null);
                male.setText("");
                female.setText("");
                phone.setText("");
                email.setText("");
                spassword.setText("");
                }
            else
       {
       }}

            catch(SQLException | HeadlessException e){
               JOptionPane.showMessageDialog(null, "ID No. is already taken.","ERROR",2);
            }

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
  if(female.isSelected())
        {male.setSelected(false);}         // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
  if(male.isSelected())
        {female.setSelected(false);}         // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
if (show.isSelected()) {
      spassword.setEchoChar((char)0); //password = JPasswordField
   } else {
      spassword.setEchoChar('*');
   }        // TODO add your handling code here:
    }//GEN-LAST:event_showActionPerformed

    private void idnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idnoKeyReleased
     
     if(idno.getText().equals(""))
        {
            idno.setText("");
            fname.setText("");
            mname.setText("");
            lname.setText("");
            male.setSelected(false);
            female.setSelected(false);
            Date date = null;
            birth .setDate(date);
            phone.setText("");
            email.setText("");
            spassword.setText("");
            refno.setText("");
            update.setEnabled(false);
            delete.setEnabled(false);
        } 
      
        try{

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");

            String sq = "select * from people where id = ? and role = 'Student' ";
            pst = conn.prepareStatement(sq);
            pst.setString(1, idno.getText());

            rs = pst.executeQuery();

            if(rs.next()){
                String add1=rs.getString("id");
                idno.setText(add1);

                String add2=rs.getString("fname");
                fname.setText(add2);

                String add3=rs.getString("mname");
                mname.setText(add3);

                String add4=rs.getString("lname");
                lname.setText(add4);
                
                String add5 =rs.getString("gender");             
                if(add5.equals("MALE"))
                {male.setSelected(true);}

                String add6 =rs.getString("gender");             
                if(add6.equals("FEMALE"))
                {female.setSelected(true);}

                Date add7 =rs.getDate("birth");
                birth.setDate(add7);

                String add8=rs.getString("phone");
                phone.setText(add8);

                String add9=rs.getString("email");
                email.setText(add9);

                String add10=rs.getString("pswrd");
                spassword.setText(add10);

                String add11=rs.getString("reference");
                refno.setText(add11);
                
                update.setEnabled(true);
                delete.setEnabled(true);
            }
            else{
        
            fname.setText("");
            mname.setText("");
            lname.setText("");
            male.setSelected(false);
            female.setSelected(false);
            Date date = null;
            birth .setDate(date);
            phone.setText("");
            email.setText("");
            spassword.setText("");
            refno.setText("");
            update.setEnabled(false);
            delete.setEnabled(false);
            }

        }catch (Exception e)
        {JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_idnoKeyReleased

    private void idnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idnoKeyPressed
                // TODO add your handling code here:
    }//GEN-LAST:event_idnoKeyPressed

    private void idnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idnoActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_idnoActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
          if(JOptionPane.showConfirmDialog(null,"Are you sure?","Delete ",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
       {
        try{  String sql="delete from people where id = ? AND role ='Student' ";
                pst=conn.prepareStatement(sql);
                pst.setString(1,idno.getText());
                pst.execute();               
                JOptionPane.showMessageDialog(null, "Done.!");
               

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);}}
       else
       {
       }    
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        

            try{
                  String value1 = idno.getText();
                String sql = "UPDATE `people` SET `fname`=?,`mname`=?,`lname`=?,`gender`=?,`birth`=?,`phone`=?,`email`=?,`pswrd`=? WHERE id = '"+value1+"' AND role = 'Student' ";
                pst=conn.prepareStatement(sql);
                 
                String sex = null;
                if(male.isSelected())
                {sex = "MALE";}

                if(female.isSelected())
                {sex = "FEMALE";}
                
                 String midname = null;
                if(mname.getText().equals("n/a") || mname.getText().equals("N/A"))
                {midname = " ";}
                else{
                    midname = mname.getText();
                }
                
                String mail = null;
                if(email.getText().equals("n/a") || email.getText().equals("N/A"))
                {mail = " ";}
                else{
                    mail = email.getText();
                }
                
                pst.setString(1,fname.getText());                                        
                pst.setString(2, midname);   
                pst.setString(3, lname.getText()); 
                pst.setString(4, sex);
                pst.setString(5,((JTextField)birth.getDateEditor().getUiComponent()).getText());
                pst.setString(6,phone.getText());
                pst.setString(7,mail);        
                pst.setString(8,spassword.getText());
        if(JOptionPane.showConfirmDialog(null,"Are you sure?","UPDATE",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
       {   
                JOptionPane.showMessageDialog(null, "Update Done.!");
                pst.execute();
       }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        
    }//GEN-LAST:event_updateActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
try{
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");

            String sq = "select reference  from people order by reference desc limit 1 ";
            pst = conn.prepareStatement(sq);           
            rs = pst.executeQuery();
            
            if(rs.next()){   
                
              String add1=rs.getString("reference");
                             
                int sum=0;
                int a = Integer.parseInt(add1);
                sum=a+1;
                refno.setText(Integer.toString(sum)); 
            }
            
        }catch (ClassNotFoundException | SQLException b)
        {
        }                // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        studentlist a = new studentlist();
        a.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       x = evt.getX();
y= evt.getY(); 
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x,yy-y); 
    }//GEN-LAST:event_jPanel1MouseDragged
    
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
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addstudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser birth;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    public static final javax.swing.JTextField idno = new javax.swing.JTextField();
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mname;
    public static final javax.swing.JTextField phone = new javax.swing.JTextField();
    public static final javax.swing.JLabel refno = new javax.swing.JLabel();
    private javax.swing.JCheckBox show;
    private javax.swing.JPasswordField spassword;
    private javax.swing.JLabel sphoto;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
