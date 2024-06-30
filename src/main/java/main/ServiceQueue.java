package main;

import dataStructure.Queue;
import java.util.Random;

public class ServiceQueue {

    public static void main(String[] args) {
        int n = 5;
        var random = new Random();
        int customer = random.nextInt(101);
        Queue queue = new Queue(customer);
        System.out.println("Customer " + customer + " arrived!");
        // Simulates customers arriving
        for (int i = 0; i <= n; i++) {
            customer = random.nextInt(101);
            System.out.println("Customer " + customer + " arrived!");
            queue.enqueue(customer);
        }
        //Simulates customer service
        var node = queue.dequeue();
        while (node != null) {
            System.out.println("Customer served:" + node.getValue());
            node = queue.dequeue();

        }
    }
}
