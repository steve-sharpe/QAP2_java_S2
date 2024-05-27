public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructors

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and Setters

    public MyPoint getTopLeft() {
        return this.topLeft;
    }

    public MyPoint getBottomRight() {
        return this.bottomRight;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // toString, getArea, getPerimeter

    public String toString() {
        return "MyRectangle[topLeft=" + this.topLeft + ", bottomRight=" + this.bottomRight + "]";
    }

    public double getArea() {
        int width = this.bottomRight.getX() - this.topLeft.getX();
        int height = this.topLeft.getY() - this.bottomRight.getY();
        return width * height;
    }

    public double getPerimeter() {
        int width = this.bottomRight.getX() - this.topLeft.getX();
        int height = this.topLeft.getY() - this.bottomRight.getY();
        return 2 * (width + height);
    }
}
