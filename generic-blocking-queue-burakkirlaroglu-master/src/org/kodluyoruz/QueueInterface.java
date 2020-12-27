package org.kodluyoruz;

public interface QueueInterface<T> {

    void add(T value);

    T poll();

    T pell();

}
