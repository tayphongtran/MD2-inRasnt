package com.company;

import java.util.Scanner;

public class DuyetMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int num = 0;
        int i = 0;

        String inra = "";

        for (i = 1; i <= number; i++) {
            int couter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    couter++;
                }
            }
            if (couter == 2) {
                inra = inra + i + " ";
            }
        }
        System.out.println("cac snt can in ra tu 1 den : " + number);
        System.out.println(inra + "");

    }
}
