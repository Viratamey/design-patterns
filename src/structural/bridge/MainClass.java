package structural.bridge;

public class MainClass {

    public static void main(String[] args) {
        RedColor red = new RedColor();
        BlueColor blue = new BlueColor();
        Shape circle = new Circle(red);
        Shape square = new Square(blue);
        square.draw();
        circle.draw();
    }
}
