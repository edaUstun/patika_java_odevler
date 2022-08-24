package DortBesKuvvet;

import java.util.Scanner;

public class Kuvvetleri {

    public Kuvvetleri() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sinir Sayisini Girin: ");
        int number = scanner.nextInt();
        // 2 kuvvetleri
        System.out.println("4 Kuvvetleri");
        for(int i=1; i<=number; i*=4) {
            System.out.println(i);
        }

        System.out.println("5 Kuvvetleri");
        for(int i=1; i<=number; i*=5) {
            System.out.println(i);
        }

        scanner.close();
    }
}
