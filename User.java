/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

/**
 *
 * @author Owner
 */
public class User {
    
    

    protected String customerName;
    protected String customerID;
    
    public User(String customerName, String customerID)
    {
       this.customerName= customerName;
       this.customerID = customerID;
                
    }
    
    public String getCustomerName()
    {
        return customerName;
       
    }  
    
    public String getCustomerID()
    {
        return customerID;
    }
    
    //mutator
    
    public void setCustomerName( String CustomerName)
    {
        this.customerName = customerName;
    }
    
    public void setCustomerID( String customerID)
    {
        this.customerID = customerID;
    }
            
           
    
}


        
    
    
    
