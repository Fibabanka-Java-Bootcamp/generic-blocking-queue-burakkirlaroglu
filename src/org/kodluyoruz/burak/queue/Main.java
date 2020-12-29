package org.kodluyoruz.burak.queue;

public class Main {

    public static void main(String[] args) {

        QueueClass<Integer> myQueue = new QueueClass<Integer>();
        QueueClass<String> myQueue2 = new QueueClass<String>();

        int data = 1;
        int data2 = 2;
        int data3 = 3;
        int data4 = 4;

        myQueue.add(data);
        myQueue.add(data2);
        myQueue.add(data3);
        myQueue.add(data4);

        System.out.println(myQueue.pell());
        System.out.println(myQueue.poll());


        String str = "a";
        String str2 = "b";
        String str3 = "c";
        String str4 = "d";

        myQueue2.add(str);
        myQueue2.add(str2);
        myQueue2.add(str3);
        myQueue2.add(str4);

        System.out.println(myQueue2.pell());
        System.out.println(myQueue2.poll());

    }
}
