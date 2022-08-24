package Kombinasyon;

import java.util.Scanner;

public class Kombinasyon {

    public Kombinasyon() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kombinasyon icin gerekli sayilari giriniz: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        factorial(number1);
        factorial(number2);
        factorial((number1-number2));

        int combination = factorial(number1) / (factorial(number2) * factorial((number1-number2)));
        System.out.println("Kombinasyonu: " + combination);
        scanner.close();
    }

    public int factorial(int number) {
        int fact=1;
        for(int i=1; i<=number; i++) {
            fact *= i;
        }
        return fact;
    }
}
