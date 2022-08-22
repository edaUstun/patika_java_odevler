package Hipotenus;

import java.util.Scanner;

public class Hipotenus {
    public Hipotenus() {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ucgenin kenar uzunluklarini giriniz: ");
        System.out.print("Birinci Kenar: ");
        a = scanner.nextInt();
        System.out.print("Ikinci Kenar: ");
        b = scanner.nextInt();
        System.out.print("Ucuncu Kenar: ");
        c = scanner.nextInt();

        double u = (a+b+c)/2;
        double cevre = 2 * u;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Cevre: " + cevre);
        System.out.println("Alan: " + alan);

        scanner.close();
    }
}
