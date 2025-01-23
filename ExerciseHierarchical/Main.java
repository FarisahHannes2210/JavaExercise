package ExerciseHierarchical;

/// Create a hierarchy of shapes: Shape, Circle, Rectangle, and Triangle. The Shape class should be abstract
/// and define abstract methods for calculating area and perimeter. The Circle, Rectangle,
/// and Triangle classes should inherit from Shape and provide concrete implementations
/// for these methods and store the area and perimeter in two ArrayLists
///
/// Implement a validateInput() method in each shape class to ensure that the input
/// parameters are valid (e.g., radius for Circle, length and width for Rectangle, etc.).
/// Throw a custom InvalidShapeException if the input is invalid.
/// If dealing with nullable values, use null checks to prevent NullPointerExceptions
/// Implement logging to record errors and track application
/// Test the classes with various input values, including valid and invalid ones.

abstract class Shape {
    double area;
    double perimeter;

    public Shape(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    abstract double calculateArea ();

    abstract double calculatePerimeter ();


}

class Triangle extends Shape {

    double base;
    double height;

    public Triangle(double area, double perimeter) {
        super(area, perimeter);
    }

     double calculateArea (){
         area = 0.5 * (base * height);
        return area;
     }

     double calculatePerimeter (){
        perimeter = base + height + Math.sqrt(base * base + height * height);
        return perimeter;
     }
}


class Circle extends Shape {

    double radius;

    public Circle(double area, double perimeter) {
        super(area, perimeter);
    }

     double calculateArea (){

        area = Math.PI * radius * radius;
        return area;
     }

     double calculatePerimeter (){
        perimeter = 2 * Math.PI * radius;
        return perimeter;
     }
}

class Rectangle extends Shape {

    double width;
    double length;

    public Rectangle(double area, double perimeter) {
        super(area, perimeter);
    }

     double calculateArea (){

        area = width * length;
        return area;
     }

     double calculatePerimeter (){
        perimeter = 2 * (width + length);
        return perimeter;
     }
}

public class Main {
    public static void main(String[] args) {

    }
}