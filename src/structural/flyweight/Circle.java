package structural.flyweight;

public class Circle implements Shape {

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("drawing Circle : color " + color + ":" + x + ":" + y);
    }
}
