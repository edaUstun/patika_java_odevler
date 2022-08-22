package ManavKasa;

import java.util.Scanner;

public class Kasa {

    public Kasa() {
        Scanner scanner = new Scanner(System.in);

        double armutKg = 2.14;
        double elmaKg = 3.67;
        double domatesKg = 1.11;
        double muzKg = 0.95;
        double patlicanKg = 5.00;

        double armut, elma, domates, muz, patlican;

        System.out.print("Armut Kaç Kilo ? : ");
        armut = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        elma = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        domates = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        muz = scanner.nextDouble();

        System.out.print("Patlican Kaç Kilo ? : ");
        patlican = scanner.nextDouble();

        double total = (armut*armutKg) + (elma*elmaKg) + (domates*domatesKg) + (muz*muzKg) + (patlican*patlicanKg);
        System.out.print("Toplam Tutar : " + total + " TL");

        scanner.close();
    }
}
