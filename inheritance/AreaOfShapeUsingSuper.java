/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.inheritance;



/**
 *
 * @author adesh
 */
class Shape
{
    double base;
    double height;
    Shape(double b,double h)
    {
        base = b;
        height = h;
    }
    
}
    class Area extends Shape
    {
        
        public Area(double b, double h) 
        {
            super(b, h);
            
        }
        public double Area()
        {
            double area=0.5*(base*height);
            return area;
            
        } 
    }
         class Area1 extends Shape
    {
        
        public Area1(double b, double h) 
        {
            super(b, h);
            
        }
        public void Area()
        {
            double area1=(base*height);
            System.out.println("Area of rectangle="+area1);
            
        }      
                
    }
    

public class AreaOfShapeUsingSuper
{
    public static void main(String[] args) 
    {
        Area triangle=new Area(10,5);
        triangle.Area();
        
           System.out.println("Area of triangle="+triangle.Area());
        
        Area1 rec=new Area1(10,5);
        rec.Area();  
    }
}
 