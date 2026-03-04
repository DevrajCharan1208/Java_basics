import java.util.Scanner;

class Shape {
    // Circle
    static class Circle {
        double radius;
        Circle(double r) { this.radius = r; }
        double getArea() { return Math.PI * radius * radius; }
    }

    // Square
    static class Square {
        double side;
        Square(double s) { this.side = s; }
        double getArea() { return side * side; }
    }

    // Rectangle
    static class Rectangle {
        double length, width;
        Rectangle(double l, double w) {
            this.length = l;
            this.width = w;
        }
        double getArea() { return length * width; }
    }

    // Triangle (Base and Height)
    static class Triangle {
        double base, height;
        Triangle(double b, double h) {
            this.base = b;
            this.height = h;
        }
        double getArea() { return 0.5 * base * height; }
    }

    // Cone (Surface Area)
    static class Cone {
        double radius, slantHeight;
        Cone(double r, double l) {
            this.radius = r;
            this.slantHeight = l;
        }
        // Total Surface Area = πr(r + l)
        double getArea() { return Math.PI * radius * (radius + slantHeight); }
    }
}

public class assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Geometry Calculator ---");
        
        // 1. Circle
        System.out.print("Enter Circle radius: ");
        Shape.Circle circle = new Shape.Circle(sc.nextDouble());
        System.out.printf("Circle Area: %.2f\n\n", circle.getArea());

        // 2. Square
        System.out.print("Enter Square side: ");
        Shape.Square square = new Shape.Square(sc.nextDouble());
        System.out.printf("Square Area: %.2f\n\n", square.getArea());

        // 3. Rectangle
        System.out.print("Enter Rectangle length & width: ");
        Shape.Rectangle rect = new Shape.Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.printf("Rectangle Area: %.2f\n\n", rect.getArea());

        // 4. Triangle
        System.out.print("Enter Triangle base & height: ");
        Shape.Triangle tri = new Shape.Triangle(sc.nextDouble(), sc.nextDouble());
        System.out.printf("Triangle Area: %.2f\n\n", tri.getArea());

        // 5. Cone
        System.out.print("Enter Cone radius & slant height: ");
        Shape.Cone cone = new Shape.Cone(sc.nextDouble(), sc.nextDouble());
        System.out.printf("Cone Surface Area: %.2f\n", cone.getArea());

        sc.close();
    }
}