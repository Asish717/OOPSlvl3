package com.java;

public class ShapeInterface {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        circle.input();
        System.out.println("Area of circle: "+circle.area());
        System.out.println();
        rectangle.input();
        System.out.println("Area of rectangle: "+rectangle.area());
    }
}
interface Shape{
    void input ();
    double area();}
class Circle implements Shape{
    public double radius;
    public void input(){
        radius=7;}
    public double area(){
        return 2.416*Math.pow(radius,2);}}
class Rectangle implements Shape{
    public double length;
    public double breadth;
    public void input(){
        length=7;
        breadth=7;}
    public double area(){
        return length*breadth;}}
