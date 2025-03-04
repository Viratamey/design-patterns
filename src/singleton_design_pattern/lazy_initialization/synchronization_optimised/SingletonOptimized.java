package singleton_design_pattern.lazy_initialization.synchronization_optimised;

public class SingletonOptimized {

    private SingletonOptimized() {};

    private static SingletonOptimized singletonInstance;

    public static SingletonOptimized getInstance() {
        if(singletonInstance == null) {
            synchronized(SingletonOptimized.class) {
                if(singletonInstance == null) {
                    singletonInstance = new SingletonOptimized();
                }
            }
        }
        return singletonInstance;
    }

}
