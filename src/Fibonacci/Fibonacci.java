package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public Fibonacci() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Eleman sayisi: ");
        int number = scanner.nextInt();

        int first = 0;
        int second = 1;
        int third = 1;

        for(int i=1; i<=number; i++) {
            third = second + first;
            System.out.println(first + " + " + second + " = " + third);

            first = second;
            second = third;

        }
    }
}
