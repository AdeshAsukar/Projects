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
class Box1 
{
    double width;
    double height;
    double depth;

    Box1(Box1 ob)
    { 
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box1(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    Box1()
    {
        width = -1; 
        height = -1; 
        depth = -1; 
    }

Box1(double len) 
{
    width = height = depth = len;
}

double volume() 
{
    return width * height * depth;
}
}

    class BoxWeight1 extends Box1 
    {
        double weight;
         BoxWeight1(BoxWeight1 ob)
    { 
        super(ob);
        weight = ob.weight;
    }
        BoxWeight1()
        {
            super();
            weight=-1;
        }
        BoxWeight1(double w, double h, double d, double m)
        {
        super(w,h,d);
        weight = m;
        }
        BoxWeight1(double l,double w)
        {
            super(l);
            weight=w;
        }
        
}
 
class BoxWeightUsingSuper
{
    public static void main(String args[])
    {
        BoxWeight1 mybox1 = new BoxWeight1(10, 20, 15, 34.3);
        BoxWeight1 mybox2 = new BoxWeight1(2, 3, 4, 0.076);
        BoxWeight1 mybox3 = new BoxWeight1(mybox1);
        BoxWeight1 mybox4 = new BoxWeight1();
        BoxWeight1 mybox5 = new BoxWeight1(5,10);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
        System.out.println();
        vol=mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);
        System.out.println("Weight of mybox3 is " + mybox3.weight);
        System.out.println();
        vol=mybox4.volume();
        System.out.println("Volume of mybox4 is " + vol);
        System.out.println("Weight of mybox4 is " + mybox4.weight);
        System.out.println();
        vol=mybox5.volume();
        System.out.println("Volume of mybox5 is " +vol);
        System.out.println("Weight of mybox5 is " + mybox5.weight);
    }
}