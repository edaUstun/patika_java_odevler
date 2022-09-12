package DiziElemanSiralama;

import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanSiralama {

    public DiziElemanSiralama() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = scanner.nextInt();

        int [] array = new int[n];
        System.out.println("Dizinin elemanlarını giriniz :");
        for(int i=0; i<array.length; i++) {
            System.out.print((i+1) + ". Elemanı : ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.print("Siralama : ");
        for(int i : array) {
            System.out.print(i + " ");
        }

    }
}
