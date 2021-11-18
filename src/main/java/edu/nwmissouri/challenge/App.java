package edu.nwmissouri.challenge;

/**
 * Starting point for our app.
 */
public class App {

    public static void main(String[] args) {

        // test Circle class
        double r = 1.0;
        Circle c = new Circle(r);

        String type = c.getShapeType();
        double area = c.getArea();
        double perimeter = c.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Circle");
        System.out.println("===========================================");
        System.out.println("Given radius: " + r);
        System.out.println("Type is: " + type);

        System.out.println("A circle's area will be " + area);
        System.out.println("A circle's perimeter will be " + perimeter);
        System.out.println("===========================================");

        // test Rectangle class
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

        // test Square class
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

        // test EquilateralTriangle class
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
