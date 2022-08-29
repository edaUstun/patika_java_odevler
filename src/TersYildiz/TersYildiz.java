package TersYildiz;

import java.util.Scanner;

public class TersYildiz {

    public TersYildiz() {

        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.print("Basamak Sayisi: ");
        number = scanner.nextInt();

        for (int i=number-1; i>=1; i--){

            for(int j=number-i; j>=1; j--){
                System.out.print(" ");
            }

            for (int j=2*i-1; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
