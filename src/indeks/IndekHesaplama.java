package indeks;

import java.util.Scanner;

public class IndekHesaplama {

    public IndekHesaplama() {
        Scanner scanner = new Scanner(System.in);

        double boy, kilo;
        double bmi;

        System.out.print("Boy (m): ");
        boy = scanner.nextDouble();
        System.out.print("Kilo (kg): ");
        kilo = scanner.nextDouble();

        bmi = kilo / (boy*boy);

        System.out.print("Vucut kilo indeksiniz: " + bmi);

        scanner.close();
    }
}
