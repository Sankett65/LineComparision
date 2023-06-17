package com.bridgelab.linecomparision;

public class LineComparision {
    public static final double LENGTH_X1=0;
    public static final double LENGTH_Y1=0;
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Comparison Computation Porgram");
        double x2=4;
        double y2=5;
        double length1=Math.pow(x2-LENGTH_X1,2);
       // System.out.println(length1);
        double length2=Math.pow(y2-LENGTH_Y1,2);
       // System.out.println(length2);
        double length3=length1+length2;
      //  System.out.println(length3);
        double length_Of_A_Line=Math.sqrt(length3);
        System.out.println("Length of a line= " + length_Of_A_Line);
    }
}
