package creational.singleton_design_pattern.multithreading;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

    // lazy singleton
    private static Singleton singleobj;

    // early singleton (no need of synchronization)
//    private static Singleton singleobj = new Singleton();

    private Singleton() {}

    public static Singleton getObject() {

        // for thread unsafe
//        if(singleobj != null) {
//            return singleobj;
//        }
//        else{
//            singleobj = new Singleton();
//            return singleobj;
//        }

        if(singleobj == null) {
            synchronized(Singleton.class) {
                if(singleobj == null) {
                    singleobj = new Singleton();
                }
            }
        }
        return singleobj;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
