abstract class Shape {
    abstract double calculate_area();

    void display_info() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double calculate_area() {
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    double calculate_area() {
        return l * b;
    }
}

class TestShape {
    public static void main(String[] args) {

        // Shape s = new Shape();  // This will give compile error

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.display_info();
        System.out.println("Circle Area: " + c.calculate_area());

        r.display_info();
        System.out.println("Rectangle Area: " + r.calculate_area());
    }
}