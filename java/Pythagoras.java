package test;

import java.util.Scanner;

import java.lang.Math;

class Pythagoras {
    public static void main(String[] args) {
        Scanner cornerb = new Scanner(System.in);
        System.out.print("input corner_b : ");

        double b = cornerb.nextDouble();
        double pythab = Math.pow(b, 2);
        Scanner cornerc = new Scanner(System.in);
        System.out.print("input corner_c :");

        double c = cornerc.nextDouble();
        double pythac = Math.pow(c, 2);
        double a = pythac + pythab;
        double answer = Math.sqrt(a);
        System.out.println("Corner for longer is = " + answer);
        cornerb.close();
        cornerc.close();
    }

}