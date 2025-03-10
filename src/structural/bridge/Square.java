package structural.bridge;


// Refined Abstraction
public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    public void draw() {
        System.out.println("drawing square");
        color.fill();
    }

}
