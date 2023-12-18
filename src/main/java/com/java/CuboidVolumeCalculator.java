package com.java;

public class CuboidVolumeCalculator {
    public static double cuboidVolume(){
        double length=5;
        double breadth=4;
        double height=7;
        return length*breadth*height;
    }
    public static void main(String[] args) {
        System.out.println("Volume of cuboid: "+cuboidVolume());
    }
}
