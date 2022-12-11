/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class manageitems extends javax.swing.JFrame {

   Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    String sql = null;
    PreparedStatement pst = null;
    public manageitems() {
        initComponents();
        conn = connector.connectiondb();
        this.setLocationRelativeTo(null);
        btn_u.setEnabled(true);
        btn_d.setEnabled(true);
    }

     int x,y;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_u = new javax.swing.JButton();
        btn_d = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        jj.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jj.setText("  MANAGE ITEM");
        jPanel1.add(jj, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 19, 130, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, 30));

        price.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        price.setText("0.00");
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 190, 30));

        categori.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(categori, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, 30));

        item.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(item, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 190, 30));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 38, 130, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("X");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 0, 20, 20));

        rf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.black, java.awt.Color.lightGray));
        rf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rfKeyReleased(evt);
            }
        });
        jPanel1.add(rf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 190, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("RF#: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("category");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Item");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 80, 30));

        btn_u.setBackground(new java.awt.Color(255, 204, 0));
        btn_u.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btn_u.setText("Update");
        btn_u.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uActionPerformed(evt);
            }
        });
        jPanel1.add(btn_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 30));

        btn_d.setBackground(new java.awt.Color(255, 0, 0));
        btn_d.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btn_d.setForeground(new java.awt.Color(255, 255, 255));
        btn_d.setText("Remove");
        btn_d.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dActionPerformed(evt);
            }
        });
        jPanel1.add(btn_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btn_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uActionPerformed

        try{
            String value1 = rf.getText();
            String sql = "UPDATE `items` SET `category`=?,`item`=?,`price`=? WHERE stock_no = '"+value1+"' ";
            pst=conn.prepareStatement(sql);

            pst.setString(1,categori.getText());
            pst.setString(2, item.getText());
            pst.setString(3, price.getText());

            if(JOptionPane.showConfirmDialog(null,"Are you sure?","UPDATE",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
            {
                JOptionPane.showMessageDialog(null, "Done.!");
                pst.execute();

            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_uActionPerformed

    private void btn_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dActionPerformed

        if(JOptionPane.showConfirmDialog(null,"Are you sure?","Delete Item ",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            try{  String sql="delete from items where stock_no = ? ";
                pst=conn.prepareStatement(sql);
                pst.setString(1,rf.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Done.!");

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);}}
        else
        {
        }
    }//GEN-LAST:event_btn_dActionPerformed

    private void rfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rfKeyReleased
 if(rf.getText().equals(""))
        {
            categori.setText("");
            item.setText("");
            price.setText("");
            btn_u.setEnabled(false);
           btn_d.setEnabled(false);
        } 
     try{

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db","root","");

            String sq = "select * from items where stock_no = ? and shopid=? ";
            pst = conn.prepareStatement(sq);
            pst.setString(1, rf.getText());
            pst.setString(2, employee_page.shopid.getText());

            rs = pst.executeQuery();

            if(rs.next()){
               String add3=rs.getString("category");
                categori.setText(add3);

                String add4=rs.getString("item");
               item.setText(add4);

                String add5=rs.getString("price");
                price.setText(add5);

                String add6=rs.getString("stock_no");
                rf.setText(add6);

                btn_u.setEnabled(true);
                btn_d.setEnabled(true);
            }
            else{
        
            categori.setText("");
            item.setText("");
            price.setText("");
            btn_u.setEnabled(false);
           btn_d.setEnabled(false);
            }

        }catch (Exception e)
        {JOptionPane.showMessageDialog(null, e);}
        
    }//GEN-LAST:event_rfKeyReleased

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
            java.util.logging.Logger.getLogger(manageitems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageitems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageitems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageitems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageitems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_d;
    private javax.swing.JButton btn_u;
    public static final javax.swing.JTextField categori = new javax.swing.JTextField();
    public static final javax.swing.JTextField item = new javax.swing.JTextField();
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static final javax.swing.JLabel jj = new javax.swing.JLabel();
    public static final javax.swing.JTextField price = new javax.swing.JTextField();
    private javax.swing.JTextField rf;
    // End of variables declaration//GEN-END:variables
}
