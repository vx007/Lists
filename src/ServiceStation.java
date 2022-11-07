import transport.Car;
import transport.Transport;
import transport.Truck;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Car, Truck> {
    private Queue<T> queue;

    public ServiceStation() {
        this.queue = new LinkedList<>();
    }

    public void add(T t){
        this.queue.offer(t);
    }

    public T service(){
        return this.queue.poll();
    }

    public Queue<T> getQueue() {
        return queue;
    }
}
