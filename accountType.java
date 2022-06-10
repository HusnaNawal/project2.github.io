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

import java.util.Scanner;

class accountType extends BankAccount{
    
     String type;
    
    @Override
   void  getAccountType(){
        
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("Enter type of account:");
   type = scanner.next();
   
   System.out.println(type);

  
}
   
 
    @Override
    void deposit(int amount)
    {
        if(amount != 0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
     
    }

    
    @Override
   void withdraw(int amount)
   {
      if(amount != 0)
      {
          balance = balance - amount;
          previousTransaction = -amount;
          
      }
   }
  
    @Override
   void getPreviousTransaction()
   {
       if( previousTransaction > 0)
       {
           System.out.println("Deposited :" + previousTransaction);
       }
       
       else if(previousTransaction < 0)
       {
           System.out.println("withdrawn :" + Math.abs(previousTransaction));

       }
       else
       {
          System.out.println("No transaction occured!!!");

       }
   }
   
   
   
   
    @Override
   void showMenu()
   {
       char choice='\0';
       Scanner scanner = new Scanner(System.in);
       
       System.out.println(" A. Check Your Balance");
       System.out.println(" B. Deposit");
       System.out.println(" C. Withdraw");
       System.out.println(" D. Previous Transaction");
       System.out.println(" E. Exit");
       
       do
       {
         System.out.println("********************************************");
         System.out.println(" Enter an option:");
         System.out.println("********************************************");
         choice = scanner.next().charAt(0);
         System.out.println("\n");
         
         switch(choice)
         {
             case 'A':
                 System.out.println("********************************************");
                 System.out.println("Balance =" + balance);
                 System.out.println("********************************************");
                 System.out.println("\n");
                 break;
                 
             case 'B':
                 System.out.println("********************************************");
                 System.out.println(" Enter amount to deposit:");
                 int amount = scanner.nextInt();
                 deposit(amount);
                 System.out.println("\n");
                 break;
                 
             case 'C':
                 System.out.println("********************************************");
                 System.out.println("Enter amount to withdraw");
                 System.out.println("********************************************");
                 
                 Money m= new Money();
                 System.out.println("Amount that are available to be withdrawn:");
                 m.setAmount();
                 System.out.println("\n");
                System.out.println("Amount:");

                 int amount2 = scanner.nextInt();
                 withdraw(amount2);
                 System.out.println("\n");
                 break;
                 
             case 'D':
                 System.out.println("********************************************");
                 getPreviousTransaction();
                 System.out.println("********************************************");
                 System.out.println("\n");
                 break;
                 
             case 'E':
                 System.out.println("********************************************");
                 break;
                 
                
                     
         }


       }while(choice != 'E');
       
       
    Record r = new customerDetails("Nurul husna", "CA18035", "Kelantan", "01117805329", "husna123@gmail.com", "89017780");
    System.out.println("NAME:" + r.getCustomerName());
    System.out.println("ID:" + r.getCustomerID());
    System.out.println("ADDRESS:" + r.getAddress());
    System.out.println("PHONE NUMBER:" + r.getPhoneNum());
    System.out.println("EMAIL:" + r.getEmail());
    System.out.println("ACCOUNT NUMBER:" + r.getAccountNum());

       
       System.out.println(" Thank you for using Our service!");
  
   }
   
     
    
}
    
