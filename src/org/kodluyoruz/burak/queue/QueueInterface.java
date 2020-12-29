package org.kodluyoruz.burak.queue;

public interface QueueInterface<T> {

    void add(T value);

    T poll();

    T pell();

}
