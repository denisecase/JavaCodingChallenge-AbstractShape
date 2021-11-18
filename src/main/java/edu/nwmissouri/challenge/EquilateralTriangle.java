/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.nwmissouri.challenge;

/**
 *
 * @author s545017
 */
public class EquilateralTriangle extends AbstractShape{

    /**
     * @param args the command line arguments
     */
    double length;

    // constructor
    public EquilateralTriangle(double length) {
        super("EquilateralTriangle");
        this.length = length;
    }
    @Override
    public double getArea() {
        return (Math.sqrt(3)*length*length)/4 ;
    }

    @Override
    public double getPerimeter() {
        return 3*length;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        double l = 2.0;
        EquilateralTriangle a = new EquilateralTriangle(l);

        String type = a.getShapeType();
        double area = a.getArea();
        double perimeter = a.getPerimeter();

        System.out.println("===========================================");
        System.out.println("EquilateralTriangle");
        System.out.println("===========================================");
        System.out.println("Given length of side: " + l);
        System.out.println("A EquilateralTriangle's area will be " + area);
        System.out.println("A EquilateralTriangle's perimeter will be " + perimeter);
        System.out.println("===========================================");

    }

    
}
