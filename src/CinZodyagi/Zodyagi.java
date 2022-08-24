package CinZodyagi;

import java.util.Scanner;

public class Zodyagi {

    public Zodyagi() {

        Scanner scanner = new Scanner(System.in);

        int yearBirth;
        String [] zodyagi = new String[12];

        zodyagi[0] = "Maymun";
        zodyagi[1] = "Horoz";
        zodyagi[2] = "Kopek";
        zodyagi[3] = "Domuz";
        zodyagi[4] = "Fare";
        zodyagi[5] = "Okuz";
        zodyagi[6] = "Kaplan";
        zodyagi[7] = "Tavsan";
        zodyagi[8] = "Ejderha";
        zodyagi[9] = "Yilan";
        zodyagi[10] = "At";
        zodyagi[11] = "Koyun";


        System.out.print("Dogum Tarihinizi Giriniz: ");
        yearBirth = scanner.nextInt();

        if(yearBirth%12==0){
            System.out.println("Çin Zodyağı Burcunuz : " + zodyagi[0]);
        } else if (yearBirth%12==1) {
            System.out.println("Çin Zodyağı Burcunuz : " + zodyagi[1]);
        } else if (yearBirth%12==2) {
            System.out.println("Çin Zodyağı Burcunuz : " + zodyagi[2]);
        } else if (yearBirth%12==3) {
            System.out.println("Çin Zodyağı Burcunuz : " + zodyagi[3]);
        } else if (yearBirth%12==4) {
            System.out.println("Çin Zodyağı Burcunuz : " + zodyagi[4]);
        } else if (yearBirth%12==5) {
            System.out.println("Çin Zodyağı Burcunuz : " + zodyagi[5]);
        } else if (yearBirth%12==6) {
            System.out.println("Çin Zodyağı Burcunuz : " + zodyagi[6]);
        } else if (yearBirth%12==7) {
            System.out.println("Çin Zodyağı Burcunuz : " + zodyagi[7]);
        } else if (yearBirth%12==8) {
            System.out.println("Çin Zodyağı Burcunuz : " + zodyagi[8]);
        } else if (yearBirth%12==9) {
            System.out.println("Çin Zodyağı Burcunuz : " + zodyagi[9]);
        } else if (yearBirth%12==10) {
            System.out.println("Çin Zodyağı Burcunuz : " + zodyagi[10]);
        } else if (yearBirth%12==11) {
            System.out.println("Çin Zodyağı Burcunuz : " + zodyagi[11]);
        } else {
            System.out.println("Hatali Giris");
        }
    }
}
