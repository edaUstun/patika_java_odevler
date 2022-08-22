package SinifDurum;

import java.util.Scanner;

public class Ortalama {

    public Ortalama() {
        Scanner scanner = new Scanner(System.in);

        int mat, fiz, kim, turk, muzik;

        System.out.print("Matematik notunuz: ");
        mat = scanner.nextInt();

        System.out.print("Fizik notunuz: ");
        fiz = scanner.nextInt();

        System.out.print("Kimya notunuz: ");
        kim = scanner.nextInt();

        System.out.print("Turkce notunuz: ");
        turk = scanner.nextInt();

        System.out.print("Muzik notunuz: ");
        muzik = scanner.nextInt();

        double total = 0.0;

        if(mat>=0 && mat<=100) {
            total += mat;
            if(fiz>=0 && fiz<=100) {
                total += fiz;
                if (kim>=0 && kim<=100) {
                    total += kim;
                    if (turk>=0 && turk<=100) {
                        total += turk;
                        if (muzik>=0 && muzik<=100) {
                            total += muzik;
                        }
                    }
                }
            }
        } else {
            System.out.println("Hatali Giris");
        }
        System.out.println(total);

        double average = total / 5.0;
        System.out.println(average);

        if (average>=50) {
            System.out.println("Sinifi Gectiniz");
        } else {
            System.out.println("Sinifta Kaldiniz");
        }

        System.out.println("Ortalamaniz: " + average);

        scanner.close();
    }
}
