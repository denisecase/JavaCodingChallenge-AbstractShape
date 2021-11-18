/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.challenge;

/**
 *
 * @author Rohan Reddy Kondaveeti
 */
public class Square extends AbstractShape {

    /**
     * @param args the command line arguments
     * @return
     */
    // private attribute
    double sq_length;

    // constructor
    public Square(double sq_length) {
        super("Square");
        this.sq_length = sq_length;
    }

    @Override
    public double getArea() {
        return sq_length * sq_length;
    }

    @Override
    public double getPerimeter() {
        return 4 * sq_length;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        double sq_length = 3;

        Square square = new Square(sq_length);
        String square_type = square.getShapeType();
        double s_area = square.getArea();
        double s_perimeter = square.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Square");
        System.out.println("===========================================");
        System.out.println("Given length: " + sq_length);
        System.out.println("Type is: " + square_type);
        System.out.println("A Sqaure's area will be " + s_area);
        System.out.println("A Square's perimeter will be " + s_perimeter);
        System.out.println("===========================================");
    }

}
