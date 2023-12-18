package com.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array1 size: ");
        int size1=sc.nextInt();
        int[] arr1=new int[size1];
        System.out.println("Enter values for array1: ");
        for (int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter array2 size: ");
        int size2=sc.nextInt();
        int[] arr2=new int[size2];
        System.out.println("Enter values for array2: ");
        for (int j=0;j<size2;j++){
            arr2[j]=sc.nextInt();
        }
        Distinct dis=new Distinct(arr1,arr2);
        dis.printUnique();
    }
}
class Distinct{
    public int[] arr1;
    public int[] arr2;
    public Distinct(int[] arr1,int[] arr2){
        this.arr1=arr1;
        this.arr2=arr2;
    }
    public void printUnique(){
        Set<int[]>set1=new HashSet<>(Arrays.asList(arr1));
        Set<int[]>set2=new HashSet<>(Arrays.asList(arr2));
        set1.removeAll(set2);
        System.out.println("Distinct unique elements: "+set1.toArray());
    }
}
