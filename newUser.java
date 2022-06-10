/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
class newUser extends User {
    
    protected String customerName;
    protected String customerID;
    
    public newUser(String customerName, String customerID) {
        super(customerName, customerID);
    }

    @Override
  public String getCustomerName()
    {
        return customerName;
       
    }  
    
    @Override
    public String getCustomerID()
    {
        return customerID;
    }
    
    //mutator
    
    @Override
    public void setCustomerName( String CustomerName)
    {
        this.customerName = customerName;
    }
    
    @Override
    public void setCustomerID( String customerID)
    {
        this.customerID = customerID;
    }
            
           
    
     
    void createAccount(){
        
        
         char option;

        Scanner scanner = new Scanner(System.in);
   
        System.out.println("Don't have an account yet?");
        System.out.println("A : YES");
        System.out.println("B : NO");
        System.out.println("C : EXIT");



        do
       {
         System.out.println("********************************************");
         System.out.println(" Enter an option:");
         System.out.println("********************************************");
         option = scanner.next().charAt(0);
         System.out.println("\n");
         
         switch(option)
         {
             case 'A':
                 System.out.println("********************************************");
                 System.out.println("Create an account");
                 System.out.println("********************************************");

                 Scanner scanner1 = new Scanner(System.in);
                 System.out.println("Enter your full name:");
                 customerName= scanner1.next(); 
                 System.out.println(customerName);
                 
                 System.out.println("Enter your phone number:");
                 String phoneNum = scanner1.next();
                 System.out.println(phoneNum);
                 
                 System.out.println("Enter your email:");
                 String email= scanner1.next();
                 System.out.println(email);
                 
                 System.out.println("Enter your Address:");
                 String address= scanner1.next();
                 System.out.println(address);
                 break;
                 
            case'B':
                      BankAccount a= new accountType();
                      a.showMenu();
                      break;



            case 'C':
                 System.out.println("********************************************");
                 break;


              
                 
               
                 
                 
               
        
    }
    
  
    
    
    
    }while(option != 'C');
        
        
  }
    
}