package ATM;

import java.util.Scanner;

public class Atm {

    public Atm() {

        Scanner scanner = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        String userName, password;

        while (right > 0){
            System.out.print("Kullanici adi: ");
            userName = scanner.nextLine();
            System.out.print("Kullanici parolasi: ");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("1234")){
                System.out.println("Merhaba, X Bankasina Hosgeldiniz..");
                System.out.println("1- Para Yatirma\n" +
                        "2- Para Cekme\n" +
                        "3- Bakiye Sorgulama\n" +
                        "4- Cikis"
                );
                System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz: ");
                int secim = scanner.nextInt();
                int money = 0;
                switch (secim) {
                    case 1:
                        System.out.println("Ne kadar para yatirmak istersiniz: ");
                        money = scanner.nextInt();
                        balance += money;
                        System.out.println("Yeni Bakiyeniz: " + balance);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Ne kadar para cekmek istersiniz: ");
                        money = scanner.nextInt();
                        balance -= money;
                        System.out.println("Yeni Bakiyeniz: " + balance);
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: " + balance);
                        break;
                    default:
                        System.out.println("Gule Gule");
                }
                break;
            } else {
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar Deneyiniz..");
                if(right==0){
                    System.out.println("Hesabiniz bloke olmustur lutfen banka ile iletisime giriniz.");
                } else {
                    System.out.println("Kalan Hakkiniz : " + right);
                }
            }

            scanner.close();

        }
    }
}
