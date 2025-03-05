package creational.singleton_design_pattern.lazy_initialization.synchronization_optimised;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<Runnable> runnable = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();
        for(int i=0; i<100000; ++i) {
            Runnable r = () ->  System.out.println(SingletonOptimized.getInstance());
            runnable.add(r);
            threads.add(new Thread(r));
        }

        long starttime = System.currentTimeMillis();
        synchronized(MainClass.class) {
            for(Thread thread : threads) {
                thread.start();
            }
        }

        synchronized(MainClass.class) {
            long endtime = System.currentTimeMillis();
            System.out.println(endtime-starttime);
        }



    }
}
