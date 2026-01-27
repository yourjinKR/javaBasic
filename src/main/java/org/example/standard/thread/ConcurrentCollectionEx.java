package org.example.standard.thread;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollectionEx {
    public static void main(String[] args) {

        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("null", null); // NullPointerException

    }
}
