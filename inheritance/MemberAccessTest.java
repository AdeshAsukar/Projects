/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.inheritance;

/**
 // Create a superclass.
class A {
int i; // public by default
private int j; // private to A
void setij(int x, int y) {
i = x;
j = y;
}
}
// A's j is not accessible here.
class B extends A {
int total;
192 Java™ 2: The Complete Reference
void sum() {
total = i + j; // ERROR, j is not accessible here
}
}
class Access {
public static void main(String args[]) {
B subOb = new B();
subOb.setij(10, 12);
subOb.sum();
System.out.println("Total is " + subOb.total);
}
}
 */




class Member
{
    int i;
    private int j;
    void setij(int x, int y)
    {
    i = x;
    j = y;
    }
}
class Submember extends Member
{
int total;
    int getj()
    {
        int j=0;
        return j;
    }
    void sum()
    {
    total=i+getj();
    }
}
public class MemberAccessTest 
{
    public static void main(String[] args) 
    {
        Submember subOb = new Submember();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}


