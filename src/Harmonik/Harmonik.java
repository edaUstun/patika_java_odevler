package Harmonik;

import java.util.Scanner;

public class Harmonik {

    public Harmonik() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi: ");
        int number = scanner.nextInt();

        double result = 0;
        for(double i=1; i<=number; i++) {
            result += (1/i);
        }
        System.out.println(result);
    }
}
