package MayinTarlasiOyunu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;

        System.out.println("Mayin Tarlasi Oyununa Hosgeldiniz.");
        System.out.println("==================================");

        System.out.print("Satir Sayisi : ");
        row = scanner.nextInt();
        System.out.print("Sutun Sayisi : ");
        col = scanner.nextInt();

        MineSweeper mineSweeper = new MineSweeper(row,col);
        mineSweeper.run();


        scanner.close();

    }
}
