package org.example.standard.generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.example.standard.compare.Player;

public class GenericEx {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("1");
        list.add("2");

        System.out.println(list.get(0));


        // List<int> intList1 = new ArrayList<>(); // 불가능!
        List<Integer> intList2 = new ArrayList<>();


    }

    // 제네릭 없이
    static class TotalComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            if (o1 instanceof Player p1 && o2 instanceof Player p2) {
                return Integer.compare(p1.getLevel(), p2.getLevel());
            }
            return -1;
        }
    }

    static class Test<T> {
        // An object of type T is declared
        T obj;
        Test(T obj) { this.obj = obj; } // constructor
        public T getObject() { return this.obj; }
    }

    static class Geeks {
        public static void main(String[] args)
        {
            // instance of Integer type
            Test<Integer> iObj = new Test<Integer>(15);
            System.out.println(iObj.getObject());

            // instance of String type
            Test<String> sObj
                    = new Test<String>("GeeksForGeeks");
            System.out.println(sObj.getObject());

//             iObj = sObj; // This results an error
        }
    }

}
