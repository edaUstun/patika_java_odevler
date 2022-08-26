package BasamakToplam;

import java.util.Scanner;

public class BasamakToplama {

    public BasamakToplama() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi Giriniz: ");
        int number = scanner.nextInt();

        int tempNumber = number;
        int basNumber = 0;
        int basValue;
        int total = 0;
        int basPow;



        while (tempNumber!=0) {
            tempNumber /= 10;
            basNumber++;
        }
        System.out.println("Basamak Sayi: " + basNumber);

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber%10;
            System.out.println(basValue);
            total += basValue;
            tempNumber /= 10;
        }

        System.out.println(total);

        scanner.close();
    }
}

/*
    Armstrong Number

        System.out.print("Sayi Giriniz: ");
        int number = scanner.nextInt();

        int tempNumber = number;
        int basNumber = 0;
        int basValue;
        int total = 0;
        int basPow;



        while (tempNumber!=0) {
            tempNumber /= 10;
            basNumber++;
        }
        System.out.println("Basamak Sayi: " + basNumber);

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber%10;
            System.out.println(basValue);
            basPow = 1;
            for(int i=1; i<=basNumber; i++){
                basPow *= basValue;
            }
            total += basPow;
            tempNumber /= 10;
        }

        System.out.println(total);

        if(total == number) {
            System.out.println(number + " sayisi bir Armstrong sayisidir.");
        } else {
            System.out.println(number + " sayisi bir Armstrong sayi degildir..");
        }
 */
