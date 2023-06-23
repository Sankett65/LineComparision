package com.bridgelab.linecomparision;
import java.util.Scanner;
// import java.lang.Integer;
//import java.lang.Math;
//import java.lang.Object;
//  import java.lang.Number;
//  import java.lang.Double;
class Length {
    public static final double LENGTH_X1 = 0;
    public static final double LENGTH_Y1 = 0;

    void leng(int x2, int y2) {
        double length1 = Math.pow(x2 - LENGTH_X1, 2);
        double length2 = Math.pow(y2 - LENGTH_Y1, 2);
        double length3 = length1 + length2;
        double lengthOfALine = Math.sqrt(length3);
        System.out.println("Length of a line= " + lengthOfALine);
    }
}


    class Equality extends Length{
    void equal(double a1, double b1, double c1, double a2, double b2, double c2) {
        System.out.println("\nChecking whether two line are equal or not: ");
        double A = a1 / a2;
        double B = b1 / b2;
        double C = c1 / c2;
        if (A == B && A == C && B == C) {
            System.out.println("True two lines are equal");
        } else {
            System.out.println("False two lines are not equal'");
        }

        double x = 1;
        double y = 2;
        double x1 = a1 * x + b1 * y + c1;
        double y1 = a2 * x + b2 * y + c2;

        Double obj1  = x1;
        Double obj2 = y1;
        int compare=obj1.compareTo(obj2);
        if (compare == 0)
            System.out.println("\nobject1 and object2 are equal");
        else if (compare < 0)
            System.out.println("\nobject1 is less than object2");
        else
            System.out.println("\nobject1 is greater than object2");
    }
}

    public class LineComparision{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Line Comparison Computation Porgram\n");
        Equality e = new Equality();
        e.leng(3,4);
        e.equal(-2,4,3,-6,12,9);


    }
}
