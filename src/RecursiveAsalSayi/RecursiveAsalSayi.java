package RecursiveAsalSayi;

import java.util.Scanner;

public class RecursiveAsalSayi {

    public void asal(int number, int i) {
        if(i==number) {
            System.out.print(number + " asal sayıdır.");
            return;
        } else if (number%i==0) {
            System.out.print(number + " asal sayı değildir.");
            return;
        }
        asal(number, i + 1);
    }

    public RecursiveAsalSayi() {

        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.print("Sayi Giriniz: ");
        number = scanner.nextInt();

        asal(number, 2);
        scanner.close();
    }
}
