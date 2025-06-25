package Java_Constructors.Level1;

public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius + ", Area: " + getArea());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(4.5);
        c1.display();
        c2.display();
    }
}
