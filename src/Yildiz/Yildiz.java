package Yildiz;

import java.util.Scanner;

public class Yildiz {

    public Yildiz() {
        System.out.print("Sayi: ");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n-1; i>=1; i--){

            for(int j=n-i; j>=1; j--){
                System.out.print(" ");
            }

            for (int j=2*i-1; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}

/*
for(int i=1; i<=number; i++) {
            System.out.print(" ");
            for (int j=i; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
 */
