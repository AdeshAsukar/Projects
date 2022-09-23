/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.inheritance;
        
        
        
class Student
{
    String name;
    long rollno;
    int m1,m2,m3,m4,m5;
public void setDetails(String name,long rollno,int m1,int m2,int m3,int m4,int m5)
{
    this.rollno=rollno;
    this.m1=m1;
    this.m2=m2;
    this.m3=m3;
    this.m4=m4;
    this.m5=m5;
    this.name=name;
}
public void getDetails()
{
    System.out.println("Name:"+name);
    System.out.println("Roll no."+rollno);
    System.out.println("m1="+m1+"\tm2="+m2+"\tm3="+m3+"\tm4="+m4+"\tm5="+m5);
}
}
class Marksheet extends Student
{
  public void Display()
  {
      int total=m1+m2+m3+m4+m5;
      System.out.println("Marklist="+total);
  }
}

public class MarksheetTest1 
{
    public static void main(String args[])
    {
       Student sup=new Student();
       Marksheet marksheet=new Marksheet();
       marksheet.setDetails("Pawan",12345, 67, 68, 78,56,76);
       marksheet.getDetails();
       marksheet.Display();
    }
}