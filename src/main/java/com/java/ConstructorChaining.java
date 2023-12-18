package com.java;

public class ConstructorChaining {
    public int x;
    public int y;
    public ConstructorChaining(){
        this(20);
        System.out.println("Inside default constructor");
    }
    public ConstructorChaining(int x){
        this.x=x;
        System.out.println("Inside parameterized constructor with x="+x);
    }
    public ConstructorChaining(int x,int y){
        this();
        this.y=y;
        System.out.println("Inside parameterized constructor with x= "+x+" and y= "+y);
        System.out.println("Sum of x and y: "+(x+y));
    }
    public static void main(String[] args) {
        ConstructorChaining obj=new ConstructorChaining(10,11);
    }
}
