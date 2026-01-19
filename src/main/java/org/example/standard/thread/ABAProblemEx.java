package org.example.standard.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

public class ABAProblemEx {

    // ABA 문제
    static class AbaDemoAtomicInteger {

        public static void main(String[] args) throws InterruptedException {
            AtomicInteger value = new AtomicInteger(100); // A=100

            Thread t1 = new Thread(() -> {
                int expected = value.get(); // 100
                sleep(300); // t2가 A->B->A 할 시간 주기

                boolean success = value.compareAndSet(expected, 200);
                System.out.println("[t1] expected=" + expected
                        + ", CAS success=" + success
                        + ", current=" + value.get());
            });

            Thread t2 = new Thread(() -> {
                sleep(100);
                boolean s1 = value.compareAndSet(100, 101); // A->B
                boolean s2 = value.compareAndSet(101, 100); // B->A
                System.out.println("[t2] 100->101=" + s1 + ", 101->100=" + s2
                        + ", current=" + value.get());
            });

            t1.start();
            t2.start();
            t1.join();
            t2.join();

            // 출력 예시:
            // [t2] 100->101=true, 101->100=true, current=100
            // [t1] expected=100, CAS success=true, current=200  <-- 중간 변경을 모르고 성공
        }

        private static void sleep(long ms) {
            try { Thread.sleep(ms); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
    }

    // ABA 문제를 해결
    static public class AbaFixStampedReference {

        public static void main(String[] args) throws InterruptedException {
            AtomicStampedReference<Integer> ref = new AtomicStampedReference<>(100, 0);

            Thread t1 = new Thread(() -> {
                int[] stampHolder = new int[1];
                Integer expectedValue = ref.get(stampHolder);
                int expectedStamp = stampHolder[0];

                sleep(300);

                boolean success = ref.compareAndSet(expectedValue, 200, expectedStamp, expectedStamp + 1);
                int[] afterStamp = new int[1];
                Integer afterValue = ref.get(afterStamp);

                System.out.println("[t1] expected=(" + expectedValue + ", stamp=" + expectedStamp + ")"
                        + ", CAS success=" + success
                        + ", current=(" + afterValue + ", stamp=" + afterStamp[0] + ")");
            });

            Thread t2 = new Thread(() -> {
                sleep(100);

                int[] stampHolder = new int[1];
                Integer v1 = ref.get(stampHolder);
                int s1 = stampHolder[0];

                boolean aToB = ref.compareAndSet(100, 101, s1, s1 + 1);

                int[] stampHolder2 = new int[1];
                Integer v2 = ref.get(stampHolder2);
                int s2 = stampHolder2[0];

                boolean bToA = ref.compareAndSet(101, 100, s2, s2 + 1);

                int[] afterStamp = new int[1];
                Integer afterValue = ref.get(afterStamp);

                System.out.println("[t2] A->B=" + aToB + ", B->A=" + bToA
                        + ", current=(" + afterValue + ", stamp=" + afterStamp[0] + ")");
            });

            t1.start();
            t2.start();
            t1.join();
            t2.join();

            // 핵심: t1의 CAS가 보통 false가 됨 (stamp가 달라져서)
        }

        private static void sleep(long ms) {
            try { Thread.sleep(ms); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
    }



}
