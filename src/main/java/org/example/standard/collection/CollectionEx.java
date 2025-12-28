package org.example.standard.collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class CollectionEx {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<>();
        List<?> list2 = new LinkedList<>();

        ArrayList<?> list3 = new ArrayList<>(list2);
        LinkedList<?> list4 = new LinkedList<>(list2);

        Vector<?> v = new Vector<>();

        Iterator<?> iterator = list1.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }





        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(5);
        queue.add(1);
        queue.add(2);
        queue.add(4);
        queue.add(3);

        System.out.println(queue.poll()); // 1
        System.out.println(queue.poll()); // 2
        System.out.println(queue.poll()); // 3
        System.out.println(queue.poll()); // 4
        System.out.println(queue.poll()); // 5
        System.out.println(queue.poll()); // null
    }
}

