package singelton_design_pattern.lazy_initialization;

public class SingletonClass {
    private static SingletonClass singletonInstance;

    private SingletonClass() {} ;

    public static SingletonClass getInstance() {
        if(singletonInstance == null) {
            singletonInstance = new SingletonClass();
            return singletonInstance;
        }
        else {
            return singletonInstance;
        }
    };

}
