package org.kodluyoruz.burak.queue;

public class QueueClass<T> implements QueueInterface<T> {

    private Node<T> first;
    private Node<T> last;

    @Override
    public void add(T value) {
        Node<T> node = new Node<>(value);
        if(first == null){
            synchronized (QueueClass.class){
                first = node;
                last = node;
            }
        }else {
            last.setNextNode(node);
            last = node;
        }
    }

    @Override
    public T poll() {
        synchronized (QueueClass.class){
            if(first != null){
                return first.getValue();
            }else {
                return null;
            }
        }
    }

    @Override
    public T pell() {
        T value = null;
        if (first != null){
            synchronized (QueueClass.class){
                Node<T> node = first;
                first = first.getNextNode();
                value = node.getValue();
            }
        }
        return value;
    }
}
