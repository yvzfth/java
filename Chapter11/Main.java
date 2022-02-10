package Chapter11;

/**
 * 11.1 (The Triangle class) Design a class named Triangle that extends
 * GeometricObject. The class contains:
 * ■ Three double data fields named side1, side2, and side3 with default values 1.0
 * to denote three sides of a triangle.
 * ■ A no-arg constructor that creates a default triangle.
 * ■ A constructor that creates a triangle with the specified side1, side2, and side3.
 * ■ The accessor methods for all three data fields.
 * ■ A method named getArea() that returns the area of this triangle.
 * ■ A method named getPerimeter() that returns the perimeter of this triangle.
 * ■ A method named toString() that returns a string description for the triangle.
 * For the formula to compute the area of a triangle, see Programming Exercise 2.19.
 * The toString() method is implemented as follows:
 * return "Triangle: side1 = " + side1 + " side2 = " + side2 +
 * " side3 = " + side3;
 * Draw the UML diagrams for the classes Triangle and GeometricObject and
 * implement the classes. Write a test program that prompts the user to enter three
 * sides of the triangle, a color, and a Boolean value to indicate whether the triangle
 * is filled. The program should create a Triangle object with these sides and set
 * the color and filled properties using the input. The program should display
 * the area, perimeter, color, and true or false to indicate whether it is filled or not.
 */
public class Main {
    public static void main(String[] args) {
        GeometricObject obj1 = new GeometricObject("yellow", true);
        System.out.println(obj1.toString());
        Triangle tri1 = new Triangle();
        Triangle tri2 = new Triangle(3, 4, 5);
        Triangle tri3 = new Triangle(6, 8, 10, "red", true);
        System.out.println(tri1.toString());
        System.out.println(tri2.toString());
        System.out.println(tri2.getArea() + " " + tri2.getPerimeter());
        System.out.println(tri3.toString() + " " + tri3.getArea() + " " + tri3.getPerimeter());
    }
}