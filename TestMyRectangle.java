public class TestMyRectangle {
    public static void main(String[] args) {
        // Test constructor and toString
        MyPoint topLeft = new MyPoint(1, 8);
        MyPoint bottomRight = new MyPoint(4, 3);
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
