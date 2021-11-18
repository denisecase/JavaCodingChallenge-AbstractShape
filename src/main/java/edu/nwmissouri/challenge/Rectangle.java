/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.challenge;

/**
 *
 * @author Maneesh Sake
 */
      
public class Rectangle extends AbstractShape {
   
    


    // constructor
    private final double width; 
    private final double height;

public Rectangle(double width, double height) 
{
    this.width = width;
    this.height = height;
}

    /**
     *
     * @return
     */
    @Override 
    public double getArea() 
{
    return width * height;
}

    /**
     *
     * @return
     */
    @Override 
    public double getPerimeter() 
{
    return 2 * (width + height);
}
    // add an executable main() method to test it

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }

    public static void main(String [] args) 


{

    // To test Rectangle...
    double width = 13, length = 9;
    Rectangle rectangle = new Rectangle(width, length);
    System.out.println(rectangle);
    System.out.println("The rectangle width is: " + width 
            + " and the length is: " + length
            + "The area is: " + rectangle.getArea()
            + "and the perimeter is: " + rectangle.getPerimeter() + ".");    }   }
