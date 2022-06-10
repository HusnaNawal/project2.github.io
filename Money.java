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
public class Money {
   
    int amount;
    
    public static void setAmount(){
        
        System.out.println(100);
        System.out.println(300);
        System.out.println(500);
        System.out.println(700);
        System.out.println(1000);
        
    }
    
    public class Amounts{
        
        public  void main(String[] args){
            
            Money m1 = new Money();
            
            Money[] moneys={m1};
            
            for(Money m: moneys){
                m.setAmount();
            }
            
            
        }
    }
}
