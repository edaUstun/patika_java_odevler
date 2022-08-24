package UcakBilet;

import java.util.Scanner;

public class Bilet {

    public Bilet() {
        Scanner scanner = new Scanner(System.in);

        int mesafe;
        int age;
        int ucusTip;

        double ucret = 0.10;

        /*

         */

        System.out.print("Gidilecek mesafe (km): ");
        mesafe = scanner.nextInt();
        System.out.print("Yasiniz: ");
        age = scanner.nextInt();
        System.out.print("Ucus Tipi: (1 => Tek Yon, 2 => Cift Yon): ");
        ucusTip = scanner.nextInt();

        double tutar = mesafe * ucret;
        double indirimliTutar = 0;

        if(mesafe<=0 || age<=0) {
            System.out.println("Hatali Mesafe ya da Yas Girisi");
        } else  {
            if(age<12) {
                System.out.println("Net Tutar: " +tutar);
                indirimliTutar = tutar - (tutar*0.50);
                if (ucusTip==1) {
                    System.out.println("Indirilim tutar(yas<12 , %50) : " + indirimliTutar);
                } else if(ucusTip ==2) {
                    indirimliTutar = (indirimliTutar - (indirimliTutar*0.20))*2;
                    System.out.println("Indirilim tutar(ucus tip 2 , %20) : " + indirimliTutar);
                } else {
                    System.out.println("Hatali Ucus Tipi Girisi");
                }
            } else if (age>=12 && age<=24) {
                indirimliTutar = tutar - (tutar*0.10);
                System.out.println("Indirilim tutar(yas 12-24 , %10) : " + indirimliTutar);
                if (ucusTip==1) {
                    System.out.println("Indirilim tutar(yas<12 , %50) : " + indirimliTutar);
                } else if(ucusTip ==2) {
                    indirimliTutar = (indirimliTutar - (indirimliTutar*0.20))*2;
                    System.out.println("Indirilim tutar(ucus tip 2 , %20) : " + indirimliTutar);
                } else {
                    System.out.println("Hatali Ucus Tipi Girisi");
                }
            } else if (age>65) {
                tutar = tutar - (tutar*0.30);
                System.out.println("Indirilim tutar(yas>65 , %30) : " + tutar);
                if (ucusTip==1) {
                    System.out.println("Indirilim tutar(yas<12 , %50) : " + indirimliTutar);
                } else if(ucusTip ==2) {
                    indirimliTutar = (indirimliTutar - (indirimliTutar*0.20))*2;
                    System.out.println("Indirilim tutar(ucus tip 2 , %20) : " + indirimliTutar);
                } else {
                    System.out.println("Hatali Ucus Tipi Girisi");
                }
            }
        }

        scanner.close();
    }
}
