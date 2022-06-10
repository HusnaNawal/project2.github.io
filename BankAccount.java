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

abstract class BankAccount {
    
    protected int balance;
     protected int previousTransaction;
    
     abstract void  getAccountType();
    abstract void deposit(int amount);
   
    abstract void withdraw(int amount);
  
   abstract void getPreviousTransaction();
   
    abstract void showMenu();
    
}


    


