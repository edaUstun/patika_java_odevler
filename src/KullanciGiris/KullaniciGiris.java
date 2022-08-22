package KullanciGiris;

import java.util.Scanner;

public class KullaniciGiris {

    public KullaniciGiris() {
        Scanner scanner = new Scanner(System.in);

        String username, password;
        String newPassword;
        String reset;

        System.out.print("Kullanici Adiniz: ");
        username = scanner.nextLine();

        System.out.print("Sifreniz: ");
        password = scanner.nextLine();


        if (username.equals("patika") && password.equals("java123")) {
            System.out.print("Başarıyla giriş yaptınız.");
        }
        else if (!(username.equals("patika") && password.equalsIgnoreCase(""))) {
            System.out.println("Kullanıcı adınız veya şifreniz hatalı.");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H):");
            reset = scanner.nextLine();

            if (reset.equals("H")) {
                System.out.print("Lütfen tekrar giriş yapmak için sayfayı yenileyiniz.");
            }
            else if (reset.equals("E")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = scanner.nextLine();

                while (newPassword.equals("java123") || newPassword.equals(password)) {
                    System.out.print("Şifreniz oluşturulamadı. Farklı bir şifre ile tekrar deneyin: ");
                    newPassword = scanner.nextLine();
                }

                System.out.print("Şifreniz başarıyla oluşturuldu.\nYeniden Giriş yapabilirsiniz.\nKullanıcı Adınız: ");
                username = scanner.nextLine();

                System.out.print("Şifreniz: ");
                password = scanner.nextLine();

                if (username.equals("patika") && password.equals(newPassword)) {
                    System.out.print("Başarıyla giriş yaptınız.");
                } else {
                    System.out.println("Kullanıcı adınız veya şifreniz hatalı.");
                }

            }


        }


        scanner.close();
    }
}
