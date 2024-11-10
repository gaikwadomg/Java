// Define the Shape interface with an abstract method area()
interface Shape {
    double area();
}

// Implement the Circle class
class Circle implements Shape {
    private final double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the area method for Circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Implement the Sphere class
class Sphere implements Shape {
    private final double radius;

    // Constructor to initialize the radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Implement the area method for Sphere (Surface Area)
    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }
}

// Main class to test the implementations
public class Main {
    public static void main(String[] args) {
        // Create a Circle object with radius 5
        Shape circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());

        // Create a Sphere object with radius 5
        Shape sphere = new Sphere(5);
        System.out.println("Area of Sphere: " + sphere.area());
    }
}
