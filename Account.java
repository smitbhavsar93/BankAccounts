/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author Smit Bhavsar
 */
public class Account {
    
    String name;
    int num;
    double iniBal;
    
    public Account(String name, int number, double initialBalance){
        this.name = name;
        num = number;
        iniBal = initialBalance;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getBalance(){
        return iniBal;
    }
    
    public int getNumber(){
        return num;
    }
    
    public boolean deposit(double amount){
        if (amount <= 0){
            return false;
        } else {
            iniBal += amount;
            return true;
        }
    }
    
    public boolean withdraw(double amount){
        if (amount <= 0 || amount > iniBal){
            return false;
        } else {
            iniBal -= amount;
            return true;
        }
    }
    
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", "
                + String.format("$%.2f", getBalance()) + ")";
    }
    
}
