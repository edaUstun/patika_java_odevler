package GelismisHesapMakinesi;

import java.util.Scanner;

public class GelismisHesapMakinesi {

    public int sum(int a, int b) {
        int sonuc = a + b;
        System.out.println("Toplam: "+sonuc);
        return sonuc;
    }

    public int minus(int a, int b) {
        int sonuc = a - b;
        System.out.println("Cikarma: "+sonuc);
        return sonuc;
    }

    public int times(int a, int b) {
        int sonuc = a * b;
        System.out.println("Carpma: "+sonuc);
        return sonuc;
    }

    public int divided(int a, int b) {
        int sonuc=0;
        if(a>b && b>0) {
            sonuc = a / b;
            System.out.println("Bolme: "+sonuc);
        } else {
            System.out.println("Girilen sayilar bolme islemi icin uygun degildir.");
        }
        return sonuc;
    }

    public int mod(int a, int b) {
        int sonuc = a % b;
        System.out.println(a+ "'nin " + b + "'ye bolumunden Kalan: "+sonuc);
        return sonuc;
    }

    public int power(int a, int b) {
        int result = 1;
        for(int i=1; i<=b; i++) {
            result *= a;
        }
        System.out.println("Us: " + result);
        return result;
    }

    public void calc(int a, int b) {
        System.out.println("Cevre: " + (2*(a+b)));
        System.out.println("Alan: " + (a*b));
    }


    public GelismisHesapMakinesi() {

        Scanner  scanner = new Scanner(System.in);

        int select;

        String menu = "1- Toplama Islemi\n" +
                "2- Cikarma Islemi\n" +
                "3- Carpma Islemi\n" +
                "4- Bolme Islemi\n" +
                "5- Uslu Sayi Hesaplama\n" +
                "6- Mod Alma\n" +
                "7- Dikdortgen Alan ve Cevre Hesabi\n" +
                "0- Cikis Yap";

            System.out.println(menu);
            while (true) {
                System.out.print("Bir islem seciniz: ");
                select = scanner.nextInt();

                if(select==0) {
                    break;
                }

                System.out.print("Birinci sayi: ");
                int a = scanner.nextInt();
                System.out.print("Ikinci sayi: ");
                int b = scanner.nextInt();


                switch (select) {
                    case 1:
                        sum(a, b);
                        break;
                    case 2:
                        minus(a, b);
                        break;
                    case 3:
                        times(a, b);
                        break;
                    case 4:
                        divided(a, b);
                        break;
                    case 5:
                        power(a, b);
                        break;
                    case 6:
                        mod(a, b);
                        break;
                    case 7:
                        calc(a, b);
                        break;
                    default:
                        System.out.println("Gecersiz bir islem sectiniz!!!");
                }

            }

        System.out.println("Gule gule");


        scanner.close();
    }
}
