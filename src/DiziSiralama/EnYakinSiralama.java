package DiziSiralama;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSiralama {

    public EnYakinSiralama() {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = {15, 12, 788, 1, -1, -778, 2, 0};
        int min = numbers[0];
        int max = numbers[0];

        System.out.print("Dizi : {");
        for(int i: numbers) {
            System.out.print(i + ", ");
        }
        System.out.println("}");

        int number;
        System.out.print("Girilen Sayi: ");
        number = scanner.nextInt();

        Arrays.sort(numbers);
        for(int i: numbers) {
            System.out.print(i + ", ");
        }
        for(int i : numbers) {
            if(i < number) {
                min = i;
            }
            if(i > number) {
                max = i;
                break;
            }
        }
        System.out.println();
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+max);
    }
}
