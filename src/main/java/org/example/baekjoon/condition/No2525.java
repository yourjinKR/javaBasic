package org.example.baekjoon.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] time = br.readLine().split(" ");

        int h = Integer.parseInt(time[0]);
        int m = Integer.parseInt(time[1]);
        int cook = Integer.parseInt(br.readLine());

        m += cook;

        if (m > 59) {
            h += m / 60;
            m = m % 60;

            if (h > 23) {
                h = h % 24;
                System.out.printf("%d %d", h, m);
            } else {
                System.out.printf("%d %d", h, m);
            }

        } else {
            System.out.printf("%d %d", h, m);
        }
    }


    /*

    import java.util .*;
    import java.io .*;

        public class Main {
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());

                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                int C = Integer.parseInt(br.readLine());

                int totaltime = A * 60 + B + C;
                int totalH = (totaltime / 60) % 24;
                int totalM = totaltime % 60;

                System.out.printf("%d %d", totalH, totalM);

            }
        }

     */
}

/*
조기반환에 대해 고민해보자
 */