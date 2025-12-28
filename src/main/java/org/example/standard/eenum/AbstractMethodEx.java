package org.example.standard.eenum;

public class AbstractMethodEx {

    enum TransPort {

        BUS(100),
        TRAIN(500),
        SHIP(1000),
        AIRPLANE(5000)
        ;

        private final int BASIC_FARE;

        TransPort(int BASIC_FARE) {
            this.BASIC_FARE = BASIC_FARE;
        }

        public int getBASIC_FARE() {
            return BASIC_FARE;
        }
    }

    public static void main(String[] args) {

    }
}
