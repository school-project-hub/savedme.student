/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author lenovo
 */
public class Product2 {
    
    
    
    private int stock_no;
    private String item;
    private String price;
    private byte[] Image;
    
    
    
    public Product2(){}
    
    public Product2(int stock_no,  String item, String price, byte[] image){
    
        
        this.stock_no = stock_no;
        this.item = item;
        this.price = price;
        this.Image = image;
        
                      
    }


    //1
    public int getStockN(){
      return stock_no;
    }
    
    public void setStockN(int stock_no){
        this.stock_no = stock_no;
    }
    //1
    //3
    public String getItem(){
        return item;
    }
    
    public void setItem(String item){
        this.item = item;
    }
    //3
    //4
     public String getPrice(){
        return price;
    }   
    public void setPrice(String price){
        this.price = price;
    }
    //4      
    //5
    public byte[] getMyImage(){
        return Image;
    }
    //5
    
}
