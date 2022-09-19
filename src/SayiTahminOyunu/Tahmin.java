package SayiTahminOyunu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tahmin {

    public Tahmin() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int right = 0;
        int selected;
        int [] wrong = new int[5];
        boolean isWin = false;
        boolean isMistake = false;

        int randomNumber = random.nextInt(1,100);
        System.out.println(randomNumber);



        while (right < 5) {
            System.out.print("Sayi Giriniz: ");
            selected = scanner.nextInt();

            if(selected < 0 || selected > 99) {
                System.out.println("Lutfen 0-100 arasinda bir sayi seciniz.");
                if(isMistake) {
                    right++;
                    System.out.println("Cok fazla hatali giris yaptiniz. Kalan Hakkiniz : " + (5 - right));
                } else {
                    isMistake = true;
                    System.out.println("Bir daha hatali bir giris yapilirsa hakkiniz azalir.");
                }
                continue;
            }
            if(selected == randomNumber) {
                System.out.println("Dogru Tahmin: Tahmin Edilen Sayi: " + randomNumber);
                isWin =true;
                break;
            } else {

                System.out.println("Hatali Tahmin");
                if(selected > randomNumber) {
                    System.out.println(selected + " sayiniz, gizli sayidan buyuktur.");
                } else {
                    System.out.println(selected + " sayiniz, gizli sayidan kucuktur.");
                }

                wrong[right] = selected;
                right++;
                System.out.println("Kalan Hakkiniz : " + (5-right));
            }


        }

        if(!isWin) {
            System.out.println("Kayvettiniz !");
            if(!isMistake) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
        scanner.close();

    }
}
