package structural.bridge;

// Refined Abstraction
public class Circle extends Shape {

    public Circle(Color color){
        super(color);
    }

    public void draw() {
        System.out.println("drawing circle");
        this.color.fill();
    }
}
