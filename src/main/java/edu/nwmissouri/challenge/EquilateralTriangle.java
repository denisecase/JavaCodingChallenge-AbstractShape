/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.challenge;

/**
 *
 * @author rohan Reddy Kondaveeti
 */
public class EquilateralTriangle extends AbstractShape {

    /**
     * @param args the command line arguments
     */
    // private attribute
    double equi_length;

    // constructor
    public EquilateralTriangle(double equi_length) {
        super("EquilateralTriangle");
        this.equi_length = equi_length;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * (equi_length * equi_length);
    }

    @Override
    public double getPerimeter() {
        return 3 * equi_length;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        double equi_length = 5;

        EquilateralTriangle equi = new EquilateralTriangle(equi_length);
        String equi_type = equi.getShapeType();
        double equi_area = equi.getArea();
        double equi_perimeter = equi.getPerimeter();

        System.out.println("===========================================");
        System.out.println("EquilateralTriangle");
        System.out.println("===========================================");
        System.out.println("Given length: " + equi_length);
        System.out.println("Type is: " + equi_type);

        System.out.println("A EquilateralTriangle's area will be " + equi_area);
        System.out.println("A EquilateralTriangle's perimeter will be " + equi_perimeter);
        System.out.println("===========================================");
    }

}
