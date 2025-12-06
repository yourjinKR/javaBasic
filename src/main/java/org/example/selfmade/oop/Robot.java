package org.example.selfmade.oop;

public class Robot implements Repairable {
    @Override
    public void repair() {
        System.out.println("로봇을 수리함");
    }
}
