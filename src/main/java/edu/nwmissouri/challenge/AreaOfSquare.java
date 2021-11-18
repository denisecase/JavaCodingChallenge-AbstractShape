/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.challenge;

import java.util.Scanner;

/**
 *
 * @author s545017
 */
// private attribute
    
public class AreaOfSquare extends AbstractShape{
    double length;

    // constructor
    public AreaOfSquare(double length) {
        super("AreaOfSquare");
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*length ;
    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }

        public static void main(String[] args){
       double l = 2.0;
        AreaOfSquare a = new AreaOfSquare(l);

        String type = a.getShapeType();
        double area = a.getArea();
        double perimeter = a.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Square");
        System.out.println("===========================================");
        System.out.println("Given length of side: " + l);
        System.out.println("A square's area will be " + area);
        System.out.println("A square's perimeter will be " + perimeter);
        System.out.println("===========================================");

   }
}
    

