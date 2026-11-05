/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_atm;

/**
 *
 * @author Stefan
 */
import java.util.Scanner;
public class Lab_ATM
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your starting balance: $");
        BankAccount account1 = new BankAccount(keyboard.nextDouble());
        System.out.println("If you would like to make a withdrawl, please enter the amount you would like.\nIf you do not want to make a withdrawl, please enter 0");
        double amount = keyboard.nextDouble();
        while (amount != 0)
        {
            account1.withdraw(amount);
            System.out.println("Would you like to make another withdrawl?");
            amount = keyboard.nextDouble();
        }
    }
}
class BankAccount
{
    double balance;
    BankAccount(double b)
    {
        balance = b;
    }
    void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdraw complete! You withdrew: " + amount);
        }
        else
        {
            System.out.println("Not enough funds.\n"); \\ I removed the "!"
        }
    }
}
