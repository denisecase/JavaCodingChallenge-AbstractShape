/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.nwmissouri.challenge;

/**
 *
 * @author Rohan Reddy Kondaveeti
 */
public class Rectangle extends AbstractShape {

    /**
     * @param args the command line arguments
     */
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        // Set the shape name as "Rectangle"
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    // Provide an implementation for inherited abstract getArea() method
    @Override
    public double getArea() {
        return width * height;
    }

    // Provide an implementation for inherited abstract getPerimeter() method
    @Override
    public double getPerimeter() {
        return 2.0 * (width + height);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        double width = 5;
        double height = 10;
        Rectangle rect = new Rectangle(width, height);
        String rect_type = rect.getShapeType();
        double rect_area = rect.getArea();
        double rect_perimeter = rect.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Rectangle");
        System.out.println("===========================================");
        System.out.println("Given width: " + width);
        System.out.println("Given height: " + height);
        System.out.println("Type is: " + rect_type);
        System.out.println("A Rectangle's area will be " + rect_area);
        System.out.println("A Rectangle's perimeter will be " + rect_perimeter);
        System.out.println("===========================================");

    }

}
