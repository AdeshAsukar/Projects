/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.inheritance;

/**
 *
 * @author Pawan
 */
import java.util.Scanner;
class Account
{
    String aname;
    long ano;
    String atype;
    double abalance;
    public void setADetails(String aname,long ano,String atype,double abalance)
    {
        this.abalance=abalance;
        this.aname=aname;
        this.ano=ano;
        this.atype=atype;
    }
    public void getADetails()
    {
        System.out.println("Name of Account Holder="+aname);
        System.out.println("Account Number="+ano);
        System.out.println("Type of Account="+atype);
        System.out.println("Account Balance="+abalance);
    }
    
    public void checkbalance()
    {
        System.out.println("Your current Balance is"+abalance);
    }
}
class CurAccount extends Account
{
    public void Deposite(double amt)
    {
        abalance=abalance+amt;
        System.out.println("Your balance is"+abalance);
    }
    public void Withdrawl(double amt)
    {
        abalance=abalance-amt;
        System.out.println("Your balance is"+abalance);
    }
    public void getFine()
    {
        
    }
}
class SavAccount extends Account
{
    
}
public class BankTest1
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        Account ac=new Account();
        CurAccount cur=new CurAccount();
        cur.setADetails("Pawan",12345,"current",30000);
        SavAccount sav=new SavAccount();
        sav.setADetails("Virat", 23456, "saving", 2000);
        System.out.println("----------Welcome to XYZ Bank----------");
        System.out.println("Enter your Account No=");
        long ano=scanner.nextLong();
        cur.getADetails();
        if(cur.ano == ano)
        {
            System.out.println("Enter type of Account=");
            String atype=scanner.next();
            if(atype.equalsIgnoreCase(cur.atype))
            {
                System.out.println("For Proceed Procces Press \n1.Withdrawl \n2.Deposite \n3.Check Balance");
                int procces=scanner.nextInt();
                switch(procces)
                {
                    case 1:
                        System.out.println("Enter your ammount for withdrawl=");
                        double amt=scanner.nextDouble();
                    break;
                    case 2:
                        System.out.println("Enter your Amount for Deposite=");
                        amt=scanner.nextDouble();
                        break;
                    case 3:
                        cur.checkbalance();
                }
            }
            else
            {
                System.out.println("invalid Account type");
            }
        }
    }
}
