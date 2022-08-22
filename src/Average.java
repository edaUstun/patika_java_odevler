import java.util.Scanner;

public class Average {

    public Average() {
        Scanner scanner = new Scanner(System.in);

        int mat, fiz, kim, turk, muzik, tarih;

        System.out.println("Matematik notunuz: ");
        mat = scanner.nextInt();

        System.out.println("Fizik notunuz: ");
        fiz = scanner.nextInt();

        System.out.println("Kimya notunuz: ");
        kim = scanner.nextInt();

        System.out.println("Turkce notunuz: ");
        turk = scanner.nextInt();

        System.out.println("Tarih notunuz: ");
        tarih = scanner.nextInt();

        System.out.println("Muzik notunuz: ");
        muzik = scanner.nextInt();

        int toplam = (mat+fiz+kim+turk+muzik+tarih);
        System.out.println(toplam);
        double sonuc = toplam / 6.0;
        System.out.println(sonuc);

        while (sonuc>=60) {
            System.out.println("Sinifi Gectiniz");
            break;
        }
        while (sonuc<60) {
            System.out.println("Sinifta Kaldiniz");
            break;
        }

        scanner.close();
    }
}
