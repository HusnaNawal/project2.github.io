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
 class customerDetails implements Record {
      
     protected String customerName;
     protected String customerID;
     protected String address;
     protected String phoneNum;
     protected String email;
     protected String accountNum ;
     
     public customerDetails(String customerName, String customerID, String address,String phoneNum, String email,String accountNum ){
        this.customerName=customerName;
        this.customerID=customerID;
        this.address=address;
        this.phoneNum=phoneNum;
        this.email=email;
        this.accountNum=accountNum;
         
     }
     
     
     @Override
      public void setCustomerName(String customerName){
          
       this.customerName=customerName;
 
          
      }
      
      @Override
     public void setCustomerID(String customerID){
         
      this.customerID=customerID;

         
     }
     
      @Override
    public void setAddress(String address){
        
        this.address=address;

        
    }
    
      @Override
    public void setPhoneNum(String phoneNum){
        
        this.phoneNum=phoneNum;

        
    }
    
      @Override
    public void setEmail(String email){
        
        this.email=email;

        
    }
    
      @Override
    public void setAccountNum(String accountNum){
        
      this.accountNum=accountNum;

        
    }
    
    
    
     @Override
    public String getCustomerName(){
      return customerName;  
    }
     @Override
    public String getCustomerID(){
        return customerID;
        
    }
     @Override
    public String getAddress(){
        return address;
        
    }
     @Override
    public String getPhoneNum(){
        return phoneNum;
        
    }
     @Override
    public String getEmail(){
        
       return email;
        
    }
     @Override
    public String getAccountNum(){
        
        return accountNum;
        
    }
    
   
    
 }
    

