package BolenUcDort;

import java.util.Scanner;

public class Bolen {

    public Bolen() {
        Scanner scanner = new Scanner(System.in);

        int number;
        int toplam = 0;

        System.out.print("Sayi Giriniz: ");
        number = scanner.nextInt();

        for(int i=0; i<=number; i++) {
            if(i%3==0 && i%4==0) {
                toplam += i;
            }
        }
        System.out.println("Toplam: "+toplam);
    }
}
