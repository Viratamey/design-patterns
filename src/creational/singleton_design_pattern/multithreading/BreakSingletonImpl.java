package creational.singleton_design_pattern.multithreading;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonImpl {
    public static void main (String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, CloneNotSupportedException {
        Singleton originalSingleton = Singleton.getObject();
        Singleton s2 = Singleton.getObject();
        System.out.println(originalSingleton.hashCode());
        System.out.println(s2.hashCode());
        System.out.println();

        // Reflection
        Class<?> singletonClass = Class.forName("creational.singleton_design_pattern.multithreading.Singleton");
        Constructor<Singleton> constructor = (Constructor<Singleton>) singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton brokenSingletonUsingReflection = constructor.newInstance();
        System.out.println(originalSingleton.hashCode());
        System.out.println(brokenSingletonUsingReflection.hashCode());
        System.out.println();


        // Serialization breaking

            // Serialization
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/creational/singleton_design_pattern/multithreading/ser"));
        outputStream.writeObject(originalSingleton);
        outputStream.close();

            // DeSerialization
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("./src/creational/singleton_design_pattern/multithreading/ser"));
        Singleton brokenSingletonUsingSerialize = (Singleton) inputStream.readObject();
        System.out.println(originalSingleton.hashCode());
        System.out.println(brokenSingletonUsingSerialize.hashCode());
        System.out.println();


        // Cloning
        Singleton brokenSingletonUsingCloning = (Singleton) originalSingleton.clone();
        System.out.println(originalSingleton.hashCode());
        System.out.println(brokenSingletonUsingCloning.hashCode());
        System.out.println();




    }
}
