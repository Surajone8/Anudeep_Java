class Perimeter {
    // Calculate perimeter of a square
    double calculatePerimeter(double s) {
        return 4 * s;
    }

    // Calculate perimeter of a rectangle
    double calculatePerimeter(double l, double b) {
        return 2 * (l + b);
    }

    // Calculate perimeter of a circle
    double calculatePerimeterOfCircle(double r) {
        return 2 * (22.0 / 7.0) * r;
    }
}

public class PerimeterTest {
    public static void main(String[] args) {
        Perimeter p = new Perimeter();

        System.out.println("Perimeter of Square: " + p.calculatePerimeter(4));
        System.out.println("Perimeter of Rectangle: " + p.calculatePerimeter(4, 5));
        System.out.println("Perimeter of Circle: " + p.calculatePerimeterOfCircle(7));
    }
}

/* Output:
Perimeter of Square: 16.0
Perimeter of Rectangle: 18.0
Perimeter of Circle: 43.976190476190474
*/
