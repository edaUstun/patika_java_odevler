package ArtikYil;

import java.util.Scanner;

public class ArtikYil {

    public ArtikYil() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz :");
        int year = scanner.nextInt();
        int sonuc = year%4;

        switch (sonuc){
            case 0:
                System.out.println(year + " bir artık yıldır !");
                break;
            case 1:
                System.out.println(year + " bir artık yıldır değildir !");

        }
    }
}
