/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

/**\
 *
 * @author Owner
 */

import java.util.Scanner;
public class BankApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     String Username;
     String Password;

    Password = "abc123";
    Username = "husna";

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username) && password.equals(Password)) {

        System.out.println("Access Granted!");
         User info = new User("husna", "CA18035");
         System.out.println("Welcome " + info.getCustomerName()+ "\n"+ "Your ID :" + info.getCustomerID());
      
    }

    else if (username.equals(Username)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password)) {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password");
        System.out.println("Access Denied!!!!!!!!!!!!!!!");
        
         newUser u = new newUser("Nurul Husna", "CA18035");
         u.createAccount();

      
    }
      
    BankAccount a= new accountType();
    a.getAccountType();
    a.showMenu();
    
    




     
    
    
    }  
    
    

}