package com.java;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer out=new Outer();
        out.outerShow();
        Outer.Inner in=new Outer.Inner();
        in.show();
    }
}
class Outer {
    public static String outerMessage = "Hello from Outer";
    public static class Inner{
        public void show(){
            System.out.println("Message from inner: "+outerMessage);
        }
    }
    public void outerShow(){
        Inner obj=new Inner();
        obj.show();
    }
}
