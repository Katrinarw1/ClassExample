/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class BankAccount {
    
    // instance variables
    private double amount = 0;
    private int pin = 0000;
    private int accountNumber;
    private String name;
    
    // Constructor
    // initial setup that needs to happen before using
    public BankAccount(String name, int pin, double initBalance){
       this.amount = initBalance;
       this.name = name;
       this.pin = pin;
       
    }
    
    // Class Methods
    
    public void withdraw(double amount){
        if(amount > 0 && this.amount >= amount){
            this.amount -= amount;
        }
    }
    
    public void deposit(double amount){
        if(amount > 0){
            this.amount += amount;
        }
    }
    
    public double checkFunds(){
        return this.amount;
    }
    
    
}
