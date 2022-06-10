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
interface Record  {
    
        
    public void setCustomerName(String customerName);
    public void setCustomerID(String customerID);
    public void setAddress(String address);
    public void setPhoneNum(String phoneNum);
    public void setEmail(String email);
    public void setAccountNum(String accountNum);
    
    
    public String getCustomerName();
    public String getCustomerID();
    public String getAddress();
    public String getPhoneNum();
    public String getEmail();
    public String getAccountNum();
    
    
}
