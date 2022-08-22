package Circle;

import java.util.Scanner;

public class Circle {
    double pi = 3.14;

    public Circle() {
        int r;
        int x;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dairenin yaricapini giriniz: ");
        r = scanner.nextInt();
        System.out.println("Mekrez acinin olcusunu giriniz: ");
        x = scanner.nextInt();

        System.out.println("Dairenin alani: " + Alan(r));

        System.out.println("Dairenin cevresi: " + Cevre(r));

        System.out.println("Dairenin dilim alani: " + CenterAlan(r,x));

        scanner.close();
    }

    public double Alan(int r) {
        return pi * Math.pow(r,2);
    }

    public double Cevre(int r) {
        return pi * 2 * r;
    }

    public double CenterAlan(int r, int x) {
        return (pi * Math.pow(r,2) * x)/360;
    }
}
