package HavaDurumu;

import java.util.Scanner;

public class Hava {

    public Hava() {
        Scanner scanner = new Scanner(System.in);

        int heat;
        System.out.print("Sicaklik degerini giriniz: ");
        heat = scanner.nextInt();

        if(heat < 5) {
            System.out.println("Kayak Yapabilirsiniz.");
        } else if(heat >=5 && heat <= 25) {
            if(heat <=15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if(heat >=10) {
                System.out.println("Piknige gidebilirsiniz.");
            }
        } else  {
            System.out.println("Yuzmeye gidebilirsiniz.");
        }
    }
}
