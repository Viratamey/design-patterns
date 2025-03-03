package singelton_design_pattern.lazy_initialization.synchronization_optimised;

public class SingletonOptimized {

    private SingletonOptimized() {};

    private static SingletonOptimized singletonInstance;

    public static SingletonOptimized getInstance() {
        if(singletonInstance != null) {
            return singletonInstance;
        }
        else{
            synchronized(SingletonOptimized.class) {
                singletonInstance = new SingletonOptimized();
                return singletonInstance;
            }
        }
    }

}
