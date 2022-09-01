package DeseneGoreMetot;

import java.util.Scanner;

public class DesenMetot {

    public void metot(int num){
        if (num>0) {
            System.out.println(num);
            metot(num-5);
        }
        System.out.println(num);
    }


    public DesenMetot(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n =scanner.nextInt();

        metot(n);

        scanner.close();
    }
}
