package Taksi;

import java.util.Scanner;

public class Taksimetre {

    public Taksimetre() {
        double mesafe;
        double perKm = 2.20;
        double startPrice = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz: ");
        mesafe = scanner.nextDouble();

        double total = startPrice + (mesafe*perKm);

        if(total<20) {
            System.out.println("Odenecek tutar 20 TL");
        } else if (total>20) {
            System.out.println("Ucret:" + total);
        }

        scanner.close();
    }
}
