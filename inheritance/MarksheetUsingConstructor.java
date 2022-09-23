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
class Student1
{
    int s1;
    int s2;
    int s3;
    String name;
    long rollno;
    Student1(String name,long rollno,int s1,int s2,int s3)
    {
        this.name=name;
        this.rollno=rollno;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    public void details()
    {
        System.out.println("Student name="+name);
        System.out.println("Student Roll No.="+rollno);
        System.out.println("Marks Obtained>>>");
        System.out.println("S1="+s1 +"\tS2="+s2 +"\tS3="+s3);
    }
     public void getResult()
    {
        double total=s1+s2+s3;
        double avg=total/3;
        System.out.println("Total="+total);
        System.out.println("Average="+avg);
    }
}
class Sports extends Student1
{
    
    public Sports(String name, long rollno, int s1, int s2, int s3,int sports) 
    {
        super(name, rollno, s1, s2, s3);
    }
     public void getResult()
    {
        double total=s1+s2+s3+10;
        double avg=total/3;
        System.out.println("Total="+total);
        System.out.println("Average="+avg);
    }
}

public class MarksheetUsingConstructor 
{
    public static void main(String[] args)
    {
        Sports s1=new Sports("Pawan",13345,56,76,67,10);
        s1.details();
        s1.getResult();
    }
}
