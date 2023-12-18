package com.java;

public class ConstructorExample {
    public static void main(String[] args) {
        child c=new child("hello from parent","hi from child");
        c.displayParent();
        c.displayChild();
    }
}
class Super{
    String superMessage;
    public Super(String superMessage){
        this.superMessage=superMessage;
        System.out.println("Superclass constructor");
    }
    public void displayParent(){
        System.out.println("Message from Super: "+superMessage);
    }
}
class child extends Super{
    String childMessage;
    public child(String superMessage,String childMessage){
        super(superMessage);
        this.childMessage=childMessage;
        System.out.println("Subclass constructor");
    }
    public void displayChild(){
        System.out.println("Message from child: "+childMessage);
    }
}
