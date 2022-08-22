package indeks;

import java.util.Scanner;

public class IndekHesaplama {

    public IndekHesaplama() {
        Scanner scanner = new Scanner(System.in);

        double boy, kilo;
        double total;

        System.out.print("Boy (m): ");
        boy = scanner.nextDouble();
        System.out.print("Kilo (kg): ");
        kilo = scanner.nextDouble();

        total = kilo / (boy*boy);

        System.out.print("Vucut kilo indeksiniz: " + total);

        scanner.close();
    }
}
