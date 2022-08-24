package TekSayiToplam;

import java.util.Scanner;

public class TekSayi {

    public TekSayi() {
        Scanner scanner = new Scanner(System.in);
        int number, total=0;

        do {
            System.out.print("Sayi Giriniz: ");
            number = scanner.nextInt();
            if(number%2==0 && number%4==0) {
                total += number;
            }
        } while (number%2==0);


        System.out.println("Toplam: " + total);


        scanner.close();
    }
}
