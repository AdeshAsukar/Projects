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
class Box 
{
    double width;
    double height;
    double depth;

    Box(Box ob)
    { 
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    Box()
    {
        width = -1; 
        height = -1; 
        depth = -1; 
    }

Box(double len) 
{
    width = height = depth = len;
}

double volume() 
{
    return width * height * depth;
}
}

    class BoxWeight extends Box 
    {
        double weight;
         BoxWeight(BoxWeight ob)
    { 
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
        weight = ob.weight;
    }
        BoxWeight()
        {
             width = -1; 
            height = -1; 
            depth = -1;  
        }
        BoxWeight(double w, double h, double d, double m)
        {
        width = w;
        height = h;
        depth = d;
        weight = m;
        }
        BoxWeight(double l,double w)
        {
            width=height=depth=l;
            weight=w;
        }
        
}
 
class DemoBoxWeight
{
    public static void main(String args[])
    {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight(mybox1);
        BoxWeight mybox4 = new BoxWeight();
        BoxWeight mybox5 = new BoxWeight(5,10);
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