package creational.singleton_design_pattern.multithreading;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton obj = Singleton.getObject();
        Singleton obj1 = Singleton.getObject();
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj == obj1);
    }
}
