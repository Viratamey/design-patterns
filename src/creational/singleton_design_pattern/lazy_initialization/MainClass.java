package creational.singleton_design_pattern.lazy_initialization;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<Runnable> runnable = new ArrayList<Runnable>();
        for(int i=0; i<10; ++i) {
            Runnable r = () -> { System.out.println(SingletonClass.getInstance()); };
            runnable.add(r);
        }
        List<Thread> threads = new ArrayList<>();

        for(Runnable r : runnable) {
            threads.add(new Thread(r));
        }

        for(Thread thread : threads) {
            thread.start();
        }

        runnable.clear();
        threads.clear();
        System.out.println(runnable.size());
        for(int i=0; i<100000; ++i) {
            Runnable r = () -> { System.out.println(SingletonClassSynchronized.getInstance()); };
            runnable.add(r);
        }

        for(Runnable r : runnable) {
            threads.add(new Thread(r));
        }

        long startTime = System.currentTimeMillis();
        synchronized(MainClass.class) {
            for(Thread thread : threads) {
                thread.start();
            }
        }

        synchronized(MainClass.class) {
            long endTime = System.currentTimeMillis();
            System.out.println(endTime-startTime);
        }
    }
}
