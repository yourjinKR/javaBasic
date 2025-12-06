package org.example.selfmade.oop;

public interface Repairable {
    void repair();

    default void repairByMoney(int money) {
        if (money > 1000) {
            repair();
        }
    }
}
