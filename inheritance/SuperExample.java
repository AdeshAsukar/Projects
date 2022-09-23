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
 class ParentClass   
{  
    int a;  
    ParentClass(int x)    
    {  
        a = x;  
    }  
}  
class ChildClass extends ParentClass      
{  
    int b;  
    ChildClass(int x, int y)   
    {   
        super(x);  
        b = y;  
    }  
    void Show()   
    {  
        System.out.println("Value of a : "+a+"\nValue of b : "+b);  
    }  
}    
public class SuperExample 
{    
    public static void main(String ar[])   
    {  
        System.out.println("Order of constructor execution...");  
        ChildClass d = new ChildClass(79, 89);  
        d.Show();  
    }  
}  