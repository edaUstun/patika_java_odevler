package UsAlma;

import java.util.Scanner;

public class UsAlma {

    public UsAlma() {

        Scanner scanner = new Scanner(System.in);

        int exponent;
        int power;
        int total=1;

        System.out.print("US: ");
        exponent = scanner.nextInt();
        System.out.print("TABAN: ");
        power = scanner.nextInt();

        for(int i=1; i<=power+1; i++) {
            total = i * (exponent);
        }
        System.out.println(total);

        scanner.close();
    }
}
