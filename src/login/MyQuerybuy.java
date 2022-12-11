/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;
import javax.swing.JOptionPane;
import static login.employee_page.jComboBoxCateg;
import static login.employee_page.shopid;
import static login.studentpage.category;
import static login.studentpage.shops;

public class MyQuerybuy {
    
     public Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/savedme_db", "root","");
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public ArrayList<Product2> BindTable(){
        
   ArrayList<Product2> list = new ArrayList<Product2>();
   Connection con = getConnection();
   Statement st;
   ResultSet rs;
   
   try {
   st = con.createStatement();
   String s2 = shopid.getText();
   rs = st.executeQuery("SELECT stock_no, item, price, picture  FROM `items` where shopid= '"+s2+"' ");
   
   Product2 p;
   while(rs.next()){
   p = new Product2(
           
   
   rs.getInt("stock_no"),
   rs.getString("item"),
   rs.getString("price"),
   rs.getBytes("picture")
  
   
   );
   list.add(p);
   }
   
   } catch (SQLException ex) {

   }
   return list;
   }
    
  //category
    public ArrayList<Product1> BindTable1(){
        
   ArrayList<Product1> list = new ArrayList<Product1>();
   Connection con = getConnection();
   Statement st;
   ResultSet rs;
   
   try {
   st = con.createStatement();
    String f = jComboBoxCateg.getSelectedItem().toString();
    String s = shopid.getText();
   rs = st.executeQuery("SELECT stock_no, item, price, picture  FROM `items` where category = '"+f+"' and shopid= '"+s+"'  ");
   
   Product1 p;
   while(rs.next()){
   p = new Product1(
           
   
   rs.getInt("stock_no"),
   rs.getString("item"),
   rs.getString("price"),
   rs.getBytes("picture")
  
   
   );
   list.add(p);
   }
   
   } catch (SQLException ex) {

   }
   return list;
   }

//table 3 student
public ArrayList<Product3> BindTable3(){
        
   ArrayList<Product3> list = new ArrayList<Product3>();
   Connection con = getConnection();
   Statement st;
   ResultSet rs;
   
   try {
   st = con.createStatement();
   String s3 = shops.getSelectedItem().toString();
   rs = st.executeQuery("SELECT stock_no, item, price, picture  FROM `items` inner join shop where shopname= '"+s3+"' and shop.shopid = items.shopid ");
   
   Product3 p;
   while(rs.next()){
   p = new Product3(
           
   
   rs.getInt("stock_no"),
   rs.getString("item"),
   rs.getString("price"),
   rs.getBytes("picture")
  
   
   );
   list.add(p);
   }
   
   } catch (SQLException ex) {

   }
   return list;
   }

//category 4
    public ArrayList<Product4> BindTable4(){
        
   ArrayList<Product4> list = new ArrayList<Product4>();
   Connection con = getConnection();
   Statement st;
   ResultSet rs;
   
   try {
   st = con.createStatement();
    String fu = category.getSelectedItem().toString();
    String s4 = shops.getSelectedItem().toString();
   rs = st.executeQuery("SELECT stock_no, item, price, items.picture  FROM `items` inner join shop where items.category = '"+fu+"' and shop.shopname = '"+s4+"' and shop.shopid = items.shopid ");
   
   Product4 p;
   while(rs.next()){
   p = new Product4(
           
   
   rs.getInt("stock_no"),
   rs.getString("item"),
   rs.getString("price"),
   rs.getBytes("picture")
  
   
   );
   list.add(p);
   }
   
   } catch (SQLException ebx) {
JOptionPane.showMessageDialog(null, ebx);
   }
   return list;
   }
}