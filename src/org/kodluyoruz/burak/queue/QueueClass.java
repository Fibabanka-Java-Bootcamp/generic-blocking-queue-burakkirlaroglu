package org.kodluyoruz.burak.queue;

public class QueueClass<T> implements QueueInterface<T> {

    private Node<T> first;
    private Node<T> last;

    @Override
    public void add(T value) {
        Node<T> node = new Node<>(value);
        if(first == null){
            first = node;
            last = node;
        }else {
            last.setNextNode(node);
            last = node;
        }
    }

    @Override
    public T poll() {
        return first != null ? first.getValue() : null;
    }

    @Override
    public T pell() {
        T value = null;
        if (first != null){
            Node<T> node = first;
            first = first.getNextNode();
            value = node.getValue();
        }
        return value;
    }
}
