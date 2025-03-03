package singelton_design_pattern.lazy_initialization;

public class SingletonClassSynchronized {

    private SingletonClassSynchronized() {};
    private static SingletonClassSynchronized singletonInstance;
    public static synchronized SingletonClassSynchronized getInstance() {
        if(singletonInstance == null) {
            singletonInstance = new SingletonClassSynchronized();
            return singletonInstance;
        }
        else {
            return singletonInstance;
        }
    };
}
