package MukemmelSayi;

import java.util.Scanner;

public class MukemmelSayi {

    public MukemmelSayi() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();

        int total = 0;
        for(int i=1; i<num; i++) {
            if(num%i==0) {
                total += i;
            }
        }
        if(total==num) {
            System.out.println(num + " Mükemmel sayıdır.");
        } else {
            System.out.println(num + " Mükemmel sayı değildir.");
        }

        scanner.close();
    }
}
