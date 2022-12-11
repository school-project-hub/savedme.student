/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static login.adminpanel.profilepic;


/**
 *
 * @author lenovo
 */
public class login extends javax.swing.JFrame {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    String sql = null;
    PreparedStatement pst = null;
    String filename = null;
    byte[] person_image = null;
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        conn = connector.connectiondb();
        this.setLocationRelativeTo(null);
        header_student.setVisible(true);
        header_tp.setVisible(false);
        header_admin.setVisible(false);
        
        
        new Thread(){
            public void run(){
            while(true){
                Date dNow = new Date ( );
            
            SimpleDateFormat ft = new SimpleDateFormat (" hh.mm.ss a");
            String time = ""+ft.format(dNow);
            tym.setText(time);
            }
                }
        }.start();
        
        ImageIcon myimage62 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("smiley.png")));     
      Image img11 = myimage62.getImage();
      Image img12 = img11.getScaledInstance(jLabel8.getWidth(),jLabel8.getHeight(), Image.SCALE_SMOOTH);
      ImageIcon e = new ImageIcon(img12);
    jLabel8.setIcon(e);
        
        ImageIcon myimage62a = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("qiBo8apjT.png")));     
      Image img1a = myimage62a.getImage();
      Image img12a = img1a.getScaledInstance(frame.getWidth(),frame.getHeight(), Image.SCALE_SMOOTH);
      ImageIcon a = new ImageIcon(img12a);
    frame.setIcon(a);
    }

    int x,y;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        header_admin = new javax.swing.JPanel();
        header_student = new javax.swing.JPanel();
        tym = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pswrd = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        header_tp = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        chooser = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        frame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainpanel.setBackground(new java.awt.Color(255, 255, 255));
        mainpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        mainpanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mainpanelMouseDragged(evt);
            }
        });
        mainpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainpanelMousePressed(evt);
            }
        });
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/savedme-logo.JPG"))); // NOI18N
        mainpanel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 350, 79));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("_____________________________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 330, -1));

        mainpanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 111, 360, -1));

        header_admin.setBackground(new java.awt.Color(255, 255, 255));
        header_admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_admin.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        label_admin.setForeground(new java.awt.Color(204, 0, 0));
        label_admin.setText("Administrator login");
        header_admin.add(label_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 220, -1));

        mainpanel.add(header_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 210, 26));

        header_student.setBackground(new java.awt.Color(255, 255, 255));
        header_student.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_student.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        label_student.setForeground(new java.awt.Color(0, 204, 204));
        label_student.setText("Student login");
        header_student.add(label_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 0, 130, -1));

        mainpanel.add(header_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, 26));

        tym.setForeground(new java.awt.Color(102, 102, 102));
        tym.setText("TIME");
        mainpanel.add(tym, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 100, -1));

        user.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        user.setForeground(new java.awt.Color(0, 0, 255));
        user.setText("USERNAME /ID");
        user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userFocusLost(evt);
            }
        });
        mainpanel.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 174, 29));

        pswrd.setForeground(new java.awt.Color(0, 0, 255));
        pswrd.setText("PASSWORD");
        pswrd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pswrdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pswrdFocusLost(evt);
            }
        });
        mainpanel.add(pswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 174, 30));

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Signin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainpanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 80, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Exit");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        mainpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 30, -1));

        header_tp.setBackground(new java.awt.Color(255, 255, 255));
        header_tp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_tp.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        label_tp.setForeground(new java.awt.Color(255, 102, 0));
        label_tp.setText("  E M P L O Y E E");
        header_tp.add(label_tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 0, 170, -1));

        mainpanel.add(header_tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 200, -1));

        jLabel6.setText(" ");
        mainpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 30, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/smiley.png"))); // NOI18N
        mainpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 60, 40));

        chooser.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        chooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STUDENT", "EMPLOYEE", "ADMIN" }));
        chooser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooser.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chooserItemStateChanged(evt);
            }
        });
        mainpanel.add(chooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 110, 20));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel1.setText("Login As:");
        mainpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 60, 40));

        frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/qiBo8apjT.png"))); // NOI18N
        frame.setText("frame");
        frame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameMouseDragged(evt);
            }
        });
        frame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameMousePressed(evt);
            }
        });
        mainpanel.add(frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusGained
 if(user.getText().trim().toUpperCase().equals("USERNAME /ID"))
        {
            user.setText("");
            user.setForeground(Color.BLUE);
        }          // TODO add your handling code here:
    }//GEN-LAST:event_userFocusGained

    private void userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusLost
  if(user.getText().trim().toUpperCase().equals("") || user.getText().trim().toUpperCase().equals("USERNAME"))
   {
       user.setText("USERNAME /ID");
       user.setForeground(Color.BLUE);
   }          // TODO add your handling code here:
    }//GEN-LAST:event_userFocusLost

    private void pswrdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswrdFocusGained
 if(pswrd.getText().trim().toUpperCase().equals("PASSWORD"))
        {
            pswrd.setText("");
            pswrd.setForeground(Color.BLUE);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_pswrdFocusGained

    private void pswrdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswrdFocusLost
 if(pswrd.getText().trim().toUpperCase().equals("") || pswrd.getText().trim().toUpperCase().equals("PASSWORD"))
   {
       pswrd.setText("PASSWORD");
       pswrd.setForeground(Color.BLUE);
   }             // TODO add your handling code here:
    }//GEN-LAST:event_pswrdFocusLost

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
if(JOptionPane.showConfirmDialog(null,"are u sure u want to exit ?","LOGIN PAGE",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

          PreparedStatement st;
        ResultSet rs;
        
        String username = user.getText();
        String password = String.valueOf(pswrd.getPassword());

        if(chooser.getSelectedItem().equals("ADMIN"))
        {
        String query = "SELECT * FROM `people` WHERE `id`= ? AND `pswrd` = ? and role = 'Admin' ";
        
        try {
            st = connector.connectiondb().prepareStatement(query);
            
              st.setString(1, username);
              st.setString(2, password);    
              rs = st.executeQuery();
              
              if (rs.next())
              {              
                 
                  
                  JOptionPane.showMessageDialog(null, "Login Success !","Success",1);
                   
                  adminpanel form = new adminpanel();                      
                  form.setVisible(true);  
                  this.dispose();
                  
                  String Sql= "INSERT INTO `loginhistory`(`id`, `status`) VALUES(?,?)";

              pst= conn.prepareStatement(Sql);
               
                pst.setString(1, user.getText());
                pst.setString(2,chooser.getSelectedItem().toString());
                pst.execute();
              }
              else
              {
                 
                 JOptionPane.showMessageDialog(null, "Invalid Username / Password","Login Error",2);
                 user.setText(null);
                 pswrd.setText(null); 
              }
                        
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
        }}
        
        ////query profile
        
        try{
              byte[] imageBytes;
              Image image;
      
            
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");

            String sq = "select profpic,id  from people where  id= ?";
            pst = conn.prepareStatement(sq);
            pst.setString(1, user.getText());
            
            rs = pst.executeQuery();
            
            if(rs.next()){
            String add11=rs.getString("id");
            adminpanel.myid.setText(add11);
                
            
            imageBytes=rs.getBytes("profpic");
            image=getToolkit().createImage(imageBytes);
            ImageIcon icon =new ImageIcon(image);             
            ImageIcon imageIcon = new ImageIcon (new ImageIcon(image).getImage().getScaledInstance(profilepic.getWidth(),profilepic.getHeight(),Image.SCALE_SMOOTH));
            adminpanel.profilepic.setIcon(imageIcon);
                 
                            
                
                                        
            }
            
        }catch (Exception e)
        {
        }
        
  /////////////student 
  
  if(chooser.getSelectedItem().equals("STUDENT"))
        {
        String query = "SELECT * FROM `people` WHERE `id`= ? AND `pswrd` = ? and role = 'Student' ";
        
        try {
            st = connector.connectiondb().prepareStatement(query);
            
              st.setString(1, username);
              st.setString(2, password);    
              rs = st.executeQuery();
              
              if (rs.next())
              {
                  JOptionPane.showMessageDialog(null, "Login Success !","Success",1);
        
                  studentpage form = new studentpage();                      
                  form.setVisible(true);  
                  this.dispose();
                   String Sql= "INSERT INTO `loginhistory`(`id`, `status`) VALUES(?,?)";

              pst= conn.prepareStatement(Sql);
               
                pst.setString(1, user.getText());
                pst.setString(2,chooser.getSelectedItem().toString());  
                pst.execute();
              }
              else
              {
                 
                 JOptionPane.showMessageDialog(null, "Invalid Username / Password","Login Error",2);
                 user.setText(null);
                 pswrd.setText(null); 
              }
                        
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
        }}
  
   try{
            
      
            
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");

            String sq = "select id, concat(fname,' ',mname,' ',lname) as fullname, reference,fname,mname,lname,gender,birth,phone,email  from people where  id= ?";
            pst = conn.prepareStatement(sq);
            pst.setString(1, user.getText());
            
            rs = pst.executeQuery();
            
            if(rs.next()){
            String add11=rs.getString("id");
            studentpage.myid.setText(add11);
             
           String add12=rs.getString("fullname");
            studentpage.fullname.setText(add12);
            
            String add13=rs.getString("reference");
            studentpage.ref.setText(add13);
            
            String add14=rs.getString("fname");
            studentpage.fname.setText(add14);
            
            String add15=rs.getString("mname");
            studentpage.mname.setText(add15);
            
            String add16=rs.getString("lname");
            studentpage.lname.setText(add16);
            
            String add17=rs.getString("birth");
            studentpage.birth.setText(add17);
            
            String add18=rs.getString("gender");
            studentpage.gender.setText(add18);
            
            String add19=rs.getString("phone");
            studentpage.phone.setText(add19);
            
            String add10=rs.getString("email");
            studentpage.email.setText(add10);
                 
                         
                
                                   
            }
            
        }catch (Exception e)
        {
        }
  /////////////employee
  
  if(chooser.getSelectedItem().equals("EMPLOYEE"))
        {
        String query = "SELECT * FROM `people` WHERE `id`= ? AND `pswrd` = ? and role = 'Employee' ";
        
        try {
            st = connector.connectiondb().prepareStatement(query);
            
              st.setString(1, username);
              st.setString(2, password);    
              rs = st.executeQuery();
              
              if (rs.next())
              {
                  JOptionPane.showMessageDialog(null, "Login Success !","Success",1);
        
                  employee_page form = new employee_page();                      
                  form.setVisible(true);  
                  this.dispose();
                   String Sql= "INSERT INTO `loginhistory`(`id`, `status`) VALUES(?,?)";

              pst= conn.prepareStatement(Sql);
               
                pst.setString(1, user.getText());
                pst.setString(2,chooser.getSelectedItem().toString()); 
                pst.execute();
              }
              else
              {
                 
                 JOptionPane.showMessageDialog(null, "Invalid Username / Password","Login Error",2);
                 user.setText(null);
                 pswrd.setText(null); 
              }
                        
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
        }}
  
   try{          
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");

            String sq = "select id,fname,mname,lname,gender,birth,phone,email  from people where  id= ?";
            pst = conn.prepareStatement(sq);
            pst.setString(1, user.getText());
            
            rs = pst.executeQuery();
            
            if(rs.next()){
            String add11=rs.getString("id");
            employee_page.myid.setText(add11);
            
            String add14=rs.getString("fname");
            employee_page.fname.setText(add14);
            
            String add15=rs.getString("mname");
            employee_page.mname.setText(add15);
            
            String add16=rs.getString("lname");
            employee_page.lname.setText(add16);
            
            String add17=rs.getString("birth");
            employee_page.birth.setText(add17);
            
            String add18=rs.getString("gender");
            employee_page.gender.setText(add18);
            
            String add19=rs.getString("phone");
            employee_page.phone.setText(add19);
            
            String add10=rs.getString("email");
            employee_page.email.setText(add10);
                 
                                       
                                
            }
            
        }catch (ClassNotFoundException | SQLException ef)
        {
        }
        //shop
     try{          
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");

            String sqf = "select shopname, shopid from shop where employee = ? ";
            pst = conn.prepareStatement(sqf);
            pst.setString(1, user.getText());
            
            rs = pst.executeQuery();
            
            if(rs.next()){           
            String add12=rs.getString("shopname");
            employee_page.shopname.setText(add12);
            
            String add13=rs.getString("shopid");
            employee_page.shopid.setText(add13);  
                                          
            pst.execute();                        
            }
            
        }catch (ClassNotFoundException | SQLException efx)
        {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chooserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chooserItemStateChanged
        if(chooser.getSelectedItem().toString().equals("ADMIN"))
        {
            header_admin.setVisible(true);
            header_student.setVisible(false);
            header_tp.setVisible(false);
        }
        if(chooser.getSelectedItem().toString().equals("STUDENT"))
        {
            header_admin.setVisible(false);
            header_student.setVisible(true);
            header_tp.setVisible(false);
        }
        if(chooser.getSelectedItem().toString().equals("EMPLOYEE"))
        {
            header_admin.setVisible(false);
            header_student.setVisible(false);
            header_tp.setVisible(true);
        }
    }//GEN-LAST:event_chooserItemStateChanged

    private void mainpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainpanelMousePressed
 
    }//GEN-LAST:event_mainpanelMousePressed

    private void mainpanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainpanelMouseDragged

    }//GEN-LAST:event_mainpanelMouseDragged

    private void frameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameMouseDragged
int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x,yy-y); 
    }//GEN-LAST:event_frameMouseDragged

    private void frameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameMousePressed
      x = evt.getX();
y= evt.getY(); 
    }//GEN-LAST:event_frameMousePressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chooser;
    private javax.swing.JLabel frame;
    private static final javax.swing.JLabel header = new javax.swing.JLabel();
    private javax.swing.JPanel header_admin;
    private javax.swing.JPanel header_student;
    private javax.swing.JPanel header_tp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private static final javax.swing.JLabel label_admin = new javax.swing.JLabel();
    private static final javax.swing.JLabel label_student = new javax.swing.JLabel();
    private static final javax.swing.JLabel label_tp = new javax.swing.JLabel();
    private javax.swing.JPanel mainpanel;
    private javax.swing.JPasswordField pswrd;
    private javax.swing.JLabel tym;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
