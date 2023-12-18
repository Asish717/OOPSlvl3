package com.java;
public class Calculator {
    public static void main(String[] args) {
        Child c=new Child();
        System.out.println("Addition result: "+c.add(2,2));
        System.out.println("Subtraction result: "+c.subtract(2,2));
        System.out.println("Multiplication result: "+c.multiply(2,2));
    }}
abstract class Parent{
    public abstract int add(int a,int b);
    public abstract int subtract(int a,int b);
    public abstract int multiply(int a,int b);
    public abstract int divide(int a,int b);}
class Child extends Parent{
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;
    }
}