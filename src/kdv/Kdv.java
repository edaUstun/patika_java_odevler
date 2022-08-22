package kdv;

import java.util.Scanner;

public class Kdv {

    public Kdv() {
        Scanner scanner = new Scanner(System.in);
        double price, kdvOrani, kdvTutar, kdvliTutar;

        System.out.println("Ucreti giriniz: ");
        price = scanner.nextDouble();

        kdvOrani = price > 0 && price < 1000 ? 0.18 : 0.08;

        kdvTutar = price * kdvOrani;
        kdvliTutar = price + kdvTutar;

        System.out.println("kdv'siz: " + price);
        System.out.println("kdv orani: " + kdvOrani);
        System.out.println("kdv tutari: " + kdvTutar);
        System.out.println("kdv'li: " + kdvliTutar);

    }
}
