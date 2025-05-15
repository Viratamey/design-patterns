package structural.flyweight;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        String[] colorlist = {"red", "blue", "yellow", "green", "yellow", "green", "blue"};
        for(int i=0; i<colorlist.length; i++) {
            Shape circle = FlyweightFactory.getCircle(colorlist[i]);
            circle.draw(i*20, i*50);
        }
        System.out.println(FlyweightFactory.getCurrentSizeOfHashmap());
    }
}
