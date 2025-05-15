package structural.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private static final HashMap<String, Shape> shapes = new HashMap<>();

    public static Shape getCircle(String color) {
        return shapes.computeIfAbsent(color, Circle::new) ;
    }

    public static int getCurrentSizeOfHashmap() {
        return shapes.size();
    }

}
