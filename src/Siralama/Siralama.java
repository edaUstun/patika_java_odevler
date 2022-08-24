package Siralama;

import java.util.Scanner;

public class Siralama {

    public Siralama() {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = new int [3];
        int [] number = new int [3];

        for(int i=0; i<=numbers.length-1; i++) {
            System.out.print((i+1) + ". Sayi Giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        if((numbers[0] < numbers[1]) && (numbers[0] < numbers[2])) {
            if(numbers[1] < numbers[2]) {
                System.out.println("1.Sayi < 2.Sayi < 3.Sayi");
            } else {
                System.out.println("1.Sayi < 3.Sayi < 2.Sayi");
            }
        } else if ((numbers[1] < numbers[0]) && (numbers[1] < numbers[2])) {
            if(numbers[0] < numbers[2]) {
                System.out.println("2.Sayi < 1.Sayi < 3.Sayi");
            } else {
                System.out.println("2.Sayi < 3.Sayi < 1.Sayi");
            }
        } else if ((numbers[2] < numbers[1]) && (numbers[2] < numbers[0])) {
            if(numbers[0] < numbers[1]) {
                System.out.println("3.Sayi < 1.Sayi < 2.Sayi");
            } else {
                System.out.println("3.Sayi < 2.Sayi < 1.Sayi");
            }
        }


    }
}
