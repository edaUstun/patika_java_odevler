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
        System.out.println("Dairenin merkez acisinin olcusunu giriniz: ");
        x = scanner.nextInt();

        System.out.println("Dairenin alani: " + Alan(r, x));
    }

    public double Alan(int r, int x) {
        return (pi * Math.pow(r,2) * x)/360;
    }

}
