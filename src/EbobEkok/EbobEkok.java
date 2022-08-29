package EbobEkok;

import java.util.Scanner;

public class EbobEkok {

    public EbobEkok() {

        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        int ebob = 1;
        int ekok = 1;
        boolean control = false;

        do {
            System.out.print("sayi 1: ");
            num1 = scanner.nextInt();
            System.out.print("sayi 2: ");
            num2 = scanner.nextInt();

            if (num1 <= 0 || num2 <=0) {
                System.out.println("Ebob ve Ekok icin negatif sayi girmeyiniz");
            } else  {
                control = true;
            }
        } while (!control) ;

        if(num2 < num1) {
            int tepNumber = num2;
            num2 = num1;
            num1 = tepNumber;
        }

        int i = num1;


        while (i >= 1) {
            if(num1 % i ==0 && num2 % i == 0) {
                System.out.println(num1 + " ve " + num2 + "' nin Ebob' u : " + i);
                break;
            } else {
                i--;
            }
        }

        System.out.println(num1 + " ve " + num2 + "' nin Ekok' u : " + (num1*num2)/i);

        scanner.close();
    }
}


