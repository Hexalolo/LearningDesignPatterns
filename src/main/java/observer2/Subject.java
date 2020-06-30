package observer2;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void startWork() {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                for(Observer observer : observers) {
                    observer.update();
                }
            }
        });
        thread.start();
    }
}
