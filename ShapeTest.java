
abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; 
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2; 
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC; 
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape myCircle = new Circle(5.0);
        Shape myTriangle = new Triangle(4.0, 3.0, 3.0, 4.0, 5.0);

        System.out.println("Circle:");
        System.out.println("Area: " + myCircle.calculateArea());
        System.out.println("Perimeter: " + myCircle.calculatePerimeter());

        System.out.println();

        System.out.println("Triangle:");
        System.out.println("Area: " + myTriangle.calculateArea());
        System.out.println("Perimeter: " + myTriangle.calculatePerimeter());
    }
}
